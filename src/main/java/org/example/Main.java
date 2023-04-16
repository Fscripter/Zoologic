package org.example;

import Controller.GestionTour;
import Model.Animal2;
import Model.Tour;
import View.mainWindow;
import Controller.GestionAnimal2;

public class Main {
    static mainWindow window;
    public static void main(String[] args) {
        Animal2 simba = GestionAnimal2.createAnimal("Simba", 190, 6, "Lion", "Bought", "Wild");

        Animal2 dumbo = GestionAnimal2.createAnimal("Dumbo", 5000, 24, "Elephant", "Bought", "Wild");

        Animal2 lucy = GestionAnimal2.createAnimal("Lucy", 3, 2, "Cat", "Adopted", "Domestic");

        Animal2 oliver = GestionAnimal2.createAnimal("Oliver", 3, 2, "Cat", "Adopted", "Domestic");

        Tour tour1 = GestionTour.createTour("Domestic Tour", (float)5.99, "Domestic tour for people who like peace", GestionAnimal2.readDomesticAnimals());

        window = new mainWindow();
    }
}
