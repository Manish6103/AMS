package com.firstproject.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstproject.app.modules.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
