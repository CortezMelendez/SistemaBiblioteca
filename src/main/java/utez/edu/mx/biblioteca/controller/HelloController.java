package utez.edu.mx.biblioteca.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

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
    protected void iniciarSesion(ActionEvent e) {
        final String password = "root";
        final String user = "1234";

        String user1 = this.user.getText();
        String password1 = this.password.getText();

        if (user1.isEmpty() || password1.isEmpty()){
            logs.setText("los campos no pueden estar vacios");
            return;
        } else if (user1.equals("root") && password1.equals("1234")) {
            logs.setText("Bienvenido");
            return;
        }
    }
}
