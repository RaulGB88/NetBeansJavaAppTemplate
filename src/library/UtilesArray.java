/*
 * Copyright 2017 (c) Raúl Granel Blasco - raul.granel@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package library;

import java.util.Random;

/**
 *
 * @author (c) Raúl Granel Blasco - raul.granel@gmail.com
 */
public class UtilesArray {

    // --------------------- LLENAR ARRAY ----------------------------
    public static final Random RND = new Random(System.currentTimeMillis());

    // Llenar el Array con valores Reales.
    public static void llenarArrayAleatorioReal(double lista[], double min, double max) {

        for (int i = 0; i < lista.length; i++) {
            lista[i] = RND.nextDouble() * (max - min) + min;
        }
    }

    // Llenar el Array con valores Enteros.
    public static void llenarArrayAleatorioEntero(int lista[], int min, int max) {

        for (int i = 0; i < lista.length; i++) {
            lista[i] = RND.nextInt(max - min + 1) + min;
        }
    }

    // --------------------- ACUMULAR ARRAY -------------------------
    // Acumula los valores Reales con un for.
    public static double sumarArrayReal(double[] lista) {

        double acumulador = 0;

        for (int i = 0; i < lista.length; i++) {
            acumulador = acumulador + lista[i];
        }
        return acumulador;
    }

    // Acumula los valores Reales con un foreach.
    public static double sumarArrayRealForEach(double[] lista) {

        double acumulador = 0;

        for (double item : lista) {
            acumulador += item;
        }
        return acumulador;
    }

    public static Object[] sumarArrayReal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Acumula los valores Enteros con un for.
    public static int sumarArrayEntero(int[] lista) {

        int acumulador = 0;

        for (int i = 0; i < lista.length; i++) {
            acumulador = acumulador + lista[i];
        }
        return acumulador;
    }

    // --------------------------- BUSCAR ARRAY -------------------------------------
    public static int buscarCaracterArray(char[] lista, char clave) {

        boolean finalBusquedaOK = false;
        int posicion = 0;

        do {
            if (lista[posicion] == clave) {
                finalBusquedaOK = true;
            } else if (posicion == lista.length - 1) {
                finalBusquedaOK = true;
                posicion = -1;
            } else {
                posicion++;
            }
        } while (!finalBusquedaOK);

        return posicion;
    }

    public static int buscarEnteroArray(int[] lista, int numero) {

        int posicion = -1;

        for (int i = 0; i < lista.length; i++) {
            if (numero == lista[i]) {
                posicion = i;
            }
        }
        return posicion;
    }

    // ------------------------------ DESORDENAR ARRAY ---------------------------
    public static void desordenarArray(int[] lista) {

        Random rnd = new Random(System.currentTimeMillis());

        for (int i = 0; i < lista.length; i++) {

            int aux = lista[i];
            int posicion = rnd.nextInt(lista.length);

            lista[i] = lista[posicion];

            lista[posicion] = aux;
        }
    }
    
}
