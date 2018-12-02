package com.diploma.przychodnia_rehabilitacyjna.controller;

import com.diploma.przychodnia_rehabilitacyjna.sdo.VisitSdo;
import com.diploma.przychodnia_rehabilitacyjna.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sylwia on 24.11.18.
 */
@RestController
@RequestMapping("/api")

public class DiseaseController {

    @Autowired
    DiseaseService diseaseService;

    @RequestMapping(value = "/disease/{id}/recommendations", method = RequestMethod.GET)
    ResponseEntity<List<com.diploma.przychodnia_rehabilitacyjna.sdo.DoctorRecommendation>> getAllRecommendations (@PathVariable("id") Long id) {
    return new ResponseEntity (diseaseService.getAllDoctorRecommendationToDisease(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/disease/{id}/visits", method = RequestMethod.GET)
    ResponseEntity<List<VisitSdo>> getAllVisits (@PathVariable("id") Long id) {
        return new ResponseEntity (diseaseService.getAllVisitsToDisease(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/disease/{id}/visits", method = RequestMethod.POST)
    ResponseEntity<VisitSdo> addNewVisit (@RequestBody VisitSdo visitSdo, @PathVariable("id") Long id){
        return new ResponseEntity (diseaseService.addNewVisitToDisease(id, visitSdo), HttpStatus.OK);
    }

}
