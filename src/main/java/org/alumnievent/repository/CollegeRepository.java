package org.alumnievent.repository;

import org.alumnievent.model.CollegeModel;

public interface CollegeRepository {
   public int verifyUser(String email,String password);
   public int getCollegeIdbyname(String collegeName);
   public String getCollegeNameById(int collegeid);
   public CollegeModel getAdminProfile(int collegeId);
   public boolean isRegistredNewCollege(CollegeModel cModel);
}
