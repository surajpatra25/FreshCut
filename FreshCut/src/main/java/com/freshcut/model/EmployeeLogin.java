package com.freshcut.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_LOGIN")
public class EmployeeLogin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMPLOYEE_LOGIN_ID")
	private Integer employeeLoginID;
	
	@Column(name="EMPLOYEE_USERID")
	private String employeeUserId;
	
	@Column(name="PASSWORD")
	private String password;
	    
	@Column(name="EMPLOYEE_NUMBER")
	private String employeeNumber;
	
	@Column(name="ACCOUNT_LOCKED")
	private String accountLocked;
	
	@Column(name="RESET_PASSWORD")
	private String resetPassword;
	
	@Column(name="OPRTNL_FLAG")
	private Integer operationalFlag;
	
}
