package org.doctorapp.client;

import java.lang.String;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.doctorapp.exceptions.DoctorNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialisation;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

public class User {
    public static void main(String[] args) {
        IDoctorService doctorService = new DoctorServiceImpl();



        String speciality = Specialisation.GYNAEC.getSpeciality();
 //       Doctor doctor = new Doctor(1,"Kavitha",speciality,1800,8,10);
//        Doctor doctor1 = new Doctor(2,"Anjali",speciality,500,6,8);
//        Doctor doctor2 = new Doctor(3,"John",speciality,2000,10,20);
//        Doctor doctor3 = new Doctor(4,"Murty",speciality,700,8,12);
//        Doctor doctor4 = new Doctor(5,"Raj",speciality,1200,5,6);


   //     doctorService.addDoctor(doctor);

        doctorService.updateDoctor(1,8000);

//        List<Doctor> doctors=doctorService.getAll();
//        for(Doctor doctor:doctors){
//            System.out.println(doctor);
//        }

        System.out.println("----------------");

        try {
            List<Doctor> doctorList=doctorService.getBySpecialityAndLesFees("GYNAECOLOGIST",3000.0);
            for(Doctor doctor:doctorList){
                System.out.println(doctor);
            }
        } catch (DoctorNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}

