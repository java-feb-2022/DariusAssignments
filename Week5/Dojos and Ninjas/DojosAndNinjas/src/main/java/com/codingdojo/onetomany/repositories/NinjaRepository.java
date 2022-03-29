package com.codingdojo.onetomany.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.onetomany.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();

}
