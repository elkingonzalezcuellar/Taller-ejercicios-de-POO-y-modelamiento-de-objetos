package ejercicio_4;

import ejercicio_5.Car;
import java.util.Date;
import java.util.Vector;

/**
 * [Clase principal donde se piden los datos de 10 vehiculos y se muestran en consola;
 * @version [1.00.000 2022-02-23
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
public class Ejercicio_4 {

    static Vector<Vehicle> list = new Vector<>();

    public static void main(String[] args) {
        CreatedVehicle();
        toList();
    }
/**
 * Bucle que pide los datos de un vehiculo
 * @version [1.00.000 2022-02-23
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
    public static void CreatedVehicle() {

        for (int i = 1; i <= 10; i++) {

            System.out.println("Datos del vehiculo " + i);
            Vehicle e = new Car();
            e.RequestVehicleData(e);
            System.out.println("Vehiculo Creado!");
            setList(e);
        }
    }

    public static void toList() {
        System.out.println(list);
    }

    public static void setList(Vehicle name) {
        list.add(name);
    }

}
