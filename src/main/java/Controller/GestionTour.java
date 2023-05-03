package Controller;

import Model.Animal;
import Model.Animal2;
import Model.Tour;

import java.util.ArrayList;

public class GestionTour {
    private static ArrayList<Tour> tourArrayList = new ArrayList<>();

    //Create Method ----------------------------------------------------------------------------------------
    public static Tour createTour(String tourName, float tourPrice, String tourDescription, ArrayList<Animal2> animalList) {
        Tour tour = new Tour();
        tour.setName(tourName);
        tour.setPrice(tourPrice);
        tour.setDescription(tourDescription);
        tour.setAnimalList(animalList);
        tour.setToursSold(0);

        tourArrayList.add(tour);
        return tour;
    }

    //Update Methods ---------------------------------------------------------------------------------------
    public static void updateTourName(Tour tour, String tourName) {
        int index = tourArrayList.indexOf(tour);

        tourArrayList.get(index).setName(tourName);

    }

    public static void updateTourPrice(Tour tour, float tourPrice)  {
        int index = tourArrayList.indexOf(tour);

        tourArrayList.get(index).setPrice(tourPrice);

    }

    public static void updateTourDescription(Tour tour, String tourDescription)  {
        int index = tourArrayList.indexOf(tour);

        tourArrayList.get(index).setDescription(tourDescription);
    }

    public static void updateTourAnimalList(Tour tour, ArrayList<Animal2> animalList)  {
        int index = tourArrayList.indexOf(tour);

        tourArrayList.get(index).setAnimalList(animalList);
    }

    public static void updateTourSellings(Tour tour, int ticketsSold) {
        int index = tourArrayList.indexOf(tour);

        tourArrayList.get(index).setToursSold(ticketsSold);
    }

    //Read Methods -----------------------------------------------------------------------------------------
    public static String readTourName(Tour tour) {
        int index = tourArrayList.indexOf(tour);

        return tourArrayList.get(index).getName();
    }

    public static float readTourPrice(Tour tour) {
        int index = tourArrayList.indexOf(tour);

        return tourArrayList.get(index).getPrice();
    }

    public static String readTourDescription(Tour tour) {
        int index = tourArrayList.indexOf(tour);

        return tourArrayList.get(index).getDescription();
    }

    public static ArrayList<Animal2> readTourAnimalList(Tour tour) {
        int index = tourArrayList.indexOf(tour);

        return tourArrayList.get(index).getAnimalList();
    }

    public static int readTourSellings(Tour tour) {
        int index = tourArrayList.indexOf(tour);

        return tourArrayList.get(index).getToursSold();
    }

    //Delete Method ---------------------------------------------------------------------------------------
    public static void deleteTour(Tour tour) {
        int index = tourArrayList.indexOf(tour);
        tourArrayList.remove(index);
    }

    // Getter
    public static ArrayList<Tour> getTourArrayList() {
        return tourArrayList;
    }
}
