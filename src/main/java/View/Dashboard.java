package View;


import Model.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dashboard implements MouseListener {
    JPanel dashboard;
    JLabel title;
    List<Panel> options = new ArrayList();
    Font roboto;
    Font indie;
    mainWindow app;
    public Dashboard(){
        this.loadFonts();
        this.createPanel();
        this.createOptions();
        this.createTitle();
    }
    private void createPanel(){
        dashboard = new JPanel();
        dashboard.setBounds(0,0,200,500);
        dashboard.setLayout(null);
        dashboard.setBackground(Color.black);
    }
    private void createOptions(){
        options.add(new AnimalsPanel2());
        options.add(new EmployeesPanel());
        options.add(new TicketPanel2());
        options.add(new TourPanel());
        this.createButtons();
    }
    private void createButtons(){
        for (int i = 0; i < options.size(); i++) {
            dashboard.add(options.get(i).getButtonPanel(i));
            options.get(i).getButtonPanel(i).addMouseListener(this);
        }
    }
    private void createTitle(){
        title = new JLabel("Wild Medallo");
        title.setBounds(0,15,200,64);
        ImageIcon logo = new ImageIcon("src/main/resources/Panel/Icons/zoo.png");
        title.setIcon(logo);
        title.setFont(this.indie);
        title.setForeground(Color.white);
        dashboard.add(title);
    }
    public JPanel getDashboard(){
        return dashboard;
    }
    private void loadFonts(){
        File robotoFile = new File("src/main/resources/Panel/Fonts/Roboto-Regular.ttf");
        File indieFile = new File("src/main/resources/Panel/Fonts/IndieFlower-Regular.ttf");
        try{
            Font robotopre = Font.createFont(Font.TRUETYPE_FONT, robotoFile);
            Font indiepre = Font.createFont(Font.TRUETYPE_FONT, indieFile);
            this.roboto = robotopre.deriveFont(22f);
            this.indie = indiepre.deriveFont(22f);
            System.out.println(robotoFile.getName());
        }catch (IOException err){
            System.out.println("No se pueden cargar las fuentes");
        } catch (FontFormatException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < options.size(); i++) {
            if(e.getComponent().getName().equals(options.get(i).getButtonPanel(i).getName())){
                options.get(i).clicked();
                this.addAndShow(options.get(i).getPanel());
            }
            else{
                options.get(i).released();
                this.removeAndHide(options.get(i).getPanel());
            }
        }
    }
    public void removeAndHide(JPanel panel){
        this.app.window.remove(panel);
        this.app.window.repaint();

    }
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    public void addAndShow(JPanel panel){
        app.addElement(panel);
    }
    public void changePanel(mainWindow app){
        this.app = app;
    }
}
