package com.healthcare.ui;

import com.healthcare.model.Patient;
import com.healthcare.model.Doctor;
import com.healthcare.service.PatientService;
import com.healthcare.service.DoctorService;
import java.util.Scanner;

public class MainUI {
    private PatientService patientService = new PatientService();
    private DoctorService doctorService = new DoctorService();
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        while (true) {
            System.out.println("Healthcare Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. View Patients");
            System.out.println("4. View Doctors");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    addDoctor();
                    break;
                case 3:
                    viewPatients();
                    break;
                case 4:
                    viewDoctors();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Date of Birth (yyyy-mm-dd): ");
        String dob = scanner.nextLine();
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter Contact Info: ");
        String contact = scanner.nextLine();

        Patient patient = new Patient(id, name, dob, gender, contact);
        patientService.addPatient(patient);
        System.out.println("Patient added successfully!");
    }

    private void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Specialty: ");
        String specialty = scanner.nextLine();
        System.out.print("Enter Contact Info: ");
        String contact = scanner.nextLine();

        Doctor doctor = new Doctor(id, name, specialty, contact);
        doctorService.addDoctor(doctor);
        System.out.println("Doctor added successfully!");
    }

    private void viewPatients() {
        System.out.println("All Patients:");
        for (Patient patient : patientService.getAllPatients()) {
            System.out.println("ID: " + patient.getId() + ", Name: " + patient.getName());
        }
    }

    private void viewDoctors() {
        System.out.println("All Doctors:");
        for (Doctor doctor : doctorService.getAllDoctors()) {
            System.out.println("ID: " + doctor.getId() + ", Name: " + doctor.getName());
        }
    }
}
