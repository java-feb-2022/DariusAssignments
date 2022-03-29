package com.codingdojo.loginregistration.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import com.codingdojo.loginregistration.models.LoginUser;
import com.codingdojo.loginregistration.models.User;
import com.codingdojo.loginregistration.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	
	//Validate User for - Duplicate email and password mismatch
	public void validate(User newUser, Errors errors) {
		//password Matching
		if(!newUser.getPassword().equals(newUser.getConfirmPassword())) {
			errors.rejectValue("password", "Mismatch" ,"Password does not match");
		}
		
		//email -duplicate
		if(userRepo.findByEmail(newUser.getEmail())!=null) {
			errors.rejectValue("email", "Taken", "This email has already been taken.");
		}
	}
	
	//Hash user's Password and add to database
	public User registerUser(User newUser) {
		String hashedPassword=BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashedPassword);
		userRepo.save(newUser);
	return null;
	}
	
	//Find user by email
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	// Find User by id
	public User FindById(Long id) {
		userRepo.findById(id).orElse(null);
		return null;
	}
	
	//Authenticate User
	public boolean authenticateUser(LoginUser newLogin,Errors errors) {
		
		//Find the user by email
		User user= userRepo.findByEmail(newLogin.getEmail());
		
		//if we cant find user by email, return false
		if(user==null) {
			errors.rejectValue("email", "missingEmail", "Email not found");
			return false;
		}
		// If user is found check if the passwords match, return true, else return false
		else {
			
			if(!BCrypt.checkpw(newLogin.getPassword(),user.getPassword())) {
				errors.rejectValue("password", "matches", "Invalid Password");
				return false;
			}
			
		}
		
		return true;
	}
	
	
	
	
}
