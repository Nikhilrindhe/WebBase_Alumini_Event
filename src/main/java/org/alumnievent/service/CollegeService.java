package org.alumnievent.service;

import java.util.List;

import org.alumnievent.model.CollegeModel;

public interface CollegeService {
    public int verifyUser(String email,String Password);
    public int getCollegeIdbyname(String collegeName);
    public String getCollegeNameById(int collegeid);
	public CollegeModel getAdminProfile(int collegeId);
	public boolean isRegistredNewCollege(CollegeModel cModel);
}
