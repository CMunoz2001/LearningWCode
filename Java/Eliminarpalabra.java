import java.util.*;

public class Eliminarpalabra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palabra;
        String cadena;
        System.out.println("Introduzca una oracion");
        cadena = in.nextLine();
        System.out.println("Introduzca la palabra a eliminar");
        palabra = in.nextLine();
        if (cadena.contains(palabra)) {
            cadena = cadena.replaceAll(palabra, "");
            cadena = cadena.replaceAll("  ", " ");
        }
        System.out.println(cadena);
    }
}
