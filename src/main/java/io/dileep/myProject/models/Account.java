package io.dileep.myProject.models;

import java.util.Date;


public class Account {

	
	private String id;
	private String organizationId;
	private String individualId;
	private String type;
	private String status;
	private Date expirationDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getIndividualId() {
		return individualId;
	}
	public void setIndividualId(String individualId) {
		this.individualId = individualId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
