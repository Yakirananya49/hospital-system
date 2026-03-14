package com.hospital.hospitalsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.hospitalsystem.model.Patient;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    List<Patient> findByDoctorId(Long doctorId);

}