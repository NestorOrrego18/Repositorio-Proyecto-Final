package model;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Appointment {

    private ArrayList<Appointment> appointment;
    private ArrayList<String> hour;
    private ArrayList<String> appointments;

    DecimalFormat df = new DecimalFormat("#.00");

    private int id;
    private String name;
    private String time;
    private String type;

    public Appointment(int newId, String newName, String newTime, String newType) {
        this.id = newId;
        this.name = newName;
        this.time = newTime;
        this.type = newType;
    }
    

    public Appointment() {
        appointment = new ArrayList<>();
        hour = new ArrayList<>();
        appointments = new ArrayList<>();
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

    public void assignAppointment(int newId, String newName, String newTime, String newType) {
        appointment.add(new Appointment(newId, newName, newTime, newType));
        
    }
    public void assignOneAppointment(){
        appointment.add(new Appointment(10, "lol ", "6,00", ""));
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
            listt += list.getId() + "  "+ list.getName()+" "+list.getTime()+ " "+list.getType()+"\n";
        }
        return listt;
    }

    public ArrayList<Appointment> getAppointment() {
        return appointment;
    }

    public void setAppointment(ArrayList<Appointment> appointment) {
        this.appointment = appointment;
    }

    public ArrayList<String> getHour() {
        return hour;
    }

    public void setHour(ArrayList<String> hour) {
        this.hour = hour;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }    

}
