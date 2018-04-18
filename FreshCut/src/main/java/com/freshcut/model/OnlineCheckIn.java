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
	
	@Column(name="LOCATION")
	private String location;
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getCheckInId() {
		return checkInId;
	}

	public void setCheckInId(Integer checkInId) {
		this.checkInId = checkInId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(String numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCouponCreatedDate() {
		return couponCreatedDate;
	}

	public void setCouponCreatedDate(String couponCreatedDate) {
		this.couponCreatedDate = couponCreatedDate;
	}

	public String getCouponCreatedBy() {
		return couponCreatedBy;
	}

	public void setCouponCreatedBy(String couponCreatedBy) {
		this.couponCreatedBy = couponCreatedBy;
	}

	public String getCouponExpiryDate() {
		return couponExpiryDate;
	}

	public void setCouponExpiryDate(String couponExpiryDate) {
		this.couponExpiryDate = couponExpiryDate;
	}

}
