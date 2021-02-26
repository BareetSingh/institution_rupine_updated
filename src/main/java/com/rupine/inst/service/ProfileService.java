package com.rupine.inst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rupine.inst.model.Profile;
import com.rupine.inst.repository.ProfileRepository;

@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profileRepo;
	
	public Profile getProfile(Long id){
		return profileRepo.findInstituteById(id);
	}
}
