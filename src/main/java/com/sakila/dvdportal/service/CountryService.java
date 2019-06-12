package com.sakila.dvdportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakila.dvdportal.entity.Country;
import com.sakila.dvdportal.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository CountryRepo;
	
	public List <Country> getAllCountries () {
		return CountryRepo.getAllCountries();
	}
}
