package View;

import javax.swing.*;
import java.awt.*;


public class GridPanel extends JPanel {

    public GridPanel(int row, int col, int hGap, int vGap) {
        setLayout(new GridLayout(row, col, hGap, vGap));
    }


    public void addGridComponent() {

    }

//    public JPanel createGrid(int row, int col, int hGap, int vGap) {
//        JPanel panel;
//        panel = new JPanel();
//        panel.setLayout(new GridLayout(row, col, hGap, vGap));
//
//        return panel;
//    }

}

