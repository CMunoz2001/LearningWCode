/*------------------Biblioteca de utilidades para el Scanner------------------*/
import java.util.*;

/*------------------Declaracion de la clase principal------------------*/
public class Vacaciones{

/*------------------Declaracion de la clase main------------------*/
  public static void main(String[] args){

/*------------------Asignacion de variables y creacion de Objetos(Scanner)------------------*/
    int vacaciones = 0;
    Scanner input = new Scanner(System.in);

/*------------------Sentencias e inputs------------------*/
    System.out.println("Ingrese su Nombre:");
    String nombre = input.next();
    System.out.println("Ingrese su Clave:");
    int clave = input.nextInt();
    System.out.println("Ingrese su Antiguedad:");
    int antiguedad = input.nextInt();

/*------------------validador de nombre, claves y antiguedad------------------*/
    while(clave < 1 && clave > 3){
      System.out.println("Clave incorrecta, por favor vuelva a digitar el numero de su Clave:");
      clave = input.nextInt();
    }
    while(antiguedad < 1){
      System.out.println("Usted no puede tener una antiguedad menor a un año:");
      antiguedad = input.nextInt();
    }
    while(nombre == ""){
      System.out.println("Usted debe ingresar un nombre:");
      nombre = input.next();
    }

/*------------------validadores de casos segun las claves------------------*/
    if(clave == 1){
      if(antiguedad >= 1 && antiguedad < 2){
        vacaciones = 6;
      }else if(antiguedad >= 2 && antiguedad <7){
        vacaciones = 14;
      }else if(antiguedad >= 7){
        vacaciones = 20;
      }

    }else if(clave == 2){
      if(antiguedad >= 1 && antiguedad < 2){
        vacaciones = 7;
      }else if(antiguedad >= 2 && antiguedad <7){
        vacaciones = 15;
      }else if(antiguedad >= 7){
        vacaciones = 22;
      }

    }else if(clave == 3){
      if(antiguedad >= 1 && antiguedad < 2){
        vacaciones = 10;
      }else if(antiguedad >= 2 && antiguedad <7){
        vacaciones = 20;
      }else if(antiguedad >= 7){
        vacaciones = 30;
      }
    }

/*------------------Mensaje de resultado------------------*/
    System.out.println(nombre+", sus vacaciones son de: " + vacaciones + " dias");
  }
}
