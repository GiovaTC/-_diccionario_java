# 🧠 Diccionario en Java

Este proyecto muestra cómo crear un **diccionario interactivo en Java** usando la clase `HashMap`.  
Se ejecuta desde consola y permite consultar definiciones simples de palabras.

---

## 🧩 Paso 1: Crear el proyecto

1. Abre **IntelliJ IDEA**.  
2. Crea un nuevo proyecto **Java** → `New Project > Java`.  
3. Asigna un nombre, por ejemplo: `DiccionarioApp`.  
4. En la carpeta `src`, crea un paquete llamado `com.diccionario`.  
5. Dentro del paquete, crea una clase llamada `Main.java`.

---

## 🧱 Paso 2: Código del diccionario

Archivo: `Main.java`

```java
package com.diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear el diccionario
        Map<String, String> diccionario = new HashMap<>();

        // Agregar palabras al diccionario
        diccionario.put("casa", "Lugar donde vive una persona");
        diccionario.put("perro", "Animal doméstico, amigo del hombre");
        diccionario.put("java", "Lenguaje de programación orientado a objetos");
        diccionario.put("intellij", "Entorno de desarrollo integrado para Java");
        diccionario.put("computadora", "Máquina electrónica que procesa información");

        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("=== DICCIONARIO EN JAVA ===");
        System.out.println("Escribe una palabra para ver su definición o 'salir' para terminar.\n");

        // Bucle principal
        while (true) {
            System.out.print("👉 Palabra: ");
            palabra = sc.nextLine().toLowerCase();

            if (palabra.equals("salir")) {
                System.out.println("👋 Saliendo del diccionario...");
                break;
            }

            // Buscar en el diccionario
            if (diccionario.containsKey(palabra)) {
                System.out.println("📖 Definición: " + diccionario.get(palabra) + "\n");
            } else {
                System.out.println("⚠️ No se encontró la palabra '" + palabra + "'.\n");
            }
        }

        sc.close();
    }
}
🚀 Paso 3: Ejecutar
En IntelliJ, haz clic derecho sobre Main.java → Run 'Main.main()'

En la consola, escribe una palabra (por ejemplo, java).

Para salir, escribe salir.

🧠 Explicación
Método / Clase	Descripción
HashMap<String, String>	Almacena pares clave-valor, donde la clave es la palabra y el valor su definición.
put()	Agrega un nuevo par al diccionario.
containsKey()	Verifica si la palabra existe en el diccionario.
get()	Obtiene la definición asociada a una palabra.
Scanner	Permite leer datos desde el teclado.

🌟 Ejemplo de salida
yaml
Copiar código
=== DICCIONARIO EN JAVA ===
Escribe una palabra para ver su definición o 'salir' para terminar.

👉 Palabra: java
📖 Definición: Lenguaje de programación orientado a objetos

👉 Palabra: perro
📖 Definición: Animal doméstico, amigo del hombre

👉 Palabra: hola
⚠️ No se encontró la palabra 'hola'.

👉 Palabra: salir
👋 Saliendo del diccionario...
📌 Autor: Proyecto de ejemplo para práctica con Java y colecciones (HashMap).
📅 Entorno: IntelliJ IDEA – Java SE 17+