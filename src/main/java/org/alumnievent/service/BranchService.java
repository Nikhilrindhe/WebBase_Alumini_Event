package org.alumnievent.service;

import java.util.List;

import org.alumnievent.model.BranchModel;

public interface BranchService {
	public String getBranchNameById(int branchId,int collegeid);
    public List<BranchModel> getCollegeWiseBranch(int collegeid);
    public boolean isAddNewBranch(BranchModel model,int CollegeId);
}
