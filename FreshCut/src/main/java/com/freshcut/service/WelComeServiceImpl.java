package com.freshcut.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshcut.dao.WelcomeDao;
import com.freshcut.model.Coupons;
@Service
public class WelComeServiceImpl implements WelComeService{
	@Autowired
	private WelcomeDao welcomeDao;
	
	@Override
	public ArrayList<Coupons> getCoupons() {
		
		return welcomeDao.getCoupons();
		
		
	}
}
