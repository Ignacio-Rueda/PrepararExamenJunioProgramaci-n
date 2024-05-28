
package utilidadesyejemplos;

public class Alumno extends Persona{
    
    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }
    @Override
    public String getNombre(){
        return String.format("El nombre del alumno es %s",this.nombre );
    }
    
    public void jugar(){
        System.out.printf("Alumno%s está jugando!%n",this.nombre);
                
    }
    
    
}
