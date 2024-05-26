package utilidadesyejemplos;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Vehiculo v = new Vehiculo(25, "0000LLL", LocalDate.of(2024, 05, 26));
        Vehiculo copia = new Vehiculo(v);
        
        //USO DE VARAGS
        System.out.println(v.sumar(1, 5, 6, 7));
        System.out.println(v.presentacionSuma("Total de su compra:", 2.5, 30, 29.88));

        try {
            v.arrancar();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            v.arrancar();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
