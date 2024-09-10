package org.alumnievent.model;

import java.sql.Date;

public class EventModel {
	
   private int eventId;
   private int branchId;
   private String eventName;
   private String description;
   private String venue;
   private Date eventDate;
   
   public EventModel()
   {
	   
   }
   
   public EventModel(int eventId,int branchId,String eventName,String description,String venue, Date eventDate)
   {
	   this.eventId=eventId;
	   this.branchId=branchId;
	   this.eventName=eventName;
	   this.description=description;
	   this.venue=venue;
	   this.eventDate=eventDate;
   }
   
public int getEventId() {
	return eventId;
}
public void setEventId(int eventId) {
	this.eventId = eventId;
}
public int getBranchId() {
	return branchId;
}
public void setBranchId(int branchId) {
	this.branchId = branchId;
}
public String getEventName() {
	return eventName;
}
public void setEventName(String eventName) {
	this.eventName = eventName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getVenue() {
	return venue;
}
public void setVenue(String venue) {
	this.venue = venue;
}
public Date getEventDate() {
	return eventDate;
}
public void setEventDate(Date eventDate) {
	this.eventDate = eventDate;
}
}
