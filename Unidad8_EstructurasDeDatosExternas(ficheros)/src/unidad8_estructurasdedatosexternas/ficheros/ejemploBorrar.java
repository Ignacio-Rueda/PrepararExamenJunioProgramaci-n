package unidad8_estructurasdedatosexternas.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejemploBorrar {
 
    public static void main(String[]args){
        String ruta = System.getProperty("user.dir")+File.separator+"src"+File.separator+"recursos"+File.separator+"datos.txt";
        File rutaFichero = new File(ruta);
        try(BufferedReader br = new BufferedReader(new FileReader(rutaFichero))){
            String cadena = br.readLine();
            System.out.println(cadena);
            while(br.read()!=-1){
                System.out.println(cadena);
                cadena = br.readLine();
            }
            
        }catch(FileNotFoundException ex){
            System.out.println("No se ha encontrado el fichero"+ex.getMessage());
        }catch(IOException ex){
            System.out.println("Ha ocurrido un error"+ex.getMessage());
        }
    }
    
}
