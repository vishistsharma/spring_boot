package com.vishist.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishist.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
