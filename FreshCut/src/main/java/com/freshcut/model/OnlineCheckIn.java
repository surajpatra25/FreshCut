package com.freshcut.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ONLINECHECKIN")
public class OnlineCheckIn {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ONLINE_CHECKIN_ID")
	private Integer checkInId;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "EMAIL_ID")
	private String emailID;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "NUMBER_OF_GUEST")
	private String numberOfGuests;
	
	@Column(name = "CHECK_IN_TIME")
	private String active;
	
	@Column(name = "COUPON_CREATED_DATE")
	private String couponCreatedDate;
	
	@Column(name = "COUPON_CREATED_BY")
	private String couponCreatedBy;
	
	@Column(name = "COUPON_EXPIRY_DATE")
	private String couponExpiryDate;

}
