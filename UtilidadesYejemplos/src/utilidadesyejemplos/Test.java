package utilidadesyejemplos;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        /*Vehiculo v = new Vehiculo(25, "0000LLL", LocalDate.of(2024, 05, 26));
        Vehiculo copia = new Vehiculo(v);
        
        //USO DE VARAGS
        System.out.println(v.sumar(1, 5, 6, 7));
        System.out.println(v.presentacionSuma("Total de su compra:", 2.5, 30, 29.88));

        try {
            v.arrancar();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            v.arrancar();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }*/
        
        
        Persona [] arrayPersona = new Persona[2];
        
        arrayPersona[0] = new Alumno("Ignacio","Rueda");
        arrayPersona[1] = new Profesor("Ramón","Rueda");
       // arrayPersona[2] = new Persona("Rafael","Armenteros");-> Porque la hice abstracta
        
        for(Persona p: arrayPersona){
            System.out.println(p.getNombre());
        }
        
        
        //CONVERSIÓN EXPLÍCITA (CASTING):
        
        Persona p = new Alumno("Juan","Salvado");
        
        System.out.println(p instanceof Alumno);//true
        System.out.println(p instanceof Profesor);//false
        
        if(p instanceof Alumno){
            ((Alumno)p).jugar();
        }
        
        
        
        
        
    }

}
