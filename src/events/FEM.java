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
package events;

import forms.GUI;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author (c) Raúl Granel Blasco - raul.granel@gmail.com
 */
public class FEM implements FocusListener {

    // Referencia al Interfaz
    private final GUI gui;

    public FEM(GUI gui) {
        this.gui = gui;
    }

    @Override
    public void focusGained(FocusEvent e) {
        // gui.procesarFocoGanado(e);
    }

    @Override
    public void focusLost(FocusEvent e) {
        // gui.procesarFocoPerdido(e);
    }

}
