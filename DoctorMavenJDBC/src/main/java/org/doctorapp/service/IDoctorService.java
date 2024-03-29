package org.doctorapp.service;

import org.doctorapp.exceptions.DoctorNotFoundException;
import org.doctorapp.exceptions.IdNotFoundException;
import org.doctorapp.model.Doctor;

import java.sql.SQLException;
import java.util.List;

public interface IDoctorService {
    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId,double fees);
    void deleteDoctor(int doctorId);
    Doctor getById(int doctorId) throws IdNotFoundException ;

    List<Doctor> getAll() ;

    List<Doctor> getBySpecialist(String speciality) throws DoctorNotFoundException, SQLException;

    List<Doctor> Speciality(String speciality) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndExp(String speciality,int experience) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndLesFees(String speciality,double fees) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndRatings(String speciality,int rating) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndNameContains(String speciality,String doctorName) throws DoctorNotFoundException;


    List<Doctor> getBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException;
}
