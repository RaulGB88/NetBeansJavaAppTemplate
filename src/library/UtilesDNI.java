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

/**
 *
 * @author (c) Raúl Granel Blasco - raul.granel@gmail.com
 */
public class UtilesDNI {

    // Limites DNI
    public final static int DNI_MIN = 10000000;
    public final static int DNI_MAX = 99999999;

    // Secuencia de letras
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calcularLetraDNI(int dni) {
        return LETRAS.charAt(dni % LETRAS.length());
    }

    public static int extraerNumeroDNI(String dni) {
        // Almacen del DNI extraido
        int numeroDNI;

        // DNI en formato NNNNNNNNL o NNNNNNNN-L
        try {
            // Convierte el texto a entero
            numeroDNI = Integer.parseInt(dni.substring(0, 8));

            // Valida el DNI
            if (validarNumeroDNI(numeroDNI) == false) {
                throw new Exception("DNI erróneo");
            }
        } catch (Exception e) {
            // Número para DNI erróneo
            numeroDNI = -1;
        }

        // Devuelve el DNI obtenido
        return numeroDNI;
    }

    public static char extraerLetraDNI(String dni) {
        // Posición guión
        int posGuion = dni.indexOf('-');

        // Letra del DNI
        char letra;

        // DNI en formato NNNNNNNNL o NNNNNNNN-L
        if (posGuion > -1) {            // Formato NNNNNNNN-L
            letra = dni.charAt(posGuion + 1);
        } else if (dni.length() > 0) {  // Formato NNNNNNNNL
            letra = dni.charAt(dni.length() - 1);
        } else {                        // Formato INCORRECTO
            letra = '?';
        }

        // Convierte la letra a mayúscula
        letra = Character.toUpperCase(letra);

        // Comprueba si la letra está en la lista
        if (LETRAS.indexOf(letra) == -1) {
            // Letra desconocida > INCORRECTO
            letra = '?';
        }

        // Devuelve la letra extraida
        return letra;
    }

    public static boolean validarNumeroDNI(int numero) {
        return numero >= DNI_MIN && numero <= DNI_MAX;
    }

    public static boolean validarDNI(String dni) {
        // Semáforo de validación
        boolean dniOK;

        // Extraer DNI
        int numero = extraerNumeroDNI(dni);

        // Extraer LETRA
        char letra = extraerLetraDNI(dni);

        // Análisis DNI
        if (!validarNumeroDNI(numero)) {
            // DNI NO válido
            dniOK = false;
        } else {
            // Análisis LETRA
            dniOK = calcularLetraDNI(numero) == letra;
        }

        // Resultado del análisis
        return dniOK;
    }
    
}
