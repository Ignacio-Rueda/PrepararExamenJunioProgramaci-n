package MetodoGenerico;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String [] args){
    
        List<Integer> listaEnteros = new ArrayList<>();
        for(int n=0;n<10;n++){
            listaEnteros.add(n);
        }
        
        System.out.println(ClaseEjemplo.getTamanio(listaEnteros));
        
        
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Mar�a",34,1000));
        listaEmpleados.add(new Empleado("Roc�o",36,1500));
        listaEmpleados.add(new Empleado("Sara",38,2500));
        
        System.out.println(ClaseEjemplo.getTamanio(listaEmpleados));
    }
    
}

class ClaseEjemplo{
    
    public static <T> String getTamanio(List<T> listaRecibida){
        return "El tama�o de la lista recibida es "+listaRecibida.size();
    }
}