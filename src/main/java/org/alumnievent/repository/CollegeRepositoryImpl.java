package org.alumnievent.repository;

import org.alumnievent.config.DBConfig;
import org.alumnievent.model.CollegeModel;

public class CollegeRepositoryImpl extends DBConfig implements CollegeRepository{

	private int getCollegeIdIncrement()
	{   
		try {
			int Cid=0;
			stmt=conn.prepareStatement("select max(collegeId)from college");
			if(rs.next())
			{
				Cid=rs.getInt(1);
			}
			return ++Cid;
					
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return 0;
		}
	}

	@Override
	public int verifyUser(String email, String password) {
		// TODO Auto-generated method stub
		try {
			int cid = 0;
			stmt=conn.prepareStatement("select collegeId from college where collegeEmail=? and collegePassword=?");
			stmt.setString(1,email);
			stmt.setString(2, password);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				cid=rs.getInt("collegeId");
				return cid;
			}
			else {
				int oid=0;
				stmt=conn.prepareStatement("select organizerId from organizer where organizerEmail=? and organizerPassword=?");
				stmt.setString(1,email);
				stmt.setString(2, password);
				rs=stmt.executeQuery();
				if(rs.next())
				{
					oid=rs.getInt("organizerId");
					return oid;
				}
			
				else {
					int aid=0;
					stmt=conn.prepareStatement("select  alumniId  from alumni where alumniEmail=? and alumniPassword=?");
					stmt.setString(1,email);
					stmt.setString(2, password);
					rs=stmt.executeQuery();
					if(rs.next())
					{
						aid=rs.getInt("alumniId");
						return aid;
					}
			}
			
			}	
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return 0;
		}
		return 0;

	}

	@Override
	public int getCollegeIdbyname(String collegeName) {
		// TODO Auto-generated method stub
	    	try {
				  stmt=conn.prepareStatement("select collegeId from college where collegeName=?"); 
				  stmt.setString(1,collegeName);
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
	public String getCollegeNameById(int collegeid) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("select collegeName from college where collegeId=?"); 
			stmt.setInt(1, collegeid);
			  rs=stmt.executeQuery();
			  if(rs.next())
			  {
				  return rs.getString("collegeName");
			  }
		      else {
				  return null;
			  }  
			
		}catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return null;
		}
		
	}

	@Override
	public CollegeModel getAdminProfile(int collegeId) {
		// TODO Auto-generated method stub
		try {
			stmt = conn.prepareStatement("select *from College where CollegeId = ?");
			stmt.setInt(1,collegeId);
			rs= stmt.executeQuery();
			CollegeModel c = null;
			if(rs.next())
			{
				c = new CollegeModel();
				c.setCollegeId(rs.getInt("collegeId"));
				c.setCollegeName(rs.getString("collegeName"));
				c.setCollegeEmail(rs.getString("collegeEmail"));
				c.setCollegeContact(rs.getString("collegeContact"));
				c.setCollegeAddress(rs.getString("collegeAddress"));
				
			}
			return c;
		}catch(Exception ex)
		{
			return null;
		}
	}

	@Override
	public boolean isRegistredNewCollege(CollegeModel cModel) {
		// TODO Auto-generated method stub
		try {
			int collegeId = this.getCollegeIdIncrement();
			stmt = conn.prepareStatement("insert into colleges values(?,?,?,?,?,?)");
			stmt.setInt(1,collegeId);
			stmt.setString(2, cModel.getCollegeName());
			stmt.setString(3, cModel.getCollegeEmail());
			stmt.setString(4, cModel.getCollegeContact());
			stmt.setString(5, cModel.getCollegePassword());
			stmt.setString(6, cModel.getCollegeAddress());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
			return false;
		}
	}
	
}
