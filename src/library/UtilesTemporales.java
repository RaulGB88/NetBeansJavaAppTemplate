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
public class UtilesTemporales {

    // Contantes fecha.
    public static final int DIA = 10;
    public static final int MES = 6;
    public static final int ANY = 2002;

    // ------------------------ TIEMPO ----------------------
    // Obtiene el TIEMPO UNIX.
    public static long getTiempoUnix() {
        long x = System.currentTimeMillis();
        return x;
    }

    // Obtiene TIEMPO RESTANTE.
    public static String getRestanteTiempo(int h, int m, int s) {
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
        long hora = gc.get(java.util.Calendar.HOUR_OF_DAY);
        long minuto = gc.get(java.util.Calendar.MINUTE);
        long segundo = gc.get(java.util.Calendar.SECOND);
        long rHora = h - hora;
        long rMinuto = m - minuto;
        long rSegundo = s - segundo;
        while (rMinuto < 0) {
            rMinuto = rMinuto + 60;
            rHora--;
        }

        while (rMinuto > 60) {
            rMinuto = rMinuto - 60;
            rHora++;
        }

        while (rSegundo < 0) {
            rSegundo = rSegundo + 60;
            rMinuto--;
        }

        while (rSegundo > 60) {
            rSegundo = rSegundo - 60;
            rMinuto++;
        }
        return String.format("Tiempo restante : %02d:%02d:%02d\n", rHora, rMinuto, rSegundo);
    }

    // Obtiene TIEMPO EXTRA.
    public static String getTiempoExtra(int h, int m, int s) {
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
        long hora = gc.get(java.util.Calendar.HOUR_OF_DAY);
        long minuto = gc.get(java.util.Calendar.MINUTE);
        long segundo = gc.get(java.util.Calendar.SECOND);
        return String.format("Hora de mas: %02d:%02d:%02d\n", hora - 10, minuto - 5, segundo);
    }

    // --------------------------- VALIDAR FECHA --------------------------------------------------
    // Muestra la fecha válida o no.
    public void testFecha(int d, int m, int a) {

        if (comprobarFecha(ANY, MES, DIA)) {
            System.out.printf("La fecha %02d/%02d/%02d SI es correcta\n", DIA, MES, ANY);
        } else {
            System.out.printf("La fecha %02d/%02d/%02d NO es correcta\n", DIA, MES, ANY);
        }
    }

    // Comprueba la fecha (día, mes , año).
    private boolean comprobarFecha(int any, int mes, int dia) {
        return comprobarMes(mes) && comprobarDia(any, mes, dia);
    }

    // Comprueba MES válido.
    private static boolean comprobarMes(int mes) {
        return mes >= 0 && mes <= 12;
    }

    // Comprueba DÍA válido.
    private boolean comprobarDia(int any, int mes, int dia) {
        int diasMax = obtenerDiasDelMes(any, mes);
        return dia >= 0 && dia <= diasMax;

    }

    // Comprueba MES 31 días.
    private static boolean comprobarMes31(int mes) {
        return mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12;
    }

    // Comprueba MES 30 días.
    private static boolean comprobarMes30(int mes) {
        return mes == 4 || mes == 6 || mes == 9 || mes == 11;
    }

    // Obtiene DÍAS del MES.
    private int obtenerDiasDelMes(int any, int mes) {
        int dias;
        if (comprobarMes31(mes)) {
            dias = 31;
        } else if (comprobarMes30(mes)) {
            dias = 30;
        } else {
            dias = obtenerDiasFebrero(any);
        }
        return dias;
    }

    // Comprueba si es AÑO BISIESTO.
    private static boolean comprobarBisiesto(int any) {
        return any % 400 == 0 || any % 100 != 0 && any % 4 == 0;
    }

    // Comprueba DÍAS FEBRERO ese año.
    private int obtenerDiasFebrero(int any) {
        int dias;
        if (comprobarBisiesto(any)) {
            dias = 29;
        } else {
            dias = 28;
        }
        return dias;
    }
    
}
