package ejercicio_5;

import ejercicio_4.Vehicle;

/**
 * [Clase que representa una lancha tomando en cuenta como atributos el ancho de
 * la Proa(parte delantera) y el de la popa(parte trasera)
 *
 * @version [1.00.000 2022-02-23
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
public class Boat extends Vehicle {

    private boolean sailBoat;
    private int FrontWidth;
    private int backWidth;

    public Boat() {
    }

    public Boat(boolean sailBoat, int rontWidth, int backWidth, int numberOfPassengers,
            boolean crew, int numberOfWheels, int value, String brand, String enviroment1, String model,
            String energySource, String color) {
        super(numberOfPassengers, crew, numberOfWheels, value, brand, enviroment1, model,
                energySource, color);
        this.sailBoat = sailBoat;
        this.FrontWidth = FrontWidth;
        this.backWidth = backWidth;
    }

    @Override
    public void Move() {

        System.out.println("Lancha en movimiento...");

    }

    @Override
    public void Start() {

        System.out.println("Lancha encendida.");

    }

    public int getBackWidth() {
        return backWidth;
    }

    public void setBackWidth(int backWidth) {
        this.backWidth = backWidth;
    }

    public boolean isSailBoat() {
        return sailBoat;
    }

    public void setSailBoat(boolean sailBoat) {
        this.sailBoat = sailBoat;
    }

    public int getFrontWidth() {
        return FrontWidth;
    }

    public void setFrontWidth(int FrontWidth) {
        this.FrontWidth = FrontWidth;
    }

}
