package com.olebas.tanks.main;

import com.olebas.tanks.display.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {

    public static void main(String[] args) {
        Display.create(800, 600, "Tanks", 0xff00ff00, 3);

        Timer t = new Timer(1000 / 60, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.clear();
                Display.render();
                Display.swapBuffers();
            }
        });

        t.setRepeats(true);
        t.start();
    }
}
