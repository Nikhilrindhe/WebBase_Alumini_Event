package org.alumnievent.repository;
import org.alumnievent.service.*;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.alumnievent.config.DBConfig;
import org.alumnievent.model.AlumniModel;
import org.alumnievent.model.EventModel;

public class EventRepositoryImpl extends DBConfig implements EventRepository{

	private int getEventIdInIncrement()
	{
		 try {
			   int Eventid=0;
			   stmt=conn.prepareStatement("select max(eventId) from event");
			   rs=stmt.executeQuery();
			   if(rs.next())
			   {
				   Eventid=rs.getInt(1);
			   }
			   return ++Eventid;
			   
		   }catch(Exception ex)
		   {
			   System.out.println("Error is"+ex);
			   return 0;
		   }
	}
	private int getCollegeOrganizerIdInIncrement()
	{
		 try {
			   int CollegeOrganizerId=0;
			   stmt=conn.prepareStatement("select max(collegeorganizerId) from collegeorganizerjoin");
			   rs=stmt.executeQuery();
			   if(rs.next())
			   {
				   CollegeOrganizerId=rs.getInt(1);
			   }
			   return ++CollegeOrganizerId;
			   
		   }catch(Exception ex)
		   {
			   System.out.println("Error is"+ex);
			   return 0;
		   }
	}
	private int getEventCollegeOrganizerIdInIncrement()
	{
		 try {
			   int EventCollegeOrganizerId=0;
			   stmt=conn.prepareStatement("select max(eventcollegeorganizerId) from eventcollegeorganizerjoin");
			   rs=stmt.executeQuery();
			   if(rs.next())
			   {
				   EventCollegeOrganizerId=rs.getInt(1);
			   }
			   return ++EventCollegeOrganizerId;
			   
		   }catch(Exception ex)
		   {
			   System.out.println("Error is"+ex);
			   return 0;
		   }
	}
	@Override
	public boolean addEvent(EventModel model,int CollegeId,int OrganizerId,int branchId) {
		// TODO Auto-generated method stub
		AlumniService aService=new 	AlumniServiceImpl();
		
		List<AlumniModel> list=aService.getAllAlumniOfCollegeBranchWise(branchId, CollegeId);
		try {
			int eventId=this.getEventIdInIncrement();
			
			stmt=conn.prepareStatement("insert into event values(?,?,?,?,?,?)");
			stmt.setInt(1, eventId);
			stmt.setInt(2,model.getBranchId());
			stmt.setString(3,model.getEventName());
			stmt.setString(4,model.getDescription());
			stmt.setString(5,model.getVenue());
			stmt.setDate(6,model.getEventDate());
			int value1=stmt.executeUpdate();
			if(value1==1)
			{
			  int collegeOrganizerId=this.getCollegeOrganizerIdInIncrement();
		
				stmt=conn.prepareStatement("insert into collegeorganizerjoin values(?,?,?)");
				stmt.setInt(1,CollegeId);
				stmt.setInt(2,OrganizerId);
				stmt.setInt(3,collegeOrganizerId);
				int value2=stmt.executeUpdate();
				if(value2==1)
				{
					int eventCollegeOrganizerId=this.getEventCollegeOrganizerIdInIncrement();
					 
					stmt=conn.prepareStatement("insert into eventcollegeorganizerjoin values(?,?,?)");
					stmt.setInt(1,eventId);
					stmt.setInt(2,collegeOrganizerId);
					stmt.setInt(3,eventCollegeOrganizerId);
					int value3=stmt.executeUpdate();
					if(value3==1)
					{   
						
						int result=0;
						//for loop here
					for(AlumniModel Am:list)	{
						stmt=conn.prepareStatement("Insert into attendance values(?,?,?,'0')");
						stmt.setInt(1,Am.getAlumniId());
						stmt.setInt(2,eventCollegeOrganizerId);
						stmt.setInt(3,0);
						result=stmt.executeUpdate();
					    }
						if(result==1)
						{
							return true;
						}
						else {
							return false;
						}
						
					}
					else {
						return false;
					}
				
				}
				else {
					return false;
				}
				
				
			}
			else {
				return false;
			}
			
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return false;
		}
		
	}
	@Override
	public List<EventModel> ShowEventsAsPerCollege(int CollegeId) {
		// TODO Auto-generated method stub
		List <EventModel> list=new ArrayList<EventModel>();
		try {
			EventModel emodel;
			
			stmt=conn.prepareStatement("select e.eventId,e.branchId,e.eventName,e.description,e.venue,e.eventDate from event e Inner join eventcollegeorganizerjoin ecoj on e.eventId=ecoj.eventId Inner join collegeorganizerjoin coj on ecoj.collegeorganizerId = coj.collegeorganizerId where coj.collegeId=?");
			stmt.setInt(1, CollegeId);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				emodel=new EventModel();
				emodel.setEventId(rs.getInt(1));
				emodel.setBranchId(rs.getInt(2));
				emodel.setEventName(rs.getString(3));
				emodel.setDescription(rs.getString(4));
				emodel.setVenue(rs.getString(5));
				emodel.setEventDate(rs.getDate(6));
				list.add(emodel);
			}
			return list !=null?list:null;
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return null;
		}
	
	}
	@Override
	public List<EventModel> ShowEventsAsPerAlumni(int CollegeId, int AlumniId) {
		// TODO Auto-generated method stub
		List <EventModel> list=new ArrayList<EventModel>();
		try {
			EventModel emodel;
			
			stmt=conn.prepareStatement("select e.eventName,e.venue,e.description,e.eventDate from event e inner join branch b on e.branchId = b.branchId inner join college c on b.collegeId = c.collegeId inner join alumni a on b.branchId = a.branchId and c.collegeId = a.collegeId where c.collegeId=? and a.alumniId=?");
			stmt.setInt(1, CollegeId);
			stmt.setInt(2, AlumniId);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				emodel=new EventModel();
				//emodel.setEventId(rs.getInt(1));
				//emodel.setBranchId(rs.getInt(2));
				emodel.setEventName(rs.getString(1));
				emodel.setDescription(rs.getString(2));
				emodel.setVenue(rs.getString(3));
				emodel.setEventDate(rs.getDate(4));
				list.add(emodel);
			}
			return list !=null?list:null;
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return null;
		}
	}
	@Override
	public List<EventModel> ShowOrganizerEvents(int collegeId,int organizerId) {
		// TODO Auto-generated method stub
		List <EventModel> list=new ArrayList<EventModel>();
		try {
			EventModel emodel;
			
			stmt=conn.prepareStatement("SELECT Distinct e.eventId,e.branchId, e.eventName, e.description, e.venue, e.eventDate FROM event e JOIN branch b ON e.branchId = b.branchId JOIN college c ON b.collegeId = c.collegeId JOIN collegeorganizerjoin coj ON c.collegeId = coj.collegeId JOIN organizer o ON coj.organizerId = o.organizerId WHERE c.collegeId =? AND o.organizerId =?");
			stmt.setInt(1, collegeId);
			stmt.setInt(2, organizerId);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				emodel=new EventModel();
				emodel.setEventId(rs.getInt(1));
				emodel.setBranchId(rs.getInt(2));
				emodel.setEventName(rs.getString(3));
				emodel.setDescription(rs.getString(4));
				emodel.setVenue(rs.getString(5));
				emodel.setEventDate(rs.getDate(6));
				list.add(emodel);
			}
			return list !=null?list:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return null;
		}
		
	}
	@Override
	public int isUpdateEvent(int eventId,EventModel model) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("update event set branchId=?,eventName=?,description=?,venue=?,eventDate=?where eventId=?");
			stmt.setInt(1,model.getBranchId());
			stmt.setString(2,model.getEventName());
			stmt.setString(3,model.getDescription());
			stmt.setString(4,model.getVenue());
			stmt.setDate(5,model.getEventDate());
			stmt.setInt(6, eventId);
		  int value=stmt.executeUpdate();
		  if(value==1)
		  {
			  return 1;
		  }
		  else {
			  return 0;
		  }
			
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return 0;
		}
		
	}
	@Override
	public int isDeleteEvent(int eventId) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("delete from event where eventId=?");
			stmt.setInt(1, eventId);
			int value=stmt.executeUpdate();
			if(value==1)
			{
				return 1;
			}
			else {
				return 0;
			}
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return 0;
		}
		
	}
	@Override
	public List<EventModel> SearchOrganizerEvents(int collegeId, int organizerId, String Search) {
		// TODO Auto-generated method stub
		List <EventModel> list=new ArrayList<EventModel>();
		try {
			EventModel emodel;
			
			stmt=conn.prepareStatement("SELECT Distinct e.eventId,e.branchId, e.eventName, e.description, e.venue, e.eventDate FROM event e JOIN branch b ON e.branchId = b.branchId JOIN college c ON b.collegeId = c.collegeId JOIN collegeorganizerjoin coj ON c.collegeId = coj.collegeId JOIN organizer o ON coj.organizerId = o.organizerId WHERE c.collegeId =? AND o.organizerId =? and e.eventName like '"+Search+"%'");
			stmt.setInt(1, collegeId);
			stmt.setInt(2, organizerId);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				emodel=new EventModel();
				emodel.setEventId(rs.getInt(1));
				emodel.setBranchId(rs.getInt(2));
				emodel.setEventName(rs.getString(3));
				emodel.setDescription(rs.getString(4));
				emodel.setVenue(rs.getString(5));
				emodel.setEventDate(rs.getDate(6));
				list.add(emodel);
			}
			return list !=null?list:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return null;
		}
	}
	@Override
	public int takeEcoIdByEventid(int eventId) {
		// TODO Auto-generated method stub
		try {
			int Ecoid = 0;
			stmt = conn.prepareStatement("SELECT DISTINCT a.eventcollegeorganizerId FROM attendance a JOIN eventcollegeorganizerjoin ecoj ON a.eventcollegeorganizerId = ecoj.eventcollegeorganizerId JOIN event e ON ecoj.eventId = e.eventId WHERE e.eventId=?");
			stmt.setInt(1, eventId);
			rs = stmt.executeQuery();
			if (rs.next()) {
				Ecoid = rs.getInt(1);
			}
			return Ecoid;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return 0;
		}
	}
	@Override
	public int alumniAttendance(int alumniId, int ecoid) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("update attendance set status=? where alumniId=? and eventcollegeorganizerId=?");
			stmt.setInt(1,1);
			stmt.setInt(2,alumniId);
			stmt.setInt(3, ecoid);
			 int value=stmt.executeUpdate();
			 if(value==1)
			 {
				 return 1;
			 }
			 else {
				 return 0;
			 }
			
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return 0;
		}
	}
	@Override
	public List<EventModel> showEventsOfBranchCollege(int BranchId, int Id) {
		// TODO Auto-generated method stub
		List<EventModel> list=new ArrayList<EventModel>();
		  EventModel model=null;
		try {
			stmt=conn.prepareStatement("SELECT e.eventId,e.branchId,e.eventName,e.venue,e.eventDate,e.description FROM event e JOIN branch b ON e.branchId = b.branchId WHERE b.collegeId =? AND b.branchId =?");
			stmt.setInt(1, Id);
			stmt.setInt(2,BranchId);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				model =new EventModel();
				model.setEventId(rs.getInt("eventId"));
				model.setBranchId(rs.getInt("branchId"));
				model.setEventName(rs.getString("eventName"));
				model.setVenue(rs.getString("venue"));
				model.setEventDate(rs.getDate("eventDate"));
				model.setDescription(rs.getString("description"));
				list.add(model);
			}
			return list;
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return null;
		}
		
	}
	@Override
	public List<EventModel> getEventsForFeedback(int alumniId) {
		// TODO Auto-generated method stub
		List <EventModel> list=new ArrayList<EventModel>();
		EventModel model=null;
		try {
			stmt=conn.prepareStatement("SELECT e.eventId, e.eventName FROM event e JOIN eventcollegeorganizerjoin ecoj ON e.eventId = ecoj.eventId JOIN attendance a ON ecoj.eventcollegeorganizerId = a.eventcollegeorganizerId WHERE a.alumniId =? AND a.status = 1");
			stmt.setInt(1,alumniId);
			rs=stmt.executeQuery();
			while(rs.next())
			{    
				model=new EventModel();
				model.setEventId(rs.getInt(1));
				model.setEventName(rs.getString(2));
				list.add(model);
			}
			return list;
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return null;
		}
		
	}
	@Override
	public int giveFeedBack(int AlumniId, int Ecoid,String AfeedBack) {
		// TODO Auto-generated method stub
		int feedbackid=0;
		try {
			stmt=conn.prepareStatement("select feedbackId from attendance where alumniId=? and eventcollegeorganizerId=?");
			stmt.setInt(1, AlumniId);
			stmt.setInt(2, Ecoid);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				feedbackid=rs.getInt("feedbackId");
			}
			stmt=conn.prepareStatement("Insert into feedback values(?,?)");
			stmt.setInt(1, feedbackid);
			stmt.setString(2, AfeedBack);
			int value=stmt.executeUpdate();
			if(value==1)
			{
				return 1;
			}
			else {
				return 0;
			}
			
		}catch(Exception ex)
		{
			System.out.println("Exception is"+ex);
			return 0;
		}
	
	}
	@Override
	public List<Object[]> showCollegeEventFeedBack(int EventId) {
		// TODO Auto-generated method stub
		List<Object[]> list=new ArrayList<>();
		try {
			stmt=conn.prepareStatement("SELECT a.alumniName,f.feedbacks FROM event e JOIN eventcollegeorganizerjoin ecoj ON e.eventId = ecoj.eventId JOIN collegeorganizerjoin coj ON ecoj.collegeorganizerId = coj.collegeorganizerId JOIN attendance at ON ecoj.eventcollegeorganizerId = at.eventcollegeorganizerId JOIN alumni a ON at.alumniId = a.alumniId JOIN feedback f ON at.feedbackId = f.feedbackId WHERE e.eventId = ?");
			stmt.setInt(1, EventId);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				Object obj[]=new Object[]{rs.getString(1),rs.getString(2)};
				list.add(obj);
			}
			return list;
		}catch(Exception ex)
		{
			System.out.println("error is"+ex);
			return null;
		}
	
	}

}

