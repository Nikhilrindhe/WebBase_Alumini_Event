package org.alumnievent.repository;

import java.util.List;

import org.alumnievent.model.BranchModel;

public interface BranchRepository {
	public String getBranchNameById(int branchId,int collegeid);
	public List<BranchModel> getCollegeWiseBranch(int collegeid);
	public boolean isAddNewBranch(BranchModel model,int CollegeId);
}
