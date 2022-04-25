
package ejercicio_1;

/**
 * [Clase que representa el sistema planetario sistema solar,permite calcular la
 * atracción entre dos cuerpos Planet. ej.: PlanetarySystem SolarSystem = new
 * PlanetarySystem();; SolarSystem.GravitationalPull();]
 *
 * @version [1.00.000 2022-02-23
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
public class PlanetarySystem {

    /**
     * Constante de gravitación universal unidades : N*m^2/kg^2
     */
    public static final double G = 6.67300E-11;
    /**
     * Valor de unidad astronómica (Distancia de la tierra al sol) unidades : m
     */
    public static final double AU = 1.496e+11;

    /**
     * [Representa los planetas que contiene este sistema planetario con sus
     * atributos más relevantes. ej.: Planet.EARTH,Planet.valueOf("EARTH"); ]
     *
     * @version [1.00.000 2022-02-23
     * @author [Elkin Estiven González Cuellar -
     * elkin.gonzalez-c@mail.escuelaing.edu.co ]
     * @since [1.00.000]
     *
     */
    public enum Planet {
        MERCURY(1, 3.303e+23, 2.4397e6, 5.43, 0.39),
        VENUS(2, 4.869e+24, 6.0518e6, 5.24, 0.72),
        EARTH(3, 5.976e+24, 6.37814e6, 5.51, 1),
        MARS(4, 6.421e+23, 3.3972e6, 3.93, 1.52),
        JUPITER(5, 1.9e+27, 7.1492e7, 1.33, 5.2),
        SATURN(6, 5.688e+26, 6.0268e7, 0.683, 9.54),
        URANUS(7, 8.686e+25, 2.5559e7, 1.27, 19.19),
        NEPTUNE(8, 1.024e+26, 2.4746e7, 1.64, 30.06);
        /**
         * Masa en kg
         */
        public final double mass;
        /**
         * radio en metros
         */
        public final double radius;
        /**
         * densidad en g/c^3
         */
        public final double density;
        /**
         * distancia al sol en unidades astronómicas
         */
        public final double distanceToSun;
        /**
         * Posición que ocupa en relación con us distancia al sol
         */
        public final int id;

        private Planet(int id, double mass, double radius, double density, double distanceToSun
        ) {
            this.id = id;
            this.mass = mass;
            this.radius = radius;
            this.density = density;
            this.distanceToSun = distanceToSun * AU;
        }

        public double getMass() {
            return mass;
        }

        public double getRadius() {
            return radius;
        }

        public double getDensity() {
            return density;
        }

        public double getDistanceToSun() {
            return distanceToSun;
        }

        public int getId() {
            return id;
        }

    }

    /**
     * [Obtener un al azar un planeta contenido en Planet. ej.: Planet P1 =
     * RandomPlanet();]
     *
     * @return C1 cuerpo seleccionado al azar
     * @throws AssertionError()
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public Planet RandomPlanet() {
        int randomNumber = (int) ((Math.random() * (8 - 1 + 1) + 1));
        Planet C1 = null;
        System.out.println(randomNumber);
        switch (randomNumber) {
            case 1:
                C1 = Planet.MERCURY;
                break;
            case 2:
                C1 = Planet.VENUS;
                break;
            case 3:
                C1 = Planet.EARTH;
                break;
            case 4:
                C1 = Planet.MARS;
                break;
            case 5:
                C1 = Planet.JUPITER;
                break;
            case 6:
                C1 = Planet.SATURN;
                break;
            case 7:
                C1 = Planet.URANUS;
                break;
            case 8:
                C1 = Planet.NEPTUNE;
                break;
            default:
                throw new AssertionError();
        }
        return C1;

    }

    /**
     * [Calcular la Atracción gravitacional entre dos cuerpos cualesquiera ej.:
     * SolarSystem.GravitationalPull();]
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public void GravitationalPull() {
        Planet P1 = RandomPlanet();
        Planet P2 = RandomPlanet();
        double r;
        double f;
        while (P1 == P2) {
            P1 = RandomPlanet();
        }
        if (P1.distanceToSun < P2.distanceToSun) {
            r = P2.distanceToSun - P1.distanceToSun;
        } else {
            r = P1.distanceToSun - P2.distanceToSun;
        }
        f = G * (P1.mass * P2.mass) / (r * r);
        System.out.println("La Atracción gravitatoria entre " + P1.name()
                + " y " + P2.name() + " es: " + f);
    }

}
