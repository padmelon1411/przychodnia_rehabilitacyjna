package com.diploma.przychodnia_rehabilitacyjna.service;

import com.diploma.przychodnia_rehabilitacyjna.dao.Disease;
import com.diploma.przychodnia_rehabilitacyjna.dao.Visit;
import com.diploma.przychodnia_rehabilitacyjna.repository.DiseaseRepository;
import com.diploma.przychodnia_rehabilitacyjna.repository.VisitRepository;
import com.diploma.przychodnia_rehabilitacyjna.sdo.DoctorRecommendation;
import com.diploma.przychodnia_rehabilitacyjna.sdo.VisitSdo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylwia on 24.11.18.
 */

@Service
public class DiseaseService {

    @Autowired
    DiseaseRepository diseaseRepository;

    @Autowired
    VisitRepository visitRepository;

    public List<DoctorRecommendation> getAllDoctorRecommendationToDisease(Long diseaseId) {

        Disease disease = diseaseRepository.findById(diseaseId).get();

        List<DoctorRecommendation> doctorRecommendationList = new ArrayList<DoctorRecommendation>();

        for (com.diploma.przychodnia_rehabilitacyjna.dao.DoctorRecommendation doctorRecommendation : disease.getDoctorRecommendations()) {
            com.diploma.przychodnia_rehabilitacyjna.sdo.DoctorRecommendation foundRecommendation = new com.diploma.przychodnia_rehabilitacyjna.sdo.DoctorRecommendation(doctorRecommendation);
            doctorRecommendationList.add(foundRecommendation);
        }
        return doctorRecommendationList;
    }

    public List<VisitSdo> getAllVisitsToDisease(Long diseaseId) {

        Disease disease = diseaseRepository.findById(diseaseId).get();

        List<VisitSdo> visitSdoList = new ArrayList<VisitSdo>();

        for (com.diploma.przychodnia_rehabilitacyjna.dao.Visit visit : disease.getVisits()) {
            VisitSdo foundVisitSdo = new VisitSdo(visit);
            visitSdoList.add(foundVisitSdo);
        }

        return visitSdoList;
    }

    public VisitSdo addNewVisitToDisease(Long diseaseId, VisitSdo visit) {

        Disease disease = diseaseRepository.findById(diseaseId).get();

       Visit visitDao = new Visit();
        visitDao.setDateOfVisit(visit.getDateOfVisit());

        disease.getVisits().add(visitDao);
        visitDao.setDisease(disease);

        visitRepository.save(visitDao);
        diseaseRepository.saveAndFlush(disease);

        VisitSdo visitSdoSdo = new VisitSdo(visitDao);

        return visitSdoSdo;
    }
}



