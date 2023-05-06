package View;

import Controller.GestionTour;
import Model.Animal2;
import Model.Panel;
import Model.Tour;
import org.example.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TicketPanel2 extends Panel {

    public TicketPanel2() {
        super("Tickets", "src/main/resources/Panel/Icons/004-ticket.png");
        JLabel h1 = new JLabel("Buy Tickets for tours");
        h1.setBounds(250, -60, 800, 200);
        Font font = h1.getFont();
        float size = font.getSize() + 11f;
        h1.setFont(font.deriveFont(size));
        this.getPanel().add(h1);


        //this.addTourButton();

        this.addTourPanels(this.getPanel());
        //this.createGrid();
    }

    private void addTourPanels(JPanel panel) {
        int x = 40;
        int y = 75;
        ArrayList<JPanel> panels = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            JPanel tourPanel = new JPanel(null);
            tourPanel.setBounds(x, y, 200, 300);
            tourPanel.setBackground(Color.darkGray);
            x += 250;
            panel.add(tourPanel);
            panels.add(tourPanel);
        }

        addToursToPanels(panels);
    }

    private void addToursToPanels(ArrayList<JPanel> panels) {
        ArrayList<Tour> tours = GestionTour.getTourArrayList();

        // Iterate through each tour and add its information to a panel
        for(int i = 0; i < tours.size(); i++) {

            // Create a label for the tour's name and add it to the panel
            panels.get(i).add(createLabels(tours.get(i).getName(), 40, 0, 200, 40, 5.0f));

            // Create a label for the tour's description and add it to the panel
            JLabel tourDescriptionLabel = createLabels("Tour Description: ", 5, 45, 180, 20, 2f);
            panels.get(i).add(tourDescriptionLabel);

            // Create a text area for the tour's description and add it to the panel
            JTextArea tourDescription = createTextArea(tours.get(i).getDescription(), 5, 65, 190, 100, 1.5f);
            panels.get(i).add(tourDescription);

            // Create a label for the tour's animals and add it to the panel
            JLabel tourAnimalsLabel = createLabels("Animals: ", 5, 170, 180, 20, 1f);
            panels.get(i).add(tourAnimalsLabel);

            // Create a string that will contain the names and species of each animal on the tour
            String animalsText = "";
            ArrayList<Animal2> animals = tours.get(i).getAnimalList();
            for (Animal2 animal: animals) {
                animalsText = animalsText.concat((animal.getName() +" (" + animal.getSpecies() +(animal == animals.get(animals.size() - 1) ? ")." : "), ")));
                System.out.println(animal.getSpecies());
            }

            // Create a text area for the tour's animals and add it to the panel
            JTextArea tourAnimals = createTextArea(animalsText, 5, 190, 190, 50, 0.2f);
            panels.get(i).add(tourAnimals);

            JLabel priceLabel = createLabels("Price: " + tours.get(i).getPrice() + "$", 5, 240, 190, 30, 1f);
            panels.get(i).add(priceLabel);

            //panels.get(i).add(createEditButton(5, 270, 70, 20, tours.get(i)));
            //panels.get(i).add(createDeleteButton(85, 270, 70, 20, tours.get(i)));
            panels.get(i).add(createBuyButton(50, 270, 100, 20, tours.get(i)));
        }
    }

    private JTextArea createTextArea(String text, int x, int y, int w, int h, float fontSize) {
        JTextArea textArea = new JTextArea(text);
        textArea.setBounds(x, y, w, h);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setMargin(new Insets(2, 2, 2, 2));

        textArea.setBackground(Color.darkGray);
        textArea.setForeground(Color.white);

        Font font = textArea.getFont();
        float size = font.getSize() + fontSize;
        textArea.setFont(font.deriveFont(size));

        return textArea;
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

    private JButton createBuyButton(int x, int y, int w, int h, Tour tour) {
        JButton button = new JButton("Buy");
        button.setBackground(null);
        button.setFocusPainted(false);
        button.setBounds(x, y, w, h);
        button.setForeground(Color.white);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int amount = getSelectedAmount();
                if (amount > 0) {
                    int result = JOptionPane.showConfirmDialog(null,"Tour: " + tour.getName() + "\nAmount: " + amount + "\nTotal: " + (tour.getPrice()*amount), "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION) {
                        // Agrega aquí el código que quieras ejecutar si el usuario selecciona "Yes"
                    }
                }
            }
        });

        return button;
    }

    private int getSelectedAmount() {
        String[] options = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String selectedOption = (String) JOptionPane.showInputDialog(null, "Select an amount", "Amount", JOptionPane.DEFAULT_OPTION, null, options, "1");
        int amount = -1;
        if (selectedOption != null) {
            amount = Integer.parseInt(selectedOption);
        }
        return amount;
    }

}
