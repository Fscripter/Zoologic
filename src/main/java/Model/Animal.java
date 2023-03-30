package org.example.Model;

//import org.json.simple.JSONObject;

public class Animal {
    private int age;
    private float size;
    private String name;
    private String species;
    private boolean dangerous;
    private String psychological;
    private String acquisitionMethod;
    private int foodFrequencyPerDay;
    private String allergies;
    private String feeding;
    //private JSONObject animalJSON = new JSONObject();

    public Animal(int age, int size, String name, String species, boolean dangerous, String psychological,
            String acquisitionMethod, int foodFrequencyPerDay, String allergies, String feeding) {
        this.age = age;
        this.size = size;
        this.name = name;
        this.species = species;
        this.dangerous = dangerous;
        this.psychological = psychological;
        this.acquisitionMethod = acquisitionMethod;
        this.foodFrequencyPerDay = foodFrequencyPerDay;
        this.allergies = allergies;
        this.feeding = feeding;
    }

//    public Animal(JSONObject animal) {
//        this.animalJSON = animal;
//
//    }

    public Object[] getArray() {
        Object[] arraylinear = {
                this.age, this.name, this.species, this.dangerous, this.psychological, this.acquisitionMethod,
                this.foodFrequencyPerDay, this.allergies, this.feeding
        };
        return arraylinear;
    }

//    public JSONObject getJSON() {
//        this.animalJSON.put("age", this.age);
//        this.animalJSON.put("name", this.name);
//        this.animalJSON.put("size", this.size);
//        this.animalJSON.put("species", this.species);
//        this.animalJSON.put("dangerous", this.dangerous);
//        this.animalJSON.put("psychological", this.psychological);
//        this.animalJSON.put("acquisitionMethod", this.acquisitionMethod);
//        this.animalJSON.put("foodFrequencyPerDays", this.foodFrequencyPerDay);
//        this.animalJSON.put("allergies", this.allergies);
//        this.animalJSON.put("feeding", this.feeding);
//        System.out.println(this.animalJSON);
//        return this.animalJSON;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
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

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public String getPsychological() {
        return psychological;
    }

    public void setPsychological(String psychological) {
        this.psychological = psychological;
    }

    public String getAcquisitionMethod() {
        return acquisitionMethod;
    }

    public void setAcquisitionMethod(String acquisitionMethod) {
        this.acquisitionMethod = acquisitionMethod;
    }

    public int getFoodFrequencyPerDay() {
        return foodFrequencyPerDay;
    }

    public void setFoodFrequencyPerDay(short foodFrequencyPerDay) {
        this.foodFrequencyPerDay = foodFrequencyPerDay;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

}