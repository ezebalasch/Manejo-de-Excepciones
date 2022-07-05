package excep_03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
// Curso Egg FullStack
 */

//@author Ezequiel Balasch
public class Excep_03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("Ingrese el primer numero");
            String numero1 = leer.next();
            System.out.println("Ingrese el segundo numero");
            String numero2 = leer.next();

            int primero = Integer.parseInt(numero1);
            int segundo = Integer.parseInt(numero2);
            Integer division = primero/segundo;
            System.out.println("Resultado: "+division);
        } catch (ArithmeticException e) {
            System.out.println("Fallo al dividir por cero");
        
        } catch (InputMismatchException e){
            System.out.println("Fallo al ingresar por teclado");
        } catch (NumberFormatException e){
            System.out.println("Fallo debido a que la cadena no puede convertirse en entero");
            
        }

    }

}
