package examen1;

import java.util.ArrayList;

public class Administrador {

    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Libros> inventario = new ArrayList();

    public Administrador(int codigo, String nombre, String apellido, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public ArrayList<Libros> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Libros> inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Administrador{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

}
