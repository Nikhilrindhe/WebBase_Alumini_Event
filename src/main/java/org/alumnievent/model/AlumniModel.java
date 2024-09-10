package org.alumnievent.model;

public class AlumniModel {
    
	private int alumniId;
	private int branchId;
	private String alumniName;
	private String alumniEmail;
	private String alumniContact;
	private String alumniAddress;
	private String alumniGender;
	private int alumniPassoutYear;
	private int collegeId;
	private String alumniPassword;
	
	public AlumniModel()
	{
		
	}
	public AlumniModel(int alumniId,int branchId,String alumniName,String alumniEmail,String alumniContact,String alumniAddress,String alumniGender,int alumniPassoutYear,int collegeId,String alumniPassword)
	{
		this.alumniId=alumniId;
		this.branchId=branchId;
		this.alumniName=alumniName;
	    this.alumniEmail=alumniEmail;
	    this.alumniContact=alumniContact;
	    this.alumniAddress=alumniAddress;
	    this.alumniGender=alumniGender;
	    this.alumniPassoutYear=alumniPassoutYear;
	    this.collegeId=collegeId;
	    this.alumniPassword=alumniPassword;
	}
	
	public int getAlumniId() {
		return alumniId;
	}
	public void setAlumniId(int alumniId) {
		this.alumniId = alumniId;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getAlumniName() {
		return alumniName;
	}
	public void setAlumniName(String alumniName) {
		this.alumniName = alumniName;
	}
	public String getAlumniEmail() {
		return alumniEmail;
	}
	public void setAlumniEmail(String alumniEmail) {
		this.alumniEmail = alumniEmail;
	}
	public String getAlumniContact() {
		return alumniContact;
	}
	public void setAlumniContact(String alumniContact) {
		this.alumniContact = alumniContact;
	}
	public String getAlumniAddress() {
		return alumniAddress;
	}
	public void setAlumniAddress(String alumniAddress) {
		this.alumniAddress = alumniAddress;
	}
	public String getAlumniGender() {
		return alumniGender;
	}
	public void setAlumniGender(String alumniGender) {
		this.alumniGender = alumniGender;
	}
	public int getAlumniPassoutYear() {
		return alumniPassoutYear;
	}
	public void setAlumniPassoutYear(int alumniPassoutYear) {
		this.alumniPassoutYear = alumniPassoutYear;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getAlumniPassword() {
		return alumniPassword;
	}
	public void setAlumniPassword(String alumniPassword) {
		this.alumniPassword = alumniPassword;
	}
	
}
