package View;

import Model.Panel;

import javax.swing.*;

public class TourPanel extends Panel {
    public TourPanel() {
        super("Tours", "src/main/resources/Panel/Icons/001-tourists.png");
        JLabel h1 = new JLabel("Using tabs, you are now in Tours");
        h1.setBounds(0, 0, 800, 200);
        this.getPanel().add(h1);
    }
}
