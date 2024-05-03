package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

    public static void main(String args[]) {
        Set<Cliente> conjuntoClientes = new HashSet<>();

        Cliente c1 = new Cliente("Juan", "12345", 500.25);
        Cliente c2 = new Cliente("José", "54321", 1500);
        Cliente c3 = new Cliente("Lucía", "20211", 8500.23);
        Cliente c4 = new Cliente("Lucía", "20211", 8500.23);//La clase Cliente implementa los métodos equals y hashcode, de manera que ya sí existe un criterio en esta clase para poder discernir si un elemento existe o no.
        conjuntoClientes.add(c1);
        conjuntoClientes.add(c2);
        conjuntoClientes.add(c3);
        conjuntoClientes.add(c4);
        //Recorrer conjunto
        System.out.println("RECORRER CONJUNTO CON FOREACH");
        for (Cliente cliente : conjuntoClientes) {
            System.out.println(cliente);
        }

        System.out.println("RECORRER CONJUNTO CON ITERADOR Y ELIMINAR UN ELEMENTO");
        Iterator<Cliente> i = conjuntoClientes.iterator();

        while (i.hasNext()) {
            if (i.next().getNombre().equals("Lucía")) {
                i.remove();
            }
        }

        System.out.println("RECORRER CONJUNTO CON ITERADOR");
        Iterator<Cliente> it = conjuntoClientes.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
