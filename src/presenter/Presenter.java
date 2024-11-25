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
                    view.showMessage("Usuario registrado");
                    break;

                case "Registre un Doctor":
                    Doctor doctor = view.getDoctorDetails();
                    data.addDoctor(doctor);
                    view.showMessage("Doctor registrado");
                    break;

                case "Ver Usuarios":
                    view.displayUsers(data.listUsers());
                    break;

                case "Ver Doctores":
                    view.displayDoctors(data.listDoctors());
                    break;

                case "Asignar Citas":
                    appointment.createList();
                    JOptionPane.showMessageDialog(null, appointment.showList(), "Horarios Disponibles", 1);
                    String hora=JOptionPane.showInputDialog("Por Favor, Escriba una de las Horas Disponibles");
                    String type=JOptionPane.showInputDialog("Por Favor, Escriba General (si es una cita general) o Especializada (si es una cita especializada)");
                    view.assignAppointments(hora, type);
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
