package com.codingdojo.loginregistration.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.loginregistration.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);

}
