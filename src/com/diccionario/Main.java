package com.diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // crear el diccionario .
        Map<String, String> diccionario = new HashMap<>();

        // agregar palabras al diccionario .
        diccionario.put("casa", "lugar donde vive una persona .");
        diccionario.put("perro", "animal domestico, amigo del hombre");
        diccionario.put("java", "lenguaje de programacion orientado a objetos");
        diccionario.put("intellij", "maquina electronica que procesa informacion");

        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("=== diccionario en Java ===");
        System.out.println("escribe una palabra para VER su Definicion o 'SALIR' para terminar :.\n");

        // bucle principal .
        while (true) {
            System.out.print("\uD83D\uDC49 Palabra: ");
            palabra = sc.nextLine().toLowerCase();

            if (palabra.equals("salir")) {
                System.out.println("\uD83D\uDC4B Saliendo del diccionario ...");
                break;
            }

            // buscar en el diccionario .. :.
            if (diccionario.containsKey(palabra)) {
                System.out.println("\uD83D\uDCD6 Definición: " + diccionario.get(palabra) + "\n");
            } else {
                System.out.println("⚠\uFE0F No se encontró la palabra '" + palabra + "'.\n");
            }
        }
        sc.close();
    }
}