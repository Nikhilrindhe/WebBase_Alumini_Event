package org.alumnievent.service;

import java.util.List;

import org.alumnievent.model.AlumniModel;
import org.alumnievent.model.BranchModel;

public interface AlumniService {
   public AlumniModel getAlumniProfile(int alumniid);
   public int isUpdateAlumni(int alumniId,String Contact,String Address);
   public int getCollegeIdOfAlumni(int alumniid);
   public int getBranchIdOfAlumni(int alumniid);
   public List<AlumniModel> getAllAlumniOfCollegeBranchWise(int BranchId,int CollegeId);
   public List<AlumniModel> getAllAlumni(int Id);
   public boolean isDeleteAlumniById(int aId);
   public boolean isUpdateAlumniById(AlumniModel model);
   public boolean isRegisteredNewAlumni(AlumniModel model);
   public List<AlumniModel> getAlumniByEvent(int collegeId, int BranchId);
   public List<AlumniModel> getAlumniBySearch(int collegeId, int BranchId,String Search);
   public int getAlumniIdByEmail(String Email);
   public List<AlumniModel> getSeniorAlumni(int EventId);
   public List<AlumniModel> getPresentAlumni(int EventId);
   public List<AlumniModel> getAbsentAlumni(int EventId);
   public List<AlumniModel> getSortedAlumniByYear(int EventId);
}
