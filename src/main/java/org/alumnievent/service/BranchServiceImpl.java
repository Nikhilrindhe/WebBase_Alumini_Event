package org.alumnievent.service;

import java.util.List;

import org.alumnievent.model.BranchModel;
import org.alumnievent.repository.*;
public class BranchServiceImpl implements BranchService{
   BranchRepository bRepo=new BranchRepositoryImpl();
	@Override
	public List<BranchModel> getCollegeWiseBranch(int collegeid) {
		// TODO Auto-generated method stub
		return bRepo.getCollegeWiseBranch(collegeid);
	}
	@Override
	public String getBranchNameById(int branchId,int collegeid) {
		// TODO Auto-generated method stub
		return bRepo.getBranchNameById(branchId,collegeid);
	}
	@Override
	public boolean isAddNewBranch(BranchModel model, int CollegeId) {
		// TODO Auto-generated method stub
		return bRepo.isAddNewBranch(model, CollegeId);
	}
	
}
