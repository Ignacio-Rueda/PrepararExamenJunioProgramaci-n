
package ClaseGenerica;
public class Test {

    public static void main(String[] args) {
        ClaseGenerico <Integer> miClaseEnteros= new ClaseGenerico<>();
        miClaseEnteros.setClaseGenerio(100);
        System.out.println(miClaseEnteros.getClaseGenerico());
        
        ClaseGenerico <String> miClaseCadena = new ClaseGenerico<>();
        miClaseCadena.setClaseGenerio("Cadena de caracteres");
        System.out.println(miClaseCadena.getClaseGenerico());
        
    }        
}
