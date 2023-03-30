package View;

import javax.swing.*;
import java.awt.*;


public class GridPanel extends JPanel {
    private int rows;
    private int columns;

    public GridPanel() {
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public JPanel createGrid(int row, int col, int hGap, int vGap) {
        JPanel panel;
        panel = new JPanel();
        panel.setLayout(new GridLayout(row, col, hGap, vGap));

        return panel;
    }

}

