package unidad8_estructurasdedatosexternas.ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FicherosBinariosImagen {

    public static void main(String args[]) {
        String rutaImagen = System.getProperty("user.dir") + File.separator + "src" + File.separator + "recursos" + File.separator + "gnomo.jpg";
        String rutaCopiaImagen = System.getProperty("user.dir") + File.separator + "src" + File.separator + "recursos" + File.separator + "copia.jpg";
        File fichero = new File(rutaImagen);
        File ficheroCopia = new File(rutaCopiaImagen);
        int[] arrayImagen = new int[72474];
        try (InputStream lecturaImagen = new FileInputStream(fichero);) {
            int contadorBytes = 0;
            int byteLeido = 0;
            while (byteLeido != -1) {
                byteLeido = lecturaImagen.read();
                arrayImagen[contadorBytes] = byteLeido;
                contadorBytes++;
            }
            System.out.printf("La imagen tiene %d bytes%n", contadorBytes);
        } catch (FileNotFoundException ex) {
            System.out.println("Ha ocurrido un error al localizar el fichero" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error" + ex.getMessage());
        }
        //***************************************
        //COPIAMOS LA IMAGEN
        //***************************************
        System.out.println("Realizando copia...");
        try (OutputStream copiarImagen = new FileOutputStream(ficheroCopia)) {
            for (int n = 0; n < arrayImagen.length;n++){
                copiarImagen.write(arrayImagen[n]);
            }
            System.out.println("Copia realizada con éxito");
        } catch (FileNotFoundException ex) {
            System.out.println("Ha ocurrido un error " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error " + ex.getMessage());
        }

    }

}
