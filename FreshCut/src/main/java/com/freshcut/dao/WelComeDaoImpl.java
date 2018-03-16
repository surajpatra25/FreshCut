package com.freshcut.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.freshcut.model.Coupons;

import antlr.collections.List;

@Repository
@Transactional
public class WelComeDaoImpl implements WelcomeDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public ArrayList<Coupons> getCoupons() {
		
		return (ArrayList<Coupons>) sessionFactory.getCurrentSession().createCriteria(Coupons.class).add(Restrictions.eq("active", "A")).list();
		
		
		
	}

}
