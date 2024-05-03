package CompareToPildorasInformaticas;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Test {
    
    
    public static void main(String[]args){
        List<Integer> listaEnteros = new ArrayList<>();
        for(int i=0;i<10;i++){
            listaEnteros.add(i);
        }
        System.out.println(ClaseEjemplo.getMenor(listaEnteros));

        
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Maria",LocalDate.of(2010, 1, 1),2500));
        listaEmpleados.add(new Empleado("José",LocalDate.of(2009,2,2),2800));
        listaEmpleados.add(new Empleado("Estefanía",LocalDate.of(2017, 3, 3),2750));
        
        System.out.println(ClaseEjemplo.getMenor(listaEmpleados));
    }
}


class ClaseEjemplo{
/**
 *El método compareTo pertenece a la interfaz comparable, eso implica que los objetos que utilicen éste método
 * tienen que implementar la interfaz Comparable.
 * Esto lo hacemos en la definición del método,debemos indicarle, donde le decimos que éste método va a manejar datos de tipo genérico.
 * EXTENDS y no IMPLEMENTS.
 * Esto tiene sentido porque nos obliga a que todos los argumentos que le pasemos a éste método genérico tengan que ser objetos que 
 * implementen la INTERFAZ COMPARABLE.
 */
    public static <T extends Comparable> T getMenor(List<T> listaRecibida){
        if(listaRecibida == null || listaRecibida.isEmpty()){
            return null;
        }
        T elementoMenor = listaRecibida.get(0);
        for(int n=0;n<listaRecibida.size();n++){
            if(elementoMenor.compareTo(listaRecibida.get(n))>0){
                elementoMenor = listaRecibida.get(n);
            }
        }
        return elementoMenor;
        
    }


}
