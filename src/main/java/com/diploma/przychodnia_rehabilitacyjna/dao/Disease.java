package com.diploma.przychodnia_rehabilitacyjna.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylwia on 23.11.18.
 */

@Entity
@Table(name = "disease")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Disease implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient patient;

    @NotNull
    private LocalDateTime dateOfStartingNewTreatment;

    @NotNull
    private LocalDateTime dateOfEndingNewTreatment;

    @OneToMany(mappedBy = "disease")
    private List<Visit>visits = new ArrayList<>();

    public List<DoctorRecommendation> getDoctorRecommendations() {
        return doctorRecommendations;
    }

    public void setDoctorRecommendations(List<DoctorRecommendation> doctorRecommendations) {
        this.doctorRecommendations = doctorRecommendations;
    }

    @OneToMany(mappedBy = "disease")

    private List<DoctorRecommendation> doctorRecommendations = new ArrayList<>();

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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
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

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }
}
