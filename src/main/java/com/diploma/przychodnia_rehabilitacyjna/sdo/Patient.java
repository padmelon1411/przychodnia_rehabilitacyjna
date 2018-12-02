package com.diploma.przychodnia_rehabilitacyjna.sdo;

/**
 * Created by sylwia on 24.11.18.
 */
public class Patient {

    private Long id;

    private String firstName;

    private String lastName;

    public Patient(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Patient (com.diploma.przychodnia_rehabilitacyjna.dao.Patient patient){
        this.id=patient.getId();
        this.firstName=patient.getFirstName();
        this.lastName=patient.getLastName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
