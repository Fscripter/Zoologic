package View;

import Model.Panel;

import javax.swing.*;
import java.awt.*;

public class AddTourWindow {

    private JFrame window;

    private JPanel panel;

    public AddTourWindow() {
        this.createWindow();
        window.setVisible(true);
    }

    private void createWindow() {
        window = new JFrame();

        panel = new JPanel();
        panel.setLayout(null);
        window.add(panel);
        this.addButton(panel);
        panel.setBackground(Color.DARK_GRAY);

        window.setSize(700, 500);
        window.setLocationRelativeTo(null);
        window.setTitle("Tour Creator");
    }

    private void addButton(JPanel panel) {
        JButton button = new JButton("Add Tour");
        button.setBorder(null);
        button.setFocusPainted(false);
        button.setForeground(Color.WHITE);
        button.setBackground(null);
        ImageIcon addIcon = new ImageIcon("src/main/resources/AnimalsPanel/CRUD/add.png");
        button.setIcon(addIcon);
        button.setBorderPainted(false);
        panel.add(button);
        button.setBounds(300, 400, 140, 40);
    }

    public void addElement(JPanel component){
        window.add(component);
        window.repaint();
    }
}
