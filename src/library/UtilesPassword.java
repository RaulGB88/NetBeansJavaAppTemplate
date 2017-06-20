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
public class UtilesPassword {

    //public static final Random rnd = new Random(System.currentTimeMillis());
    // Obtiene ENTERO ALEATORIO entre un rango.
    public static int obtenerRandomInt(int MIN, int MAX) {
        java.util.Random rnd = new java.util.Random();
        return rnd.nextInt(MAX - MIN + 1) + MIN;
    }

    // GENERA CONTRASEÑA.
    public static String generarPassword(int longitud) {
        String password = "";
        String letrasMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZÇ";
        String letrasMin = "abcdefghijklmnopqrstuvwxyzç";
        String numeros = "1234567890";
        String especiales = "-_#$.:/+*()=?{}[]&¿";
        while (password.length() < longitud) {
            password = password + letrasMay.charAt(obtenerRandomInt(0, letrasMay.length() - 1));
            password = password + letrasMin.charAt(obtenerRandomInt(0, letrasMin.length() - 1));
            password = password + numeros.charAt(obtenerRandomInt(0, numeros.length() - 1));
            password = password + especiales.charAt(obtenerRandomInt(0, especiales.length() - 1));
        }
        return password.substring(0, longitud);
    }
    
}
