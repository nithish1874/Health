package com.healthcare.model;

public class Bill {
    private int id;
    private Patient patient;
    private double amount;
    private String status;

    // Constructor
    public Bill(int id, Patient patient, double amount, String status) {
        this.id = id;
        this.patient = patient;
        this.amount = amount;
        this.status = status;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
