package utez.edu.mx.biblioteca.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import utez.edu.mx.biblioteca.model.BibliotecaDatos;

public class MostrarController extends BibliotecaDatos {


    @FXML
    private Label lblId;
    @FXML
    private Label lblTitulo;
    @FXML
    private Label lblGenero;
    @FXML
    private TextField lblID2;
    @FXML
    private TextField lblGenero2;
    @FXML
    private TextField lblTitulo2;
    @FXML
    private Label lblMensaje;
    @FXML
    private TextField id;
    @FXML
    private TextField titulo;
    @FXML
    private TextField genero;

    BibliotecaDatos Libro = new BibliotecaDatos(0, "", "");

    @FXML
    public void mostrar() {
        lblId.setText("ID: " + Libro.getId());
        lblTitulo.setText("Título: " + Libro.getTitulo());
        lblGenero.setText("Género: " + Libro.getGenero());
    }
    @FXML
    public void guardarLibro(ActionEvent event) {
        String idText2 = lblID2.getText();
        String titulo2 = lblTitulo2.getText();
        String genero2 = lblGenero2.getText();

        if (idText2.isEmpty() || titulo2.isEmpty() || genero2.isEmpty()) {
            lblMensaje.setText("Los campos no pueden estar vacíos");
        } else {
            int id = Integer.parseInt(idText2);
            BibliotecaDatos libro = new BibliotecaDatos(id, genero2, titulo2);
            lblMensaje.setText("Libro registrado con éxito: " + libro.getTitulo());
        }
    }
}