package utez.edu.mx.biblioteca.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import utez.edu.mx.biblioteca.model.BibliotecaDatos;

public class AuthController extends ControladorBase {
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
        final String userDef = "root";
        final String passwordDef = "1234";

        String inputUser = this.user.getText();
        String inputPassword = this.password.getText();

        if (inputUser.isEmpty() || inputPassword.isEmpty()) {
            logs.setText("Los campos no pueden estar vacíos");
            return;
        }

        if (inputUser.equals(userDef) && inputPassword.equals(passwordDef)) {
            logs.setText("Bienvenido");
            cambiarVentana(e, "libros.fxml", "Lista de Libros");
        } else {
            logs.setText("Credenciales incorrectas");
        }
    }
}