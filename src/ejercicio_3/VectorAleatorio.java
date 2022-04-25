/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

/**
 *
 * @author PC
 */
public class VectorAleatorio {

    private int randomNumber = (int) (Math.random() * 100);
    private int vector[] = new int[randomNumber];
    private int length = vector.length;

    public void GenerateArray() {
        for (int i = 0; i < this.getVector().length; i++) {
            setRandomNumber((int) (Math.random() * 100));
            this.getVector()[i] = getRandomNumber();
        }
    }

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

    /**
     * @return the randomNumber
     */
    public int getRandomNumber() {
        return randomNumber;
    }

    /**
     * @param randomNumber the randomNumber to set
     */
    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    /**
     * @return the vector
     */
    public int[] getVector() {
        return vector;
    }

    /**
     * @param vector the vector to set
     */
    public void setVector(int[] vector) {
        this.vector = vector;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

}
