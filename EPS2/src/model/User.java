package model;

/*Name: Nestor Felipe Orrego Ulloa 
Date: 23/11/2024
Project: Proyecto final 
*/

public class User extends Info {
    private String medicalRecord;

    public User(int id, String name, String email, String phone, String medicalRecord) {
        super(id, name, email, phone);
        this.medicalRecord = medicalRecord;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }
}