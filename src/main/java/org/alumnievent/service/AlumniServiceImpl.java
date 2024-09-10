package org.alumnievent.service;

import java.util.List;

import org.alumnievent.model.AlumniModel;
import org.alumnievent.model.BranchModel;
import org.alumnievent.repository.*;
public class AlumniServiceImpl implements AlumniService{
   AlumniRepository aRepo=new AlumniRepositoryImpl();
	@Override
	public AlumniModel getAlumniProfile(int alumniid) {
		// TODO Auto-generated method stub
		return aRepo.getAlumniProfile(alumniid);
	}
	@Override
	public int isUpdateAlumni(int alumniId, String Contact, String Address) {
		// TODO Auto-generated method stub
		return aRepo.isUpdateAlumni(alumniId, Contact, Address);
	}
	@Override
	public int getCollegeIdOfAlumni(int alumniid) {
		// TODO Auto-generated method stub
		return aRepo.getCollegeIdOfAlumni(alumniid);
	}
	@Override
	public int getBranchIdOfAlumni(int alumniid) {
		// TODO Auto-generated method stub
		return aRepo.getBranchIdOfAlumni(alumniid);
	}
	@Override
	public List<AlumniModel> getAllAlumniOfCollegeBranchWise(int BranchId, int CollegeId) {
		// TODO Auto-generated method stub
		return aRepo.getAllAlumniOfCollegeBranchWise(BranchId, CollegeId);
	}
	@Override
	public List<AlumniModel> getAllAlumni(int Id) {
		// TODO Auto-generated method stub
		return aRepo.getAllAlumni(Id);
	}
	@Override
	public boolean isDeleteAlumniById(int aId) {
		// TODO Auto-generated method stub
		return aRepo.isDeleteAlumniById(aId);
	}
	@Override
	public boolean isUpdateAlumniById(AlumniModel model) {
		// TODO Auto-generated method stub
		return aRepo.isUpdateAlumniById(model);
	}
	@Override
	public boolean isRegisteredNewAlumni(AlumniModel model) {
		// TODO Auto-generated method stub
		return aRepo.isRegisteredNewAlumni(model);
	}
	@Override
	public List<AlumniModel> getAlumniByEvent(int collegeId, int BranchId) {
		// TODO Auto-generated method stub
		return aRepo.getAlumniByEvent(collegeId, BranchId);
	}
	@Override
	public List<AlumniModel> getAlumniBySearch(int collegeId, int BranchId, String Search) {
		// TODO Auto-generated method stub
		return aRepo.getAlumniBySearch(collegeId, BranchId, Search);
	}
	@Override
	public int getAlumniIdByEmail(String Email) {
		// TODO Auto-generated method stub
		return aRepo.getAlumniIdByEmail(Email);
	}
	@Override
	public List<AlumniModel> getSeniorAlumni(int EventId) {
		// TODO Auto-generated method stub
		return aRepo.getSeniorAlumni(EventId);
	}
	@Override
	public List<AlumniModel> getPresentAlumni(int EventId) {
		// TODO Auto-generated method stub
		return aRepo.getPresentAlumni(EventId);
	}
	@Override
	public List<AlumniModel> getAbsentAlumni(int EventId) {
		// TODO Auto-generated method stub
		return aRepo.getAbsentAlumni(EventId);
	}
	@Override
	public List<AlumniModel> getSortedAlumniByYear(int EventId) {
		// TODO Auto-generated method stub
		return aRepo.getSortedAlumniByYear(EventId);
	}

}
