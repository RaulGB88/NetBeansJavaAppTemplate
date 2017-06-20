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
package entities;

import interfaces.ICapacity;
import java.io.Serializable;

/**
 *
 * @author (c) Raúl Granel Blasco - raul.granel@gmail.com
 */
public class Capacity implements Serializable, ICapacity {

    // Constantes
    public static final int NUMERO_MIN = 1;
    public static final int NUMERO_MAX = 49;
    public static final int NUMERO_DEF = 17;

    // Campos
    private int numero;

    // Constructor Predeterminado
    public Capacity() {
        numero = NUMERO_DEF;
    }

    // Constructor Parametrizado
    public Capacity(int numero) {
        if (validarNumero()) {
            this.numero = numero;
        } else {
            this.numero = NUMERO_DEF;
        }
    }

    // --- Accesores ---
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero >= NUMERO_MIN && numero <= NUMERO_MAX) {
            this.numero = numero;
        }
    }

    // --- Overrides ---
    @Override
    public String toString() {
        return String.valueOf(numero);
    }

    @Override
    public boolean equals(Object o) {
        // Semáforo
        boolean igualOK;

        // Comprobación
        if (o == null) {
            igualOK = false;
        } else if (!getClass().isInstance(o)) {
            igualOK = false;
        } else {
            // Compara campos de ambos objetos
            igualOK = getClass().cast(o).getNumero() == numero;
        }

        // Devuelve la comparación
        return igualOK;
    }

    // Campos diferentes > hashCode diferente
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.numero;
        return hash;
    }

    // Comprobar Número Correcto
    @Override
    public final boolean validarNumero() {
        return numero >= NUMERO_MIN && numero <= NUMERO_MAX;
    }
    
}
