package com.diploma.przychodnia_rehabilitacyjna.controller;

import com.diploma.przychodnia_rehabilitacyjna.sdo.Disease;
import com.diploma.przychodnia_rehabilitacyjna.sdo.Patient;
import com.diploma.przychodnia_rehabilitacyjna.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.*;

/**
 * Created by sylwia on 24.11.18.
 */
@RestController
@RequestMapping("/api")
public class PatientController {

    @Autowired
    PatientService patientService;

    @RequestMapping(value = "/patient/{id}" , method = RequestMethod.GET)
    ResponseEntity<Patient> getPatient (@PathVariable("id") Long id){

        try{
            Patient patient = new Patient(patientService.getById(id));
            return new ResponseEntity<Patient>(patient, HttpStatus.OK);
        }catch (EntityNotFoundException e){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/patient/{id}/diseases", method = RequestMethod.GET)
    ResponseEntity<List<Disease>> getAllDiseases (@PathVariable("id") Long id){
        return new ResponseEntity (patientService.getAllPatientDiseases(id), HttpStatus.OK);
    }
}
