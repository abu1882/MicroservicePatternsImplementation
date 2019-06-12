package com.sakila.dvdportal.repository;

import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.sakila.dvdportal.entity.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long>  {
	public List <City> getAllCities ();
}
