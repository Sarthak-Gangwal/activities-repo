package com.npci.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;
	
	@Column(name = "employee_name")
	private String empname;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "password")
	private String password;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//getters & setters
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
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


	
	//Parameterized constructor
	public Employee(int employee_id, String empname, String emailId, String password) {
		super();
		this.employee_id = employee_id;
		this.empname = empname;
		this.emailId = emailId;
		this.password = password;
	}


	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", empname=" + empname + ", emailId=" + emailId + ", password="
				+ password + "]";
	}
	
	
	
	
}
