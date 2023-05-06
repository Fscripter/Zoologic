package org.example;

import Controller.GestionTour;
import Model.Animal2;
import Model.Tour;
import View.mainWindow;
import Controller.GestionAnimal2;

public class Main {
    public static mainWindow window;
    public static void main(String[] args) {

        // initial wild animals
        Animal2 simba = GestionAnimal2.createAnimal("Simba", 190, 6, "Lion", "Bought", "Wild Animal");
        Animal2 dumbo = GestionAnimal2.createAnimal("Dumbo", 5000, 24, "Elephant", "Bought", "Wild Animal");

        // initial domestic animals
        Animal2 lucy = GestionAnimal2.createAnimal("Lucy", 3, 2, "Cat", "Adopted", "Domestic Animal");
        Animal2 oliver = GestionAnimal2.createAnimal("Oliver", 3, 2, "Cat", "Adopted", "Domestic Animal");

        // initial animals for adoption
        Animal2 tom = GestionAnimal2.createAnimal("Tom", 2.5f, 1, "Cat", "Adopted", "For Adoption");
        Animal2 jerry = GestionAnimal2.createAnimal("Jerry", 2.5f, 1, "Mouse", "Adopted", "For Adoption");


        Tour tour1 = GestionTour.createTour("Domestic Tour", 5.99f, "Domestic tour for people who like peace", GestionAnimal2.readDomesticAnimals());

        window = new mainWindow();

    }
}
