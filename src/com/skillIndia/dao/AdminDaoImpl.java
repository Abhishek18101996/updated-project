package com.skillIndia.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skillIndia.model.Course;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Course>  listAllCourse() {
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String query="from Course";
		Query q=session.createQuery(query);
		List<Course> courseList=q.list();
		tx.commit();
		session.close();
		return courseList;
	}

	@Override
	public void acceptCandidate(String candidateName) {
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String query="update Candidate c set c.requestStatus='ACCEPTED' where c.candidateName=:candidateName";
		Query q=session.createQuery(query);
		q.setString("candidateName", candidateName);
		q.executeUpdate();
		
		tx.commit();
		session.close();
		
	}

	@Override
	public void rejectCandidate(String candidateName) {
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String query="update Candidate c set c.requestStatus='REJECTED' where c.candidateName=:candidateName";
		Query q=session.createQuery(query);
		q.setString("candidateName", candidateName);
		q.executeUpdate();
		
		tx.commit();
		session.close();
		
	}

	@Override
	public void acceptEstablishment(String estName) {
		
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String query="update Establishement est set est.requestStatus='ACCEPTED' where c.estName=:estName";
		Query q=session.createQuery(query);
		q.setString("estName", estName);
		q.executeUpdate();
		
		tx.commit();
		session.close();
	}

	@Override
	public void rejectEstablishment(String estName) {
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String query="update Establishement est set est.requestStatus='REJECTED' where c.estName=:estName";
		Query q=session.createQuery(query);
		q.setString("estName", estName);
		q.executeUpdate();
		
		tx.commit();
		session.close();
		
	}

	public void verifyContract(String contract) {
		
		
	}

}
