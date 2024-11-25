package model;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Appointment {

    private ArrayList<Appointment> appointment;
    private ArrayList<String> hour;

    DecimalFormat df = new DecimalFormat("#.00");

    private int id;
    private String name;
    private String time;
    private String type;

    public Appointment(int newId, String newName, String newTime, String newType) {
        id = newId;
        name = newName;
        time = newTime;
        type = newType;
    }

    public Appointment() {
        appointment = new ArrayList<>();
        hour = new ArrayList<>();
    }

    public void createList() {
        double hora = 6.0;
        int counter = 0;
        for (int i = 0; i < 19; i++) {
            if ((hora <= 12)) {
                hour.add(df.format(hora));
                hora += 0.3;
                counter++;
                if (counter == 2) {
                    hora += 0.4;
                    counter = 0;
                }
            }
        }
        hora = 14.0;
        for (int i = 11; i < 19; i++) {
            if ((hora < 18)) {
                hour.add(df.format(hora));
                hora += 0.3;
                counter++;
                if (counter == 2) {
                    hora += 0.4;
                    counter = 0;
                }
            }
        }
    }

    public String showList() {
        String listt = "";
        for (String list : hour) {
            listt += list + " - " +"\n";
        }
        return listt;
    }
    
    public String showList2() {
        String listt = "";
        for (Appointment list : appointment) {
            listt += list + " - " +"\n";
        }
        return listt;
    }


    public void assignAppointment(int newId, String newName, String newTime, String newType) {
        appointment.add(new Appointment(newId, newName, newTime, newType));
    }

}
