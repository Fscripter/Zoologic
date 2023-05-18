package Controller;

import Model.Animal2;
import DAO.AnimalDAO;

import java.util.ArrayList;

public class GestionAnimal2 implements AnimalDAO {

    private static ArrayList<Animal2> animalArrayList = new ArrayList<>();

    // Create Method
    // ----------------------------------------------------------------------------
    public static Animal2 createAnimal(String name, float weight, int age, String species, String acquisitionMethod,
            String animalDivision) {
        Animal2 animal = new Animal2();
        animal.setName(name);
        animal.setWeight(weight);
        animal.setAge(age);
        animal.setSpecies(species);
        animal.setAcquisitionMethod(acquisitionMethod);
        animal.setAnimalDivision(animalDivision);

        animalArrayList.add(animal);
        return animal;
    }

    // Update methods
    // ---------------------------------------------------------------------------

    public static void updateAnimalName(Animal2 animal, String name) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setName(name);
    }

    public static void updateWeight(Animal2 animal, float weight) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setWeight(weight);
    }

    public static void updateAge(Animal2 animal, int age) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setAge(age);
    }

    public static void updateSpecies(Animal2 animal, String species) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setSpecies(species);
    }

    public static void updateAcquisitionMethod(Animal2 animal, String acquisitionMethod) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setAcquisitionMethod(acquisitionMethod);
    }

    public static void updateAnimalDivision(Animal2 animal, String animalDivision) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setAnimalDivision(animalDivision);
    }

    // Read Methods
    // -----------------------------------------------------------------------------
    public static String readAnimalName(Animal2 animal) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getName();
    }

    public static float readWeight(Animal2 animal) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getWeight();
    }

    public static int readAge(Animal2 animal) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getAge();
    }

    public static String readSpecies(Animal2 animal) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getSpecies();
    }

    public static String readAcquisitionMethod(Animal2 animal) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getAcquisitionMethod();
    }

    public static String readAnimalDivision(Animal2 animal) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getAnimalDivision();
    }

    public static ArrayList<Animal2> readWildAnimals() {
        ArrayList<Animal2> wildAnimals = new ArrayList<>();

        for (int i = 0; i < animalArrayList.size(); i++) {
            if (animalArrayList.get(i).getAnimalDivision().equals("Wild Animal")) {
                wildAnimals.add(animalArrayList.get(i));
            }
        }

        return wildAnimals;
    }

    public static ArrayList<Animal2> readDomesticAnimals() {
        ArrayList<Animal2> domesticAnimals = new ArrayList<>();

        for (int i = 0; i < animalArrayList.size(); i++) {
            if (animalArrayList.get(i).getAnimalDivision().equals("Domestic Animal")) {
                domesticAnimals.add(animalArrayList.get(i));
            }
        }

        return domesticAnimals;
    }

    public static ArrayList<Animal2> readAdoptionAnimals() {
        ArrayList<Animal2> adoptionAnimals = new ArrayList<>();

        for (int i = 0; i < animalArrayList.size(); i++) {
            if (animalArrayList.get(i).getAnimalDivision().equals("For Adoption")) {
                adoptionAnimals.add(animalArrayList.get(i));
            }
        }

        return adoptionAnimals;
    }

    // Delete Method
    // ----------------------------------------------------------------------------
    public static void deleteAnimal(Animal2 animal) {
        int index = animalArrayList.indexOf(animal);
        animalArrayList.remove(index);
    }

    // Getter

    public static ArrayList<Animal2> getAnimalArrayList() {
        return animalArrayList;
    }

}
