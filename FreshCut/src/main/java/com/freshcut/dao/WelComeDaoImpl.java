package com.freshcut.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.freshcut.model.Coupons;

import antlr.collections.List;

public class WelComeDaoImpl {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public ArrayList<Coupons> getCoupons() {
		
		return (ArrayList<Coupons>) sessionFactory.getCurrentSession().createCriteria(Coupons.class).list()getClass();
		
		
		
	}

}
