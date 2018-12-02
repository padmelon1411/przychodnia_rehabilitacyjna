package com.diploma.przychodnia_rehabilitacyjna.repository;

import com.diploma.przychodnia_rehabilitacyjna.dao.DoctorRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sylwia on 23.11.18.
 */

public interface DoctorRecommendationRepository extends JpaRepository<DoctorRecommendation, Long> {
}
