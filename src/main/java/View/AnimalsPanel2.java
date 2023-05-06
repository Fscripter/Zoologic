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

    private ButtonGroup acquisitionMethodButtonGroup = new ButtonGroup();
    private ButtonGroup animalDivisionButtonGroup = new ButtonGroup();


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
        innerPanel.add(button1);

        JRadioButton button2 = createRadioButtons("Bornt", 20, 90, 100, 20);
        acquisitionButtons.add(button2);
        innerPanel.add(button2);

        JRadioButton button3 = createRadioButtons("Adopted", 20, 120, 100, 20);
        acquisitionButtons.add(button3);
        innerPanel.add(button3);


        panel.add(innerPanel);
    }
    private void addAnimalDivisionRadioButtons(JPanel panel) {
        JPanel innerPanel = createInnerPanels(525, 80, 200, 200, Color.darkGray);

        JLabel label = createLabels("Animal Division", 20, 20, 150, 30, 4f);
        innerPanel.add(label);

        ButtonGroup acquisitionButtons = new ButtonGroup();

        JRadioButton button1 = createRadioButtons("Wild Animal", 20, 60, 100, 20);
        acquisitionButtons.add(button1);
        innerPanel.add(button1);

        JRadioButton button2 = createRadioButtons("Domestic Animal", 20, 90, 170, 20);
        acquisitionButtons.add(button2);
        innerPanel.add(button2);

        JRadioButton button3 = createRadioButtons("For adoption", 20, 120, 100, 20);
        acquisitionButtons.add(button3);
        innerPanel.add(button3);


        panel.add(innerPanel);
    }

    private void addButton(JPanel panel) {
        JButton button1 = createButton("Add Animal", 300, 400, 140, 40, "src/main/resources/AnimalsPanel/CRUD/add.png");

        panel.add(button1);
    }

}
