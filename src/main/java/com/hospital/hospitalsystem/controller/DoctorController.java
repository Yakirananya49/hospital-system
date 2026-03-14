package com.hospital.hospitalsystem.controller;
import com.hospital.hospitalsystem.model.Patient;
import com.hospital.hospitalsystem.repository.PatientRepository;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.hospital.hospitalsystem.model.Doctor;
import com.hospital.hospitalsystem.repository.DoctorRepository;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorRepository repo;
    private final PatientRepository patientRepo;
    public DoctorController(DoctorRepository repo, PatientRepository patientRepo) {
        this.repo = repo;
        this.patientRepo = patientRepo;
    }

    @GetMapping
    public List<Doctor> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return repo.save(doctor);
    }
    @GetMapping("/{id}/patients")
    public List<Patient> getPatientsByDoctor(@PathVariable Long id) {
        return patientRepo.findByDoctorId(id);
    }
}