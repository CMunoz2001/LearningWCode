import java.util.*;

public class Calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numero;
        System.out.println(
                "Digite la operacion que desea realizar (Suma, Resta, Multiplicacion, Division, Division Entera, Exponente o Modulo)");
        switch (in.nextLine()) {
            case "Suma":
                System.out.println("Digite un numero");
                numero = in.nextDouble();
                System.out.println("Digite otro numero");
                numero = numero + in.nextDouble();
                System.out.println("El resultado es: " + numero);
                break;
            case "Resta":
                System.out.println("Digite un numero");
                numero = in.nextDouble();
                System.out.println("Digite otro numero");
                numero = numero - in.nextDouble();
                System.out.println("El resultado es: " + numero);
                break;
            case "Multiplicacion":
                System.out.println("Digite un numero");
                numero = in.nextDouble();
                System.out.println("Digite otro numero");
                numero = numero * in.nextDouble();
                System.out.println("El resultado es: " + numero);
                break;
            case "Division":
                System.out.println("Digite un numero");
                numero = in.nextDouble();
                System.out.println("Digite otro numero");
                numero = numero / in.nextDouble();
                System.out.println("El resultado es: " + numero);
                break;
            case "Division Entera":
                System.out.println("Digite un numero");
                numero = in.nextDouble();
                System.out.println("Digite otro numero");
                numero = numero / in.nextDouble();
                System.out.println("El resultado es: " + numero);
                break;
            case "Exponente":
                System.out.println("Digite un numero");
                numero = in.nextDouble();
                System.out.println("Digite el exponente");
                numero = Math.pow(numero, in.nextDouble());
                System.out.println("El resultado es: " + numero);
                break;
            case "Modulo":
                System.out.println("Digite un numero");
                numero = in.nextDouble();
                System.out.println("Digite otro numero");
                numero = numero % in.nextDouble();
                System.out.println("El resultado es: " + numero);
                break;
            default:
                System.out.println("La opcion no es correcta");
                break;
        }
    }
}
