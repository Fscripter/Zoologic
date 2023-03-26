package View;

import Model.Panel;

import javax.swing.*;

public class UsersPanel extends Panel {
    public UsersPanel(){
        super("Users","src/main/resources/Panel/Icons/001-tourists.png");
        JLabel h1 = new JLabel("Using tabs, you are now in Users");
        h1.setBounds(0,0,800,200);
        this.getPanel().add(h1);
    }

}
