package View;

import Model.Panel;
import Model.Animal2;
import org.example.Main;
import Controller.GestionAnimal2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdoptionPanel extends Panel {
    public AdoptionPanel() {

        super("Adoptar", "src/main/resources/Panel/Icons/006-adoption.png");
        JLabel h1 = new JLabel("Adopciones");
        h1.setBounds(350, -60, 800, 200);
        Font font = h1.getFont();
        float size = font.getSize() + 11f;
        h1.setFont(font.deriveFont(size));
        this.getPanel().add(h1);

        this.addAdoptionPanel(getPanel());
    }

    private ArrayList<Animal2> adoptionAnimals = GestionAnimal2.readAdoptionAnimals();

    private void addAdoptionPanel(JPanel panel) {
        int x = 40;
        int y = 75;
        int xAnimals = 20;
        int yAnimals = 20;
        JPanel adoptionPanel = new JPanel(null);
        adoptionPanel.setBounds(x, y, 700, 350);
        adoptionPanel.setBackground(Color.darkGray);
        x += 250;
        panel.add(adoptionPanel);

        for (int i = 0; i < adoptionAnimals.size(); i++) {
            JButton button = createAnimalButton(xAnimals, yAnimals, 100, 50, adoptionAnimals.get(i));
            xAnimals += 120;
            adoptionPanel.add(button);
        }
    }

    private JButton createAnimalButton(int x, int y, int w, int h, Animal2 adoptionAnimal) {
        JButton button = new JButton(adoptionAnimal.getName());
        button.setBackground(null);
        button.setFocusPainted(false);
        button.setBounds(x, y, w, h);
        button.setForeground(Color.white);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdoptionWindow(adoptionAnimal);
            }
        });

        return button;
    }
}
