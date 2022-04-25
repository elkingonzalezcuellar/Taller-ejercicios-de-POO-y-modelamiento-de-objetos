
package ejercicio_3;

import java.util.Scanner;

/**
 * [Clase principal para ordenar un vector;
 * @version [1.00.000 2022-02-23
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
public class Ejercicio_3 {

    private static Scanner in = new Scanner(System.in);
    private static int selection;

    public static void main(String[] args) {
        RandomVector vec1 = new RandomVector();
        vec1.GenerateArray();
        System.out.println("Hemos generado el vector : ");
        vec1.PrintArray();
        System.out.println("Selecciona una opción para ordenarlo ascendentemente :");
        System.out.println("  1.Metodo burbuja");
        System.out.println("  2.Metodo quicksort");
        selection = in.nextInt();

        if (selection == 1) {
            vec1.OrderBubble();
            vec1.PrintArray();
        } else if (selection == 2) {
            vec1.QuickSort(0, (vec1.getLength() - 1), vec1.getVector());
            vec1.PrintArray();

        } else {
            System.out.println("Opción  no valida");
        }

    }

}
