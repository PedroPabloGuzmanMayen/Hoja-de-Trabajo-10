import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      /*
      * Leer contenidos de archivo logistica.txt
      */
        List<String> contenidoArchivo = leerArchivo("logistica.txt");

        for (String linea : contenidoArchivo) {
            System.out.println(linea);
        }
    }

    public static List<String> leerArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();

        try {
            File archivo = new File(nombreArchivo);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                lineas.add(linea);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error de lectura del archivo: " + e.getMessage());
        }

        return lineas;
    }
}
