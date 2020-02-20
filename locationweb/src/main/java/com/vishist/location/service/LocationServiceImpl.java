package com.vishist.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.vishist.location.entities.Location;
import com.vishist.location.repos.LocationRepository;

public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;
	
	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		// TODO Auto-generated method stub
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		// TODO Auto-generated method stub
		repository.delete(location);
	}

	@Override
	public Location getLocationById(int Id) {
		// TODO Auto-generated method stub
		Optional<Location> findById = repository.findById(Id);
		return findById.get();
	}

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

}