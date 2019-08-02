package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.model.UserProfile;
import com.app.service.UserService;
import com.app.util.GenerateUniqueIds;
import com.app.util.NullUtil;
import com.app.validator.UserProfileValidator;

@Controller
@RequestMapping("/mahindra")
public class MyController {
	
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserProfileValidator userProfileValidator;
	
	@GetMapping("/hemo")
	public String hello() {
		
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@PostMapping("/loginuser")
	public String loginuser(ModelMap model,
			@RequestParam("userid")String userid,@RequestParam("userpassword")String userpassword,RedirectAttributes redirectAttributes) {
		
		if(userid != null && userpassword != null) {
			
			UserProfile profile=userService.getUserProfile(userid, userpassword);
			
			if(NullUtil.isNotEmpty(profile)){	
				
				model.addAttribute("", profile);
			}else {
				redirectAttributes.addFlashAttribute("msg", "user credintials doesn't match");
				return "login";
			}
			return "redirect:login";
		}else {
			//redirectAttributes.addFlashAttribute("msg", "user credintials doesn't match");
			model.addAttribute("msg", "user credintials doesn't match");
			return "login";
		}
	}
	
	
	
	@PostMapping("/saveprofile")
	public String saveprofile(@ModelAttribute UserProfile userprofile,ModelMap model) {
		
		
		System.out.println(userprofile);
		
		model.addAttribute("userprofile",new UserProfile());
		
		return "addprofile";
	}
	
	@GetMapping("/addprofile")
	public String addprofile(ModelMap model) {
		
		
		model.addAttribute("userprofile",new UserProfile());
		
		return "addprofile";
	}
	
	@PostMapping("/saveuserprofile")
	public String saveUserProfile(@ModelAttribute UserProfile userProfile
			,@RequestParam(value="file",required = false)MultipartFile file, Errors errors) {
		
		if(!file.isEmpty()) {
			
		}else {
		
			
		}
		
		
		
		return null;
	}
	
	@RequestMapping("/download/file")
	public byte[] searchUserFile(@RequestParam("userid")String userid) {
		
		if(userid !=null) {
		
			
			
		}else {
			
			
		}
		
		
		
		return null;
	}
}
