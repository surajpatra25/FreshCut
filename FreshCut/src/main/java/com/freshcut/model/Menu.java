package com.freshcut.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MENU")
public class Menu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MENU_ID")
	private Integer menuID;
	
	@Column(name="MENU_NAME")
	private String menuName;
	
	@Column(name="MENU_DESCRIPTION")
	private String menuDescription;
	
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
