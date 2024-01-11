package com.firstproject.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstproject.app.modules.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
