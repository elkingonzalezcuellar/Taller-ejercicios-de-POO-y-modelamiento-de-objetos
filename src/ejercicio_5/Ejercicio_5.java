
package ejercicio_5;

import ejercicio_4.Ejercicio_4;
import ejercicio_4.ValidateData;
import ejercicio_4.Vehicle;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * [Clase principal que permite crear distintos tipos de vehiculos
 *
 * @version [1.00.000 2022-02-23
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
public class Ejercicio_5 {

    private ArrayList<Vehicle> list = new ArrayList<>();

    public static void main(String[] args) {
        Ejercicio_5 e = new Ejercicio_5();
        e.MainMenu();

    }

    public void MainMenu() {
        /**
         * Variable encargada de la ejecución en bucle del programa
         */
        int flag = 0;
        /**
         * Variable correspondiente al numero de opcion escogida por el usuario
         */
        int selection = 0;

        do {
            do {

                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Porfavor seleccione una opción:");
                System.out.println("    1. Crear Bicicleta.");
                System.out.println("    2. Crear Lancha.");
                System.out.println("    3. Crear Carro.");
                System.out.println("    4. Crear Moto.");
                System.out.println("    5. Crear Camión.");
                System.out.println("    6. Listar Vehiculos creados");
                System.out.println("    7. Salir.");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                selection = ValidateData.DataInt();

                if (selection >= 1 && selection <= 7) {
                    flag = 1;
                } else {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            } while (flag == 0);

            if (selection == 1) {
                Bike kind = new Bike();
                kind.RequestVehicleData(kind);
                System.out.print("Medida de rin: ");
                kind.setRinSize(ValidateData.DataInt());
                System.out.println("Vehiculo Creado!");
                setList(kind);
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            } else if (selection == 2) {
                Boat kind = new Boat();
                kind.RequestVehicleData(kind);
                System.out.print("Ancho en Proa: ");
                kind.setFrontWidth(ValidateData.DataInt());
                System.out.print("Ancho en Popa: ");
                kind.setBackWidth(ValidateData.DataInt());
                System.out.println("Vehiculo Creado!");
                setList(kind);
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            } else if (selection == 3) {
                Car kind = new Car();
                kind.RequestVehicleData(kind);
                System.out.print("¿Tiene Baúl? : ");
                kind.setCarTrunk(ValidateData.DataBoolean());
                System.out.print("¿Tiene Vidrios Polarizados? :");
                kind.setTintedWindows(ValidateData.DataBoolean());
                System.out.println("Vehiculo Creado!");
                setList(kind);
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            } else if (selection == 4) {
                Motorcycle kind = new Motorcycle();
                kind.RequestVehicleData(kind);
                System.out.print("¿Cuenta con sistema de frenos ABS? : ");
                kind.setABS(ValidateData.DataBoolean());
                System.out.print("Peso :");
                kind.setWeight(ValidateData.DataInt());
                System.out.println("Vehiculo Creado!");
                setList(kind);
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            } else if (selection == 5) {
                Truck kind = new Truck();
                kind.RequestVehicleData(kind);
                System.out.print("Peso de carga : ");
                kind.setLoadWeight(ValidateData.DataInt());
                System.out.println("Vehiculo Creado!");
                setList(kind);
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            } else if (selection == 6) {
                System.out.println(list);
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            } else if (selection == 7) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("¡Gracias!, vuelva pronto.");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                flag = 2;
            }
        } while (flag != 2);
    }

    public void setList(Vehicle name) {
        this.list.add(name);
    }

}
