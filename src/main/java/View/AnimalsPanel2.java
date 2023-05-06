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
        /*JLabel h1 = new JLabel("Using tabs, you are now in Animals");
        h1.setBounds(0,0,800,500);
        this.getPanel().add(h1);*/

        addLabel(panel);
        addTextField(panel);
        addRadioButtons(panel);

    }


    // Methods for the creation of several components to add later in the panel
    private JButton createButtons(String buttonText, int x, int y, int width, int height, String iconFilename) {
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
    private JTextField createTextFields(int x, int y, int w, int h) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, w, h);

        return textField;
    }
    private JRadioButton createRadioButtons(String text, int x, int y, int w, int h) {
        JRadioButton button = new JRadioButton(text);
        button.setBounds(x, y, w, h);
        button.setForeground(Color.white);

        return button;
    }

    // Methods to add the components to the panel
    private void addLabel(JPanel panel) {

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
    private void addRadioButtons(JPanel panel) {
        JPanel innerPanel = new JPanel(null);
        innerPanel.setBounds(300, 50, 200, 300);
        innerPanel.setBackground(Color.darkGray);

        JLabel label = createLabels("Acquisition Method", 30, 20, 150, 30);
        innerPanel.add(label);

        panel.add(innerPanel);

    }


}
