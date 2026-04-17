package utez.edu.mx.biblioteca.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utez.edu.mx.biblioteca.MainApp;

import java.io.IOException;

public class ControladorBase {

    protected void cambiarVentana(ActionEvent event, String archivoFxml, String titulo) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource(archivoFxml));
            Scene nuevaEscena = new Scene(fxmlLoader.load());

            Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();

            ventanaActual.setTitle(titulo);
            ventanaActual.setScene(nuevaEscena);
            ventanaActual.show();

        } catch (IOException e) {
            System.err.println("Error al intentar abrir la ventana: " + archivoFxml);
            e.printStackTrace();
        }
    }
}