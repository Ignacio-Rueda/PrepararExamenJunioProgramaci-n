
package AlgoritmosOrdenandoElementosColeccion;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Empleado>{

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return Integer.compare(o1.getEdad(), o2.getEdad());
    }
    
    
}
