package View;

import Model.Panel;

import javax.swing.*;

public class TicketPanel extends Panel {
    public TicketPanel(){
        super("Tickets","src/main/resources/Panel/Icons/004-ticket.png");
        JLabel h1 = new JLabel("Using tabs, you are now in Ticket");
        h1.setBounds(0,0,800,500);
        this.getPanel().add(h1);
    }
}
