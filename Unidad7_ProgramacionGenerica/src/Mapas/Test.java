
package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    
    public static void main(String args[]){
    
        Map<String,Empleado> mapa = new HashMap<>();
        mapa.put("01", new Empleado("Raúl",33,3500));
        mapa.put("02",new Empleado("Sandra",27,2900));
        mapa.put("03",new Empleado("Isabel",28,3600));
        mapa.remove("01");
        //Para reemplazarlo, introducir el elemento con la misma clave
        mapa.put("02", new Empleado("Alejandro",24,2700));
        Set<Map.Entry<String,Empleado>> s = mapa.entrySet();
        for(Map.Entry<String,Empleado> i:s){
            System.out.println(i.getKey());
            System.out.println(i.getValue().getEdad());
        }
        
    }
    
}
