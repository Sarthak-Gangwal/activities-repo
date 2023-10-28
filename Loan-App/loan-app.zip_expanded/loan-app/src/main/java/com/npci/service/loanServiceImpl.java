package com.npci.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.dao.loanDao;

@Service("service")
public class loanServiceImpl implements loanService {
	

	@Autowired
	private loanDao dao;

}
