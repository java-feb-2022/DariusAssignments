package com.codingdojo.onetomany.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.onetomany.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();

}
