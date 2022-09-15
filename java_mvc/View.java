//package com.parkingmvc;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class View {
    
    private JFrame frame;
    private JLabel ssnLabel;
    private JLabel firstnameLabel;
    private JLabel lastnameLabel;
    private JLabel genderLabel;
    private JLabel regionLabel;
    private JLabel phoneLabel;
    private JLabel deptLabel;
    private JLabel salaryLabel;
    
    private JTextField ssnTextField;
    private JTextField firstnameTextField;
    private JTextField lastnameTextField;
    private JTextField genderTextField;
    private JTextField regionTextField;
    private JTextField phoneTextField;
    private JTextField deptTextField;
    private JTextField salaryTextField;

    private JButton submitButton;
    private JButton clearButton;
    private JButton exitButton;
    private JButton viewallButton;
   
    
    
    

    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(true);

        ssnLabel = new JLabel("SSN : ");
        firstnameLabel = new JLabel("First Name: ");
        lastnameLabel = new JLabel("Last Name: ");
        genderLabel = new JLabel("Gender: ");
        regionLabel = new JLabel("Region: ");
        phoneLabel = new JLabel("Phone: ");
        deptLabel = new JLabel("Dept Name: ");
        salaryLabel = new JLabel("Salary: ");
        

        ssnTextField = new JTextField();
        firstnameTextField = new JTextField();
        lastnameTextField = new JTextField();
        genderTextField = new JTextField();
        regionTextField = new JTextField();
        phoneTextField = new JTextField();
        deptTextField = new JTextField();
        salaryTextField = new JTextField();
        submitButton = new JButton("Add");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        viewallButton = new JButton("All Records");
       

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup()
                        		.addComponent(ssnLabel)
                                .addComponent(firstnameLabel)
                                .addComponent(lastnameLabel)
                                .addComponent(genderLabel)
                                .addComponent(regionLabel)
                                .addComponent(phoneLabel)
                                .addComponent(deptLabel)
                                .addComponent(salaryLabel))
                        .addGroup(layout.createParallelGroup()
                        		.addComponent(ssnTextField)
                                .addComponent(firstnameTextField)
                                .addComponent(lastnameTextField)
                                .addComponent(genderTextField)
                                .addComponent(regionTextField)
                                .addComponent(phoneTextField)
                                .addComponent(deptTextField)
                                .addComponent(salaryTextField)))
                .addGroup(layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addComponent(clearButton)
                        .addComponent(viewallButton)
                        .addComponent(exitButton)));

        layout.setVerticalGroup(layout.createSequentialGroup()
        		.addGroup(layout.createParallelGroup()
                        .addComponent(ssnLabel)
                        .addComponent(ssnTextField))
                .addGroup(layout.createParallelGroup()
                        .addComponent(firstnameLabel)
                        .addComponent(firstnameTextField))
                .addGroup(layout.createParallelGroup()
                        .addComponent(lastnameLabel)
                        .addComponent(lastnameTextField))
                .addGroup(layout.createParallelGroup()
                        .addComponent(genderLabel)
                        .addComponent(genderTextField))
                .addGroup(layout.createParallelGroup()
                        .addComponent(regionLabel)
                        .addComponent(regionTextField))
                .addGroup(layout.createParallelGroup()
                        .addComponent(phoneLabel)
                        .addComponent(phoneTextField))
                .addGroup(layout.createParallelGroup()
                        .addComponent(deptLabel)
                        .addComponent(deptTextField))
                .addGroup(layout.createParallelGroup()
                        .addComponent(salaryLabel)
                        .addComponent(salaryTextField))
                .addGroup(layout.createParallelGroup()
                        .addComponent(submitButton)
                        .addComponent(clearButton)
                        .addComponent(viewallButton)
                        .addComponent(exitButton)));

    }

    public JFrame getFrame() {
        return frame;
    }
    
    public JLabel getssnLabel() {
        return ssnLabel;
    }

    public JLabel getFirstnameLabel() {
        return firstnameLabel;
    }
    public JLabel getLastnameLabel() {
        return lastnameLabel;
    }
    public JLabel getgenderLabel() {
        return genderLabel;
    }
    public JLabel getRegionLabel() {
        return regionLabel;
    }
    public JLabel getPhoneLabel() {
        return phoneLabel;
    }
    public JLabel getdeptLabel() {
        return deptLabel;
    }
    public JLabel getsalaryLabel() {
        return salaryLabel;
    }
    public JTextField getssnTextField() {
        return ssnTextField;
    }
    public JTextField getFirstnameTextField() {
        return firstnameTextField;
    }
    public JTextField getLastnameTextField() {
        return lastnameTextField;
    }
    public JTextField getgenderTextField() {
        return genderTextField;
    }
    public JTextField getRegionTextField() {
        return regionTextField;
    }
    public JTextField getPhoneTextField() {
        return phoneTextField;
    }
    public JTextField getdeptTextField() {
        return deptTextField;
    }
    public JTextField getsalaryTextField() {
        return salaryTextField;
    }
    public JButton getSubmitButton() {
        return submitButton;
    }
    public JButton getClearButton() {
        return clearButton;
    }
  
    public JButton getviewallButton() {
        return viewallButton;
    }
    public JButton getExitButton() {
        return exitButton;
    }
    
    public void setssnLabel(JLabel ssnLabel) {
        this.ssnLabel = ssnLabel;
    }
    public void setFirstnameLabel(JLabel firstnameLabel) {
        this.firstnameLabel = firstnameLabel;
    }
    public void setLastnameLabel(JLabel lastnameLabel) {
        this.lastnameLabel = lastnameLabel;
    }
    public void setgenderLabel(JLabel genderLabel) {
        this.genderLabel = genderLabel;
    }
    public void setRegionLabel(JLabel regionLabel) {
        this.regionLabel = regionLabel;
    }
    public void setPhoneLabel(JLabel phoneLabel) {
        this.phoneLabel = phoneLabel;
    }
    public void setdeptLabel(JLabel deptLabel) {
        this.deptLabel = deptLabel;
    }
    public void setsalaryLabel(JLabel salaryLabel) {
        this.salaryLabel = salaryLabel;
    }
    public void setssnTextField(JTextField ssnTextField) {
        this.ssnTextField = ssnTextField;
    }
    public void setFirstnameTextField(JTextField firstnameTextField) {
        this.firstnameTextField = firstnameTextField;
    }
    public void setLastnameTextField(JTextField lastnameTextField) {
        this.lastnameTextField = lastnameTextField;
    }
    public void setgenderTextField(JTextField genderTextField) {
        this.genderTextField = genderTextField;
    }
    public void setRegionTextField(JTextField regionTextField) {
        this.regionTextField = regionTextField;
    }
    public void setPhoneTextField(JTextField phoneTextField) {
        this.phoneTextField = phoneTextField;
    }
    public void setdeptTextField(JTextField deptTextField) {
        this.deptTextField = deptTextField;
    }
    public void setsalaryTextField(JTextField salaryTextField) {
        this.salaryTextField = salaryTextField;
    }
    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }
    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }
   
    public void setviewallButton(JButton viewallButton) {
        this.viewallButton = viewallButton;
    }
    public void setExitButton(JButton exitButton) {
        this.exitButton = exitButton;
    }
}
