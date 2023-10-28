package com.npci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.dao.loanApplicationDao;



@Service("service")   
public class loanApplicationServiceImpl implements loanApplicationService {

	

	@Autowired
	private loanApplicationDao dao;

	@Override
	public loanApplicationService applyforloan(loanApplicationService loanApplication) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<loanApplicationService> allLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<loanApplicationService> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
