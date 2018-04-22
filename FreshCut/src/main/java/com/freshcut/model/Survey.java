package com.freshcut.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SURVEY")
public class Survey {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "SURVEY_ID")
	private Integer surveyID;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	
	
	@Column(name = "EMAIL_ADDRESS")
	private String emailAddres;
	
	@Column(name = "PHONE")
	private Integer phone;
	
	@Column(name = "CUSTOMER_NOTE")
	private String customerNote;
	
	@Column(name = "QUESTION_1_ID")
	private Integer question1Id;
	
	@Column(name = "QUESTION_1")
	private String question1;
	
	@Column(name = "QUESTION_2_ID")
	private Integer question2Id;
	
	@Column(name = "QUESTION_2")
	private String question2;
	
	@Column(name = "QUESTION_3_ID")
	private Integer question3Id;
	
	@Column(name = "QUESTION_3")
	private String question3;
	
	@Column(name = "QUESTION_4_ID")
	private Integer question4Id;
	
	@Column(name = "QUESTION_4")
	private String question4;
	
	@Column(name = "QUESTION_5_ID")
	private Integer question5Id;
	
	@Column(name = "QUESTION_5")
	private String question5;
	
		
	

	public Integer getSurveyID() {
		return surveyID;
	}

	public void setSurveyID(Integer surveyID) {
		this.surveyID = surveyID;
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

	public String getEmailAddres() {
		return emailAddres;
	}

	public void setEmailAddres(String emailAddres) {
		this.emailAddres = emailAddres;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getCustomerNote() {
		return customerNote;
	}

	public void setCustomerNote(String customerNote) {
		this.customerNote = customerNote;
	}

	public Integer getQuestion1Id() {
		return question1Id;
	}

	public void setQuestion1Id(Integer question1Id) {
		this.question1Id = question1Id;
	}

	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public Integer getQuestion2Id() {
		return question2Id;
	}

	public void setQuestion2Id(Integer question2Id) {
		this.question2Id = question2Id;
	}

	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	public Integer getQuestion3Id() {
		return question3Id;
	}

	public void setQuestion3Id(Integer question3Id) {
		this.question3Id = question3Id;
	}

	public String getQuestion3() {
		return question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	public Integer getQuestion4Id() {
		return question4Id;
	}

	public void setQuestion4Id(Integer question4Id) {
		this.question4Id = question4Id;
	}

	public String getQuestion4() {
		return question4;
	}

	public void setQuestion4(String question4) {
		this.question4 = question4;
	}

	public Integer getQuestion5Id() {
		return question5Id;
	}

	public void setQuestion5Id(Integer question5Id) {
		this.question5Id = question5Id;
	}

	public String getQuestion5() {
		return question5;
	}

	public void setQuestion5(String question5) {
		this.question5 = question5;
	}

	
}
