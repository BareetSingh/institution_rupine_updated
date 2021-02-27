package com.rupine.inst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rupine.inst.model.Profile;
import com.rupine.inst.service.ProfileService;

@RestController
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	@GetMapping("/profile/{id}")
	public Profile getProfile(@PathVariable("id") Long id){
		
		Profile p=profileService.getProfile(id);
		return p;
	}
}
