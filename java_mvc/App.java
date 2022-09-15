//package com.parkingmvc;

public class App {
    
    public static void main(String[] args) {
        Model model = new Model("", "", "", "", "", "", "","");
        View view = new View("Employee Management System");
        Database database = new Database("mongodb://localhost:27017", "Records", "Employees");
        database.getDocumentsFromDatabase();
        Controller controller = new Controller(model, view, database);
        controller.initController();
    }
}

