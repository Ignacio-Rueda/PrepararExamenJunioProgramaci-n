
package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Pruebas {

  
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        
        listaPersonas.add(new Persona("Nacho","Rueda",34));
        listaPersonas.add(new Persona ("Ramón","Rueda",31));
        
        List<Persona> result = listaPersonas.stream().filter(e->e.getApellido().contains("u")).collect(Collectors.toList());
        
        System.out.println(result);
             
        
        List<String> names = Arrays.asList("Nacho","Ramón","Eva");
        //List<String> result = names.stream().filter(s->s.contains("a")).collect(Collectors.toList());
        
        //System.out.println(result);
                
        
    }
    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String nombre,String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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
    
    
}
