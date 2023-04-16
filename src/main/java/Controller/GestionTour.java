package Controller;

import Model.Animal;
import Model.Tour;

import java.util.ArrayList;

public class GestionTour {
    ArrayList<Tour> tourArrayList = new ArrayList<>();

    //Create Method ----------------------------------------------------------------------------------------
    public void createTour(String tourName, float tourPrice, String tourDescription, ArrayList<Animal> animalList) {
        Tour tour = new Tour();
        tour.setName(tourName);
        tour.setPrice(tourPrice);
        tour.setDescription(tourDescription);
        tour.setAnimalList(animalList);

        tourArrayList.add(tour);
    }


    //Update Methods ---------------------------------------------------------------------------------------
    public void updateTourName(Tour tour, String tourName) {
        int index = tourArrayList.indexOf(tour);

        tourArrayList.get(index).setName(tourName);

    }

    public void updateTourPrice(Tour tour, float tourPrice)  {
        int index = tourArrayList.indexOf(tour);

        tourArrayList.get(index).setPrice(tourPrice);

    }

    public void updateTourDescription(Tour tour, String tourDescription)  {
        int index = tourArrayList.indexOf(tour);

        tourArrayList.get(index).setDescription(tourDescription);
    }

    public void updateTourAnimalList(Tour tour, ArrayList<Animal> animalList)  {
        int index = tourArrayList.indexOf(tour);

        tourArrayList.get(index).setAnimalList(animalList);
    }


    //Read Methods -----------------------------------------------------------------------------------------
    public String readTourName(Tour tour) {
        int index = tourArrayList.indexOf(tour);

        return tourArrayList.get(index).getName();
    }

    public float readTourPrice(Tour tour) {
        int index = tourArrayList.indexOf(tour);

        return tourArrayList.get(index).getPrice();
    }

    public String readTourDescription(Tour tour) {
        int index = tourArrayList.indexOf(tour);

        return tourArrayList.get(index).getDescription();
    }

    public ArrayList<Animal> readTourAnimalList(Tour tour) {
        int index = tourArrayList.indexOf(tour);

        return tourArrayList.get(index).getAnimalList();
    }

    //Delete Method ---------------------------------------------------------------------------------------
    public void deleteTour(Tour tour) {
        int index = tourArrayList.indexOf(tour);
        tourArrayList.remove(index);
    }


}
