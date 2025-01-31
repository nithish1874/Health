package com.healthcare.dao;

import com.healthcare.model.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientDao {
    private List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getAllPatients() {
        return patients;
    }

    public Patient getPatientById(int id) {
        return patients.stream().filter(patient -> patient.getId() == id).findFirst().orElse(null);
    }
}
