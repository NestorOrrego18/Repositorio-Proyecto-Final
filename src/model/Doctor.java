package model;

/*Name:Nestor Felipe Orrego Ulloa 
Date:23/11/2024
Proyect: proyecto final 
*/

public class Doctor extends Info {
    private String specialty;

    public Doctor(int id, String name, String email, String phone, String specialty) {
        super(id, name, email, phone);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }
}

