
package AlgoritmosOrdenandoElementosColeccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
    
    public static void main(String args[]){
    
        List <Empleado>conjunto = new ArrayList<>();
        
        
        conjunto.add(new Empleado("Pedro","001",68,2500,"si"));
        conjunto.add(new Empleado("Sara","002",29,3200,"no"));
        conjunto.add(new Empleado("Ramón","003",79,2500,"si"));
        conjunto.add(new Empleado("Ana","004",19,2800,"no"));
        //Collections.sort(conjunto);
        //Collections.sort(conjunto, new ComparadorPorEdad());
        //Collections.sort(conjunto,new ComparadorPorSueldo());
        Collections.sort(conjunto, new ComparadorPorJubilacion());
        Iterator <Empleado> it = conjunto.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
    }
}
