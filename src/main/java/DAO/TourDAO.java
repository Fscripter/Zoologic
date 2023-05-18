package DAO;

import Model.Animal2;
import Model.Tour;

import java.util.ArrayList;

public interface TourDAO {

    static Tour createTour(String tourName, float tourPrice, String tourDescription, ArrayList<Animal2> animalList) {return null;}

    static void updateTourName(Tour tour, String tourName) {}

    static void updateTourPrice(Tour tour, float tourPrice) {}

    static void updateTourDescription(Tour tour, String tourDescription) {}

    static void updateTourAnimalList(Tour tour, ArrayList<Animal2> animalList){}

    static String readTourName(Tour tour) {return "";}
    static float readTourPrice(Tour tour) {return 0;}
    static String readTourDescription(Tour tour) {return "";}
    static ArrayList<Animal2> readTourAnimalList(Tour tour) {return null;}
}
