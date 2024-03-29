package org.doctorapp.util;

public class Queries {
    public static final String INSERTQUERY =
            "INSERT INTO DOCTOR(doctor_Id,doctor_name,speciality,experience,fees,ratings) VALUES(?,?,?,?,?,?)";
    public static final String UPDATEQUERY =  "UPDATE DOCTOR SET fees=? where doctor_Id";
    public static final String DELETEQUERY =  "DELETE FROM DOCTOR WHERE doctorId=?";
    public static final String FINDALLQUERY = "SELECT * FROM DOCTOR";
    public static final String FINDBYSPECIALITY = "SELECT * from DOCTOR where speciality=?";
    public static final String FINDBYSPECANDEX = "SELECT * FROM DOCTOR speciality=? and experience>=?";
    public static final String FINDBYSPECANDRATINGS = "SELECT * FROM DOCTOR speciality=? and ratings>=?";
    public static final String FINDBYSPECANDFEES = "SELECT * FROM DOCTOR speciality=? and FEES<=?";
    public static final String FINDBYSPECANDNAME = "SELECT * FROM DOCTOR speciality=? and doctor_name like ?";
    public static final String FINDBYID = "SELECT * FROM DOCTOR WHERE doctor_id=?";
}
