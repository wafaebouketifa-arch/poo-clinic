package model;

import model.patient.Patient;

public class appointment {

    private String date;

    public appointment(int id, doctor doctor, Patient p1, String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}



