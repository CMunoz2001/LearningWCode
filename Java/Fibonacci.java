public class Fibonacci {
    public static void main(String[] args) {
        int fibonacci = 0, estado1 = 0, estado2 = 1;
        while (fibonacci <= 1597) {
            String caracter = (fibonacci < 1597) ? "," : "";
            System.out.print(fibonacci + caracter);
            estado1 = fibonacci + estado2;
            fibonacci = estado2;
            estado2 = estado1;
        }
    }
}