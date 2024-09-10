package org.alumnievent.service;
import java.util.List;

import org.alumnievent.model.CollegeModel;
import org.alumnievent.repository.*;
public class CollegeServiceImpl implements CollegeService{
CollegeRepository Crepo =new CollegeRepositoryImpl();
	@Override
	public int verifyUser(String email, String Password) {
		// TODO Auto-generated method stub
		return Crepo.verifyUser(email, Password);
	}
	@Override
	public int getCollegeIdbyname(String collegeName) {
		// TODO Auto-generated method stub
		return Crepo.getCollegeIdbyname(collegeName);
	}
	@Override
	public String getCollegeNameById(int collegeid) {
		// TODO Auto-generated method stub
		return Crepo.getCollegeNameById(collegeid);
	}
	@Override
	public CollegeModel getAdminProfile(int collegeId) {
		// TODO Auto-generated method stub
		return Crepo.getAdminProfile(collegeId);
	}
	@Override
	public boolean isRegistredNewCollege(CollegeModel cModel) {
		// TODO Auto-generated method stub
		return Crepo.isRegistredNewCollege(cModel);
	}

}
