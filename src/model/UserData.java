package model;

import java.util.ArrayList;

/*Name:Nestor Felipe Orrego Ulloa 
Date:23/11/2024
Proyect: proyecto final 
*/

public class UserData {

    private Doctor doc=new Doctor();
private Appointment app=new Appointment();
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();    

    // Agregar un usuario al repositorio
    public void addUser(User user) {
        users.add(user);
    }

    public String nameUser(String names){
        String name="";
        for (User user : users) {
            if(user.getName().equals(names)){
                name+=user.getName();
            }
        
        }
        
        return name;
        
    }

    public void createDoctors(){
        doctors.add(new Doctor(1052579888,"Juan Çarvajal", "juanC@gmail.com", "3152718559", "Doctor General"));
        doctors.add(new Doctor(1052577512,"Pedro Laverde", "pedroLv@gmail.com", "3213402706", "Doctor General"));
        doctors.add(new Doctor(1052579846,"Diego Mojica", "diegoM@gmail.com", "3169875231", "Doctor Especialista"));
    }

    public void createUsers(){
        users.add(new User(1052579888,"pepe Çarvajal", "juanC@gmail.com", "3152718559", ""));
        users.add(new User(1052577512,"lorena Laverde", "pedroLv@gmail.com", "3213402706", ""));
        users.add(new User(1052579846,"Andrea Mojica", "diegoM@gmail.com", "3169875231",""));
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
            app.assignAppointment(userr.getId(), userr.getName(), "none", "none");
        }
        return dataUser;
    }

    public String listDoctors() {
        String dataDoctor = "";
        for (Doctor doctorr : doctors) {
            dataDoctor += ("ID: ") + (doctorr.getId()) + (", Name: ") + (doctorr.getName()) + (", Especialidad: ")
                    + (doctorr.getDoctorType()) + ("\n");
        }
        return dataDoctor;
    }
    
}
