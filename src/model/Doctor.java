package model;

/*Name: Nestor Felipe Orrego Ulloa 
Date: 23/11/2024
Project: Proyecto final 
*/

public class Doctor extends Info {
    private String doctorType;

    public Doctor(int id, String name, String email, String phone, String doctorType) {
        super(id, name, email, phone);
        this.doctorType = doctorType;
    }
    public Doctor(){   
    }
    public String getDoctorType() {
        return doctorType;
    }
}
