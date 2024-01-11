package com.firstproject.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.firstproject.app.modules.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
