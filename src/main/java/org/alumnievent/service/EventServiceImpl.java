package org.alumnievent.service;

import java.util.List;

import org.alumnievent.model.EventModel;
import org.alumnievent.repository.*;
public class EventServiceImpl implements EventService{
   EventRepository eRepo=new EventRepositoryImpl();
	@Override
	public boolean addEvent(EventModel model, int CollegeId,int OrganizerId,int branchId) {
		// TODO Auto-generated method stub
		return eRepo.addEvent(model,CollegeId,OrganizerId,branchId);
	}
	@Override
	public List<EventModel> ShowEventsAsPerCollege(int CollegeId) {
		// TODO Auto-generated method stub
		return eRepo.ShowEventsAsPerCollege(CollegeId);
	}
	@Override
	public List<EventModel> ShowEventsAsPerAlumni(int CollegeId, int AlumniId) {
		// TODO Auto-generated method stub
		return eRepo.ShowEventsAsPerAlumni(CollegeId, AlumniId);
	}
	@Override
	public List<EventModel> ShowOrganizerEvents(int collegeId,int organizerId) {
		// TODO Auto-generated method stub
		return eRepo.ShowOrganizerEvents(collegeId, organizerId);
	}
	@Override
	public int isUpdateEvent(int eventId,EventModel model) {
		// TODO Auto-generated method stub
		return eRepo.isUpdateEvent(eventId,model);
	}
	@Override
	public int isDeleteEvent(int eventId) {
		// TODO Auto-generated method stub
		return eRepo.isDeleteEvent(eventId);
	}
	@Override
	public List<EventModel> SearchOrganizerEvents(int collegeId, int organizerId, String Search) {
		// TODO Auto-generated method stub
		return eRepo.SearchOrganizerEvents(collegeId, organizerId, Search);
	}
	@Override
	public int takeEcoIdByEventid(int eventId) {
		// TODO Auto-generated method stub
		return eRepo.takeEcoIdByEventid(eventId);
	}
	@Override
	public int alumniAttendance(int alumniId, int ecoid) {
		// TODO Auto-generated method stub
		return eRepo.alumniAttendance(alumniId, ecoid);
	}
	@Override
	public List<EventModel> showEventsOfBranchCollege(int BranchId, int Id) {
		// TODO Auto-generated method stub
		return eRepo.showEventsOfBranchCollege(BranchId, Id);
	}
	@Override
	public List<EventModel> getEventsForFeedback(int alumniId) {
		// TODO Auto-generated method stub
		return eRepo.getEventsForFeedback(alumniId);
	}
	@Override
	public int giveFeedBack(int AlumniId, int Ecoid,String AfeedBack) {
		// TODO Auto-generated method stub
		return eRepo.giveFeedBack(AlumniId, Ecoid, AfeedBack);
	}
	@Override
	public List<Object[]> showCollegeEventFeedBack(int EventId) {
		// TODO Auto-generated method stub
		return eRepo.showCollegeEventFeedBack(EventId);
	}

}
