package unidad8_estructurasdedatosexternas.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicherosDeTexto {

    public static void leerFichero(String ruta) {
        File fichero = new File(ruta);
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String cadena = "";
            while (cadena != null) {
                cadena = br.readLine();
                if (cadena != null) {
                    System.out.println(cadena);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha podido localizar el fichero solicitado" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error" + ex.getMessage());
        }
    }

    public static void escribirFichero(String ruta) {
        File fichero = new File(ruta);
        try (FileWriter fw = new FileWriter(fichero, true); PrintWriter pw = new PrintWriter(fw);) {
            pw.print("Hola a todo el mundo\n");
            pw.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha podido localizar el fichero solictado" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error" + ex.getMessage());
        }
    }

    public static void main(String args[]) {
        String ruta = System.getProperty("user.dir") + File.separator + "src" + File.separator + "recursos" + File.separator + "datos.txt";
        System.out.println("Leyendo fichero...");
        leerFichero(ruta);
        System.out.println("Escribiendo en fichero...");
        escribirFichero(ruta);
        System.out.println("Leyendo fichero...");
        leerFichero(ruta);

    }

}
