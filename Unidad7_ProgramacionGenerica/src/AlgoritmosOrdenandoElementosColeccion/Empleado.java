package AlgoritmosOrdenandoElementosColeccion;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private int edad;
    private String dni;
    private double sueldo;
    private String jubilado;
    
    public Empleado(String nombre,String dni,int edad,double sueldo,String jubilado){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.sueldo = sueldo;
        this.jubilado = jubilado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getJubilado() {
        return jubilado;
    }

    public void setJubilado(String jubilado) {
        this.jubilado = jubilado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sueldo=" + sueldo + ", jubilado=" + jubilado + '}';
    }
    @Override
    public int compareTo(Empleado o) {
       return this.nombre.compareTo(o.nombre);
    }


    
}
