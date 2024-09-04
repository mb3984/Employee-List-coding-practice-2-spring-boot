package com.example.employee;

import com.example.employee.Employee;
import java.util.ArrayList;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();

    Employee getEmployeeById(int employeeId);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(int employeeId, Employee employee);

    void deleteEmployee(int employeeId);

}