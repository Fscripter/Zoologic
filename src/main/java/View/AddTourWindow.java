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

        window.setBackground(Color.DARK_GRAY);
        window.setSize(700, 500);
        window.setLocationRelativeTo(null);
        window.setTitle("Tour Creator");
    }

    private void addButton() {
        JButton but = new JButton();
    }

    public void addElement(JPanel component){
        window.add(component);
        window.repaint();
    }
}
