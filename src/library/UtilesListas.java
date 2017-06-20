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
public class UtilesListas {

    // Comparar listas.
    public static int compararListas(String[] lista1, String[] lista2) {

        int aciertos = 0;

        for (String num1 : lista1) {
            for (String num2 : lista2) {
                if (num1.equals(num2)) {
                    aciertos++;
                }
            }
        }
        return aciertos;
    }

    public static void mostrarLista(String[] lista, String titulo) {

        System.out.println(titulo);

        for (int i = 0; i < lista.length; i++) {
            System.out.println("=");
        }
        for (String item : lista) {
            System.out.printf("Item.......: %s\n", item);
        }
    }
    
}
