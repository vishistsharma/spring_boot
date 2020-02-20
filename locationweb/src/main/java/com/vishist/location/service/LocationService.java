package com.vishist.location.service;

import com.vishist.location.entities.Location;

import java.util.List;

public interface LocationService {
	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int Id);

	List<Location> getAllLocations();

}
