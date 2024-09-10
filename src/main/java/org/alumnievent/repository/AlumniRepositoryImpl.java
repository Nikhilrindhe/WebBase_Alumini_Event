package org.alumnievent.repository;

import java.util.ArrayList;
import java.util.List;

import org.alumnievent.config.DBConfig;
import org.alumnievent.model.AlumniModel;
import org.alumnievent.model.BranchModel;

public class AlumniRepositoryImpl extends DBConfig implements AlumniRepository{
   private int getAlumniIdIncrement()
   {
	   try {
		   int Aid=0;
		   stmt=conn.prepareStatement("select max(alumniId) from alumni");
		   rs=stmt.executeQuery();
		   if(rs.next())
		   {
			   Aid=rs.getInt(1);
		   }
		   return ++Aid;
		   
	   }catch(Exception ex)
	   {
		   System.out.println("Error is"+ex);
		   return 0;
	   }
   }

@Override
public AlumniModel getAlumniProfile(int alumniid) {
	// TODO Auto-generated method stub
	AlumniModel amodel = null;
	try {
		stmt=conn.prepareStatement("select * from alumni where alumniId=?");
		stmt.setInt(1, alumniid);
		rs=stmt.executeQuery();
		while(rs.next())
		{
			amodel = new AlumniModel();
			amodel.setAlumniName(rs.getString("alumniName"));
			amodel.setAlumniEmail(rs.getString("alumniEmail"));
			amodel.setAlumniContact(rs.getString("alumniContact"));
			amodel.setAlumniAddress(rs.getString("alumniAddress"));
			amodel.setAlumniPassoutYear(rs.getInt("alumniPassoutYear"));
		}
		
		return amodel!=null?amodel:null;
		
	}catch(Exception ex)
	{
		System.out.println("Error is"+ex);
		return null;
	}
	
}

@Override
public int isUpdateAlumni(int alumniId, String Contact, String Address) {
	// TODO Auto-generated method stub
	try {
		stmt=conn.prepareStatement("update alumni set alumniContact=?,alumniAddress=? where alumniId=?");
		stmt.setString(1,Contact);
		stmt.setString(2,Address);
		stmt.setInt(3, alumniId);
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

@Override
public int getCollegeIdOfAlumni(int alumniid) {
	// TODO Auto-generated method stub
	try {
		int collegeId=0;
		stmt=conn.prepareStatement("select collegeId from alumni where alumniId=?");
		stmt.setInt(1, alumniid);
		rs=stmt.executeQuery();
		if(rs.next())
		{
			collegeId=rs.getInt("collegeId");
			System.out.println(collegeId);
			return collegeId;
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
public int getBranchIdOfAlumni(int alumniid) {
	// TODO Auto-generated method stub
	try {
		int branchId=0;
		stmt=conn.prepareStatement("select branchId from alumni where alumniId=?");
		stmt.setInt(1, alumniid);
		rs=stmt.executeQuery();
		if(rs.next())
		{
			branchId=rs.getInt("branchId");
			System.out.println(branchId);
			return branchId;
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
public List<AlumniModel> getAllAlumniOfCollegeBranchWise(int BranchId, int CollegeId) {
	// TODO Auto-generated method stub
	try {
		AlumniModel model = null;
		List<AlumniModel> list = new ArrayList<AlumniModel>();
		stmt=conn.prepareStatement("Select alumniId from alumni where branchId=? and collegeId=?");
		stmt.setInt(1, BranchId);
		stmt.setInt(2, CollegeId);
		rs=stmt.executeQuery();
		while(rs.next())
		{
			model=new AlumniModel();
			model.setAlumniId(rs.getInt("alumniId"));
			list.add(model);	
		}
		return list.size()>0?list:null;
		
	}catch(Exception ex)
	{
		System.out.println("Error is"+ex);
	}
	return null;
}

@Override
public List<AlumniModel> getAllAlumni(int Id) {
	// TODO Auto-generated method stub
	try {
		List<AlumniModel> list = new ArrayList<>();
		stmt = conn.prepareStatement("select *from alumni where CollegeId = ?");
		stmt.setInt(1, Id);
		rs = stmt.executeQuery();
		while (rs.next()) {
			AlumniModel aModel = new AlumniModel();
			aModel.setAlumniId(rs.getInt("alumniId"));
			aModel.setAlumniName(rs.getString("alumniName"));
			aModel.setAlumniEmail(rs.getString("alumniEmail"));
			aModel.setAlumniContact(rs.getString("alumniContact"));
			aModel.setAlumniAddress(rs.getString("alumniAddress"));
			aModel.setAlumniGender(rs.getString("alumniGender"));
			aModel.setAlumniPassoutYear(rs.getInt("alumniPassoutYear"));
			list.add(aModel);
		}
		return list.size() > 0 ? list : null;
	} catch (Exception ex) {
		System.out.println("Error is " + ex);
		return null;
	}
}

@Override
public boolean isDeleteAlumniById(int aId) {
	// TODO Auto-generated method stub
	try {
		stmt = conn.prepareStatement("delete from alumni where alumniId=?");
		stmt.setInt(1, aId);
		int value = stmt.executeUpdate();
		return value > 0 ? true : false;
	} catch (Exception ex) {
		System.out.println("Error is " + ex);
		return false;
	}
}

@Override
public boolean isUpdateAlumniById(AlumniModel model) {
	// TODO Auto-generated method stub
	try {
		stmt = conn.prepareStatement("update alumni set AlumniEmail=?,AlumniContact=?,AlumniAddress=? where  alumniId=?");
		stmt.setString(1, model.getAlumniEmail());
		stmt.setString(2, model.getAlumniContact());
		stmt.setString(3, model.getAlumniAddress());
		stmt.setInt(4, model.getAlumniId());
		int value = stmt.executeUpdate();
		return value > 0 ? true : false;
	} catch (Exception ex) {
		System.out.println("Error is : " + ex);
		return false;
	}
}

@Override
public boolean isRegisteredNewAlumni(AlumniModel model) {
	// TODO Auto-generated method stub
	try {
		int Id = this.getAlumniIdIncrement();
		stmt = conn.prepareStatement("insert into alumni values(?,?,?,?,?,?,?,?,?,?)");
		stmt.setInt(1, Id);
		stmt.setInt(2, model.getBranchId());
		stmt.setString(3, model.getAlumniName());
		stmt.setString(4, model.getAlumniEmail());
		stmt.setString(5, model.getAlumniContact());
		stmt.setString(6, model.getAlumniAddress());
		stmt.setString(7, model.getAlumniGender());
		stmt.setInt(8, model.getAlumniPassoutYear());
		stmt.setInt(9, model.getCollegeId());
		stmt.setString(10,model.getAlumniPassword());
		int value = stmt.executeUpdate();
		return value > 0 ? true : false;
	} catch (Exception ex) {
		System.out.println("Error is New ALumni" + ex);
		return false;
	}

}

@Override
public List<AlumniModel> getAlumniByEvent(int collegeId, int BranchId) {
	// TODO Auto-generated method stub
	try {
		List<AlumniModel> li = new ArrayList<AlumniModel>();
		stmt = conn.prepareStatement("select alumniId,alumniName,alumniEmail,alumniContact,alumniAddress,alumniGender,alumniPassoutYear from alumni where CollegeId =? and BranchId=?");
		stmt.setInt(1, collegeId);
		stmt.setInt(2, BranchId);
		rs = stmt.executeQuery();
		
		while (rs.next()) {
			AlumniModel aModel = new AlumniModel();
			aModel.setAlumniId(rs.getInt("alumniId"));
			aModel.setAlumniName(rs.getString("alumniName"));
			aModel.setAlumniEmail(rs.getString("alumniEmail"));
			aModel.setAlumniContact(rs.getString("alumniContact"));
			aModel.setAlumniAddress(rs.getString("alumniAddress"));
			aModel.setAlumniGender(rs.getString("alumniGender"));
			aModel.setAlumniPassoutYear(rs.getInt("alumniPassoutYear"));
			System.out.println(aModel.getAlumniName());
			li.add(aModel);

		}
		return li.size() > 0 ? li : null;
	} catch (Exception ex) {
		System.out.println("Error is " + ex);
		return null;
	}
}

@Override
public List<AlumniModel> getAlumniBySearch(int collegeId, int BranchId, String Search) {
	// TODO Auto-generated method stub
	try {
		List<AlumniModel> list = new ArrayList<AlumniModel>();
		stmt = conn.prepareStatement("select alumniId,alumniName,alumniEmail,alumniContact,alumniAddress,alumniGender,alumniPassoutYear from alumni where CollegeId =? and BranchId=? and alumniName like'"+Search+"%'");
		stmt.setInt(1, collegeId);
		stmt.setInt(2, BranchId);
		rs = stmt.executeQuery();
		while (rs.next()) {
			AlumniModel aModel = new AlumniModel();
			aModel.setAlumniId(rs.getInt("alumniId"));
			aModel.setAlumniName(rs.getString("alumniName"));
			aModel.setAlumniEmail(rs.getString("alumniEmail"));
			aModel.setAlumniContact(rs.getString("alumniContact"));
			aModel.setAlumniAddress(rs.getString("alumniAddress"));
			aModel.setAlumniGender(rs.getString("alumniGender"));
			aModel.setAlumniPassoutYear(rs.getInt("alumniPassoutYear"));
			System.out.println(aModel.getAlumniName());
			list.add(aModel);
		}
		return list.size() > 0 ? list : null;
	}
	catch(Exception ex)
	{
	System.out.println("Exception is"+ex);
	return null;
	}
   }

@Override
public int getAlumniIdByEmail(String Email) {
	// TODO Auto-generated method stub
	int Aid=0;
	try {
		stmt=conn.prepareStatement("select alumniId from alumni where alumniEmail=?");
		stmt.setString(1, Email);
		rs=stmt.executeQuery();
		if(rs.next())
		{
			Aid=rs.getInt(1);
			return Aid;
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
public List<AlumniModel> getSeniorAlumni(int EventId) {
	// TODO Auto-generated method stub
	List<AlumniModel> list=new ArrayList<>();
	AlumniModel model=null;
	try {
		//stmt=conn.prepareStatement("WITH SeniorAlumni AS (SELECT a.alumniPassoutYear FROM alumni a JOIN attendance att ON a.alumniId = att.alumniId JOIN eventcollegeorganizerjoin ecoj ON att.eventcollegeorganizerId = ecoj.eventcollegeorganizerId JOIN event e ON ecoj.eventId = e.eventId WHERE e.eventId = ? AND att.status = 1 ORDER BY  a.alumniPassoutYear ASC LIMIT 1) SELECT a.alumniId, a.alumniName, a.alumniEmail, a.alumniContact, a.alumniPassoutYear FROM alumni a JOIN  attendance att ON a.alumniId = att.alumniId JOIN eventcollegeorganizerjoin ecoj ON att.eventcollegeorganizerId = ecoj.eventcollegeorganizerId JOIN event e ON ecoj.eventId = e.eventid JOIN SeniorAlumni sa ON a.alumniPassoutYear = sa.alumniPassoutYear WHERE e.eventId =? AND att.status = 1;");
	    stmt=conn.prepareStatement("WITH SeniorAlumni AS (\r\n"
	    		+ "    SELECT a.alumniPassoutYear\r\n"
	    		+ "    FROM alumni a\r\n"
	    		+ "    JOIN attendance att ON a.alumniId = att.alumniId\r\n"
	    		+ "    JOIN eventcollegeorganizerjoin ecoj ON att.eventcollegeorganizerId = ecoj.eventcollegeorganizerId\r\n"
	    		+ "    JOIN event e ON ecoj.eventId = e.eventId\r\n"
	    		+ "    WHERE e.eventId = ? AND att.status = 1\r\n"
	    		+ "    ORDER BY a.alumniPassoutYear ASC\r\n"
	    		+ "    LIMIT 1\r\n"
	    		+ ")\r\n"
	    		+ "SELECT a.alumniId, a.alumniName, a.alumniEmail, a.alumniContact, a.alumniPassoutYear\r\n"
	    		+ "FROM alumni a\r\n"
	    		+ "JOIN attendance att ON a.alumniId = att.alumniId\r\n"
	    		+ "JOIN eventcollegeorganizerjoin ecoj ON att.eventcollegeorganizerId = ecoj.eventcollegeorganizerId\r\n"
	    		+ "JOIN event e ON ecoj.eventId = e.eventId\r\n"
	    		+ "JOIN SeniorAlumni sa ON a.alumniPassoutYear = sa.alumniPassoutYear\r\n"
	    		+ "WHERE e.eventId = ? AND att.status = 1;");
		stmt.setInt(1, EventId);
	    stmt.setInt(2, EventId);
	    rs=stmt.executeQuery();
	    while(rs.next())
	    {
	    	model=new AlumniModel();
	    	model.setAlumniId(rs.getInt("alumniId"));
	    	model.setAlumniName(rs.getString("alumniName"));
	    	model.setAlumniEmail(rs.getString("alumniEmail"));
	    	model.setAlumniContact(rs.getString("alumniContact"));
	    	model.setAlumniPassoutYear(rs.getInt("alumniPassoutYear"));
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
public List<AlumniModel> getPresentAlumni(int EventId) {
	// TODO Auto-generated method stub
	List<AlumniModel> list=new ArrayList<>();
	AlumniModel model=null;
	try {
		stmt=conn.prepareStatement("SELECT a.alumniId,a.alumniName,a.alumniEmail,a.alumniContact,a.alumniPassoutYear FROM alumni a JOIN attendance att ON a.alumniId = att.alumniId JOIN eventcollegeorganizerjoin ecoj ON att.eventcollegeorganizerId = ecoj.eventcollegeorganizerId JOIN event e ON ecoj.eventId = e.eventId WHERE e.eventId = ? AND att.status = 1");
	    stmt.setInt(1, EventId);
	    rs=stmt.executeQuery();
	    while(rs.next())
	    {
	    	model=new AlumniModel();
	    	model.setAlumniId(rs.getInt("alumniId"));
	    	model.setAlumniName(rs.getString("alumniName"));
	    	model.setAlumniEmail(rs.getString("alumniEmail"));
	    	model.setAlumniContact(rs.getString("alumniContact"));
	    	model.setAlumniPassoutYear(rs.getInt("alumniPassoutYear"));
	    	list.add(model);
	    }
	    return list;
	}catch(Exception ex)
	{
		System.out.println("Exception is"+ex);
		return null;
	}

}

@Override
public List<AlumniModel> getAbsentAlumni(int EventId) {
	// TODO Auto-generated method stub
	List<AlumniModel> list=new ArrayList<>();
	AlumniModel model=null;
	try {
		stmt=conn.prepareStatement("SELECT a.alumniId,a.alumniName,a.alumniEmail,a.alumniContact,a.alumniPassoutYear FROM alumni a LEFT JOIN attendance att ON a.alumniId = att.alumniId  JOIN eventcollegeorganizerjoin ecoj ON att.eventcollegeorganizerId = ecoj.eventcollegeorganizerId  JOIN event e ON ecoj.eventId = e.eventId WHERE e.eventId = ? AND att.status = 0;");
		stmt.setInt(1, EventId);
		rs=stmt.executeQuery();
		while(rs.next())
	    {
	    	model=new AlumniModel();
	    	model.setAlumniId(rs.getInt("alumniId"));
	    	model.setAlumniName(rs.getString("alumniName"));
	    	model.setAlumniEmail(rs.getString("alumniEmail"));
	    	model.setAlumniContact(rs.getString("alumniContact"));
	    	model.setAlumniPassoutYear(rs.getInt("alumniPassoutYear"));
	    	list.add(model);
	    }
	    return list;
	}catch(Exception ex)
	{
		System.out.println("Exception is"+ex);
		return null;
	}

}

@Override
public List<AlumniModel> getSortedAlumniByYear(int EventId) {
	// TODO Auto-generated method stub
	List<AlumniModel> list=new ArrayList<>();
	AlumniModel model=null;
	try {
		stmt=conn.prepareStatement("SELECT a.alumniId,a.alumniName,a.alumniEmail,a.alumniContact,a.alumniPassoutYear FROM alumni a JOIN attendance att ON a.alumniId = att.alumniId JOIN eventcollegeorganizerjoin ecoj ON att.eventcollegeorganizerId = ecoj.eventcollegeorganizerId JOIN event e ON ecoj.eventId = e.eventId WHERE e.eventId = ? AND att.status = 1 ORDER BY a.alumniPassoutYear ASC");
	    stmt.setInt(1, EventId);
	    rs=stmt.executeQuery();
	    while(rs.next())
	    {
	    	model=new AlumniModel();
	    	model.setAlumniId(rs.getInt("alumniId"));
	    	model.setAlumniName(rs.getString("alumniName"));
	    	model.setAlumniEmail(rs.getString("alumniEmail"));
	    	model.setAlumniContact(rs.getString("alumniContact"));
	    	model.setAlumniPassoutYear(rs.getInt("alumniPassoutYear"));
	    	list.add(model);
	    }
	    return list;
	}catch(Exception ex)
	{
		System.out.println("Exception is"+ex);
		return null;
	}

}

}