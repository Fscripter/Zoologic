package Controller;

import Model.Animal2;
import Model.Tour;

import java.util.ArrayList;

public class GestionAnimal2 {

    ArrayList<Animal2> animalArrayList;


    // Create Method ----------------------------------------------------------------------------
    public void createAnimal(String name, float weight, int age, String species, String acquisitionMethod, String animalDivision) {
        Animal2 animal = new Animal2();
        animal.setName(name);
        animal.setWeight(weight);
        animal.setAge(age);
        animal.setSpecies(species);
        animal.setAcquisitionMethod(acquisitionMethod);
        animal.setAnimalDivision(animalDivision);

        animalArrayList.add(animal);
    }

    // Update methods ---------------------------------------------------------------------------

    public void updateAnimalName(Animal2 animal, String name) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setName(name);
    }

    public void updateWeight(Animal2 animal, float weight) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setWeight(weight);
    }

    public void updateAge(Animal2 animal, int age) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setAge(age);
    }

    public void updateSpecies(Animal2 animal, String species) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setSpecies(species);
    }

    public void updateAcquisitionMethod(Animal2 animal, String acquisitionMethod) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setAcquisitionMethod(acquisitionMethod);
    }

    public void updateAnimalDivision(Animal2 animal, String animalDivision) {
        int index = animalArrayList.indexOf(animal);

        animalArrayList.get(index).setAnimalDivision(animalDivision);
    }

    // Read Methods -----------------------------------------------------------------------------
    public String readAnimalName(Animal2 animal, String name) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getName();
    }

    public float readWeight(Animal2 animal, float weight) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getWeight();
    }

    public int readAge(Animal2 animal, int age) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getAge();
    }

    public String readSpecies(Animal2 animal, String species) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getSpecies();
    }

    public String readAcquisitionMethod(Animal2 animal, String acquisitionMethod) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getAcquisitionMethod();
    }

    public String readAnimalDivision(Animal2 animal, String animalDivision) {
        int index = animalArrayList.indexOf(animal);

        return animalArrayList.get(index).getAnimalDivision();
    }

    // Delete Method ----------------------------------------------------------------------------
    public void deleteTour(Animal2 tour) {
        int index = animalArrayList.indexOf(tour);
        animalArrayList.remove(index);
    }
}
