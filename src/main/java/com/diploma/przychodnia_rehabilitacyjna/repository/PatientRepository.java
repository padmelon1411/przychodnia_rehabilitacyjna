package com.diploma.przychodnia_rehabilitacyjna.repository;

import com.diploma.przychodnia_rehabilitacyjna.dao.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sylwia on 23.11.18.
 */

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
