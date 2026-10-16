package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.VaccinationCenter;
import com.klef.soa.exam.service.CrudService;

@RestController
public class CrudController {

    @Autowired
    private CrudService service;


    @PostMapping("/add")
    public ResponseEntity<VaccinationCenter> addVaccine(@RequestBody VaccinationCenter v) {
        VaccinationCenter vaccine = service.addVaccine(v);
        return ResponseEntity.status(201).body(vaccine);
    }

    
    @GetMapping("/displayall")
    public ResponseEntity<List<VaccinationCenter>> displayAllVaccines() {
        List<VaccinationCenter> vaccines = service.displayAllVaccines();
        return ResponseEntity.status(200).body(vaccines);
    }
   
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteVaccine(@PathVariable Long id) {
        service.deleteVaccine(id);
        return ResponseEntity.status(200).body("Vaccine deleted successfully");
    }
}