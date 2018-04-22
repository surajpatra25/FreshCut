package com.freshcut.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshcut.controller.Services;
import com.freshcut.dao.WelcomeDao;
import com.freshcut.model.Coupons;
import com.freshcut.model.OnlineCheckIn;
import com.freshcut.model.Survey;
import com.freshcut.model.User;
@Service
public class WelComeServiceImpl implements WelComeService{
	@Autowired
	private WelcomeDao welcomeDao;
	
	@Override
	public ArrayList<Coupons> getCoupons() {
		
		return welcomeDao.getCoupons();
		
		
	}

	@Override
	public void checkinService(OnlineCheckIn checkIn) {
		// TODO Auto-generated method stub
		 welcomeDao.checkInDao(checkIn);
	}

	@Override
	public String getWaitTime(String location) {
		// TODO Auto-generated method stub
		return welcomeDao.getWaitTimeDao(location);
	}

	@Override
	public String registerUser(User user) {
		return welcomeDao.registerUserDao(user);
	}

	@Override
	public void saveSurveyService(Survey survey) {
		
		welcomeDao.saveSurveyDao(survey);
	}

	@Override
	public ArrayList<Services> getServices() {
		// TODO Auto-generated method stub
		return welcomeDao.getServices();
	}
	
	
	
}
