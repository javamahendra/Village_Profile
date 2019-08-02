package com.app.service;

import java.util.List;

import com.app.model.UserProfile;

public interface UserService {
	
	public UserProfile saveUserProfile(UserProfile userProfile);
	public List<UserProfile> getAllUsers();
	
	public List<UserProfile> getBasedOnProfileSearch(String profilename);
	public List<UserProfile> getBasedOnTagSearch(String tagprofile);

	public boolean deleteUserProfile(String userid);
	public UserProfile getUserProfile(String username, String password);
}
