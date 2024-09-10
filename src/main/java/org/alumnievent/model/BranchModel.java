package org.alumnievent.model;

public class BranchModel {
	
   private int branchId;
   private String branchName;
   private int mcollegeId;
   
   public BranchModel()
   {
	   
   }
   public BranchModel (int branchId, String branchName,int mcollegeId)
   {
	            this.branchId=branchId;
			   this.branchName=branchName;
			   this.mcollegeId=mcollegeId;
	   
   }
   
public int getBranchId() {
	return branchId;
}
public void setBranchId(int branchId) {
	this.branchId = branchId;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public int getMcollegeId() {
	return mcollegeId;
}
public void setMcollegeId(int mcollegeId) {
	this.mcollegeId = mcollegeId;
}
}
