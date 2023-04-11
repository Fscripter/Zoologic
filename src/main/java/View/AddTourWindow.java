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

            }
        });

    }

    private void addLabel(JPanel panel) {

        JLabel label1 = createLabels("Insert Tour name", 20, 20, 100, 30);
        panel.add(label1);

        JLabel label2 = createLabels("Insert Tour Price (0,00 format)", 20, 120, 200, 30);
        panel.add(label2);

        JLabel label3 = createLabels("Write a brief description of the tour", 20, 220, 200, 30);
        panel.add(label3);

    }

    private void addTextField(JPanel panel) {
        JTextField textField1 = createTextFields(20, 50, 200, 30);
        panel.add(textField1);


        JTextField textField2 = createTextFields(20, 150, 200, 30);
        panel.add(textField2);
    }

    private void addTextArea(JPanel panel) {
        JTextArea textArea1 = createTextArea(20, 10, 20, 250, 200, 100);
        panel.add(textArea1);

    }

    private void addCheckBox(JPanel panel) {
        JPanel innerPanel = new JPanel(null);
        innerPanel.setBounds(330, 80, 200, 300);
        innerPanel.setBackground(Color.gray);

        JLabel label1 = createLabels("Select the animals that", 30, 20, 150, 30);
        JLabel label2 = createLabels("will be in the tour", 50, 30, 100, 50);
        innerPanel.add(label1);
        innerPanel.add(label2);

        JCheckBoxMenuItem checkBoxMenuItem1 = createCheckBoxItems("Wild Animals", 10, 75, 150, 30);
        innerPanel.add(checkBoxMenuItem1);

        JCheckBoxMenuItem checkBoxMenuItem2 = createCheckBoxItems("Animal Type 2", 10, 105, 150, 30);
        innerPanel.add(checkBoxMenuItem2);

        JCheckBoxMenuItem checkBoxMenuItem3 = createCheckBoxItems("Animal Type 3", 10, 135, 150, 30);
        innerPanel.add(checkBoxMenuItem3);




        panel.add(innerPanel);
    }

    public void addElement(JPanel component){
        window.add(component);
        window.repaint();
    }
}
