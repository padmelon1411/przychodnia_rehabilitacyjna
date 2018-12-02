package com.diploma.przychodnia_rehabilitacyjna.service;

import com.diploma.przychodnia_rehabilitacyjna.dao.Patient;
import com.diploma.przychodnia_rehabilitacyjna.repository.PatientRepository;
import com.diploma.przychodnia_rehabilitacyjna.sdo.Disease;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylwia on 24.11.18.
 */

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public Patient getById(Long id){
        return patientRepository.getOne(id);
    }

    public List<Disease> getAllPatientDiseases (Long patientId){

        com.diploma.przychodnia_rehabilitacyjna.dao.Patient patient = patientRepository.findById(patientId).get();

        List<Disease> diseaseList = new ArrayList<Disease>();

        for(com.diploma.przychodnia_rehabilitacyjna.dao.Disease disease : patient.getDiseases()){
            com.diploma.przychodnia_rehabilitacyjna.sdo.Disease foundDisease = new com.diploma.przychodnia_rehabilitacyjna.sdo.Disease(disease);
            diseaseList.add(foundDisease);
        }

        return diseaseList;
    }
}
