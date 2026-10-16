package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.VaccinationCenter;

public interface CrudService {
	VaccinationCenter addVaccine(VaccinationCenter v);
	
	List<VaccinationCenter> displayAllVaccines();
	void deleteVaccine(Long id);

}
