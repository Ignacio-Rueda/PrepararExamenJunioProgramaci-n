package unidad8_estructurasdedatosexternas.ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EjemploAborrar {
    public static void serializar(List<Persona>listadoPersonas,String rutaSerializado){
        
        File fichero = new File(rutaSerializado);
        try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(fichero))){
            salida.writeObject(listadoPersonas);
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void deserializar(String rutaSerializado){
        File fichero = new File(rutaSerializado);
        try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(fichero))){
            List<Persona> listaRecibida = (List<Persona>)entrada.readObject();
            System.out.println("Los datos deserializados son los que siguen");
            for(Persona p : listaRecibida){
                System.out.println(p.getNombre());
            }
            
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String args[]) {
        List<Persona> listadoPersonas = new ArrayList<>();
        String rutaSerializado = System.getProperty("user.dir")+File.separator+"src"+File.separator+"recursos"+File.separator+"listaSerializada.bat";
        listadoPersonas.add(new CuentaBancaria("Nacho","Rueda Delgado","001",34,1500));
        listadoPersonas.add(new CuentaBancaria("Juan","López Ruiz","002",44,15500));
        listadoPersonas.add(new CuentaBancaria("Carla","Amapola Sánchez","003",36,7500));
        listadoPersonas.add(new CuentaBancaria("Carol","Cueto Fernández","004",24,75000));
        
        //Serializar objeto
        EjemploAborrar.serializar(listadoPersonas,rutaSerializado);
        //Deserializar objeto
        EjemploAborrar.deserializar(rutaSerializado);
        
        

    }
}

abstract class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Apellidos=" + apellidos + ", DNI=" + dni + ", Edad=" + edad;
    }
}

class CuentaBancaria extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private double totalAcumulado;

    public CuentaBancaria(String nombre, String apellidos, String dni, int edad,double totalAcumulado) {
        super(nombre, apellidos, dni, edad);
        this.totalAcumulado = totalAcumulado;
    }
    
   @Override
   public String toString(){
       return String.format("%s Total acumulado = %.2f", 
                super.toString(),
                this.totalAcumulado
               );
   }
}
