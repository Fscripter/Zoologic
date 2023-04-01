package View;

import Model.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        this.addLabel("First label", 20, 20, 100, 30, panel);

        this.addTextField(20, 50, 200, 30, panel);

        window.setSize(700, 500);
        window.setLocationRelativeTo(null);
        window.setTitle("Tour Creator");
    }

    private void createButtons() {

    }

    private void createLabels() {

    }

    private void createTextFields() {

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

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void addLabel(String text, int x, int y, int w, int h, JPanel panel) {
        JLabel label = new JLabel(text);
        label.setName(text);
        label.setBounds(x, y, w, h);
        label.setForeground(Color.white);

        panel.add(label);
    }


    private void addTextField(int x, int y, int w, int h, JPanel panel) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, w, h);
        panel.add(textField);
    }


    public void addElement(JPanel component){
        window.add(component);
        window.repaint();
    }
}
