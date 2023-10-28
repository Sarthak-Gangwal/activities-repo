package com.npci.service;

import java.util.List;

public interface loanApplicationService {

	//apply for loan
	//view all loan
	//see loan states
	
	loanApplicationService applyforloan(loanApplicationService loanApplication);
	List<loanApplicationService> allLoans();
	List<loanApplicationService> findAll();
}
