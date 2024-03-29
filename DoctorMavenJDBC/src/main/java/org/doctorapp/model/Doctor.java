package org.doctorapp.model;

public class Doctor {
    private int doctorId;
    private String doctorName;
    private String speciality;
    private double fees;
    private int ratings;
    private int experience;


    public Doctor() {
    }

    public Doctor(String doctorName, String speciality, double fees, int ratings, double experience) {
        this.doctorName = doctorName;
        this.speciality = speciality;
        this.fees = fees;
        this.ratings = ratings;
        this.experience = (int) experience;
    }

    public Doctor(int doctorId, String doctorName, String speciality, double fees, int ratings, int experience) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.speciality = String.valueOf(Integer.parseInt(speciality));
        this.fees = fees;
        this.ratings = ratings;
        this.experience = experience;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = String.valueOf(Integer.parseInt(speciality));
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", fees=" + fees +
                ", ratings=" + ratings +
                ", experience=" + experience +
                '}';
    }
}
