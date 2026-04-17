package utez.edu.mx.biblioteca.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class MostrarController {

    @FXML
    private Label lblId;

    @FXML
    private Label lblTitulo;
    @FXML
    private Label lblGenero;

    @FXML
    public void mostrar(){
        lblId.setText("ID: " + Libro.getUltimoId());
        lblTitulo.setText("Título: " + Libro.getUltimoTitulo());
        lblGenero.setText("Género: " + Libro.getUltimoGenero());
    }
}
