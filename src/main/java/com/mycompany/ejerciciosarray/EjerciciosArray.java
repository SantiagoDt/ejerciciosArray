/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciosarray;

/**
 *
 * @author Santiago
 */
public class EjerciciosArray {

    public static void main(String[] args) {
        final int LENGH = 50;
        int array[] = new int[LENGH];
        int sumatorio = 0;
        for (int i = 0; i <= LENGH - 1; i++) {
            array[i] = i + 1;
            sumatorio += array[i];
        }

        imprimirArray(array);

        System.out.println();
        System.out.println(sumatorio);

        System.out.println(primeraMenor(array));

        cambiar(array);
        imprimirArray(array);

        int arrayPrueba[] = {3, 1, 24, 5, 2, 2};

        System.out.println(tieneVecinosIguales(arrayPrueba));

        int arrayPrueba2[] = {20, 10, 24, 22, 4, 2};

        System.out.println(mismaDiferencia(arrayPrueba2));

    }

    public static int[] cambiar(int[] vector) {
        for (int i = 0; i < 50; i++) {
            if (vector[i] % 2 == 0) {
                vector[i] = vector[i] / 2;
            } else {
                vector[i] += 1;
            }
        }
        return vector;
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + array[i] + "] ");
        }
    }

    public static boolean primeraMenor(int[] vector) {
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < 50; i++) {
            if (i < 25) {
                suma1 += vector[i];
            } else {
                suma2 += vector[i];
            }
        }

        return (suma1 < suma2);
    }

    public static boolean tieneVecinosIguales(int[] vector) {

        int ocurrencias = 0;
        int aux = vector[0];
        for (int i = 1; i < vector.length; i++) {

            if (aux == vector[i]) {
                ocurrencias++;
                aux = vector[i];
            } else {
                aux = vector[i];
            }

        }
        return (ocurrencias > 0);
    }

    public static boolean mismaDiferencia(int[] vector) {
        int diferencia = vector[0] - vector[1];

        for (int i = 1; i < vector.length - 1; i++) {
            if (diferencia != vector[i] - vector[i + 1]) {
                return false;
            }
        }

        return true;

    }

}
