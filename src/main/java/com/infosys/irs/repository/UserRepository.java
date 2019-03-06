package com.infosys.irs.repository;

import org.springframework.stereotype.Repository;

import com.infosys.irs.model.User;

@Repository
public class UserRepository {

	public String registerUser(User user) {
		return "UserRepository.Registration_sucess";
		
	}
}
