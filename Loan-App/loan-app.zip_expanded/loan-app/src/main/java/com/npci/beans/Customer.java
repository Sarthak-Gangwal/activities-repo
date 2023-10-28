package com.npci.beans;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "customer_id")
	private int id;
	
	@Column(name = "firstname")
	private String fname;
	
	@Column(name = "lastname")
	private String lname;
	
	@Column(name = "email_id ")
	private String emailId;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "phone_number")
	private long phoneNumber;
	
	@Column(name = "pan")
	private String pan;

	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getters & setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	
	//Parameterized constructors
	public Customer(int id, String fname, String lname, String emailId, String password, long phoneNumber, String pan) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.emailId = emailId;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.pan = pan;
	}

	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", emailId=" + emailId + ", password="
				+ password + ", phoneNumber=" + phoneNumber + ", pan=" + pan + "]";
	}
	
	

}
