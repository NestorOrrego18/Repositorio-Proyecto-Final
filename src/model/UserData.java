package model;

import java.util.ArrayList;

/*Name:Nestor Felipe Orrego Ulloa 
Date:23/11/2024
Proyect: proyecto final 
*/

public class UserData {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();    

    // Agregar un usuario al repositorio
    public void addUser(User user) {
        users.add(user);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Obtener todos los usuarios
    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public String listUsers() {
        String dataUser = "";
        for (User userr : users) {
            dataUser += ("ID: ") + (userr.getId()) + (", Name: ") + (userr.getName()) + ("\n");
        }
        return dataUser;
    }

    public String listDoctors() {
        String dataDoctor = "";
        for (Doctor doctorr : doctors) {
            dataDoctor += ("ID: ") + (doctorr.getId()) + (", Name: ") + (doctorr.getName()) + (", Especialidad: ")
                    + (doctorr.getSpecialty()) + ("\n");
        }
        return dataDoctor;
    }
    
}
