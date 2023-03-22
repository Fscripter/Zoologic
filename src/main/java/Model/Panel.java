package Model;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class Panel {
    JLabel buttonPanel;
    ImageIcon iconPanel;
    String path;
    String labelText;
    JPanel frame;
    public Panel(String labelText, String path){
        this.labelText = labelText;
        this.path = path;
        createButton();
    }
    public void createPanel(){
        frame = new JPanel();
        frame.setLayout(null);
        frame.setBounds(200,0,800,500);
        frame.setBackground(Color.gray);
    }
    public void createButton(){
        buttonPanel = new JLabel(labelText);
        buttonPanel.setBounds(20,50,150,40);
        buttonPanel.setOpaque(true);
        buttonPanel.setBorder(new EmptyBorder(0,15,0,0));
        buttonPanel.setForeground(Color.white);
        buttonPanel.setBackground(Color.gray);
        System.out.println(labelText);
        iconPanel = new ImageIcon(path);
        buttonPanel.setIcon(iconPanel);
    }
    public JLabel getButtonPanel(){
        return  buttonPanel;
    }
    public JPanel getPanel(){
        return frame;
    }
}
