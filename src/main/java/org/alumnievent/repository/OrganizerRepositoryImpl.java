package org.alumnievent.repository;
import java.util.ArrayList;

import java.util.List;

import org.alumnievent.config.*;
import org.alumnievent.model.CollegeModel;

import org.alumnievent.model.OrganizerModel;
public class OrganizerRepositoryImpl extends DBConfig implements OrganizerRepository {

	private int getOrganizerIdIncrement()
	{   
	    
		try {
			int Oid=0;
			stmt=conn.prepareStatement("select max(organizerId)from organizer");
			rs=stmt.executeQuery();
			if(rs.next())
			{
				Oid=rs.getInt(1);
			}
			return ++Oid;
					
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return 0;
		}
	}

	@Override
	public OrganizerModel getOrganizerProfile(int organizerId) {
		// TODO Auto-generated method stub
		try {
			OrganizerModel omodel=null;
			stmt=conn.prepareStatement("select *from organizer where  organizerId=?");
			stmt.setInt(1, organizerId);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				 omodel=new  OrganizerModel();
				 omodel.setOrganizerName(rs.getString(2));
				 omodel.setOrganizerEmail(rs.getString(3));
				 omodel.setOrganizerContact(rs.getString(4));
				 omodel.setOrganizerAddress(rs.getString(5));
			}
			return omodel!=null?omodel:null;
			
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
		return null;
	}

	@Override
	public int getOrganizerIdByName(String organizerName) {
		// TODO Auto-generated method stub
		try {
			  stmt=conn.prepareStatement("select organizerId from organizer where organizerName=?"); 
			  stmt.setString(1,organizerName);
			  rs=stmt.executeQuery();
			  if(rs.next())
			  {
				  return rs.getInt(1);
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
	public List<CollegeModel> getAllCollege() {
		// TODO Auto-generated method stub
		CollegeModel model=null;
	    List <CollegeModel> list=new ArrayList<CollegeModel>();
	    try {
	    	stmt=conn.prepareStatement("select * from college");
	    	rs=stmt.executeQuery();
	    	while(rs.next())
	    	{
	    		model=new CollegeModel();
	    		model.setCollegeId(rs.getInt(1));
	    		model.setCollegeName(rs.getString(2));
	    		model.setCollegeEmail(rs.getString(3));
	    		model.setCollegeContact(rs.getString(4));
	    		model.setCollegeAddress(rs.getString(5));
	    		model.setCollegePassword(rs.getString(6));
	    		list.add(model);
	    	}
	    	return list!=null?list:null;
	    	
	    }catch(Exception ex)
	    {
	    	System.out.println("Exception is"+ex);
			return null;
	    }
	}

	@Override
	public int isUpdateOrganizer(int organizerId,String contact,String Address) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("update organizer set organizerContact=?,organizerAddress=? where organizerId=?");
			stmt.setString(1,contact);
			stmt.setString(2,Address);
			stmt.setInt(3,organizerId);
			int value=stmt.executeUpdate();
			if(value==1)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return 0;
		}
		
	}

	public List<CollegeModel> getcoleveOrganizedByOrganizer(int organizerId) {
	    List<CollegeModel> list = new ArrayList<>();
	    try {
	      
	        stmt = conn.prepareStatement("SELECT Distinct c.collegeId, c.collegeName, c.collegeEmail, c.collegeContact, c.collegeAddress, c.collegePassword FROM college c JOIN collegeorganizerjoin coj ON c.collegeId = coj.collegeId JOIN eventcollegeorganizerjoin ecoj ON coj.collegeorganizerId = ecoj.collegeorganizerId JOIN organizer o ON coj.organizerId = o.organizerId WHERE o.organizerId = ?");
	        stmt.setInt(1, organizerId);
	     
	        rs = stmt.executeQuery();
	  
	        while (rs.next()) {
	           
	            CollegeModel model = new CollegeModel();
	            model.setCollegeId(rs.getInt("collegeId"));
	            model.setCollegeName(rs.getString("collegeName"));
	            model.setCollegeEmail(rs.getString("collegeEmail"));
	            model.setCollegeContact(rs.getString("collegeContact"));
	            model.setCollegeAddress(rs.getString("collegeAddress"));
	            model.setCollegePassword(rs.getString("collegePassword"));
	            list.add(model);
	        
	        }
	      
	        return list;
	    } catch (Exception ex) {
	        System.out.println("Error: " + ex.getMessage());
	      
	        return null;
	    }
	}

	@Override
	public List<CollegeModel> getAllCollegeSearch(String Search) {
		// TODO Auto-generated method stub
		CollegeModel model=null;
	    List <CollegeModel> list=new ArrayList<CollegeModel>();
	    try {
	    	stmt=conn.prepareStatement("select * from college where collegeName like '"+Search+"%'");
	    	rs=stmt.executeQuery();
	    	while(rs.next())
	    	{
	    		model=new CollegeModel();
	    		model.setCollegeId(rs.getInt(1));
	    		model.setCollegeName(rs.getString(2));
	    		model.setCollegeEmail(rs.getString(3));
	    		model.setCollegeContact(rs.getString(4));
	    		model.setCollegeAddress(rs.getString(5));
	    		model.setCollegePassword(rs.getString(6));
	    		list.add(model);
	    	}
	    	return list!=null?list:null;
	    	
	    }catch(Exception ex)
	    {
	    	System.out.println("Exception is"+ex);
			return null;
	    }
	}

	@Override
	public List<CollegeModel> getOrganizerCollegeSearch(int OrganizerId, String Search) {
		// TODO Auto-generated method stub
		 List<CollegeModel> list = new ArrayList<>();
		    try {
		        stmt = conn.prepareStatement("SELECT Distinct c.collegeId, c.collegeName, c.collegeEmail, c.collegeContact, c.collegeAddress, c.collegePassword FROM college c JOIN collegeorganizerjoin coj ON c.collegeId = coj.collegeId JOIN eventcollegeorganizerjoin ecoj ON coj.collegeorganizerId = ecoj.collegeorganizerId JOIN organizer o ON coj.organizerId = o.organizerId WHERE o.organizerId = ? and c.collegeName like '"+Search+"%'");
		        stmt.setInt(1, OrganizerId);
		        rs = stmt.executeQuery();
		        while (rs.next()) {
		           
		            CollegeModel model = new CollegeModel();
		            model.setCollegeId(rs.getInt("collegeId"));
		            model.setCollegeName(rs.getString("collegeName"));
		            model.setCollegeEmail(rs.getString("collegeEmail"));
		            model.setCollegeContact(rs.getString("collegeContact"));
		            model.setCollegeAddress(rs.getString("collegeAddress"));
		            model.setCollegePassword(rs.getString("collegePassword"));
		            list.add(model);
		        }
		        return list;
		    } catch (Exception ex) {
		        System.out.println("Error: " + ex.getMessage());
		        return null;
		    }
	}

	@Override
	public List<OrganizerModel> getAllOragnizer() {
		// TODO Auto-generated method stub
		List<OrganizerModel> list = new ArrayList<OrganizerModel>();
		try {
			stmt = conn.prepareStatement("select *from Organizer");
			rs = stmt.executeQuery();
			while(rs.next())
			{
				OrganizerModel oModel = new OrganizerModel();
				oModel.setOrganizerId(rs.getInt("OrganizerId"));
				oModel.setOrganizerName(rs.getString("OrganizerName"));
				oModel.setOrganizerEmail(rs.getString("OrganizerEmail"));
				oModel.setOrganizerContact(rs.getString("OrganizerContact"));
				oModel.setOrganizerAddress(rs.getString("OrganizerAddress"));
				list.add(oModel);
			}
			return list.size()>0?list:null;
		}catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return null;
		}
	}

