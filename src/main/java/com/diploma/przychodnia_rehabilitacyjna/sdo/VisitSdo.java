package com.diploma.przychodnia_rehabilitacyjna.sdo;

import com.diploma.przychodnia_rehabilitacyjna.dao.Visit;

import java.time.LocalDateTime;

/**
 * Created by sylwia on 24.11.18.
 */
public class VisitSdo {
    private Long id;

    private LocalDateTime dateOfVisit;

    public VisitSdo(Long id, LocalDateTime dateOfStartingNewTreatment) {
        this.id = id;
        this.dateOfVisit = dateOfStartingNewTreatment;
    }

    public VisitSdo(Visit visit){
        this.id=visit.getId();
        this.dateOfVisit=visit.getDateOfVisit();
    }

    public VisitSdo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(LocalDateTime dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }
}
