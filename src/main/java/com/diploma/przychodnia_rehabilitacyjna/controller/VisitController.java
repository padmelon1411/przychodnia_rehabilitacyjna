package com.diploma.przychodnia_rehabilitacyjna.controller;

import com.diploma.przychodnia_rehabilitacyjna.sdo.MedicalTreatment;
import com.diploma.przychodnia_rehabilitacyjna.sdo.Note;
import com.diploma.przychodnia_rehabilitacyjna.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sylwia on 25.11.18.
 */

@RestController
@RequestMapping("/api")
public class VisitController {

    @Autowired
    VisitService visitService;

    @RequestMapping(value = "/visit/{id}/notes", method = RequestMethod.GET)
    ResponseEntity<List<Note>> getAllNotes(@PathVariable("id") Long id) {
        return new ResponseEntity (visitService.getAllNotes(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/visit/{id}/medicalTreatments", method = RequestMethod.GET)
    ResponseEntity<List<MedicalTreatment>> getAllMedicalTreatments (@PathVariable("id") Long id) {
        return new ResponseEntity (visitService.getAllMedicalTreatment(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/visit/{id}/notes", method = RequestMethod.POST)
    ResponseEntity<Note> addNewNote (@RequestBody Note note , @PathVariable("id") Long id){
        return new ResponseEntity (visitService.addNote(id, note), HttpStatus.OK);
    }

    @RequestMapping(value = "/visit/{id}/medicalTreatments", method = RequestMethod.POST)
    ResponseEntity<MedicalTreatment> addNewMedicalTreatments (@RequestBody MedicalTreatment medicalTreatment, @PathVariable("id") Long id) {
        return new ResponseEntity(visitService.addMedicalTreatment(id, medicalTreatment), HttpStatus.OK);
    }

}
