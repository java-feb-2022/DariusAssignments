package com.codingdojo.onetomany.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.onetomany.models.Dojo;
import com.codingdojo.onetomany.models.Ninja;
import com.codingdojo.onetomany.repositories.DojoRepository;
import com.codingdojo.onetomany.repositories.NinjaRepository;


@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepo;
	
	@Autowired
	private DojoRepository dojoRepo;
	
	//All ninjas
	public List<Ninja> getAllNinjas(){
		return ninjaRepo.findAll();
	}
	
	//Create ninja
	public Ninja createNinja(Ninja newNinja) {
		return ninjaRepo.save(newNinja);
	}
	//All dojos
	public List<Dojo> getAllDojos(){
		return dojoRepo.findAll();
	}
	
	//create dojo
	public Dojo createDojo(Dojo newDojo) {
		return dojoRepo.save(newDojo);
	}
	
	public Ninja ninjaDetail(Long id) {
		return ninjaRepo.findById(id).orElse(null);
	}
	public Dojo dojoDetail(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
	
	
}
