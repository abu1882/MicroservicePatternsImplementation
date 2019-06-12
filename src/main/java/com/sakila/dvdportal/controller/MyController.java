package com.sakila.dvdportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakila.dvdportal.entity.City;
import com.sakila.dvdportal.entity.Country;
import com.sakila.dvdportal.service.CityService;
import com.sakila.dvdportal.service.CountryService;

@RestController
public class MyController {
	
	@Autowired
	CityService citySrv;
	
	@Autowired
	CountryService countrySrv;
	
	
	@RequestMapping ("/allcities")
	public List <City> getAllCities () {
		return citySrv.getCities();
	}

	@RequestMapping ("/allcountires")
	public List <Country> getAllCountry () {
		return countrySrv.getAllCountries();
	}
}
