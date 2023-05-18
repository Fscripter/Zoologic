package View;

import Controller.GestionAnimal2;
import Controller.GestionTour;
import Model.Animal2;
import Model.Panel;
import Model.Tour;
import org.example.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AnimalsPanel2 extends Panel {

    private JTextField animalName;
    private JTextField animalWeight;
    private JTextField animalAge;
    private JTextField animalSpecies;
    private ArrayList<JRadioButton> listAcquisitionButtons = new ArrayList<>();
    private ArrayList<JRadioButton> listAnimalDivision = new ArrayList<>();


    private JPanel panel = this.getPanel();

    public AnimalsPanel2(){
        super("Animals","src/main/resources/Panel/Icons/003-deer.png");

        addLabel(panel);
        addTextField(panel);
        addAcquisitionRadioButtons(panel);
        addAnimalDivisionRadioButtons(panel);
        addButton(panel);
    }


    // Methods for the creation of several components to add later in the panel
    private JButton createButton(String buttonText, int x, int y, int width, int height, String iconFilename) {
        JButton button = new JButton(buttonText);
        button.setBorder(null);
        button.setFocusPainted(false);
        button.setForeground(Color.WHITE);
        button.setBackground(null);
        ImageIcon addIcon = new ImageIcon(iconFilename);
        button.setIcon(addIcon);
        button.setBorderPainted(false);
        button.setBounds(x, y, width, height);

        return button;
    }
    private JLabel createLabels(String text, int x, int y, int w, int h) {
        JLabel label = new JLabel(text);
        label.setName(text);
        label.setBounds(x, y, w, h);
        label.setForeground(Color.white);

        return label;
    }
    private JLabel createLabels(String text, int x, int y, int w, int h, float fontSize) {
        JLabel label = new JLabel(text);
        label.setName(text);
        label.setBounds(x, y, w, h);
        label.setForeground(Color.white);
        Font font = label.getFont();
        float size = font.getSize() + fontSize;
        label.setFont(font.deriveFont(size));

        return label;
    }
    private JTextField createTextFields(int x, int y, int w, int h) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, w, h);

        return textField;
    }
    private JRadioButton createRadioButtons(String text, int x, int y, int w, int h) {
        JRadioButton button = new JRadioButton(text);
        button.setBounds(x, y, w, h);
        button.setForeground(Color.white);
        button.setBackground(Color.darkGray);

        return button;
    }
    private JPanel createInnerPanels(int x, int y, int w, int h, Color color) {
        JPanel innerPanel = new JPanel(null);
        innerPanel.setBounds(x, y, w, h);
        innerPanel.setBackground(color);

        return innerPanel;
    }

    // Methods to add the components to the panel
    private void addLabel(JPanel panel) {
        JLabel header1 = createLabels("Add Animal",320, -70, 800, 200, 11f);
        panel.add(header1);

        JLabel label1 = createLabels("Enter animal name", 20, 20, 200, 30);
        panel.add(label1);

        JLabel label2 = createLabels("Enter animal weight (0.00 Kg)", 20, 120, 200, 30);
        panel.add(label2);

        JLabel label3 = createLabels("Enter animal age", 20, 220, 200, 30);
        panel.add(label3);

        JLabel label4 = createLabels("Enter animal species", 20, 320, 200, 30);
        panel.add(label4);

    }
    private void addTextField(JPanel panel) {
        animalName = createTextFields(20, 50, 200, 30);
        panel.add(animalName);

        animalWeight = createTextFields(20, 150, 200, 30);
        panel.add(animalWeight);

        animalAge = createTextFields(20, 250, 200, 30);
        panel.add(animalAge);

        animalSpecies = createTextFields(20, 350, 200, 30);
        panel.add(animalSpecies);
    }
    private void addAcquisitionRadioButtons(JPanel panel) {
        JPanel innerPanel = createInnerPanels(300, 80, 200, 200, Color.darkGray);

        JLabel label = createLabels("Acquisition Method", 20, 20, 150, 30, 4f);
        innerPanel.add(label);

        ButtonGroup acquisitionButtons = new ButtonGroup();

        JRadioButton button1 = createRadioButtons("Bought", 20, 60, 100, 20);
        acquisitionButtons.add(button1);
        listAcquisitionButtons.add(button1);
        innerPanel.add(button1);

        JRadioButton button2 = createRadioButtons("Bornt", 20, 90, 100, 20);
        acquisitionButtons.add(button2);
        listAcquisitionButtons.add(button2);
        innerPanel.add(button2);

        JRadioButton button3 = createRadioButtons("Adopted", 20, 120, 100, 20);
        acquisitionButtons.add(button3);
        listAcquisitionButtons.add(button3);
        innerPanel.add(button3);

        panel.add(innerPanel);
    }
    private void addAnimalDivisionRadioButtons(JPanel panel) {
        JPanel innerPanel = createInnerPanels(525, 80, 200, 200, Color.darkGray);

        JLabel label = createLabels("Animal Division", 20, 20, 150, 30, 4f);
        innerPanel.add(label);

        ButtonGroup divisionButtons = new ButtonGroup();

        JRadioButton button1 = createRadioButtons("Wild Animal", 20, 60, 100, 20);
        divisionButtons.add(button1);
        listAnimalDivision.add(button1);
        innerPanel.add(button1);

        JRadioButton button2 = createRadioButtons("Domestic Animal", 20, 90, 170, 20);
        divisionButtons.add(button2);
        listAnimalDivision.add(button2);
        innerPanel.add(button2);

        JRadioButton button3 = createRadioButtons("For Adoption", 20, 120, 100, 20);
        divisionButtons.add(button3);
        listAnimalDivision.add(button3);
        innerPanel.add(button3);

        panel.add(innerPanel);
    }
    private void addButton(JPanel panel) {
        JButton addAnimalButton = createButton("Add Animal", 300, 400, 140, 40, "src/main/resources/AnimalsPanel/CRUD/add.png");

        addAnimalButton.addActionListener(e -> {

            String name = "";
            float weight = 0f;
            int age = 0;
            String species = "";
            String acquisitionMethod = "";
            String animalDivision = "";

            // This variable will increase by 1 everytime a test from the inputs is passed.
            // It will allow the creation of the tour once it has a value of 6
            int creationPermission = 0;

            // Filter the weight value given to fit in a float format
            try {
                weight = Float.parseFloat(animalWeight.getText());
                creationPermission++;
            } catch (NumberFormatException exception) {
                JFrame alertWindow = new JFrame();
                JPanel alertPanel = new JPanel(null);

                alertWindow.setSize(300, 200);
                alertWindow.add(alertPanel);

                JLabel alertLabel = new JLabel("The animal weight given is invalid");
                alertLabel.setBounds(40, 50, 250, 30);

                alertPanel.add(alertLabel);

                alertWindow.setVisible(true);
                alertWindow.setLocationRelativeTo(null);

                creationPermission = 0;
            }

            // Filter the age value given so that it's positive and fits in an integer format
            try {
                age = Integer.parseInt(animalAge.getText());
                age = age < 0 ? age * -1 : age;
                creationPermission++;

            } catch (NumberFormatException exception) {
                JFrame alertWindow = new JFrame();
                JPanel alertPanel = new JPanel(null);

                alertWindow.setSize(300, 200);
                alertWindow.add(alertPanel);

                JLabel alertLabel = new JLabel("The animal age given is invalid");
                alertLabel.setBounds(40, 50, 250, 30);

                alertPanel.add(alertLabel);

                alertWindow.setVisible(true);
                alertWindow.setLocationRelativeTo(null);

                creationPermission = 0;
            }

            // Checks that the name given is not an empty string
            if (animalName.getText().equals("")) {
                JFrame alertWindow = new JFrame();
                JPanel alertPanel = new JPanel(null);

                alertWindow.setSize(300, 200);
                alertWindow.add(alertPanel);

                JLabel alertLabel = new JLabel("Please give the poor animal a name");
                alertLabel.setBounds(40, 50, 250, 30);

                alertPanel.add(alertLabel);

                alertWindow.setVisible(true);
                alertWindow.setLocationRelativeTo(null);

                creationPermission = 0;

            } else {
                name = animalName.getText();
                creationPermission++;

            }

            // Checks that the species given is not an empty string either
            if (animalSpecies.getText().equals("")) {
                JFrame alertWindow = new JFrame();
                JPanel alertPanel = new JPanel(null);

                alertWindow.setSize(300, 200);
                alertWindow.add(alertPanel);

                JLabel alertLabel = new JLabel("Ok, but what kind of animal is this?");
                alertLabel.setBounds(40, 50, 250, 30);

                alertPanel.add(alertLabel);

                alertWindow.setVisible(true);
                alertWindow.setLocationRelativeTo(null);

                creationPermission = 0;

            } else {
                species = animalSpecies.getText();
                creationPermission++;
            }



            // Checks if there is a radio button selected form the acquisition buttons.
            // If so, it will get the selected button and save its name to use it later.
            boolean acquisitionSelected = false;
            JRadioButton selectedSpeciesButton = null;
            for (JRadioButton button:
                 listAcquisitionButtons) {
                if (button.isSelected()) {
                    acquisitionSelected = true;
                    selectedSpeciesButton = button;
                    break;
                }
            }
            if (acquisitionSelected) {
                acquisitionMethod = selectedSpeciesButton.getText();
                creationPermission++;
            } else {
                JFrame alertWindow = new JFrame();
                JPanel alertPanel = new JPanel(null);

                alertWindow.setSize(400, 200);
                alertWindow.add(alertPanel);

                JLabel alertLabel = new JLabel("Please tell us how this animal came to us.");
                alertLabel.setBounds(40, 50, 300, 30);

                alertPanel.add(alertLabel);

                alertWindow.setVisible(true);
                alertWindow.setLocationRelativeTo(null);

                creationPermission = 0;
            }



            // Searches for the animalDivision radi button selected and assigns its text.
            boolean divisionSelected = false;
            JRadioButton selectedDivisionButton = null;
            for (JRadioButton button:
                    listAnimalDivision) {
                if (button.isSelected()) {
                    divisionSelected = true;
                    selectedDivisionButton = button;
                    break;
                }
            }
            if (divisionSelected) {
                animalDivision = selectedDivisionButton.getText();
                creationPermission++;
            } else {
                JFrame alertWindow = new JFrame();
                JPanel alertPanel = new JPanel(null);

                alertWindow.setSize(400, 200);
                alertWindow.add(alertPanel);

                JLabel alertLabel = new JLabel("Please tell us the division of the animal.");
                alertLabel.setBounds(40, 50, 300, 30);

                alertPanel.add(alertLabel);

                alertWindow.setVisible(true);
                alertWindow.setLocationRelativeTo(null);

                creationPermission = 0;
            }

            if (creationPermission == 6) {
                GestionAnimal2.createAnimal(name, weight, age, species, acquisitionMethod, animalDivision);
                JFrame alertWindow = new JFrame();
                JPanel alertPanel = new JPanel(null);

                alertWindow.setSize(400, 200);
                alertWindow.add(alertPanel);

                JLabel alertLabel = new JLabel("Animal added successfully.");
                alertLabel.setBounds(40, 50, 300, 30);

                alertPanel.add(alertLabel);

                alertWindow.setVisible(true);
                //alertWindow.setLocationRelativeTo(null);

                Main.window.window.setVisible(false);
                Main.window = new mainWindow();
            }
        });

        panel.add(addAnimalButton);
    }

}