	@Override
	public boolean isRegisteredNewOragnizer(OrganizerModel model) {
		// TODO Auto-generated method stub
		try {
			int Id = this.getOrganizerIdIncrement();
			stmt = conn.prepareStatement("insert into Organizer values(?,?,?,?,?,?)");
			stmt.setInt(1,Id);
			stmt.setString(2, model.getOrganizerName());
			stmt.setString(3, model.getOrganizerEmail());
			stmt.setString(4,model.getOrganizerContact());
			stmt.setString(5, model.getOrganizerAddress());
			stmt.setString(6, model.getOrganizerPassword());
			int value = stmt.executeUpdate();
			return value>0?true:false;
			
		}catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}

	@Override
	public boolean isDeleteOragnizerById(int oId) {
		// TODO Auto-generated method stub
		try {
			stmt = conn.prepareStatement("delete from organizer where OrganizerId=?");
			stmt.setInt(1, oId);
			int value = stmt.executeUpdate();
			
			return value>0?true:false;
			
		}catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}

	@Override
	public boolean isUpdateOragnizerById(OrganizerModel model) {
		// TODO Auto-generated method stub
		try {
			stmt = conn.prepareStatement("update organizer set OrganizerEmail=?,OrganizerContact=?,OrganizerAddress=? where  OrganizerId=?");
			stmt.setString(1, model.getOrganizerEmail());
			stmt.setString(2, model.getOrganizerContact());
			stmt.setString(3,model.getOrganizerAddress());
			stmt.setInt(4,model.getOrganizerId());
			int value = stmt.executeUpdate();
			return value>0?true:false;
		}catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
		}
		return false;
	}
	
}
