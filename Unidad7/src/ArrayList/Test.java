package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    
    public static void main(String args[]){
    
        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        listaEmpleados.add(new Empleado("Juan",35,3500));
        listaEmpleados.add(new Empleado("Pedro",40,2500));
        listaEmpleados.add(new Empleado("Eva",25,3750));
        
        //Insertar en una posición determinada.
        listaEmpleados.set(1, new Empleado("Tomás",47,1350));

        System.out.println("USANDO UN FOR EACH");
        for(Empleado e : listaEmpleados){
            System.out.println(e);
        }
        System.out.println("USANDO UN ITERADOR");
        Iterator i = listaEmpleados.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        
        System.out.println("COPIAMOS A UN ARRAY CONVENCIONAL");
        //Copiar el List a un array convencional
        Empleado arrayEmpleados [] = new Empleado [listaEmpleados.size()];
        listaEmpleados.toArray(arrayEmpleados);
        for(int n=0;n<arrayEmpleados.length;n++){
            System.out.println(arrayEmpleados[n]);
        }
    }
    
}
