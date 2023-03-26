package View;

import Model.Panel;

import javax.swing.*;

public class EmployeesPanel extends Panel {
    public EmployeesPanel(){
        super("Employees","src/main/resources/Panel/Icons/002-employee.png");
        JLabel h1 = new JLabel("Using tabs, you are now in Employees");
        h1.setBounds(0,0,800,500);
        this.getPanel().add(h1);
        this.crearFormulario();
    }
    public void crearFormulario(){
        JLabel nombreEmpleado = new JLabel("nombre:");
        JTextField nombreEmpleadoInput = new JTextField();
        JButton buttonx = new JButton();
        buttonx.setBounds(130,20,100,32);
        nombreEmpleado.setBounds(20,20,100,32);
        nombreEmpleadoInput.setBounds(20,50,100,32);
        this.getPanel().add(nombreEmpleado);
        this.getPanel().add(nombreEmpleadoInput);
    }
}
