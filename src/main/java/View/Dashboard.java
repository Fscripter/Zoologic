package View;


import Model.Panel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Dashboard {
    JPanel dashboard;
    List<Panel> options = new ArrayList();
    public Dashboard(){
        dashboard = new JPanel();
        dashboard.setBounds(0,0,200,500);
        dashboard.setLayout(null);
        dashboard.setBackground(Color.black);
        this.createOptions();
    }
    private void createOptions(){
        options.add(new AnimalsPanel());
        options.add(new EmployeesPanel());
        options.add(new TicketPanel());
        options.add(new UsersPanel());
        this.createButtons();
    }
    private void createButtons(){
        for (int i = 0; i < options.size(); i++) {
            dashboard.add(options.get(i).getButtonPanel());
        }
    }
    public JPanel getDashboard(){
        return dashboard;
    }
}
