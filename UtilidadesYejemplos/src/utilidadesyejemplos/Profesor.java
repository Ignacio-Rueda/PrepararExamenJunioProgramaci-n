
package utilidadesyejemplos;

public class Profesor extends Persona {
    
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    @Override
    public String getNombre(){
        return String.format("El nombre del profesor es:%s",this.nombre);
    }
    
}
