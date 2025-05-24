
package com.src.laboratorio_3_nunez;


import java.util.Arrays;

public class Laboratorio_5_NunezCardenas {

    public static void main(String[] args) {
        int[] F = {9, 75, 14, 68, 29, 17, 31, 25};

        System.out.println("Vector original: " + Arrays.toString(F));

        mezclaDirectaConPasos(F);

        System.out.println("Vector ordenado: " + Arrays.toString(F));
    }

    public static void mezclaDirectaConPasos(int[] arreglo) {
        int n = arreglo.length;
        int[] temp = new int[n];

        for (int longitud = 1, paso = 1; longitud < n; longitud *= 2, paso++) {
            System.out.println("\n=== Paso " + paso + ": longitud de secuencia = " + longitud + " ===");

            for (int i = 0; i < n; i += 2 * longitud) {
                int inicio = i;
                int medio = Math.min(i + longitud, n);
                int fin = Math.min(i + 2 * longitud, n);

                // Particiones F1 y F2
                int[] F1 = Arrays.copyOfRange(arreglo, inicio, medio);
                int[] F2 = Arrays.copyOfRange(arreglo, medio, fin);

                System.out.println("F1: " + Arrays.toString(F1));
                System.out.println("F2: " + Arrays.toString(F2));

                // Fusión
                fusionar(arreglo, temp, inicio, medio, fin);

                // Resultado parcial de la fusión
                int[] fusionado = Arrays.copyOfRange(temp, inicio, fin);
                System.out.println("Fusion: " + Arrays.toString(fusionado));
            }

            // Copiar al arreglo original
            System.arraycopy(temp, 0, arreglo, 0, n);
            System.out.println("Resultado tras paso " + paso + ": " + Arrays.toString(arreglo));
        }
    }

    private static void fusionar(int[] arreglo, int[] temp, int inicio, int medio, int fin) {
        int i = inicio;
        int j = medio;
        int k = inicio;

        while (i < medio && j < fin) {
            if (arreglo[i] <= arreglo[j]) {
                temp[k++] = arreglo[i++];
            } else {
                temp[k++] = arreglo[j++];
            }
        }

        while (i < medio) {
            temp[k++] = arreglo[i++];
        }

        while (j < fin) {
            temp[k++] = arreglo[j++];
        }
    }
}


