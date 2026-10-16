package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.soa.exam.entity.VaccinationCenter;

import jakarta.persistence.Id;

public interface CrudRepository extends JpaRepository<VaccinationCenter, Long> {
	
	

}
