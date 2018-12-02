package com.diploma.przychodnia_rehabilitacyjna.sdo;

import java.time.LocalDateTime;

/**
 * Created by sylwia on 24.11.18.
 */
public class Disease {

    private Long id;

    private String name;

    private LocalDateTime dateOfStartingNewTreatment;

    private LocalDateTime dateOfEndingNewTreatment;

    public Disease(Long id, String name, LocalDateTime dateOfStartingNewTreatment, LocalDateTime dateOfEndingNewTreatment) {
        this.id = id;
        this.name = name;
        this.dateOfStartingNewTreatment = dateOfStartingNewTreatment;
        this.dateOfEndingNewTreatment = dateOfEndingNewTreatment;
    }

    public Disease (com.diploma.przychodnia_rehabilitacyjna.dao.Disease disease){
        this.id=disease.getId();
        this.name=disease.getName();
        this.dateOfStartingNewTreatment=disease.getDateOfStartingNewTreatment();
        this.dateOfEndingNewTreatment=disease.getDateOfEndingNewTreatment();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfStartingNewTreatment() {
        return dateOfStartingNewTreatment;
    }

    public void setDateOfStartingNewTreatment(LocalDateTime dateOfStartingNewTreatment) {
        this.dateOfStartingNewTreatment = dateOfStartingNewTreatment;
    }

    public LocalDateTime getDateOfEndingNewTreatment() {
        return dateOfEndingNewTreatment;
    }

    public void setDateOfEndingNewTreatment(LocalDateTime dateOfEndingNewTreatment) {
        this.dateOfEndingNewTreatment = dateOfEndingNewTreatment;
    }
}
