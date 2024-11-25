package main;

import view.View;
import model.UserData;
import presenter.Presenter;

/*Name: Nestor Felipe Orrego Ulloa 
Date: 23/11/2024
Project: Proyecto final 
*/

public class Main {
    public static void main(String[] args) {
        View view = new View();
        UserData data = new UserData();
        Presenter presenter = new Presenter(view, data);

        presenter.start();
    }
}
