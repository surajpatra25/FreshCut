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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name="PASSWORD")
	private String password;

	@Column(name="EMPLOYEE_EMAIL")
	private String employeeEmail;
	
	@Column(name="EMPLOYEE_FIRST_NAME")
	private String firstName;
	
	@Column(name="EMPLOYEE_LAST_NAME")
	private String lastName;
	
	@Column(name="ACCOUNT_LOCKED")
	private String accountLocked;
	
	@Column(name="RESET_PASSWORD")
	private String resetPassword;
	
	@Column(name="OPRTNL_FLAG")
	private String operational;
	
	@Column(name="EMPLOYEE_ID")
	private String employeeID;
	
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="CREATED_DATE")
	private Timestamp createdDate;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name="MODIFIED_DATE")
	private Timestamp modifiedDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountLocked() {
		return accountLocked;
	}

	public void setAccountLocked(String accountLocked) {
		this.accountLocked = accountLocked;
	}

	public String getResetPassword() {
		return resetPassword;
	}

	public void setResetPassword(String resetPassword) {
		this.resetPassword = resetPassword;
	}

	public String getOperational() {
		return operational;
	}

	public void setOperational(String operational) {
		this.operational = operational;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	


}
