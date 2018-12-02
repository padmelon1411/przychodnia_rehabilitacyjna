package com.diploma.przychodnia_rehabilitacyjna.repository;

import com.diploma.przychodnia_rehabilitacyjna.dao.MedicalTreatment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sylwia on 24.11.18.
 */
public interface MedicalTreatmentRepository extends JpaRepository<MedicalTreatment, Long> {
}
