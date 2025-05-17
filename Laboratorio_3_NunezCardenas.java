package com.src.laboratorio_3_nunez;


public class Laboratorio_4_Nunez {

    // Versión recursiva
    public static int ackermannRecursivo(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackermannRecursivo(m - 1, 1);
        } else {
            return ackermannRecursivo(m - 1, ackermannRecursivo(m, n - 1));
        }
    }

    public static void main(String[] args) {
        // Pruebas
        System.out.println("A(1, 5) = " + ackermannRecursivo(3, 6)); // 1

        
        // ¡Cuidado con valores mayores! Puede causar stack overflow
        // System.out.println("A(4, 1) = " + ackermannRecursivo(4, 1)); // 65533
    }
}
/*
FUNCION TIEMPO: 
m | T(m,n) (complejidad temporal)
0   O(c) Constante
1   O(n) Lineal
2   O(n) Lineal
3   O(2**n)  Exponencial
4   Hipercrecimiento, Incomputable
*/