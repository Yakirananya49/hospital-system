package com.hospital.hospitalsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.hospitalsystem.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {


}