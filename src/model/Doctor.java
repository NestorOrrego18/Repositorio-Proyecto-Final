package model;

/*Name: Nestor Felipe Orrego Ulloa 
Date: 23/11/2024
Project: Proyecto final 
*/

public class Doctor extends Info {
    private String specialty;

    public Doctor(int id, String name, String email, String phone, String specialty) {
        super(id, name, email, phone);
        this.specialty = specialty;
    }
    public Doctor(){
        
    }

    public String getSpecialty() {
        return specialty;
    }
}
