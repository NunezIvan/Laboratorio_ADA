package com.src.laboratorio_1_nunez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Laboratorio_1_Nunez_Cardenas{

    //Direccion Posibles de Busqueda
    private static final int[][] DIRECTIONS = {
        {0, 1},   // Derecha
        {0, -1},  // Izquierda
        {1, 0},   // Abajo
        {-1, 0},  // Arriba
        {1, 1},   // Diagonal derecha-abajo
        {-1, -1}, // Diagonal izquierda-arriba
        {1, -1},  // Diagonal izquierda-abajo
        {-1, 1}   // Diagonal derecha-arriba
    };

    // Generar tablero 4x4
    public static char[][] generarTablero(List<String> palabras) {
        char[][] tablero = new char[4][4];
        List<Character> letras = new ArrayList<>();

        // Validar palabras y recolectar letras
        for (String palabra : palabras) {
            if (palabra.length() > 4) {
                throw new IllegalArgumentException("Palabras deben tener máximo 4 letras(De preferencia que tengan las mismas letras).");
            }
            for (char c : palabra.toUpperCase().toCharArray()) {
                letras.add(c);
            }
        }

        // Rellenar con letras aleatorias si es necesario
        while (letras.size() < 16) {
            letras.add((char) ('A' + Math.random() * 26));
        }

        // Mezclar letras y llenar el tablero
        Collections.shuffle(letras);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = letras.get(i * 4 + j);
            }
        }

        // Insertar al menos una palabra en el tablero
        Collections.shuffle(palabras);
        for (String palabra : palabras) {
            if (insertarPalabra(tablero, palabra.toUpperCase())) {
                break;
            }
            if (insertarPalabra(tablero, palabra.toUpperCase())) {
                break;
            }
        }

        return tablero;
    }

    // Insertar una palabra en el tablero (en cualquier dirección)
    private static boolean insertarPalabra(char[][] tablero, String palabra) {
        int n = 4;
        for (int[] dir : DIRECTIONS) {
            int dRow = dir[0];
            int dCol = dir[1];
            int maxRow = n - (palabra.length() - 1) * (dRow != 0 ? 1 : 0);
            int maxCol = n - (palabra.length() - 1) * (dCol != 0 ? 1 : 0);

            for (int i = 0; i < maxRow; i++) {
                for (int j = 0; j < maxCol; j++) {
                    boolean valido = true;
                    if (valido) {
                        // Insertar la palabra
                        for (int k = 0; k < palabra.length(); k++) {
                            int row = i + k * dRow;
                            int col = j + k * dCol;
                            tablero[row][col] = palabra.charAt(k);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Buscar palabras y mostrar posiciones
    public static List<String> buscarPalabras(char[][] tablero, List<String> palabras) {
        List<String> resultados = new ArrayList<>();
        for (String palabra : palabras) {
            String palabraUpper = palabra.toUpperCase();
            boolean encontrada = false;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int[] dir : DIRECTIONS) {
                        if (buscarEnDireccion(tablero, palabraUpper, i, j, dir[0], dir[1])) {
                            int finRow = i + (palabraUpper.length() - 1) * dir[0];
                            int finCol = j + (palabraUpper.length() - 1) * dir[1];
                            // Formato 1-based
                            String inicio = "(" + (i + 1) + "," + (j + 1) + ")";
                            String fin = "(" + (finRow + 1) + "," + (finCol + 1) + ")";
                            resultados.add(palabraUpper + " encontrada de " + inicio + " a " + fin);
                            encontrada = true;
                            break;
                        }
                    }
                    if (encontrada) break;
                }
                if (encontrada) break;
            }
        }
        return resultados;
    }

    private static boolean buscarEnDireccion(char[][] tablero, String palabra, int row, int col, int dRow, int dCol) {
        for (int k = 0; k < palabra.length(); k++) {
            int newRow = row + k * dRow;
            int newCol = col + k * dCol;
            if (newRow < 0 || newRow >= 4 || newCol < 0 || newCol >= 4) {
                return false;
            }
            if (tablero[newRow][newCol] != palabra.charAt(k)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();

        System.out.println("Ingresa 4 palabras (máximo 4 letras cada una):");
        for (int i = 0; i < 4; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras.add(scanner.nextLine());
        }

        try {
            char[][] tablero = generarTablero(palabras);
            
            System.out.println("\nTablero generado:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            List<String> resultados = buscarPalabras(tablero, palabras);
            System.out.println("\nResultados:");
            resultados.forEach(System.out::println);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}