package org.example;

import Model.Animal2;
import View.mainWindow;
import Controller.GestionAnimal2;

public class Main {
    static mainWindow window;
    public static void main(String[] args) {
        Animal2 simba = GestionAnimal2.createAnimal("Simba", 190, 6, "Lion", "Bought", "Wild");

        Animal2 dumbo = GestionAnimal2.createAnimal("Dumbo", 5000, 24, "Elephant", "Bought", "Wild");

        window = new mainWindow();
    }
}
