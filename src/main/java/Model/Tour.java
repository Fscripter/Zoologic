package Model;

import java.util.ArrayList;

public class Tour {

    private float price;
    private String name;
    private String description;
    private ArrayList<Animal2> animalList;

    public Tour() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Animal2> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal2> animalList) {
        this.animalList = animalList;
    }
}
