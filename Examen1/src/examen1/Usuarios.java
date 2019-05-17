package examen1;

import java.util.*;

public class Usuarios {

    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Libros> prestados = new ArrayList();
    private int prestamos;

    public Usuarios(String codigo, String nombre, String apellido, int edad, int prestamos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.prestamos = prestamos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Libros> getPrestados() {
        return prestados;
    }

    public void setPrestados(ArrayList<Libros> prestados) {
        this.prestados = prestados;
    }

    public int getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(int prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", prestados=" + prestados + ", prestamos=" + prestamos + '}';
    }

}
