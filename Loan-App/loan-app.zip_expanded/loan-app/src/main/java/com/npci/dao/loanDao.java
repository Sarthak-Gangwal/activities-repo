package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.beans.Loan;

public interface loanDao extends JpaRepository<Loan, Integer> {

}
