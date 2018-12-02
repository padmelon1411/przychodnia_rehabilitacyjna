package com.diploma.przychodnia_rehabilitacyjna.sdo;

/**
 * Created by sylwia on 24.11.18.
 */
public class DoctorRecommendation {

    private Long id;

    private String name;

    public DoctorRecommendation(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DoctorRecommendation (com.diploma.przychodnia_rehabilitacyjna.dao.DoctorRecommendation doctorRecommendation){
        this.id=doctorRecommendation.getId();
        this.name=doctorRecommendation.getName();
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
}
