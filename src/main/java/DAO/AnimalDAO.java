package DAO;

import Model.Animal2;

public interface AnimalDAO {
    static void updateAnimalName(Animal2 animal, String name) {
    }

    static void updateWeight(Animal2 animal, float weight){
    }

    static void updateAge(Animal2 animal, int age) {
    }

    static void updateSpecies(Animal2 animal, String species) {
    }

    static void updateAcquisitionMethod(Animal2 animal, String acquisitionMethod) {
    }

    static void updateAnimalDivision(Animal2 animal, String animalDivision) {}

    static String readAnimalName(Animal2 animal) {return "";}

    static float readWeight(Animal2 animal) {return 0;}

    static int readAge(Animal2 animal) {return 0;}

    static String readSpecies(Animal2 animal) {return "";}

    static String readAcquisitionMethod(Animal2 animal) {return "";}

    static String readAnimalDivision(Animal2 animal) {return "";}
}
