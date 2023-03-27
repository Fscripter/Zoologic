package View;

import Model.Panel;

import javax.swing.*;
import java.awt.*;

public class AnimalsPanel extends Panel {
    JTable animalsTable;
    public AnimalsPanel(){
        super("Animals","src/main/resources/Panel/Icons/003-deer.png");
        this.addSearchBar();
        this.addAnimalButton();
        this.addTableInfo();
    }
    private void addSearchBar(){
        JTextField searchBar = new JTextField();
        JButton searchButton = new JButton();
        ImageIcon searchImage = new ImageIcon("src/main/resources/AnimalsPanel/search.png");

        searchBar.setText(" Search Animal");
        searchBar.setBounds(250,15,250,38);
        searchBar.setBorder(BorderFactory.createLineBorder(Color.black,2));

        searchButton.setIcon(searchImage);
        searchButton.setBounds(505,15,50,38);
        searchButton.setOpaque(false);
        searchButton.setBorder(BorderFactory.createLineBorder(Color.black,2));

        this.getPanel().add(searchBar);
        this.getPanel().add(searchButton);
    }
    private void addAnimalButton(){
        JButton addButton = new JButton("Add animal");
        ImageIcon addIcon = new ImageIcon("src/main/resources/AnimalsPanel/CRUD/add.png");
        addButton.setIcon(addIcon);
        addButton.setBorder(null);
        addButton.setBackground(null);
        addButton.setBounds(700,350,100,50);

        this.getPanel().add(addButton);
    }
    private void addTableInfo(){
        JLabel animalsTableTitle = new JLabel("Animals list");
        animalsTableTitle.setBounds(15,60,400,32);

        animalsTable = new JTable();
        animalsTable.setBounds(15,90,755,300);
        animalsTable.setBorder(BorderFactory.createLineBorder(Color.black,1));

        this.getPanel().add(animalsTable);
        this.getPanel().add(animalsTableTitle);
    }

}
