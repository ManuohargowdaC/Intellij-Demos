package org.doctorapp.model;

public enum Specialisation {
    ORTHO("ORTHOPEDIC"),
    PEDIA("PEDIATRICIAN"),
    PHYSICIAN("GENERAL PHYSICIAN"),
    GYNAEC("GYNAECOLOGIST"),
    NEURO("NEUROLOGIST"),
    DERMA("DERMATOLOGIST");

    private String speciality;

    Specialisation(String speciality) {
        this.speciality = speciality;
    }

    public  String getSpeciality() {
        return speciality;
    }
}
