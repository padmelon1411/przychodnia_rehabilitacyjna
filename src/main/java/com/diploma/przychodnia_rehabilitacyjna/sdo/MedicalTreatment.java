package com.diploma.przychodnia_rehabilitacyjna.sdo;

import com.diploma.przychodnia_rehabilitacyjna.dao.*;
import com.diploma.przychodnia_rehabilitacyjna.dao.Physiotherapist;

/**
 * Created by sylwia on 24.11.18.
 */
public class MedicalTreatment {

    private Long id;

    private String name;

    private String description;

    //try
    private com.diploma.przychodnia_rehabilitacyjna.sdo.Physiotherapist physiotherapist;

    public MedicalTreatment(Long id, String name, String description, Long idPhysiotherapist) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.physiotherapist.setId(idPhysiotherapist);
    }

    public MedicalTreatment (com.diploma.przychodnia_rehabilitacyjna.dao.MedicalTreatment medicalTreatment){
        this.id=medicalTreatment.getId();
        this.name=medicalTreatment.getName();
        this.description=medicalTreatment.getDescription();
        this.physiotherapist=new com.diploma.przychodnia_rehabilitacyjna.sdo.Physiotherapist(medicalTreatment.getPhysiotherapist());
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public com.diploma.przychodnia_rehabilitacyjna.sdo.Physiotherapist getPhysiotherapist() {
        return physiotherapist;
    }

    public void setPhysiotherapist(com.diploma.przychodnia_rehabilitacyjna.sdo.Physiotherapist physiotherapist) {
        this.physiotherapist = physiotherapist;
    }
}
