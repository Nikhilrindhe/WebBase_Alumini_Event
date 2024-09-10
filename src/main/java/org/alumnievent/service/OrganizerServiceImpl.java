package org.alumnievent.service;
import java.util.List;

import org.alumnievent.model.CollegeModel;
import org.alumnievent.model.OrganizerModel;
import org.alumnievent.repository.*;
public class OrganizerServiceImpl implements OrganizerService{
	 OrganizerRepository oRepository=new  OrganizerRepositoryImpl();

	@Override
	public OrganizerModel getOrganizerProfile(int organizerId) {
		// TODO Auto-generated method stub
		return oRepository.getOrganizerProfile(organizerId);
	}

	@Override
	public int getOrganizerIdByName(String organizerName) {
		// TODO Auto-generated method stub
		return oRepository.getOrganizerIdByName(organizerName);
	}

	@Override
	public List<CollegeModel> getAllCollege() {
		// TODO Auto-generated method stub
		return oRepository.getAllCollege();
	}

	@Override
	public int isUpdateOrganizer(int organizerId,String contact,String Address) {
		// TODO Auto-generated method stub
		return  oRepository.isUpdateOrganizer(organizerId,contact,Address);
	}

	@Override
	public List<CollegeModel> getcoleveOrganizedByOrganizer(int OrganizerId) {
		// TODO Auto-generated method stub
		return oRepository.getcoleveOrganizedByOrganizer(OrganizerId);
	}

	@Override
	public List<CollegeModel> getAllCollegeSearch(String Search) {
		// TODO Auto-generated method stub
		return oRepository.getAllCollegeSearch(Search);
	}

	@Override
	public List<CollegeModel> getOrganizerCollegeSearch(int OrganizerId, String Search) {
		// TODO Auto-generated method stub
		return oRepository.getOrganizerCollegeSearch(OrganizerId, Search);
	}

	@Override
	public List<OrganizerModel> getAllOragnizer() {
		// TODO Auto-generated method stub
		return oRepository.getAllOragnizer();
	}

	@Override
	public boolean isRegisteredNewOragnizer(OrganizerModel model) {
		// TODO Auto-generated method stub
		return oRepository.isRegisteredNewOragnizer(model);
	}

	@Override
	public boolean isDeleteOragnizerById(int oId) {
		// TODO Auto-generated method stub
		return  oRepository.isDeleteOragnizerById(oId);
	}

	@Override
	public boolean isUpdateOragnizerById(OrganizerModel model) {
		// TODO Auto-generated method stub
		return oRepository.isUpdateOragnizerById(model);
	}
	

}
