module utez.edu.mx.biblioteca {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens utez.edu.mx.biblioteca to javafx.fxml;
    exports utez.edu.mx.biblioteca;
}