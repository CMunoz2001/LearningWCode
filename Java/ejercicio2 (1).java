public class ejercicio2 {
    public static void main(String[] args) {
        int numero = 99;
        int objetivo = 95;
        int iteraciones = 1;
        System.out.println("ciclo do-while");
        do {
            System.out.println(" " + iteraciones + ", " + numero );
            numero--;
            iteraciones++;
        } while (numero >= objetivo);



        System.out.println("ciclo for");
        int numero2 = 99;
        int objetivo2 = 95;
        for (int it = 1; numero2 >= objetivo2; it++, numero2--) {
            System.out.println(it + ", " + numero2);
        }
    



        System.out.println("ciclo while");
        int num = 99;
        int min= 95;
        int i = 1;
        while (min <=num) {
            System.out.println(i + " "+ num );
            i++;
            num--;
            
        }



    }
}