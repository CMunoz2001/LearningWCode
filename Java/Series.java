import java.util.*;
public class Series{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Digite un numero");
    int num1 = in.nextInt();
    
    System.out.println("Con el ciclo For:");
    int num2 = 100;
    for(int i=1;i<=num1;i++){
      System.out.println("Resultado: "+i+" - "+(num2-i));
    }

    System.out.println("\nCon el ciclo While:");
    num2 = 100;
    int contador = 1;
    while(contador<num1){
      System.out.println("Resultado: "+contador+" - "+(num2-contador));
      contador++;
    };
    
    do{
    
    
    
    }
  }
}