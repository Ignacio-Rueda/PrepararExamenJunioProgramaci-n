package CombinarDatosDeVariasColecciones;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    /**
     * Estas operaciones son comunes para todas las colecciones.
     */
    public static void main(String[] args) {

        Set<Integer> conjuntoA = new TreeSet<>();
        conjuntoA.add(9);
        conjuntoA.add(19);
        conjuntoA.add(5);
        conjuntoA.add(7);
        Set<Integer> conjuntoB = new TreeSet<>();
        conjuntoB.add(10);
        conjuntoB.add(20);
        conjuntoB.add(5);
        conjuntoB.add(7);
        
        /**
         * UNI�N.
         * Todos los del conjunto A, a�adiendo los del B PERO sin repetir los existentes.
         */
        conjuntoA.addAll(conjuntoB);
        System.out.println(conjuntoA);
        /**
         * DIFERENCIA.
         * Elimina aquellos que tienen en com�n.
         * 
         */
        conjuntoA.removeAll(conjuntoB);
        System.out.println(conjuntoA);
        /**
         * INTERSECCI�N.
         * Retiene aquellos que tienen en com�n.
         */
        conjuntoA.retainAll(conjuntoB);
        System.out.println(conjuntoA);
    }

}
