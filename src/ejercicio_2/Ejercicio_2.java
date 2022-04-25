package ejercicio_2;

/**
 * [Clase que instancia otras clases con metodos main, solo es posible declarar
 * una clase publica con metodo main en un mismo fichero pero se pueden declarar
 * otras clases con encapsulamiento por defecto, un IDE como Neatbeans nos da la
 * opción de escoger la clase que iniciará el programa, sin embargo, al
 * ejecutarlo en el cmd de Windows empieza por la clase publica]
 *
 * @version [1.00.000 2022-02-23
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        System.out.println("Aqui inicia el programa");
        ClassOne First = new ClassOne();
        ClassTwo Second = new ClassTwo();
        ClassTwo.main(args);
    }

}

class ClassTwo {

    public static void main(String[] args) {
        System.out.println("Clase 2");
    }
}

class ClassThree {

    public static void main(String[] args) {
        System.out.println("Clase 3");
    }
}
