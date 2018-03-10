package com.freshcut.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COUPONS")
public class Coupons {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "COUPON_ID")
	private Integer couponId;
	
	@Column(name = "COUPON_NAME")
	private String couponName;
	
	@Column(name = "DISCOUNT")
	private String discount;
	
	@Column(name = "COUPON_TEXT")
	private String couponText;
	
	@Column(name = "COUPON_PROMO_CODE")
	private String couponPromoCode;
	
	@Column(name = "COUPON_ACTIVE")
	private String active;
	
	@Column(name = "COUPON_CREATED_DATE")
	private String couponCreatedDate;
	
	@Column(name = "COUPON_CREATED_BY")
	private String couponCreatedBy;
	
	@Column(name = "COUPON_EXPIRY_DATE")
	private String couponExpiryDate;

	

	public Integer getCouponId() {
		return couponId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getCouponText() {
		return couponText;
	}

	public void setCouponText(String couponText) {
		this.couponText = couponText;
	}

	public String getCouponPromoCode() {
		return couponPromoCode;
	}

	public void setCouponPromoCode(String couponPromoCode) {
		this.couponPromoCode = couponPromoCode;
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

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}


	
	
}
