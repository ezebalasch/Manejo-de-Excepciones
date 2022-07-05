/*
// Curso Egg FullStack
 */
package excep_05;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Ezequiel Balasch
 */
public class Excep_05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int intentos = 0;
        int fallas = 0;
        Long num = null;
        Long x = Math.round(Math.random() * 500);
        System.out.println(x);
        try {
            do {

                System.out.println("Ingrese número para adivinar");
                num = leer.nextLong();
                if (num<x) {
                    System.out.println("Intenta con un número más grande");                    
                }
                if (num>x) {
                    System.out.println("Intenta con un numero mas bajo");
                    
                }
                intentos++;
                if (!Objects.equals(num, x)) {
                    fallas++;                    
                }
            } while (!Objects.equals(num, x));
            if (Objects.equals(num, x)) {
                System.out.println("Número Correcto!!");
                System.out.println("El número es: " + x);
                System.out.println("Número de intentos: "+intentos);
                System.out.println("Número de fallos: "+ fallas);
            } else {
                System.out.println("Error, por favor reinicie el juego :)");
            }
        }catch (InputMismatchException e){
            System.out.println("Fallo al ingresar por teclado");
        }catch (Exception e) {
            System.out.println("Error Fatal");
        }

        }

    }


