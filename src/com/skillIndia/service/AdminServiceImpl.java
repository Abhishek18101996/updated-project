package com.skillIndia.service;

import java.util.List;

import com.skillIndia.dao.AdminDao;
import com.skillIndia.model.Course;

public class AdminServiceImpl implements AdminService {

	public AdminDao adminDao;
	@Override
	public List<Course> listAllCourse() {
		// TODO Auto-generated method stub
		return adminDao.listAllCourse();
	}

	@Override
	public void acceptCandidate(String candidateName) {
		// TODO Auto-generated method stub
	adminDao.acceptCandidate(candidateName);
	}

	@Override
	public void rejectCandidate(String candidateName) {
		adminDao.rejectCandidate(candidateName);
		
	}

	@Override
	public void acceptEstablishment(String estName) {
		adminDao.acceptEstablishment(estName);
		
	}

	@Override
	public void rejectEstablishment(String estName) {
		adminDao.rejectEstablishment(estName);;
		
		
	}

	@Override
	public void verifyContract(String contract) {
		adminDao.verifyContract(contract);
		
	}

}
