package ejercicio_5;

import ejercicio_4.Vehicle;

/**
 * [Clase que representa una moto, en las cuales es importante atributos como
 * tener frenos ABS(sistema antibloqueo de ruedas) , el peso y si tiene llantas
 * antideslizantes ;
 *
 * @version [1.00.000 2022-02-23
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
public class Motorcycle extends Vehicle {

    private boolean ABS;
    private boolean nonSlipTires;
    private int weight;

    public Motorcycle() {
    }

    public Motorcycle(boolean ABS, boolean nonSlipTires, int weight, int numberOfPassengers,
            boolean crew, int numberOfWheels, int value, String brand, String enviroment1,
            String model, String energySource, String color) {
        super(numberOfPassengers, crew, numberOfWheels, value, brand, enviroment1, model,
                energySource, color);
        this.ABS = ABS;
        this.nonSlipTires = nonSlipTires;
        this.weight = weight;
    }

    @Override
    public void Move() {
        System.out.println("Motocicleta en movimiento");

    }

    @Override
    public void Start() {

        System.out.println("Moto encendida");

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean ABS) {
        this.ABS = ABS;
    }

    public boolean isNonSlipTires() {
        return nonSlipTires;
    }

    public void setNonSlipTires(boolean nonSlipTires) {
        this.nonSlipTires = nonSlipTires;
    }

}
