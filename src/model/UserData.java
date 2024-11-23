package model;
import java.util.ArrayList;

/*Name:Nestor Felipe Orrego Ulloa 
Date:23/11/2024
Proyect: proyecto final 
*/

public class UserData {

    private ArrayList<Info> users = new ArrayList<>();

    // Agregar un usuario al repositorio
    public void addUser(Info user) {
        users.add(user);
    }

    // Eliminar un usuario por ID
    public void removeUser(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    // Obtener todos los usuarios
    public ArrayList<Info> getUsers() {
        return users;
    }

    // Buscar un usuario por ID
    public Info findUserById(int id) {
        for (Info user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null; // Si no se encuentra el usuario
    }

    
}
