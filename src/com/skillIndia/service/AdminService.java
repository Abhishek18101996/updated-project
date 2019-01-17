package com.skillIndia.service;

import java.util.List;

import com.skillIndia.model.Course;

public interface AdminService {
public List<Course>  listAllCourse();
	
	public void acceptCandidate(String candidateName);
	public void rejectCandidate(String candidateName);
	
	public void acceptEstablishment(String estName);
	public void rejectEstablishment(String estName);
	
	public void verifyContract(String contract);
}
