package ejercicio_6;

import static java.lang.System.in;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Integer;
import java.util.Objects;

/**
 * [Clase que pide números hasta que se introduce dos veces seguidas el mismo
 * número;
 *
 * @version [1.00.000 2022-03-01
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
public class CheckRepeatedData {

    Vector<Integer> v1 = new Vector<>();
    Scanner in = new Scanner(System.in);
    String number;

    public void AskForNumber() {
        do {
            System.out.println("Ingrese un numero : ");
            number = in.nextLine();
        } while (!number.matches("[0-9]*"));
        v1.add(Integer.parseInt(number));

        do {
            do {
                System.out.println("Ingrese un numero : ");
                number = in.nextLine();
            } while (!number.matches("[0-9]*"));
            v1.add(Integer.parseInt(number));
        } while (v1.get(v1.size() - 1) != v1.get(v1.size() - 2));

    }

}
