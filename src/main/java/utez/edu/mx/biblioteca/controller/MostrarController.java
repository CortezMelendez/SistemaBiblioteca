package utez.edu.mx.biblioteca.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import utez.edu.mx.biblioteca.model.BibliotecaDatos;

public class MostrarController extends ControladorBase {


    @FXML
    private Label lblId;

    @FXML
    private Label lblTitulo;
    @FXML
    private Label lblGenero;

    BibliotecaDatos Libro = new BibliotecaDatos(0, "", "");

    @FXML
    public void mostrar() {
        lblId.setText("ID: " + Libro.getId());
        lblTitulo.setText("Título: " + Libro.getTitulo());
        lblGenero.setText("Género: " + Libro.getGenero());
    }
}