package AlgoritmosOrdenandoElementosColeccion;

import java.util.Comparator;


public class ComparadorPorSueldo implements Comparator<Empleado> {

    @Override
    public int compare(Empleado E1, Empleado E2) {
        return Double.compare(-E1.getSueldo(), -E2.getSueldo());
    }
    
}
