package model;

import java.util.ArrayList;

/*Name: Nestor Felipe Orrego Ulloa 
Date: 23/11/2024
Project: Proyecto final 
*/

public class UserData {
    private ArrayList<Info> users;
    private ArrayList<Info> doctors;

    public UserData() {
        users = new ArrayList<>();
        doctors = new ArrayList<>();
    }
    

    public void addUser(Info user) {
        users.add(user);
    }
    public void addDoctor(Info doctor) {
        doctors.add(doctor);
    }


    public ArrayList<Info> getUsers() {
        return users;
    }
    public ArrayList<Info> getDoctors() {
        return doctors;
    }
}
