package unidad8_estructurasdedatosexternas.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class Token {
    /**
     * TT_WORD indica que el token es una palabra.
     * TT_NUMBER indique que el token es un número.
     * TT_EOL indica que se ha leído el fin de línea.
     * TT_EOF inica que se ha llegado al fin del flujo de entrada.
     * @param nombreFichero 
     */
    public void contarPlabrasYNumeros(String nombreFichero) {
        StreamTokenizer sTokenizer = null;
        int contadorPalabras = 0;
        int numeroDenumeros = 0;
        try {
            sTokenizer = new StreamTokenizer(new FileReader(nombreFichero));
            while (sTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (sTokenizer.ttype == StreamTokenizer.TT_WORD) {
                    contadorPalabras++;
                } else if (sTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                    numeroDenumeros++;
                }
            }
            System.out.println("Número de palabras en el fichero:" + contadorPalabras);
            System.out.println("Número de números en el fichero:" + numeroDenumeros);
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado el fichero"+ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        String ruta = System.getProperty("user.dir")+File.separator+"src"+File.separator+"recursos"+File.separator+"datos.txt"; 
        new Token().contarPlabrasYNumeros(ruta);
       

    }

}
