package View;

import Model.Panel;
import View.GridPanel;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TourPanel extends Panel {

    public TourPanel() {
        super("Tours", "src/main/resources/Panel/Icons/001-tourists.png");
        JLabel h1 = new JLabel("Using tabs, you are now in Tours");
        h1.setBounds(300, -50, 800, 200);
        this.getPanel().add(h1);

        this.addTourButton();
        //this.createGrid();
    }

    private void addTourButton() {
        JButton addButton = new JButton("Tour Creator");
        ImageIcon addIcon = new ImageIcon("src/main/resources/AnimalsPanel/CRUD/add.png");
        addButton.setIcon(addIcon);
        addButton.setBorder(null);
        addButton.setBackground(null);
        addButton.setBounds(350, 400, 100,50);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTourWindow tourCreator = new AddTourWindow();
            }
        });

        this.getPanel().add(addButton);
    }

//    private JPanel createGrid() {
//        GridPanel grid = new GridPanel();
//        JPanel panel = grid.createGrid(0, 3, 5, 5);
//        panel.setBounds(100, 100, 600, 300);
//        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
//
//        return panel;
//    }
}
