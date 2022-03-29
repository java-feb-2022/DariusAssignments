package com.codingdojo.fullcrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.fullcrud.models.Travel;
import com.codingdojo.fullcrud.repositories.TravelRepository;

@Service
public class TravelService {
	@Autowired  //this replaces the constructor for travelRepo
	private TravelRepository travelRepo;
	
	//All Arts
	public List<Travel> getAllTravels(){
		return travelRepo.findAll();
	}
	
	//Create Art
	public Travel createTravel(Travel newTravel) {
		return travelRepo.save(newTravel);
	}
	
	//Update Art and Display details before edit
	public Travel travelDetail(long id) {
		return travelRepo.findById(id).orElse(null);
	}
	public Travel updateTravel(Travel updatedTravel) {
		return travelRepo.save(updatedTravel);
	}
	//Delete Art
	public void deleteTravel(Long id) {
		travelRepo.deleteById(id);
	}
	
	
}
