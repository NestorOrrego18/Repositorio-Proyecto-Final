package view;

import model.Doctor;
import model.User;
import javax.swing.JOptionPane;

/*Name:Nestor Felipe Orrego Ulloa 
Date:23/11/2024
Proyect: proyecto final 
*/

public class View {
    public String showMenu() {
        String[] options = {"Registre un Usuario", "Registre un Doctor", "Ver Usuarios", "Salir"};
        return (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "Menu",
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    }

    public User getUserDetails() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cedula del usuario:"));
        String name = JOptionPane.showInputDialog("Ingrese el Nombre:");
        String email = JOptionPane.showInputDialog("Ingrese Email de Contacto:");
        String phone = JOptionPane.showInputDialog("Ingrese Numero de Contacto:");
        return new User(id, name, email, phone, phone);
    }

    public Doctor getDoctorDetails() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cedula del usuario:"));
        String name = JOptionPane.showInputDialog("Ingrese el Nombre:");
        String email = JOptionPane.showInputDialog("Ingrese Email de Contacto:");
        String phone = JOptionPane.showInputDialog("Ingrese Numero de Contacto:");
        String specialty = JOptionPane.showInputDialog("Ingrese la especialidad del Doctor:");
        return new Doctor(id, name, email, phone, specialty);
    }

    public void displayUsers(String users) {
        JOptionPane.showMessageDialog(null, users, "User List", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}

