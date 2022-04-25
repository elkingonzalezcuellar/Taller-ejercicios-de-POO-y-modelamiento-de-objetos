package ejercicio_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [Clase utilizada para validar datos que ingresa el usuario , en caso que se
 * ingrese un dato que no corresponde con el tipo de dato solicitado;
 *
 * @version [1.00.000 2022-02-23
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
public class ValidateData {

    /**
     * [Valida un dato de tipo String]
     *
     * @return input
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public static String Data() {
        String input = null;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            input = in.readLine();
        } catch (IOException e) {
            System.out.println("ERROR :" + e.getMessage());
        }
        return input;
    }
    /**
     * [Valida un dato de tipo Int]
     *
     * @return Integer
     * @throws NumberFormatException
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public static int DataInt() {
        try {
            return (Integer.parseInt(Data()));
        } catch (NumberFormatException error) {
            return (Integer.MIN_VALUE);
        }
    }

    /**
     * [Valida un dato de tipo float]
     *
     * @return float
     * @throws NumberFormatException
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public static float DataFloat() {
        try {
            Float f = new Float(Data());
            return (f.floatValue());
        } catch (NumberFormatException error) {
            return (Float.NaN);
        }
    }
    /**
     * [Valida un dato de tipo double]
     *
     * @return double
     * @throws NumberFormatException
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public static double DataDouble() {
        try {
            Double d = new Double(Data());
            return (d.doubleValue());
        } catch (NumberFormatException error) {
            return (Double.NaN);
        }
    }

    /**
     * [Valida un dato de tipo float]
     *
     * @return char
     * @throws Exception
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public static char DataChar() {
        try {
            char resp = Data().charAt(0);
            return resp;
        } catch (Exception error) {
            return ('z');
        }
    }

    /**
     * [Valida un dato de tipo boolean]
     *
     * @return boolean
     * @throws NumberFormatException
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public static boolean DataBoolean() {
        try {
            return (Boolean.parseBoolean(Data()));
        } catch (NumberFormatException error) {
            return (false);
        }
    }
}
