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
public class UtilesDatosAleatorios {

    //Instanciacin de la clase Random.
    public static final Random RND = new Random(System.currentTimeMillis());

    //Obtiene número ENTERO aleatorio.
    public static int enteroAleatorio(int min, int max) {

        int numeroAleatorio = RND.nextInt(max - min + 1) - min;

        //Devolver valor.
        return numeroAleatorio;
    }

    //Obtiene número REAL aleatorio.
    public static double realAleatorio(double min, double max) {

        double numeroAleatorio = RND.nextDouble() * (max - min) - min;

        //Devolver valor.
        return numeroAleatorio;
    }

    //Obtiene número REAL aleatorio entre 0 y 1.
    public static double realAleatorio01() {

        double numeroAleatorio = RND.nextDouble();

        //Devolver valor.
        return numeroAleatorio;
    }

    //Obtiene valor BOOLEANO aleatorio.
    public static boolean valorAleatorio() {

        boolean valorAleatorio = RND.nextBoolean();

        //Devolver valor.
        return valorAleatorio;
    }

    //Obtiene CARÁCTER aleatorio.
    public static char caracterAleatorio(char min, char max) {

        char caracterAleatorio = (char) (RND.nextInt(max - min + 1) - min);

        //Devolver valor.
        return caracterAleatorio;
    }
    
}
