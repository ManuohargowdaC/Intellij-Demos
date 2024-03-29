package org.doctorapp.service;

import org.doctorapp.exceptions.DoctorNotFoundException;
import org.doctorapp.exceptions.IdNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.repository.DoctorRepositoryImpl;
import org.doctorapp.repository.IDoctorRepository;
import org.doctorapp.util.DoctorDb;
import org.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoctorServiceImpl implements IDoctorService {
    private IDoctorRepository doctorRepository=new DoctorRepositoryImpl();
    @Override
    public void addDoctor(Doctor doctor) {
        doctorRepository.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        doctorRepository.updateDoctor(doctorId,fees);
    }

    @Override
    public void deleteDoctor(int doctorId) {doctorRepository.deleteDoctor(doctorId);
    }

    @Override
    public Doctor getById(int doctorId) throws IdNotFoundException {
        Doctor doctor=doctorRepository.findById(doctorId);
        if(doctor==null)
            throw new IdNotFoundException("Invalid id");
        return doctor;
    }

    @Override
    public List<Doctor> getAll() {
        List<Doctor> doctorList=doctorRepository.findAll();
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialist(String speciality) throws DoctorNotFoundException, SQLException {
        List<Doctor> doctorList=new ArrayList<>();
        try(Connection connection= DoctorDb.OpenConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECIALITY);
        ){
            statement.setString(1,speciality);
            try(ResultSet resultSet=statement.executeQuery();){
                while (resultSet.next()){
                    int doctorId=resultSet.getInt("doctor_id");
                    String doctorName=resultSet.getString("doctor_name");
                    double fees=resultSet.getDouble("fees");
                    int rating=resultSet.getInt("ratings");
                    int experience=resultSet.getInt("experience");
                    Doctor doctor=new Doctor();


                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setRatings(rating);
                    doctor.setFees(fees);
                    doctor.setDoctorId(doctorId);

                    doctorList.add(doctor);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return doctorList;
    }

    @Override
    public List<Doctor> Speciality(String speciality) throws DoctorNotFoundException{
        List<Doctor> doctorList=doctorRepository.Speciality(speciality);
        if(doctorList.isEmpty()){
            throw new DoctorNotFoundException("Doctor with this speciality Not Found");
        }
        Collections.sort(doctorList,(d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException{
        List<Doctor> doctorList=doctorRepository.findBySpecialityAndExp(speciality,experience);
        if(doctorList.isEmpty()){
            throw new DoctorNotFoundException("Doctor with this speciality and experience Not Found");
        }
        Collections.sort(doctorList,(d1,d2)->((Integer)(d2.getExperience())).compareTo(d1.getExperience()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndLesFees(String speciality, double fees) throws DoctorNotFoundException{

        List<Doctor> doctorList=doctorRepository.findBySpecialityAndLesFees(speciality,fees);
        if(doctorList.isEmpty()){
            throw new DoctorNotFoundException("Doctor with this speciality and less fees Not Found");
        }
        Collections.sort(doctorList,(d1,d2)->((Double)d2.getFees()).compareTo(d1.getFees()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndRatings(String speciality, int rating) throws DoctorNotFoundException{

        List<Doctor> doctorList=doctorRepository.findBySpecialityAndRatings(speciality,rating);
        if(doctorList.isEmpty()){
            throw new DoctorNotFoundException("Doctor with this speciality and rating Not Found");
        }
        Collections.sort(doctorList,(d1,d2)->((Integer)d2.getRatings()).compareTo(d1.getRatings()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName)  throws DoctorNotFoundException{
        List<Doctor> doctorList=doctorRepository.findBySpecialityAndNameContains(speciality,doctorName);
        if(doctorList.isEmpty()){
            throw new DoctorNotFoundException("Doctor with this speciality and name Not Found");
        }

        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndFees(String speciality, double fees) {
        List<Doctor> doctorList=new ArrayList<>();
        try(Connection connection= DoctorDb.OpenConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECANDFEES);
        ){
            statement.setString(1,speciality);
            statement.setDouble(2,fees);
            try(ResultSet resultSet=statement.executeQuery();){
                while (resultSet.next()){
                    int doctorId=resultSet.getInt("doctor_id");
                    String doctorName=resultSet.getString("doctor_name");
                    int rating=resultSet.getInt("ratings");
                    int experience=resultSet.getInt("experience");
                    Doctor doctor=new Doctor();


                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setRatings(rating);
                    doctor.setFees(fees);
                    doctor.setDoctorId(doctorId);

                    doctorList.add(doctor);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return doctorList;
    }


}
