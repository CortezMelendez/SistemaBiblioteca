package utez.edu.mx.biblioteca.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import jdk.jfr.Event;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label logs;
    @FXML
    private TextField user;
    @FXML
    private TextField password;

    @FXML
    protected void iniciarSesion(Event e) {
        final String password = "root";
        final String user = "1234";

        String user1 = this.user.getText();
        String password2 = this.password.getText();

        if (user.isEmpty() && password.isEmpty()){
            logs.setText("los campos no pueden estar vacios");
            return;
        } else if (user.equals("root") && password.equals("1234")) {
            logs.setText("Bienvenido");
            return;

        }

    }
}
