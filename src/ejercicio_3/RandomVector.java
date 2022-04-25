package ejercicio_3;

/**
 * [Clase que genera un vector de tamaño aleatorio entre 0-100 ,incluye metodos
 * para mostrar el vector,llenarlos con numeros aleatorios entre 0-100 y los
 * metodos de ordenamiento burbuja y quicksort. ej.: RandomVector vec1 = new
 * RandomVector ; vec1.GenerateArray()]
 *
 * @version [1.00.000 2022-02-23
 * @author [Elkin Estiven González Cuellar -
 * elkin.gonzalez-c@mail.escuelaing.edu.co ]
 * @since [1.00.000]
 *
 */
public class RandomVector {

    private int randomNumber = (int) (Math.random() * 100);
    private int vector[] = new int[randomNumber];
    private int length = vector.length;

    /**
     * [Rellena un vector con numeros aleatorios.
     *
     * @throws AssertionError()
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public void GenerateArray() {
        for (int i = 0; i < this.getVector().length; i++) {
            setRandomNumber((int) (Math.random() * 100));
            this.getVector()[i] = getRandomNumber();
        }
    }

    /**
     * [Imprime en consola el vector y sus elementos
     *
     * @throws AssertionError()
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public void PrintArray() {
        System.out.print("[");
        for (int i = 0; i < getVector().length; i++) {
            if (i < (getVector().length - 1)) {
                System.out.print(getVector()[i] + ", ");
            } else {
                System.out.print(getVector()[i]);
            }

        }
        System.out.println("]");

    }

    /**
     * [Ordena un vector de manera ascendente por el metodo burbuja revisando
     * cada elemento comparandolo con el siguiente, intercambiándolos de
     * posición si están en el orden equivocado. Es necesario revisar varias
     * veces toda la lista.
     *
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public void OrderBubble() {
        int temporary;
        for (int i = 0; i < getVector().length - 1; i++) {
            for (int j = 0; j < getVector().length - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    temporary = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temporary;
                }
            }
        }
    }

    /**
     * [Ordena un vector de manera ascendente por el metodo quicksort
     * subdividiendo el vector en arrays más pequeños,para hacer esta división,
     * se toma un valor del vector como pivote, y se mueven todos los elementos
     * menores que este pivote a su izquierda, y los mayores a su derecha.Luego
     * se aplica el mismo metodo(recursividad) para ordenar los vectores que
     * quedaron a izquierda y dercha.
     *
     * @param first realiza el recorrido de derecha a izquierda
     * @param last realiza el recorrido de izquierda a derecha
     * @param v vector a ordenar
     * @author [Elkin Estiven González Cuellar]
     * @since [1.00.000]
     *
     */
    public void QuickSort(int first, int last, int[] v) {
        int i = first;
        int j = last;
        int pivot = vector[(first + last) / 2];
        do {
            while (pivot > vector[i]) {
                i++;
            }
            while (pivot < vector[j]) {
                j--;
            }
            if (i <= j) {
                int temporary = vector[i];
                vector[i] = vector[j];
                vector[j] = temporary;
                i++;
                j--;
            }
        } while (i <= j);
        if (first < j) {
            QuickSort(first, j, v);
        }
        if (last > first) {
            QuickSort(i, last, v);
        }
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getLength() {
        return length;
    }

}
