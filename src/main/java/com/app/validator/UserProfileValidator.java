package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.UserProfile;
import com.app.util.NullUtil;

@Component
public class UserProfileValidator implements Validator {

	@Autowired
	private NullUtil utils;

	@Override
	public boolean supports(Class<?> clazz) {

		return UserProfile.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		UserProfile profile = (UserProfile) target;

		if (!Pattern.compile("[a-zA-Z\\s]{4,50}").matcher(profile.getFirstname()).matches()) {

			errors.rejectValue("firstname", "", "First Name doesn't Empty/ Not Match");
		}

		if (!Pattern.compile("[a-zA-Z\\s]{4,50}").matcher(profile.getLastname()).matches()) {
			errors.rejectValue("lastname", "", "Last Name doesn't Empty/ Not Match");
		}
		/*
		 * if (!Pattern.compile("[0-9]{10}").matcher(profile.getEmail()).matches()) {
		 * 
		 * }
		 */
		if (!Pattern.compile("[0-9]{10}").matcher(profile.getMobileno()).matches()) {
			errors.rejectValue("mobileno", "", "Please Enter Valid Mobile No");
		}
		if (NullUtil.isNotEmpty(profile.getQualification())) {
			if (!Pattern.compile("[a-zA-Z\\s]{3,20}").matcher(profile.getQualification()).matches()) {
				errors.rejectValue("qualification", "", "Please Enter Your Qualification");
			}
		}
		if (NullUtil.isNotEmpty(profile.getDesignation())) {
			if (!Pattern.compile("[a-zA-Z\\s]{4,50}").matcher(profile.getDesignation()).matches()) {
				errors.rejectValue("designation", "", "Please Enter Designation");
			}
		}
		if (NullUtil.isNotEmpty(profile.getCompanyname())) {
			if (!Pattern.compile("[a-zA-Z\\\\s]{4,50}").matcher(profile.getCompanyname()).matches()) {
				errors.rejectValue("companyname", "", "Please Enter Present Company Name");
			}
		}
		/*
		 * if (!Pattern.compile("").matcher(profile.getFburl()).matches()) {
		 * 
		 * }
		 */

		if (NullUtil.isNotEmpty(profile.getCity())) {
			if (!Pattern.compile("[a-zA-Z\\s]{3,20}").matcher(profile.getCity()).matches()) {
				errors.rejectValue("city", "", "Please Enter Living City Name");
			}
		}
		if (NullUtil.isNotEmpty(profile.getState())) {
			if (!Pattern.compile("[a-zA-Z\\s]{3,20}").matcher(profile.getState()).matches()) {
				errors.rejectValue("state", "", "Please Enter Living State Name");
			}

		}
		if (NullUtil.isNotEmpty(profile.getPincode())) {
			if (!Pattern.compile("[0-9]{6}").matcher(profile.getPincode()).matches()) {
				errors.rejectValue("pincode", "", "Please Enter Your Living Area Pincode");
			}
		}
	}
}
