package com.diploma.przychodnia_rehabilitacyjna.service;

import com.diploma.przychodnia_rehabilitacyjna.dao.Visit;
import com.diploma.przychodnia_rehabilitacyjna.repository.MedicalTreatmentRepository;
import com.diploma.przychodnia_rehabilitacyjna.repository.NoteRepository;
import com.diploma.przychodnia_rehabilitacyjna.repository.VisitRepository;
import com.diploma.przychodnia_rehabilitacyjna.sdo.MedicalTreatment;
import com.diploma.przychodnia_rehabilitacyjna.sdo.Note;
import com.diploma.przychodnia_rehabilitacyjna.sdo.VisitSdo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylwia on 25.11.18.
 */

@Service
public class VisitService {

    @Autowired
    VisitRepository visitRepository;

    @Autowired
    NoteRepository noteRepository;

    @Autowired
    MedicalTreatmentRepository medicalTreatmentRepository;

    public List<Note> getAllNotes (Long visitId) {

        Visit visit = visitRepository.findById(visitId).get();

        List<Note> noteList = new ArrayList<Note>();

        for (com.diploma.przychodnia_rehabilitacyjna.dao.Note note : visit.getNotes()){
            Note foundNote = new Note(note);
            noteList.add(foundNote);
        }
        return noteList;
    }

    public List<MedicalTreatment> getAllMedicalTreatment (Long visitId) {

        Visit visit = visitRepository.findById(visitId).get();

        List<MedicalTreatment> medicalTreatmentList = new ArrayList<MedicalTreatment>();

        for (com.diploma.przychodnia_rehabilitacyjna.dao.MedicalTreatment medicalTreatment : visit.getMedicalTreatments()){
            MedicalTreatment foundMedicalTreatment = new MedicalTreatment(medicalTreatment);
            medicalTreatmentList.add(foundMedicalTreatment);
        }
        return medicalTreatmentList;
    }

    public Note addNote (Long visitId, Note noteSdo){

        Visit visit = visitRepository.findById(visitId).get();

        com.diploma.przychodnia_rehabilitacyjna.dao.Note noteDao = new com.diploma.przychodnia_rehabilitacyjna.dao.Note();

        noteDao.setContentOfNote(noteSdo.getContentOfNote());

        visit.getNotes().add(noteDao);
        noteDao.setVisit(visit);

        noteRepository.save(noteDao);
        visitRepository.saveAndFlush(visit);

        Note noteSdoSdo = new Note(noteDao);

        return noteSdoSdo;

    }

    public MedicalTreatment addMedicalTreatment (Long visitId, MedicalTreatment medicalTreatment){

        Visit visit = visitRepository.findById(visitId).get();

        com.diploma.przychodnia_rehabilitacyjna.dao.MedicalTreatment treatmentDao = new com.diploma.przychodnia_rehabilitacyjna.dao.MedicalTreatment();

        treatmentDao.setName(medicalTreatment.getName());
        treatmentDao.setDescription(medicalTreatment.getDescription());

        visit.getMedicalTreatments().add(treatmentDao);
        treatmentDao.setVisit(visit);


        medicalTreatmentRepository.save(treatmentDao);
        visitRepository.saveAndFlush(visit);

        MedicalTreatment treatmentSdo = new MedicalTreatment(treatmentDao);

        return treatmentSdo;
    }


}