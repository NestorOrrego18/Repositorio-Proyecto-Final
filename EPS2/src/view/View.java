package view;

import model.User;
import model.Doctor;

import java.util.Scanner;

/*Name: Nestor Felipe Orrego Ulloa 
Date: 23/11/2024
Project: Proyecto final 
*/

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public String showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Registrar un Usuario");
        System.out.println("2. Registrar un Doctor");
        System.out.println("3. Ver Usuarios");
        System.out.println("4. Ver Doctores");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextLine();
    }

    public User getUserDetails() {
        System.out.print("Ingrese el ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el nombre: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese el correo electrónico: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese el teléfono: ");
        String phone = scanner.nextLine();
        System.out.print("Ingrese el historial médico: ");
        String medicalRecord = scanner.nextLine();

        return new User(id, name, email, phone, medicalRecord);
    }

    public Doctor getDoctorDetails() {
        System.out.print("Ingrese el ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el nombre: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese el correo electrónico: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese el teléfono: ");
        String phone = scanner.nextLine();
        System.out.print("Ingrese la especialidad: ");
        String specialty = scanner.nextLine();

        return new Doctor(id, name, email, phone, specialty);
    }

    public void displayUsers(String userList) {
        System.out.println("Usuarios registrados:");
        System.out.println(userList);
    }

    public void displayDoctors(String doctorList) {
        System.out.println("Doctores registrados:");
        System.out.println(doctorList);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
