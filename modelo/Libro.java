package modelo;

import java.util.ArrayList;

public class Libro {
    
    // Atributos
    private String titulo;
    private String autor;
    private String anioEdicion;
    private String lujo;
    private String coleccion;
    private ArrayList<Libro> Libro;

    // Constructor
    public Libro(String titulo, String autor, String anioEdicion, String lujo) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
        this.lujo = lujo;
        this.Libro = new ArrayList<Libro>();
    }



    // Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnioEdicion() {
        return anioEdicion;
    }

    public String getLujo() {
        return lujo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioEdicion(String anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public void setLujo(String lujo) {
        this.lujo = lujo;
    }

    

    //toString
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", anioEdicion=" + anioEdicion + ", lujo=" + lujo + '}';
    }
}