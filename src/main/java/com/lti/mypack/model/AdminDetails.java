package com.lti.mypack.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="admindetails")
public class AdminDetails {
	@Id
	private int admin_id;
	private String first_name;
	private String last_name;
	private String email_id;
	private String admin_password;
	@Temporal(TemporalType.DATE)
	private java.util.Date date_of_birth;
	private String gender;
	private String phone_number;
	public AdminDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminDetails(int admin_id, String first_name, String last_name, String email_id, String admin_password,
			java.util.Date date_of_birth, String gender, String phone_number) {
		super();
		this.admin_id = admin_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
		this.admin_password = admin_password;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.phone_number = phone_number;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public java.util.Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(java.util.Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	
}