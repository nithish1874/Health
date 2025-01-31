package com.healthcare.service;

import com.healthcare.model.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorService {
    private List<Doctor> doctors = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }
}
