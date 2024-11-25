package view;

import model.Appointment;
import model.Doctor;
import model.User;
import model.UserData;
import javax.swing.JOptionPane;

/*Name:Nestor Felipe Orrego Ulloa 
Date:23/11/2024
Proyect: proyecto final 
*/

public class View {

    UserData userData=new UserData();
    User user=new User();
    Appointment appointment=new Appointment();
    
    public String showMenu() {
        String[] options = {"Registre un Usuario", "Registre un Doctor", "Ver Usuarios", "Ver Doctores", "Eliminar Usuario", "Eliminar Doctor", 
        "Asignar Citas", "Salir"};
        return (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "Menu",
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    }

    public User getUserDetails() {
        String name = JOptionPane.showInputDialog("Ingrese el Nombre:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cedula del usuario:"));
        String email = JOptionPane.showInputDialog("Ingrese Email de Contacto:");
        String phone = JOptionPane.showInputDialog("Ingrese Numero de Contacto:");
        return new User(id, name, email, phone, "");
    }

    public Doctor getDoctorDetails() {
        String name = JOptionPane.showInputDialog("Ingrese el Nombre :");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cedula del usuario:"));
        String email = JOptionPane.showInputDialog("Ingrese Email de Contacto:");
        String phone = JOptionPane.showInputDialog("Ingrese Numero de Contacto:");
        String specialty = JOptionPane.showInputDialog("Ingrese la especialidad del Doctor:");
        return new Doctor(id, name, email, phone, specialty);
    }

    public void displayUsers(String users) {
        JOptionPane.showMessageDialog(null, users, "User List", JOptionPane.INFORMATION_MESSAGE);
    }
    public void displayDoctors(String users) {
        JOptionPane.showMessageDialog(null, users, "Doctor List", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void assignAppointments(String newHour, String newType){
        int id=user.getId();
        String name=user.getName();
        String hour=newHour;
        String type=newType;
        appointment.assignAppointment(id, name,hour, type);
    }
    


    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}

