/*

 * Nombre de la clase: Clase de la semana del 22
 * Información de la versión: 
 * Fecha: 5/9/2022
 * Enunciado: Escriba una aplicación que lea dos enteros, 
 * determine si el primero es un múltiplo del segundo e 
 * imprima el resultado
 */

/* Se importa la libreria de java Scanner que permite registrar el input del usuario */
import java.util.Scanner;

public class Ejercicio226 {
    /* Se pone el valor del Scanner en la palabra leer para poder llamar a la libreria en el codigo */
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        /*Definicion de variables */
        int numero1 = 0;
        int numero2 = 0;
        /* Codigo Principal */
        /* Se le pide al usuario ingresar dos numeros */
        System.out.println("Por favor ingrese el primer numero");
        numero1 = leer.nextInt();
        System.out.println("Por favor ingrese el segundo numero");
        numero2 = leer.nextInt();
        /* Se crea una condicional que verificara si el numero1 es multiplo del numero 2 */
        if (numero1 % numero2 == 0){
            System.out.println("El numero "+ numero1 + "es multiplo de " + numero2);
        }
        /* Si la condicion falla, se imprimira que el numero 1 no es multiplo del numero 2*/
        else{
            System.out.println("El numero " + numero1 + "no es multiplo de "+ numero2);
        }
    }
}
