package org.alumnievent.service;

import java.util.List;

import org.alumnievent.model.EventModel;

public interface EventService {
    public boolean addEvent(EventModel model, int CollegeId,int OrganizerId,int branchId);
    public List<EventModel> ShowEventsAsPerCollege(int CollegeId);
    public List<EventModel> ShowEventsAsPerAlumni(int CollegeId,int AlumniId);
    public List<EventModel> ShowOrganizerEvents(int collegeId,int organizerId);
    public int isUpdateEvent(int eventId,EventModel model);
    public int isDeleteEvent(int eventId);
    public List<EventModel> SearchOrganizerEvents(int collegeId,int organizerId,String Search);
    public int takeEcoIdByEventid(int eventId);
    public int alumniAttendance(int alumniId,int ecoid);
    public List<EventModel>showEventsOfBranchCollege(int BranchId,int Id);
    public List<EventModel>getEventsForFeedback(int alumniId);
    public int giveFeedBack(int AlumniId,int Ecoid,String AfeedBack);
    public List<Object[]> showCollegeEventFeedBack(int EventId);
}
