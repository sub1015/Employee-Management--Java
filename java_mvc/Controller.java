//package com.parkingmvc;

import javax.swing.JOptionPane;
import org.bson.Document;

public class Controller {
    
    private Model model;
    private View view;
    private Database database;

    public Controller(Model model, View view, Database database) {
        this.model = model;
        this.view = view;
        this.database = database;
    }

    public void initController() {
        view.getSubmitButton().addActionListener(e -> {
        	String ssn = view.getssnTextField().getText();
            if (ssn.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ssn is not entered");
                return;
            }
            String firstname = view.getFirstnameTextField().getText();
            if (firstname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Firstname is not entered");
                return;
            }
            String lastname = view.getLastnameTextField().getText();
            if (lastname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lastname is not entered");
                return;
            }
            String gender = view.getgenderTextField().getText();
            if (gender.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Gender is not entered");
                return;
            }
            String region = view.getRegionTextField().getText();
            if (region.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Region is not entered");
                return;
            }
            String phone = view.getPhoneTextField().getText();
            if (phone.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Phone number is not entered");
                return;
            }
            String dept = view.getdeptTextField().getText();
            if (dept.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Department name is not entered");
                return;
            }
            String salary = view.getsalaryTextField().getText();
            if (salary.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Salary is not entered");
                return;
            }
            model.setssn(ssn);            
            model.setFirstname(firstname);
            model.setLastname(lastname);
            model.setgender(gender);
            model.setRegion(region);
            model.setPhone(phone);
            model.setdept(dept);
            model.setsalary(salary);

            Document document = new Document("srn", model.getssn())
            		.append("firstname", model.getFirstname())
                    .append("lastname", model.getLastname())
                    .append("gender", model.getgender())
                    .append("region", model.getRegion())
                    .append("phone", model.getPhone())
                    .append("dept", model.getdept())
                    .append("salary", model.getsalary());

            database.insertDocument(document);
            view.getssnTextField().setText("");
            view.getFirstnameTextField().setText("");
            view.getLastnameTextField().setText("");
            view.getgenderTextField().setText("");
            view.getRegionTextField().setText("");
            view.getPhoneTextField().setText("");
            view.getdeptTextField().setText("");
            view.getsalaryTextField().setText("");

            JOptionPane.showMessageDialog(null, "Employee details have been stored successfully ");
        });

        view.getClearButton().addActionListener(e -> {
        	view.getssnTextField().setText("");
            view.getFirstnameTextField().setText("");
            view.getLastnameTextField().setText("");
            view.getgenderTextField().setText("");
            view.getRegionTextField().setText("");
            view.getPhoneTextField().setText("");
            view.getdeptTextField().setText("");
            view.getsalaryTextField().setText("");
        });

        view.getviewallButton().addActionListener(e -> {
            database.getDocumentsFromDatabase();
            view.getssnTextField().setText("");
            view.getFirstnameTextField().setText("");
            view.getLastnameTextField().setText("");
            view.getgenderTextField().setText("");
            view.getRegionTextField().setText("");
            view.getPhoneTextField().setText("");
            view.getdeptTextField().setText("");
            view.getsalaryTextField().setText("");
          
        });

        view.getExitButton().addActionListener(e -> {
            database.closeConnection();
            System.exit(0);
        });
    }

}
