package org.doctorapp.repository;

import org.doctorapp.model.Doctor;
import org.doctorapp.util.DoctorDb;
import org.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void addDoctor(Doctor doctor) {
        //establish connection
        //create prepared methods
        //set values
        try(Connection connection= DoctorDb.OpenConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.INSERTQUERY);){
            statement.setString(1,doctor.getDoctorName());
            statement.setString(2,doctor.getSpeciality());
            statement.setInt(3,doctor.getExperience());
            statement.setInt(4,doctor.getRatings());
            statement.setDouble(5,doctor.getFees());

            boolean result=statement.execute();
            System.out.println("one row inserted "+!result);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        try(Connection connection= DoctorDb.OpenConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);){
            statement.setInt(2,doctorId);
            statement.setDouble(1,fees);

            boolean result=statement.execute();
            System.out.println("doctor updated "+!result);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void deleteDoctor(int doctorId) {
        try(Connection connection= DoctorDb.OpenConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.DELETEQUERY);){
            statement.setInt(1,doctorId);

            boolean result=statement.execute();
            System.out.println("doctor updated "+!result);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Doctor findById(int doctorId) {
        try(Connection connection= DoctorDb.OpenConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYID);
        ){
            statement.setInt(1,doctorId);
            try(ResultSet resultSet=statement.executeQuery();){
                while (resultSet.next()){
                    String speciality=resultSet.getString("speciality");
                    String doctorName=resultSet.getString("doctor_name");
                    double fees=resultSet.getDouble("fees");
                    int rating=resultSet.getInt("ratings");
                    int experience=resultSet.getInt("experience");

                    Doctor doctor=new Doctor(doctorId,doctorName,speciality,fees,rating,experience);
                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setRatings(rating);
                    doctor.setFees(fees);
                    doctor.setDoctorId(doctorId);

                    return doctor;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor> doctorList=new ArrayList<>();
        try(Connection connection= DoctorDb.OpenConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDALLQUERY);
            ResultSet resultSet= statement.executeQuery(Queries.FINDALLQUERY);){

            while (resultSet.next()){
                int doctorId=resultSet.getInt("doctor_id");
                String doctorName=resultSet.getString("doctor_name");
                String speciality=resultSet.getString("speciality");
                double fees=resultSet.getDouble("fees");
                int rating=resultSet.getInt("ratings");
                int experience=resultSet.getInt("experience");
                Doctor doctor=new Doctor(doctorId,doctorName,speciality,fees,rating,experience);
                doctorList.add(doctor);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return doctorList;
    }



    @Override
    public List<Doctor> Speciality(String speciality)  {
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
    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
        List<Doctor> doctorList=new ArrayList<>();
        try(Connection connection= DoctorDb.OpenConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECANDEX);
        ){
            statement.setString(1,speciality);
            statement.setInt(1,experience);
            try(ResultSet resultSet=statement.executeQuery();){
                while (resultSet.next()){
                    int doctorId=resultSet.getInt("doctor_id");
                    String doctorName=resultSet.getString("doctor_name");
                    double fees=resultSet.getDouble("fees");
                    int rating=resultSet.getInt("ratings");

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
    public List<Doctor> findBySpecialityAndLesFees(String speciality, double fees) {
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

    @Override
    public List<Doctor> findBySpecialityAndRatings(String speciality, int rating) {
        List<Doctor> doctorList=new ArrayList<>();
        try(Connection connection= DoctorDb.OpenConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECANDRATINGS);
        ){
            statement.setString(1,speciality);
            statement.setInt(2,rating);
            try(ResultSet resultSet=statement.executeQuery();){
                while (resultSet.next()){
                    int doctorId=resultSet.getInt("doctor_id");
                    String doctorName=resultSet.getString("doctor_name");
                    double fees=resultSet.getDouble("fees");
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
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctorList=new ArrayList<>();
        try(Connection connection=DoctorDb.OpenConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECANDNAME);
        ){
            statement.setString(1,speciality);
            statement.setString(2,"%"+doctorName+"%");
            try (ResultSet resultSet=statement.executeQuery();){
                while (resultSet.next()){
                    Doctor doctor=new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setFees(resultSet.getInt("fees"));
                    doctor.setDoctorId(resultSet.getInt("doctor_id"));
                    doctorList.add(doctor);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndLesFees(String speciality, double fees) {
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