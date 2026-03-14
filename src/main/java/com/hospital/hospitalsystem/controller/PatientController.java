package com.hospital.hospitalsystem.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.hospital.hospitalsystem.model.Patient;
import com.hospital.hospitalsystem.repository.PatientRepository;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientRepository repo;

    public PatientController(PatientRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Patient> getAll() {
        return repo.findAll();
    }
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return repo.save(patient);
    }
    }