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

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author (c) Raúl Granel Blasco - raul.granel@gmail.com
 */
public class UtilesEntradaDatos {

    //Instanciciación de la clase Scanner.
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");
    public static final Locale LCL = new Locale("EN", "uk");

    //Introduce un número ENTERO.
    public static int introduceEntero() {

        //Uso de la clase Locale.
        SCN.useLocale(LCL);

        boolean testOK = true;
        int numero = 0;

        do {
            try {
                System.out.printf("Introduce un número entero.....: ");
                numero = SCN.nextInt();
                System.out.printf("Número introducido.............: %d\n", numero);
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada, introduce un número.");
            } finally {
                SCN.nextLine();
            }
        } while (testOK);

        return numero;
    }

    //Introduce un número REAL.
    public static double introduceReal() {

        //Uso de la clase Locale.
        SCN.useLocale(LCL);

        boolean testOK = true;
        double numero = 0;

        do {
            try {
                System.out.printf("Introduce un número real.....: ");
                numero = SCN.nextDouble();
                System.out.printf("Número introducido...........: %f\n", numero);
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada, introduce un número.");
            } finally {
                SCN.nextLine();
            }
        } while (testOK);

        return numero;
    }

    //Introduce un valor BOOLEANO.
    public static boolean introduceValor() {

        boolean testOK = true;
        boolean b = true;

        do {
            try {
                System.out.printf("Introduce un valor.....: ");
                b = SCN.nextBoolean();
                System.out.printf("Valor introducido......: %b\n", b);
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada, introduce un valor.");
            } finally {
                SCN.nextLine();
            }
        } while (testOK);

        return b;
    }

    //Introduce una CADENA.
    public static String introduceCadena() {

        boolean testOK = true;
        String cadena = "";

        do {
            try {
                System.out.printf("Introduce una cadena.....: ");
                cadena = SCN.nextLine();
                System.out.printf("Cadena introducida.......: %s\n", cadena);
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada, introduce una cadena.");
            }
        } while (testOK);

        return cadena;
    }

    //Introduce un CARÁCTER.
    public static char introduceCaracter() {

        boolean testOK = true;
        char caracter = 0;

        do {
            try {
                System.out.printf("Introduce un carácter.....: ");
                caracter = SCN.nextLine().charAt(0);
                System.out.printf("Carácter introducido......: %c\n", caracter);
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada, introduce un carácter.");
            }
        } while (testOK);

        return caracter;
    }
    
}
