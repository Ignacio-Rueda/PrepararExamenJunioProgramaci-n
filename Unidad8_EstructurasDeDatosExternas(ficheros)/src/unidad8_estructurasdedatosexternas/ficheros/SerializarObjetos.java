package unidad8_estructurasdedatosexternas.ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Serializar -> Conversión de un objeto en una secuencia de bytes que pueden
 * ser guardados en un archivo, enviados a través de la red o almacenados en una
 * base de datos.
 *
 * serialVersionUID es un campo especial en una clase serializable que se
 * utiliza para controlar la versión de la clase durante la serialización y
 * deserialización.
 *
 * @author Ignacio
 *
 */
public class SerializarObjetos {
    
    
    public static void main(String args[]){
        String ruta = System.getProperty("user.dir")+File.separator+"src"+File.separator+"recursos"+File.separator+"personas.dat";
        File fichero = new File(ruta);
        
        Persona[] arrayPersonas = new Persona[3];

        arrayPersonas[0] = new Profesor("Juan", 33, "Matemáticas", 2500);
        arrayPersonas[1] = new Alumno("Pablo",8,"Aprender","Saltar a la comba");
        arrayPersonas[2] = new Profesor("María",29,"Química",2650);

        try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(fichero))){
            salida.writeObject(arrayPersonas);
            salida.flush();
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
        try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(fichero))){
            Persona[] arrayPersonasDeserializado = (Persona[])entrada.readObject();
            System.out.println("DESERIALIZANDO...");
            System.out.println();
            for(int n=0;n<arrayPersonasDeserializado.length;n++){
                System.out.println(arrayPersonasDeserializado[n]);
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

}
abstract class Persona implements Serializable{
    private final long SerialVersionUID = 1L;
    
    private String nombre;
    private int edad;
    private String oficio;
    
    public Persona(String nombre,int edad,String oficio){
        this.nombre = nombre;
        this.edad = edad;
        this.oficio = oficio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }
    @Override
    public String toString(){
        return String.format("NOMBRE: %s EDAD: %d OFICIO: %S",
                this.nombre,
                this.edad,
                this.oficio
        );
    }
}

class Profesor extends Persona implements Serializable{
    private double sueldo;
    private final long SerialVersionUID = 1L;
    public Profesor(String nombre,int edad,String oficio,double sueldo){
        super(nombre,edad,oficio);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public String toString(){
        return String.format("%s SUELDO: %.2f%n",
                super.toString(),
                this.sueldo);
    }   
}

class Alumno extends Persona implements Serializable{
    private final long SerialVersionUID = 1L;
    private String juegoFavorito;
    
    public Alumno(String nombre,int edad,String oficio,String juegoFavorito){
        super(nombre,edad,oficio);
        this.juegoFavorito = juegoFavorito;
    }

    public String getJuegoFavorito() {
        return juegoFavorito;
    }

    public void setJuegoFavorito(String juegoFavorito) {
        this.juegoFavorito = juegoFavorito;
    }
    @Override
    public String toString(){
        return String.format("%s JUEGO FAVORITO: %s%n", 
                super.toString(),
                this.juegoFavorito);
    }
}