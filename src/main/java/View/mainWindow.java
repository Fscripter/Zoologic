package View;

import javax.swing.*;
import java.awt.*;

public class mainWindow {
    JFrame window;
    Dashboard menu;
    public mainWindow(){
        createWindow();
        this.createMenu();
        window.setVisible(true);
        menu.changePanel(this);
    }
    private void createMenu(){
        menu = new Dashboard();
        window.add(menu.getDashboard());
    }
    private void createWindow(){
        window = new JFrame();
        window.setBackground(Color.black);
        window.setSize(1000,500);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        window.setTitle("Zoologic");
    }
    public void addElement(JPanel component){
        window.add(component);
        window.repaint();
    }
}
