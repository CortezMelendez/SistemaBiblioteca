package utez.edu.mx.biblioteca.model;

public class BibliotecaDatos {
    private int id;
    private String genero;
    private String titulo;

    public BibliotecaDatos(int id, String genero, String titulo) {
        this.id = id;
        this.genero = genero;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

}