import java.util.*;

public class Invertircadena {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres:");
        String cadena = in.nextLine();
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}
