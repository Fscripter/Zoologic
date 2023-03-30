package View;

import Model.Panel;

import javax.swing.*;

public class TourPanel extends Panel {
    public TourPanel() {
        super("Tours", "src/main/resources/Panel/Icons/001-tourists.png");
        JLabel h1 = new JLabel("Using tabs, you are now in Tours");
        h1.setBounds(300, -50, 800, 200);
        this.getPanel().add(h1);

        this.addTourButton();
    }

    private void addTourButton() {
        JButton addButton = new JButton("Add tour");
        ImageIcon addIcon = new ImageIcon("src/main/resources/AnimalsPanel/CRUD/add.png");
        addButton.setIcon(addIcon);
        addButton.setBorder(null);
        addButton.setBackground(null);
        addButton.setBounds(350, 400, 100,50);

        this.getPanel().add(addButton);
    }




}
