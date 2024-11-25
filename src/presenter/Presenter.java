package presenter;

import view.View;
import model.Doctor;
import model.User;
import model.UserData;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

import model.Appointment;

/*Name:Nestor Felipe Orrego Ulloa 
Date:23/11/2024
Proyect: proyecto final 
*/

public class Presenter {
    private View view;
    private UserData data = new UserData();
    private Appointment appointment = new Appointment();
    private Doctor doctor = new Doctor();

    public Presenter(View view, UserData data) {
        this.view = view;
        this.data = data;
    }

    public void start() {
        String option;
        do {
            option = view.showMenu();
            switch (option) {
                case "Registre un Usuario":
                    User user = view.getUserDetails();
                    data.addUser(user);
                    data.createUsers();
                    view.showMessage("Usuario registrado");
                    break;

                case "Ver Usuarios":
                    view.displayUsers(data.listUsers());
                    break;

                case "Ver Doctores":
                data.createDoctors();
                view.displayDoctors(data.listDoctors());
                    break;

                case "Asignar Citas":
                    appointment.createList();
                    data.listUsers();
                    JOptionPane.showMessageDialog(null, appointment.showList(), "Horarios Disponibles", 1);
                    String name=JOptionPane.showInputDialog("Por Favor, Escriba su nombre");
                    String hora=JOptionPane.showInputDialog("Por Favor, Escriba una de las Horas Disponibles");
                    String type=JOptionPane.showInputDialog("Por Favor, Escriba General (si es una cita general) o Especializada (si es una cita especializada)");
                    //appointment.assignAppointment(1, name, hora, type);
                    
                    JOptionPane.showMessageDialog(null, appointment.showList2(), "Citas", 1);
                    break;

                

                case "Salir":
                    view.showMessage("Tenga buen dia");
                    break;

                default:
                    view.showMessage("Opcion Invalida");
                    break;
            }
        } while (!option.equals("Salir"));
    }
}
