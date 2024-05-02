package CompareTo;

import java.time.LocalDate;

public class Empleado implements Comparable<Empleado>{
    
    private String nombre;
    private LocalDate edad;
    private double sueldo;
    
    public Empleado(String nombre,LocalDate edad,double sueldo){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
//String | Date y GCalendar implementan Comparable
    @Override
    public int compareTo(Empleado e) {
        return e.getEdad().compareTo(edad);
    }

    @Override
    public String toString() {
        return "Emplead@:" + "nombre=" + nombre + " edad=" + edad + ", sueldo=" + sueldo;
    }
    
    
    
}
