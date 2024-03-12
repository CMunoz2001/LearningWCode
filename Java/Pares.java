import java.util.*;

public class Pares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero entero");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        } else {
            System.out.println("El numero " + num + " es impar");
        }
    }
}