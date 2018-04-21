package com.freshcut.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.freshcut.model.Coupons;
import com.freshcut.model.OnlineCheckIn;
import com.freshcut.model.Survey;
import com.freshcut.model.User;

import antlr.collections.List;

@Repository
@Transactional
public class WelComeDaoImpl implements WelcomeDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Coupons> getCoupons() {
		
		return (ArrayList<Coupons>) sessionFactory.getCurrentSession().createCriteria(Coupons.class).add(Restrictions.eq("active", "A")).list();
		
		
		
	}


	@Override
	public int checkInDao(String location) {
		// TODO Auto-generated method stub
	
		String sqlquery="select count * from onlinecheckin where location=?";
		int count = sessionFactory.getCurrentSession().createQuery(sqlquery)
				.setString(0, location)
				.executeUpdate();
		return count;
				}


	@Override
	public String getWaitTimeDao(String location) {
		// TODO Auto-generated method stub
		String sqlquery="select count(o) from OnlineCheckIn o where location=?";
		Long count = (Long) sessionFactory.getCurrentSession().createQuery(sqlquery)
				.setString(0, location)
				.list().get(0);
		return String.valueOf(count);
	}


	@Override
	public void checkInDao(OnlineCheckIn checkIn) {
		// TODO Auto-generated method stub
		
		sessionFactory.getCurrentSession().save(checkIn);
	}


	@Override
	public String registerUserDao(User user) {
		@SuppressWarnings("unchecked")
		ArrayList<User> checkUserName= (ArrayList<User>) sessionFactory
							.getCurrentSession()
							.createCriteria(User.class)
							.add(Restrictions.eq("operational", "A"))
							.add(Restrictions.eq("userName",user.getUserName()))
							.list();
		if(checkUserName.size() >0) return "user name exists";
		@SuppressWarnings("unchecked")
		ArrayList<User> checkUser= (ArrayList<User>) sessionFactory
				.getCurrentSession()
				.createCriteria(User.class)
				.add(Restrictions.eq("operational", "A"))
				.add(Restrictions.eq("userName",user.getUserName()))
				.list();
		if(checkUser.size()>0) return "Email ID already being used";
		user.setOperational("A");
		sessionFactory.getCurrentSession().save(user);
		
		return "success";
	}


	@Override
	public void saveSurveyDao(Survey survey) {
		sessionFactory.getCurrentSession().save(survey);
		
	}
}
