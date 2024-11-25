package presenter;

import view.View;
import model.Doctor;
import model.Info;
import model.User;
import model.UserData;

/*Name: Nestor Felipe Orrego Ulloa 
Date: 23/11/2024
Project: Proyecto final 
*/

public class Presenter {
    private View view;
    private UserData data;

    private Doctor doctor=new Doctor();

    public Presenter(View view, UserData data) {
        this.view = view;
        this.data = data;
    }

    public void start() {
        String option;
        do {
            option = view.showMenu().trim();
            switch (option) {
                case "1":
                    User user = view.getUserDetails();
                    data.addUser(user);
                    view.showMessage("Usuario registrado exitosamente.");
                    break;

                case "2":
                    Doctor doctor = view.getDoctorDetails();
                    data.addUser(doctor);
                    view.showMessage("Doctor registrado exitosamente.");
                    break;

                case "3":
                    view.displayUsers(listUsers());
                    break;

                case "4":
                    view.displayDoctors(listDoctors());
                    break;

                case "5":
                    view.showMessage("¡Hasta pronto!");
                    break;

                default:
                    view.showMessage("Opción inválida. Por favor, intente de nuevo.");
                    break;
            }
        } while (!option.equals("5"));
    }

    private String listUsers() {
        StringBuilder dataUser = new StringBuilder();
        for (Info userr : data.getUsers()) {
            dataUser.append("Nombre: ").append(userr.getName())
                    .append(", ID: ").append(userr.getId())
                    .append("\n");
        }
        return dataUser.toString();
    }

    private String listDoctors() {
        StringBuilder dataDoctor = new StringBuilder();
        for (Info doctorr : data.getDoctors()) {
            dataDoctor.append("Nombre: ").append(doctorr.getName())
                    .append(", ID: ").append(doctorr.getId())
                    .append(", Especialidad: ").append(doctor.getSpecialty())
                    .append("\n");
        }
        return dataDoctor.toString();
    }
}
