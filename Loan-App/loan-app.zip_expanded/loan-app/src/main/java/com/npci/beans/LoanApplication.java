package com.npci.beans;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "loan_application")
public class LoanApplication {
	
	@Id
	@Column(name = "application_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int applicationId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	private Customer customerIdRef;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "loan_id")
	private Loan loanIdRef;
	
	@Column(name = "status")
	private String status;

	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public Customer getCustomerId() {
		return customerIdRef;
	}

	public void setCustomerId(Customer customerId) {
		this.customerIdRef = customerId;
	}

	public Loan getLoanId() {
		return loanIdRef;
	}

	public void setLoanId(Loan loanId) {
		this.loanIdRef = loanId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LoanApplication(int applicationId, Customer customerId, Loan loanId, String status) {
		super();
		this.applicationId = applicationId;
		this.customerIdRef = customerId;
		this.loanIdRef = loanId;
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoanApplication [applicationId=" + applicationId + ", customerId=" + customerIdRef + ", loanId=" + loanIdRef
				+ ", status=" + status + "]";
	}
	
	
	

}
