package org.alumnievent.repository;

import java.util.ArrayList;
import java.util.List;

import org.alumnievent.config.DBConfig;
import org.alumnievent.model.BranchModel;

public class BranchRepositoryImpl extends DBConfig implements BranchRepository{

	private int getBranchIdInIncrement()
	{
		 try {
			   int branchid=0;
			   stmt=conn.prepareStatement("select max(branchId) from branch");
			   rs=stmt.executeQuery();
			   if(rs.next())
			   {
				   branchid=rs.getInt(1);
			   }
			   return ++branchid;
			   
		   }catch(Exception ex)
		   {
			   System.out.println("Error is"+ex);
			   return 0;
		   }
	}
	
	 
	@Override
	public List<BranchModel> getCollegeWiseBranch(int collegeid) {
		// TODO Auto-generated method stub
		try {
			List<BranchModel> list=new ArrayList<BranchModel>();
			BranchModel bModel;
			stmt=conn.prepareStatement("select *from branch where collegeId=?");
			stmt.setInt(1, collegeid);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				bModel=new BranchModel(); 
				bModel.setBranchId(rs.getInt(1));
				bModel.setBranchName(rs.getString(2));
				bModel.setMcollegeId(rs.getInt(3));
				
				list.add(bModel);	
			}
			return list!=null?list:null;
		}catch(Exception ex)
		{
			System.out.println("Exception is"+ex);
			return null;
		}
		
	}


	@Override
	public String getBranchNameById(int branchId,int collegeid) {
		// TODO Auto-generated method stub
		String branchName=null;
		try {
			
			stmt=conn.prepareStatement("select branchName from branch where branchId=? && collegeId=?");
			stmt.setInt(1, branchId);
			stmt.setInt(2,collegeid);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				branchName=rs.getString("branchName");
			}
			return  branchName!=null? branchName:null;
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return null;
		}
		
	}


	@Override
	public boolean isAddNewBranch(BranchModel model, int CollegeId) {
		// TODO Auto-generated method stub
		try
		{   String bname;
		boolean  flag=false;
			stmt=conn.prepareStatement("select *from branch where collegeid=?");
			stmt.setInt(1, CollegeId);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				bname=rs.getString("BranchName");
				if(bname.equalsIgnoreCase(model.getBranchName()))
				{
					flag=true;
				}
			} 
			if(!flag)
			{
			int bid=this.getBranchIdInIncrement();
			stmt = conn.prepareStatement("insert into branch values(?,?,?)");
			stmt.setInt(1,bid);
			stmt.setString(2,model.getBranchName());
			stmt.setInt(3, CollegeId);
			int value = stmt.executeUpdate();
			return value>0?true:false;
			}
			else {
				System.out.println("alredy there");
				return false;
			}
		}catch(Exception ex)
		{
			System.out.println("Error Branch Not Added"+ex);
			return false;
		}
	}

}
