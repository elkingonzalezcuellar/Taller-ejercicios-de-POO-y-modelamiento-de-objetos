package ejercicio_5;

import ejercicio_4.ValidateData;
import ejercicio_4.Vehicle;
import java.util.Date;

/**
 * [Clase que representa una bicicleta con atributos importantes como,el plato y
 * tamaño del rin;
 *
 * @version [1.00.000 2022-02-23
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
public class Bike extends Vehicle {

    private int currentChainring;
    private int currentBikeSprocket;
    private int rinSize;

    public Bike() {
    }

    public Bike(int currentChainring, int currentBikeSprocket, int numberOfPassengers,
            boolean crew, int numberOfWheels, int value, String brand, String enviroment1,
            String model, String energySource, String color) {
        super(numberOfPassengers, crew, numberOfWheels, value, brand, enviroment1, model,
                energySource, color);
        this.currentChainring = currentChainring;
        this.currentBikeSprocket = currentBikeSprocket;
    }

    @Override
    public void Move() {

        System.out.println("Bicicleta en movimiento");

    }

    @Override
    public void Start() {

        System.out.println("Pedaleando...");

    }

    public int getCurrentBikeSprocket() {
        return currentBikeSprocket;
    }

    public void setCurrentBikeSprocket(int currentBikeSprocket) {
        this.currentBikeSprocket = currentBikeSprocket;
    }

    public int getCurrentChainring() {
        return currentChainring;
    }

    public void setCurrentChainring(int currentChainring) {
        this.currentChainring = currentChainring;
    }

    public int getRinSize() {
        return rinSize;
    }

    public void setRinSize(int rinSize) {
        this.rinSize = rinSize;
    }

}
