package com.freshcut.dao;

import java.util.ArrayList;
import java.util.List;

import com.freshcut.controller.Services;
import com.freshcut.model.Coupons;
import com.freshcut.model.OnlineCheckIn;
import com.freshcut.model.Survey;
import com.freshcut.model.User;

public interface WelcomeDao {
	public ArrayList<Coupons> getCoupons();

	public void checkInDao(OnlineCheckIn checkIn);

	public String getWaitTimeDao(String location);

	int checkInDao(String location);

	public String registerUserDao(User user);

	public void saveSurveyDao(Survey survey);

	public ArrayList<Services> getServices();
}
