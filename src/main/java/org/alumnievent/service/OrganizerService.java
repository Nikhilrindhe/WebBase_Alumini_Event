package org.alumnievent.service;

import java.util.List;


import org.alumnievent.model.CollegeModel;

import org.alumnievent.model.OrganizerModel;

public interface OrganizerService {
   public OrganizerModel getOrganizerProfile(int organizerId);
   public int getOrganizerIdByName(String organizerName);
   public List<CollegeModel> getAllCollege();
   public int isUpdateOrganizer(int organizerId,String contact,String Address);
   public List<CollegeModel> getcoleveOrganizedByOrganizer(int OrganizerId);
   public List<CollegeModel> getAllCollegeSearch(String Search);
   public List<CollegeModel> getOrganizerCollegeSearch(int OrganizerId,String Search);
   public List<OrganizerModel> getAllOragnizer();
   public boolean isRegisteredNewOragnizer(OrganizerModel model);
   public boolean isDeleteOragnizerById(int oId);
   public boolean isUpdateOragnizerById(OrganizerModel model);
}
