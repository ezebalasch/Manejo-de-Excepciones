/*
// Curso Egg FullStack
 */
package excep_02;

//@author Ezequiel Balasch
public class Excep_02 {

    public static void main(String[] args) {
        Integer[] array1 = new Integer[3];
        try {
            for (int i = 0; i < array1.length + 1; i++) {
                array1[i] = i;

            }
            for (Integer array11 : array1) {
                System.out.println(array11);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error exitoso en Array");
        }

    }

}
