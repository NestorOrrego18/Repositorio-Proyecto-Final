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

        String options=(String) JOptionPane.showInputDialog(null, "select", null, 1, null,new Object[]{"Registre un Usuario", "Ver Usuarios", "Ver Doctores", "Asignar Citas", "Salir"}, 4);
        return options;
    }

    public User getUserDetails() {
        String name = JOptionPane.showInputDialog("Ingrese el Nombre:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cedula del usuario:"));
        String email = JOptionPane.showInputDialog("Ingrese Email de Contacto:");
        String phone = JOptionPane.showInputDialog("Ingrese Numero de Contacto:");
        return new User(id, name, email, phone, "");
    }
    public String doctors(){
        String opcion=(String) JOptionPane.showInputDialog(null, "select", null, 1, null,new Object[]{"Doctor especialista","Doctor general"}, 4);
        return opcion;
     }

    public void displayUsers(String users) {
        JOptionPane.showMessageDialog(null, users, "User List", JOptionPane.INFORMATION_MESSAGE);
    }
    public void displayDoctors(String users) {
        JOptionPane.showMessageDialog(null, users, "Doctor List", JOptionPane.INFORMATION_MESSAGE);
    }


    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}

