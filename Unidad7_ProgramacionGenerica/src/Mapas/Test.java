
package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Test {
    
    public static void main(String args[]){
    
        Map<String,Empleado> mapa = new HashMap<>();
        mapa.put("01", new Empleado("Raúl",33,3500));
        mapa.put("02",new Empleado("Sandra",27,2900));
        mapa.put("03",new Empleado("Isabel",28,3600));
    
        
        
    }
    
}
