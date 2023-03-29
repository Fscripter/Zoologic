package org.example.Control;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.SupportedOptions;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.example.Model.Animal;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

public class GestionAnimal {

    String filePath = "animals.json";
    File animalsRecord = new File(filePath);
//    JSONObject animalsObject = new JSONObject();
//    JSONArray animalsArrayJSON = new JSONArray();
    ArrayList<Animal> animalsArray = new ArrayList();

//    public GestionAnimal() {
//        checkFile();
//    //    animalsObject.put("Animales", this.animalsArrayJSON);
//    }

    public void createAnimal() {

    }

//    public void checkFile() {
//        if (animalsRecord.exists()) {
//            System.out.println("Ya existe");
//            this.readAnimalFromFile();
//        } else {
//            createFile();
//        }
//    }

    public void createFile() {
        try {
            if (animalsRecord.createNewFile()) {
                System.out.println("Arhivo creado, debido a que no existia");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error creando el archivo" + animalsRecord.getName());
        }
    }

    public void createAnimal(
            String name,
            int age,
            String species,
            boolean dangerous,
            String psychological,
            String acquisitionMethod,
            int foodFrequencyPerDay,
            String allergies,
            String feeding) {
        this.animalsArray.add(
                new Animal(
                        age,
                        12,
                        name,
                        species,
                        dangerous,
                        psychological,
                        acquisitionMethod,
                        foodFrequencyPerDay,
                        allergies,
                        feeding));
//        this.animalsArrayJSON.add(
//                this.animalsArray.get((this.animalsArray.size() - 1)).getJSON());
        this.insertAnimalInFile(
                this.animalsArray.get((this.animalsArray.size() - 1)));
        System.out.println("Nuevo animal añadido");
    }

    public void insertAnimalInFile(Animal animal) {
        try (FileWriter animalsRecordWrite = new FileWriter(filePath)) {
            //animalsRecordWrite.write(this.animalsObject.toString());
            animalsRecordWrite.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public void deleteAnimal() {
    }

    public void updateAnimal() {
    }

    public void tableAnimals(DefaultTableModel model) {
        System.out.println("Bien");
        if (this.animalsArray.isEmpty()) {
            System.out.println("Vacion");
            return;
        }
        for (int i = 0; i < this.animalsArray.size(); i++) {
            model.addRow(this.animalsArray.get(i).getArray());
        }
    }

//    public void readAnimalFromFile() {
//        try {
//            Object read = new JSONParser().parse(new FileReader(filePath));
//            JSONObject j = (JSONObject) read;
//            JSONArray ja = (JSONArray) j.get("Animales");
//            for (int i = 0; i < ja.size(); i++) {
//                System.out.println(ja.get(i));
//            }
//        } catch (Exception e) {
//            // TODO: handle exception
//            System.out.println("No podemos leer el archivo");
//        }
//    }

    public void readAnimalByParams() {
    }
}
