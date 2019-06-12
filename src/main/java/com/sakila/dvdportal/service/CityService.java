package com.sakila.dvdportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakila.dvdportal.entity.City;
import com.sakila.dvdportal.repository.CityRepository;

@Service
public class CityService {
	
	@Autowired
	CityRepository cityRepo;
	
	public List <City> getCities () {
		return cityRepo.getAllCities();
	}
	

}
