import java.util.*;

public class Maxnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 1 numero entero");
        int num1 = in.nextInt();
        System.out.println("Digite otro numero entero");
        int num2 = in.nextInt();
        System.out.println("Digite el ultimo numero entero");
        int num3 = in.nextInt();
        int nummayor = Math.max(num1, Math.max(num2, num3));
        System.out.println("El numero " + nummayor + " es el mas grande de los tres");
    }
}
