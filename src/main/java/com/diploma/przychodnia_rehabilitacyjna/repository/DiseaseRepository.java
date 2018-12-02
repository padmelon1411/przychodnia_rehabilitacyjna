package com.diploma.przychodnia_rehabilitacyjna.repository;

import com.diploma.przychodnia_rehabilitacyjna.dao.Disease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sylwia on 23.11.18.
 */

public interface DiseaseRepository extends JpaRepository<Disease, Long> {
}