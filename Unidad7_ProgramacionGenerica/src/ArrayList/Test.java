package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {
    
    public static void main(String args[]){
    
        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        listaEmpleados.add(new Empleado("Juan",35,3500));
        listaEmpleados.add(new Empleado("Pedro",40,2500));
        listaEmpleados.add(new Empleado("Eva",25,3750));
        
        //Insertar en una posición determinada.
        listaEmpleados.add(1, new Empleado("Tomás",47,1350));

        System.out.println("IMPRIMIR UN FOR EACH");
        for(Empleado e : listaEmpleados){
            System.out.println(e);
        }
        System.out.println("SUSTITUIMOS UN ELEMENTO...");
        //Reemplazar en una posición determinada.
        listaEmpleados.set(1, new Empleado("Rogelio",20,2500));
        System.out.println("IMPRIMIR CON UN ITERADOR");
        Iterator <Empleado> i = listaEmpleados.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        
        /*System.out.println("COPIAMOS A UN ARRAY CONVENCIONAL");
        //Copiar el List a un array convencional
        Empleado arrayEmpleados [] = new Empleado [listaEmpleados.size()];
        listaEmpleados.toArray(arrayEmpleados);
        for(int n=0;n<arrayEmpleados.length;n++){
            System.out.println(arrayEmpleados[n]);
        }*/
        /**
         * La diferencia entre Iterator y ListIterator es que ListIterator tiene muchos más métodos que Iterator y podemos recorrer la lista hacia delante y hacia atrás.
         */
       ListIterator <Empleado> it = listaEmpleados.listIterator();
        it.add(new Empleado ("Pepe",25,3800));
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
 
        
    }
    
}
