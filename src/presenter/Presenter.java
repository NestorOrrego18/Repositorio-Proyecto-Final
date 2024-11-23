package presenter;

import view.View;
import model.Doctor;
import model.Info;
import model.User;
import model.UserData;

/*Name:Nestor Felipe Orrego Ulloa 
Date:23/11/2024
Proyect: proyecto final 
*/

public class Presenter {
    private View view;
    private UserData data= new UserData();

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
                    data.addUser(doctor);
                    view.showMessage("Doctor registrado");
                    break;

                case "Ver Usuarios":
                    view.displayUsers(listUsers());
                    break;

                case "Salir":
                    view.showMessage("Tenga buen dia");
                    break;

                default:
                    view.showMessage("Opcion Invalida");
                    break;
            }
        } while (!option.equals("Exit"));
    }

    private String listUsers() {
        String datas = "";
        for (Info userr : data.getUsers()) {
            datas+=("ID: ")+(userr.getId())+(", Name: ")+(userr.getName())+("\n");
        }
        return datas;
    }
}
