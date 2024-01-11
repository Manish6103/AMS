package com.firstproject.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstproject.app.modules.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
