package examen1;

import java.util.*;

public class Libros {

    private ArrayList autores = new ArrayList();
    private String titulo;
    private String genero;
    private String editorial;
    private String idioma;
    private Date anio_excribo;
    private String ISBN;
    private Date anio_Ingreso;
    private String estado;
    private String nombre_prestado;
    private String cuenta_prestada;

    public Libros(String titulo, String genero, String editorial, String idioma, Date anio_excribo, String ISBN, Date anio_Ingreso, String estado, String nombre_prestado, String cuenta_prestada) {
        this.titulo = titulo;
        this.genero = genero;
        this.editorial = editorial;
        this.idioma = idioma;
        this.anio_excribo = anio_excribo;
        this.ISBN = ISBN;
        this.anio_Ingreso = anio_Ingreso;
        this.estado = estado;
        this.nombre_prestado = nombre_prestado;
        this.cuenta_prestada = cuenta_prestada;
    }

    public ArrayList getAutores() {
        return autores;
    }

    public void setAutores(ArrayList autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getAnio_excribo() {
        return anio_excribo;
    }

    public void setAnio_excribo(Date anio_excribo) {
        this.anio_excribo = anio_excribo;
    }

  

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getAnio_Ingreso() {
        return anio_Ingreso;
    }

    public void setAnio_Ingreso(Date anio_Ingreso) {
        this.anio_Ingreso = anio_Ingreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre_prestado() {
        return nombre_prestado;
    }

    public void setNombre_prestado(String nombre_prestado) {
        this.nombre_prestado = nombre_prestado;
    }

    public String getCuenta_prestada() {
        return cuenta_prestada;
    }

    public void setCuenta_prestada(String cuenta_prestada) {
        this.cuenta_prestada = cuenta_prestada;
    }

    @Override
    public String toString() {
        return "Libros{" + "autores=" + autores + ", titulo=" + titulo + ", genero=" + genero + ", editorial=" + editorial + ", idioma=" + idioma + ", anio_excribo=" + anio_excribo + ", ISBN=" + ISBN + ", anio_Ingreso=" + anio_Ingreso + ", estado=" + estado + ", nombre_prestado=" + nombre_prestado + ", cuenta_prestada=" + cuenta_prestada + '}';
    }

}
