package View;

import Model.Panel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
        addButton.setBounds(350,400,100,50);

        this.getPanel().add(addButton);
    }
    private void addTableInfo(){
        JLabel animalsTableTitle = new JLabel("Animals list");
        animalsTableTitle.setBounds(350,60,400,32);

        String[] headers = {"name, "age","Specie"};
        Object[][] data = {
                {"Ramesh Raman", 5000,0},
                {"Shabbir Hussein", 7000,0}
        };
        animalsTable = new JTable(data,headers);
        animalsTable.setBounds(15,90,755,300);
        animalsTable.setBorder(BorderFactory.createLineBorder(Color.black,1));
        animalsTable.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(animalsTable);
        scrollPane.setBounds(15,90,755,300);
        animalsTable.setFillsViewportHeight(true);

        this.getPanel().add(scrollPane);
        this.getPanel().add(animalsTableTitle);
    }

}
