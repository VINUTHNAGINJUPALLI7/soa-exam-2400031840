package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.VaccinationCenter;
import com.klef.soa.exam.repository.CrudRepository;

@Service
public class CrudServiceImpl implements CrudService {
	
	@Autowired
	private CrudRepository repo;

	@Override
	public VaccinationCenter addVaccine(VaccinationCenter v) {
		// TODO Auto-generated method stub
		return repo.save(v);
	}

	@Override
	public List<VaccinationCenter> displayAllVaccines() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	@Override
	public void deleteVaccine(Long id) {
	    repo.deleteById(id);
	}
	
	
	

}
