package AlgoritmosOrdenandoElementosColeccion;

import java.util.Comparator;

public class ComparadorPorJubilacion implements Comparator<Empleado>{

    @Override
    public int compare(Empleado E1, Empleado E2) {
        return E1.getJubilado().compareTo(E2.getJubilado());                
    }
    
}
