package com.bala.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private EmployeeRepository employeeRepository;
    
    @Autowired
    DatabaseLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public void run(String... arg0) throws Exception {
        System.out.println("Inside the run method");
        this.employeeRepository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
    

}
