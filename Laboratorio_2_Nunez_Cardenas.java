
package com.src.laboratorio_1_nunez;

import java.util.Scanner;

public class Laboratorio_2_Nunez_Cardenas {

   public static int[] findsumMax(int []vectorsito){
        int sumMaxActual = vectorsito[0], sumMaxGlobal = vectorsito[0], indiceInicial = 0, indiceFinal = 0;
        boolean allNegative = true;
        
        for(int num : vectorsito){
            if(num >= 0){
                allNegative = false;
                break;
            }
        }
        
        if(allNegative){
            return null;
        }
        
        for(int i = 1; i < vectorsito.length; i++){
            if(sumMaxActual + vectorsito[i] > vectorsito[i]){
                sumMaxActual = sumMaxActual + vectorsito[i];
            } else {
                sumMaxActual = vectorsito[i];
                indiceInicial = i;
            }
            
            if(sumMaxActual > sumMaxGlobal){
                sumMaxGlobal = sumMaxActual;
                indiceFinal = i;
            }
        }
        
        int resultLength = indiceFinal - indiceInicial + 1;
        
        int[] subVector = new int[resultLength];
        for (int i = 0; i < subVector.length; i++){
            subVector[i] = vectorsito[indiceInicial + i];
        }
        
        return subVector;
    }
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in); 
        System.out.print("Ingrese el tamaño del vector: ");
        int cantidad = Integer.parseInt(consola.nextLine());
        int []vector = new int[cantidad];
        
        for(int i = 0; i < vector.length; i++){
            System.out.print("Ingrese el valor de la posicion " + (i + 1) + ": ");
            vector[i] = Integer.parseInt(consola.nextLine());
        }
        
        int[] vector2 = findsumMax(vector);
        
        if (vector2 != null) {
            int sumMax = 0;
            System.out.print("El subvector con la maxima suma es: ");
            for (int i : vector2) {
                System.out.print(i + " ");
                sumMax += i;
            }
            System.out.println();
            System.out.println("La suma maxima es: " + sumMax);
        } else {
            System.out.println("Todos los elementos del vector son negativos.");
        }
    }
}
