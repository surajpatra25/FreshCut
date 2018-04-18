package com.freshcut.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID")
	private Integer employeeID;
	
	@Column(name="EMPLOYEE_NUMBER")
	private String employeeNumber;
	
	@Column(name="EMPLOYEE_NAME")
	private String employeeName;
	
	@Column(name="EMPLOYEE_LAST_NAME")
	private String employeeLastNAme;
	
	@Column(name="EMPLOYEE_EMAIL")
	private String employeeEmail;
	
	@Column(name="EMPLOYEE_ADDRESS")
	private String employeeaddress;
	
	@Column(name="EMPLOYEE_DOB")
	private String employeeDOB;
	
	@Column(name="EMPLOYEE_TITLE")
	private String employeeTitle;
	
	@Column(name="EMPLOYEE_JOINING_DATE")
	private Timestamp employeeJoiningDate;
	
	@Column(name="EMPLOYEE_PREVIOUS_EXP_YEARS")
	private String employeePreviousYearsOfExp;
	
	@Column(name="OPRTNL_FLAG")
	private Integer operationalFlag;
	
	@Column(name="CREATED_BY")
	private Integer createdBy;
	
	@Column(name="CREATED_DATE")
	private Timestamp createdDate;
	
	@Column(name="MODIFIED_BY")
	private Integer modifiedBy;
	
	@Column(name="MODIFIED_DATE")
	private Timestamp modifiedDate;
	
}
