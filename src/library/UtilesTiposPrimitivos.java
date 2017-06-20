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
public class UtilesTiposPrimitivos {

    // ------------------------- ENTEROS -------------------------
    // Valida si es PAR.
    public static boolean validarParidadEntero(int num) {

        // Variable retorno.
        boolean valor;

        // Determina el valor boolean.
        if (num % 2 == 0) {
            valor = true;
        } else {
            valor = false;
        }
        // Devuelve el valor.
        return valor;
    }

    // Valida SIGNO.
    public static boolean validarSignoEntero(int num) {

        // Variable retorno.
        boolean valor;

        // Determina el valor boolean.
        if (num <= 0) {
            valor = true;
        } else {
            valor = false;
        }
        // Devuelve el valor.
        return valor;
    }

    // Obtiene el MAYOR.
    public static int obtenerMayorEntero(int n1, int n2) {

        // Variable retorno.
        int mayor;

        // Determina el número mayor.
        if (n1 > n2) {
            mayor = n1;
        } else {
            mayor = n2;
        }

        //Devuelve el valor.
        return mayor;
    }

    // Obtiene el MENOR.
    public static int obtenerMenorEntero(int n1, int n2) {

        // Variable retorno.
        int menor;

        // Determina el número menor.
        if (n1 > n2) {
            menor = n1;
        } else {
            menor = n2;
        }

        //Devuelve el valor.
        return menor;
    }

    // Determina la RELACIÓN.
    public static int obtenerRelacionEntero(double n1, double n2) {

        // Variable retorno.
        int relacion;

        // Determina la relación entre los números.
        if (n1 > n2) {
            relacion = 1;
        } else if (n1 < n2) {
            relacion = -1;
        } else {
            relacion = 0;
        }

        //Devuelve el valor.
        return relacion;
    }

    // --------------------------- REALES ----------------------------------
    // Valida si es PAR.
    public static boolean validarParidadReal(double num) {

        // Variable retorno.
        boolean valor;

        // Determina el valor boolean.
        if (num % 2 == 0) {
            valor = true;
        } else {
            valor = false;
        }
        // Devuelve el valor.
        return valor;
    }

    // Valida SIGNO.
    public static boolean validarSignoReal(double num) {

        // Variable retorno.
        boolean valor;

        // Determina el valor boolean.
        if (num <= 0) {
            valor = true;
        } else {
            valor = false;
        }
        // Devuelve el valor.
        return valor;
    }

    // Obtiene el MAYOR.
    public static double obtenerMayorReal(double n1, double n2) {

        // Variable retorno.
        double mayor;

        // Determina el número mayor.
        if (n1 > n2) {
            mayor = n1;
        } else {
            mayor = n2;
        }

        //Devuelve el valor.
        return mayor;
    }

    // Obtiene el MENOR.
    public static double obtenerMenorReal(double n1, double n2) {

        // Variable retorno.
        double menor;

        // Determina el número menor.
        if (n1 > n2) {
            menor = n1;
        } else {
            menor = n2;
        }

        //Devuelve el valor.
        return menor;
    }

    // Determina la RELACIÓN.
    public static int obtenerRelacionReal(double n1, double n2) {

        // Variable retorno.
        int relacion;

        // Determina la relación entre los números.
        if (n1 > n2) {
            relacion = 1;
        } else if (n1 < n2) {
            relacion = -1;
        } else {
            relacion = 0;
        }

        //Devuelve el valor.
        return relacion;
    }
    
}
