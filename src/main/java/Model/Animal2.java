package Model;

//import org.json.simple.JSONObject;

public class Animal2 {
    private int age;
    private float weight;
    private String name;
    private String species;
    private String acquisitionMethod;
    private String animalDivision; //Wild animal, domestic animal or animal for adoption

    public Animal2() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAcquisitionMethod() {
        return acquisitionMethod;
    }

    public void setAcquisitionMethod(String acquisitionMethod) {
        this.acquisitionMethod = acquisitionMethod;
    }

    public String getAnimalDivision() {
        return animalDivision;
    }

    public void setAnimalDivision(String animalDivision) {
        this.animalDivision = animalDivision;
    }
}