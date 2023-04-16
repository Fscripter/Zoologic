package View;

import Controller.GestionAnimal2;
import Model.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddTourWindow {

    private JTextField tourName;
    private JTextField tourPrice;
    private JTextArea tourDescription;

    private JCheckBoxMenuItem wildAnimals;
    private JCheckBoxMenuItem animalType2;
    private JCheckBoxMenuItem animalType3;
    private ArrayList<JCheckBoxMenuItem> animalCheckBoxes = new ArrayList<>();


    private JFrame window;
    private JPanel panel;

    public AddTourWindow() {
        window = new JFrame();
        panel = new JPanel();
        this.createWindow(window, panel);
        window.setVisible(true);
    }

    private void createWindow(JFrame window, JPanel panel) {

        panel.setLayout(null);
        window.add(panel);
        panel.setBackground(Color.DARK_GRAY);

        addButton(panel);

        addLabel(panel);

        addTextField(panel);

        addTextArea(panel);

        addCheckBox(panel);


        window.setSize(700, 500);
        window.setLocationRelativeTo(null);
        window.setTitle("Tour Creator");
    }

    //component creating methods
    private JTextArea createTextArea(int rows, int columns, int x, int y, int w, int h) {
        JTextArea textArea = new JTextArea(rows, columns);
        textArea.setBounds(x, y, w, h);
        textArea.setLineWrap(true);
        textArea.setMargin(new Insets(2, 2, 2, 2));

        return textArea;
    }

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

    private JCheckBoxMenuItem createCheckBoxItems(String text, int x, int y, int w, int h) {
        JCheckBoxMenuItem checkbox = new JCheckBoxMenuItem(text);
        checkbox.setBounds(x, y, w, h);
        checkbox.setForeground(Color.white);
        checkbox.setBackground(Color.gray);

        return checkbox;
    }

    //component adding methods
    private void addButton(JPanel panel) {
        JButton button1 = createButtons("Add Tour", 300, 400, 140, 40, "src/main/resources/AnimalsPanel/CRUD/add.png");
        panel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // This variable will help check when there are no errors/exceptions
                // in the creation of the tour, if nothing goes wrong it should have the value
                // of 4 by the end of all the following filters
                int creationPermited = 0;
                // -----------------------------------------------------------------------------------------------------

                //This Try Catch will try to get a float number for the price, if it can't do it,
                // it will create a window of alert for the user to fix it
                try {
                    float price = Float.parseFloat(tourPrice.getText());
                    creationPermited++;

                } catch (NumberFormatException exception) {
                    JFrame alertWindow = new JFrame();
                    JPanel alertPanel = new JPanel(null);

                    alertWindow.setSize(300, 200);
                    alertWindow.add(alertPanel);

                    JLabel alertLabel = new JLabel("The Tour Price given is invalid");
                    alertLabel.setBounds(40, 50, 250, 30);

                    alertPanel.add(alertLabel);

                    alertWindow.setVisible(true);
                    alertWindow.setLocationRelativeTo(null);

                    creationPermited = 0;
                }
                // -----------------------------------------------------------------------------------------------------

                // This if Statement alerts the user when the Tour Name given is an empty
                // String so that the user corrects it before being able to create the tour
                if (tourName.getText().equals("")) {
                    JFrame alertWindow = new JFrame();
                    JPanel alertPanel = new JPanel(null);

                    alertWindow.setSize(300, 200);
                    alertWindow.add(alertPanel);

                    JLabel alertLabel = new JLabel("Please give the Tour a name");
                    alertLabel.setBounds(40, 50, 250, 30);

                    alertPanel.add(alertLabel);

                    alertWindow.setVisible(true);
                    alertWindow.setLocationRelativeTo(null);

                    creationPermited = 0;

                } else {
                    System.out.println("Tour Name: " + tourName.getText());
                    creationPermited++;

                }
                // -----------------------------------------------------------------------------------------------------

                // This if statement works similar to the one from the tourName
                if (tourDescription.getText().equals("")) {
                    JFrame alertWindow = new JFrame();
                    JPanel alertPanel = new JPanel(null);

                    alertWindow.setSize(400, 200);
                    alertWindow.add(alertPanel);

                    JLabel alertLabel = new JLabel("A short description won't hurt, go on and write it c:");
                    alertLabel.setBounds(40, 50, 300, 30);

                    alertPanel.add(alertLabel);

                    alertWindow.setVisible(true);
                    alertWindow.setLocationRelativeTo(null);

                    creationPermited = 0;

                } else {
                    System.out.println("Tour Description: " + tourDescription.getText());
                    creationPermited++;

                }
                // -----------------------------------------------------------------------------------------------------

                // This piece of code first checks if at least one of the checkboxes has been selected, if not it will
                // throw an alert to the user. If one is selected it searches for each one of the checkboxes so that it
                // knows what was selected in order to create a new Tour
                boolean animalTypeSelected = false;

                for (JCheckBoxMenuItem checkBox : animalCheckBoxes) {
                    if (checkBox.isSelected()){
                        animalTypeSelected = true;
                        break;
                    }
                }

                if (animalTypeSelected) {

                    creationPermited++;

                    if (wildAnimals.isSelected()) {
                        System.out.println(GestionAnimal2.readWildAnimals());
                    }

                    if (animalType2.isSelected()) {
                        System.out.println("{Array improvisado de animal type 2}");
                    }

                    if (animalType3.isSelected()) {
                        System.out.println("{Array improvisado de animal type 3}");
                    }
                } else {
                    JFrame alertWindow = new JFrame();
                    JPanel alertPanel = new JPanel(null);

                    alertWindow.setSize(400, 200);
                    alertWindow.add(alertPanel);

                    JLabel alertLabel = new JLabel("Please choose at least one animal type for your tour");
                    alertLabel.setBounds(40, 50, 300, 30);

                    alertPanel.add(alertLabel);

                    alertWindow.setVisible(true);
                    alertWindow.setLocationRelativeTo(null);

                    creationPermited = 0;

                }
                // -----------------------------------------------------------------------------------------------------

                System.out.println(creationPermited >= 4 ? "Tour Created bro" : "Not able to create tour");


            }

        });

    }

    private void addLabel(JPanel panel) {

        JLabel label1 = createLabels("Insert Tour name", 20, 20, 100, 30);
        panel.add(label1);

        JLabel label2 = createLabels("Insert Tour Price (0.00 format)", 20, 120, 200, 30);
        panel.add(label2);

        JLabel label3 = createLabels("Write a brief description of the tour", 20, 220, 200, 30);
        panel.add(label3);

    }

    private void addTextField(JPanel panel) {
        tourName = createTextFields(20, 50, 200, 30);
        panel.add(tourName);

        tourPrice = createTextFields(20, 150, 200, 30);
        panel.add(tourPrice);
    }

    private void addTextArea(JPanel panel) {
        tourDescription = createTextArea(20, 10, 20, 250, 200, 100);
        panel.add(tourDescription);

    }

    private void addCheckBox(JPanel panel) {
        JPanel innerPanel = new JPanel(null);
        innerPanel.setBounds(330, 80, 200, 300);
        innerPanel.setBackground(Color.gray);

        JLabel label1 = createLabels("Select the animals that", 30, 20, 150, 30);
        JLabel label2 = createLabels("will be in the tour", 50, 30, 100, 50);
        innerPanel.add(label1);
        innerPanel.add(label2);

        wildAnimals = createCheckBoxItems("Wild Animals", 10, 75, 150, 30);
        innerPanel.add(wildAnimals);
        animalCheckBoxes.add(wildAnimals);

        animalType2 = createCheckBoxItems("Animal Type 2", 10, 105, 150, 30);
        innerPanel.add(animalType2);
        animalCheckBoxes.add(animalType2);

        animalType3 = createCheckBoxItems("Animal Type 3", 10, 135, 150, 30);
        innerPanel.add(animalType3);
        animalCheckBoxes.add(animalType3);

        panel.add(innerPanel);
    }

    public void addElement(JPanel component){
        window.add(component);
        window.repaint();
    }
}
