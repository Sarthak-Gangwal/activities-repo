package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.beans.LoanApplication;

public interface loanApplicationDao extends JpaRepository<LoanApplication, Integer> {

}
