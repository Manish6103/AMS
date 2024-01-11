package com.firstproject.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstproject.app.modules.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
            
	
}
