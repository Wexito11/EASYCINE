package com.example.mincine2;

public class peliculas {

    //Empezar a declarar las variables
    private String nombre, categoria, director;
    private int idImagen;

    public peliculas(String nombre, String categoria, String director, int idImagen) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.director = director;
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    @Override
    public String toString() {
        return "peliculas{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", director='" + director + '\'' +
                ", idImagen=" + idImagen +
                '}';
    }
}
