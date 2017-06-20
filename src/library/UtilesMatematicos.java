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
public class UtilesMatematicos {

    // ----------------------- CÍRCULO ----------------------
    // Calcula PERÍMETRO CÍRCULO.
    public static double calcularPermimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    // Calcula ÁREA CÍRCIULO.
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // ----------------------- ESFERA -------------------------------
    // Calcula ÁREA ESFERA.
    public static double calcularAreaEsfera(double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    // Calcula VOLUMEN ESFERA.
    public static double calcularVolumenEsfera(double radio) {
        return 4.0 / 3 * Math.PI * Math.pow(radio, 3);
    }

    // --------------------- ECUACIONES -----------------------------
    // Resuelve ECUACIÓN 2 GRADO.
    public static double segundoGrado(double a, double b, double c) {
        double x = (-b + Math.sqrt(Math.pow(b, 2.0) - 4 * a * c)) / (2 * a);
        return x;
    }

}
