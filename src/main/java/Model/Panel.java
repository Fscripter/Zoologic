package Model;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class Panel  {
    JLabel buttonPanel;
    ImageIcon iconPanel;
    String path;
    String labelText;
    JPanel panel;
    public Panel(String labelText, String path){
        this.createPanel();
        this.labelText = labelText;
        this.path = path;
        createButton();
    }
    public void createPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(200,0,800,500);
        panel.setBackground(Color.gray);
    }
    public void createButton(){
        buttonPanel = new JLabel(labelText);
        buttonPanel.setName(labelText);
        buttonPanel.setBounds(20,50,150,40);
        buttonPanel.setOpaque(true);
        buttonPanel.setBorder(new EmptyBorder(0,15,0,0));
        buttonPanel.setForeground(new Color(147, 143, 143));
        buttonPanel.setBackground(Color.black);
        buttonPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        System.out.println(labelText);
        iconPanel = new ImageIcon(path);
        buttonPanel.setIcon(iconPanel);
    }
    public JLabel getButtonPanel(int yOffset){
        buttonPanel.setBounds(20,130+60*yOffset,150,40);
        return  buttonPanel;
    }
    public void clicked(){
        buttonPanel.setBackground(Color.white);
        buttonPanel.setForeground(Color.black);
    }
    public void released(){
        buttonPanel.setBackground(Color.black);
        buttonPanel.setForeground(Color.gray);
    }
    public void hover(){
        buttonPanel.setBackground(Color.gray);
    }
    public JPanel getPanel(){
        return this.panel;
    }
}
