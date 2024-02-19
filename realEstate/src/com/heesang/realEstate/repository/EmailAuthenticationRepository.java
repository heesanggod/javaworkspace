package com.heesang.realEstate.repository;

import java.sql.SQLException;

public interface EmailAuthenticationRepository {
	
	boolean existsByEmail(String email) throws SQLException;
	
	void save(String eamil, String authenticationCode) throws SQLException;
	

}
