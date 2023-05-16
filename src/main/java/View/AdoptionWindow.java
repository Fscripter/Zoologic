package View;

import Controller.GestionAnimal2;
import Controller.GestionTour;
import Model.Animal2;
import Model.Tour;
import org.example.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdoptionWindow {

    private String animalName;
    private int animalAge;
    private float animalWeight;
    private String animalSpecie;
    private JFrame window;
    private JPanel panel;
    private JPanel panelAdoption;

    public AdoptionWindow(Animal2 adoptionAnimal) {

        animalName = adoptionAnimal.getName();
        animalAge = adoptionAnimal.getAge();
        animalWeight = adoptionAnimal.getWeight();
        animalSpecie = adoptionAnimal.getSpecies();
        window = new JFrame();
        panel = new JPanel();
        panelAdoption = new JPanel();
        createWindow(panel, "Adoptando", 400, 500);
        JButton button = createAdoptionButton(40, 380, 300, 50, adoptionAnimal);
        panel.add(button);
    }

    private void createWindow(JPanel panel, String tittle, int width, int height) {

        window.setVisible(true);
        panel.setLayout(null);
        window.add(panel);
        panel.setBackground(Color.DARK_GRAY);

        addLabel(panel);

        window.setSize(width, height);
        window.setLocationRelativeTo(null);
        window.setTitle(tittle);
        window.setResizable(false);

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

    private JButton createAdoptionButton(int x, int y, int w, int h, Animal2 adoptionAnimal) {
        JButton button = new JButton("Adoptar");
        button.setBackground(null);
        button.setFocusPainted(false);
        button.setBounds(x, y, w, h);
        button.setForeground(Color.white);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestionAnimal2.deleteAnimal(adoptionAnimal);
                Main.window.window.setVisible(false);
                Main.window = new mainWindow();
                window.dispose();
                createWindow(panelAdoption, "Felicidades!", 400, 200);
            }
        });

        return button;
    }

    private void addLabel(JPanel panel) {

        JLabel label1 = createLabels(animalName, 180, 20, 100, 30, 12);
        panel.add(label1);

        JLabel label2 = createLabels("Edad: " + animalAge, 40, 80, 200, 30, 4);
        panel.add(label2);

        JLabel label3 = createLabels("Peso(Kg): " + animalWeight, 40, 160, 200, 30, 4);
        panel.add(label3);

        JLabel label4 = createLabels("Especie: " + animalSpecie, 40, 240, 200, 30, 4);
        panel.add(label4);
    }

}
