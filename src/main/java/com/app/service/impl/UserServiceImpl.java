package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.UserProfile;
import com.app.repository.UserProfilseRepository;
import com.app.service.UserService;
import com.app.util.GenerateUniqueIds;
import com.app.util.NullUtil;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserProfilseRepository userReposotiry;
	
	@Autowired
	private GenerateUniqueIds idsGenerator;
	
	@Override
	public UserProfile saveUserProfile(UserProfile userProfile) {
		userProfile.setUserId(idsGenerator.generateId(32));
		
		return userReposotiry.save(userProfile);
	}

	@Override
	public List<UserProfile> getAllUsers() {
		
		return userReposotiry.findAll();
	}

	@Override
	public List<UserProfile> getBasedOnProfileSearch(String profilename) {
		
		return null;
	}

	@Override
	public List<UserProfile> getBasedOnTagSearch(String tagprofile) {
		
		return null;
	}

	@Override
	public boolean deleteUserProfile(String userid) {
		
		boolean flag=false;
		UserProfile profile=userReposotiry.findByUserId(userid);
		
		if(NullUtil.isNotEmpty(profile)) {
			userReposotiry.delete(profile);
			flag=true;
			return flag;
		}else {
			return flag=false;
		}
		
	}

	@Override
	public UserProfile getUserProfile(String username, String password) {

		
		//userReposotiry.findbyEmailOrMobilenoAndPassword(username, password);
		return null;
	}

	
}
