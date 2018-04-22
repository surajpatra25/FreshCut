package com.freshcut.service;

import java.util.ArrayList;
import java.util.List;

import com.freshcut.controller.Services;
import com.freshcut.model.Coupons;
import com.freshcut.model.OnlineCheckIn;
import com.freshcut.model.Survey;
import com.freshcut.model.User;

public interface WelComeService {

	ArrayList<Coupons> getCoupons();

	void checkinService(OnlineCheckIn checkIn);

	String getWaitTime(String location);

	String registerUser(User user);

	void saveSurveyService(Survey survey);

	ArrayList<Services> getServices();



}
