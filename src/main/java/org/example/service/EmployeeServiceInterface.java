package org.example.service;

import org.example.entity.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    Employee createEmployee(Employee employee);
    List<Employee> findAllEmployees();
    List<Employee> findAllEmployees(int pageNo, int pageSize);
}
