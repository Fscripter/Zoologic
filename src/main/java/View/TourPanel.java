package View;

import Controller.GestionTour;
import Model.Panel;
import Model.Tour;
import View.GridPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TourPanel extends Panel {

    public TourPanel() {
        super("Tours", "src/main/resources/Panel/Icons/001-tourists.png");
        JLabel h1 = new JLabel("Using tabs, you are now in Tours");
        h1.setBounds(300, -50, 800, 200);
        this.getPanel().add(h1);

        this.addTourButton();

        this.addTourPanels(this.getPanel());
        //this.createGrid();
    }

    private void addTourButton() {
        JButton addButton = new JButton("Tour Creator");
        ImageIcon addIcon = new ImageIcon("src/main/resources/AnimalsPanel/CRUD/add.png");
        addButton.setIcon(addIcon);
        addButton.setBorder(null);
        addButton.setBackground(null);
        addButton.setBounds(350, 400, 100,50);

        JPanel outerPanel = this.getPanel();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTourWindow tourCreator = new AddTourWindow(outerPanel);
            }
        });

        this.getPanel().add(addButton);
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

        for(int i = 0; i < tours.size(); i++) {
            panels.get(i).add(createTextArea(tours.get(i).getName(), 40, 10, 200, 100, 5.0f));
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

    public void refresh() {
        addTourPanels(this.getPanel());
    }

}
