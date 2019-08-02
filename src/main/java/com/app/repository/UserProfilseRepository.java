package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.model.UserProfile;

@Repository
public interface UserProfilseRepository extends JpaRepository<UserProfile, Long>{

	
	/*
	 * @Query("select * from com.app.model.UserProfile where (email=? or mobileno=?) and password=?2"
	 * ) public UserProfile findbyEmailOrMobilenoAndPassword(String email,String
	 * password);
	 */
	public UserProfile findByUserId(String userid);
}
