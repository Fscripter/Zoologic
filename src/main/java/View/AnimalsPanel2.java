package View;

import Model.Panel;

import javax.swing.*;

public class AnimalsPanel2 extends Panel {
    public AnimalsPanel2(){
        super("Animals","src/main/resources/Panel/Icons/003-deer.png");
        JLabel h1 = new JLabel("Using tabs, you are now in Animals");
        h1.setBounds(0,0,800,500);
        this.getPanel().add(h1);
    }
}