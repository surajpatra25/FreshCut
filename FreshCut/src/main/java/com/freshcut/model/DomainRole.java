package com.freshcut.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOMAIN_X_ROLE")
public class DomainRole {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DOMAIN_ROLE_ID")
	private Integer domainRoleID;
	
	@Column(name="DOMAIN_ID")
	private Integer domainId;
	
	@Column(name="DOMAIN_ROLE")
	private String domainRole;
	
	@Column(name="REGION_DESCRIPTION")
	private String roleDescription;
	
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
