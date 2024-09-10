package org.alumnievent.model;

public class CollegeModel {
	 
	
	
	private int collegeId;
	private String collegeName;
     private String collegeEmail;
     private String collegeContact;
     private String collegeAddress;
     private String collegePassword;
     
     public CollegeModel()
     {
    	 
     }
     public CollegeModel(int collegeId,String collegeName,String collegeEmail,String collegeContact,String collegeAddress,String collegePassword)
     {
    	         this.collegeId=collegeId;
    			 this.collegeName=collegeName;
    			 this.collegeEmail=collegeEmail;
    			 this.collegeContact=collegeContact;
    			 this.collegeAddress=collegeAddress;
    			 this.collegePassword=collegePassword;
     }
     
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeEmail() {
		return collegeEmail;
	}
	public void setCollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}
	public String getCollegeContact() {
		return collegeContact;
	}
	public void setCollegeContact(String  collegeContact) {
		this.collegeContact = collegeContact;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	public String getCollegePassword() {
		return collegePassword;
	}
	public void setCollegePassword(String collegePassword) {
		this.collegePassword = collegePassword;
	}
	  public int getCollegeId() {
			return collegeId;
		}
		public void setCollegeId(int collegeId) {
			this.collegeId = collegeId;
		}
}
