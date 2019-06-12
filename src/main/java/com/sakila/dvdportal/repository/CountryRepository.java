package com.sakila.dvdportal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sakila.dvdportal.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Long>  {
	public List <Country> getAllCountries ();
}