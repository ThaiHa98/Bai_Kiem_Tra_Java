package org.example.controller;


import org.example.entity.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/createUser")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/getEmployees")
    public List<Employee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/paged")
    public List<Employee> findAllEmployeesPaged(@RequestParam(defaultValue = "0") int pageNo,
                                                @RequestParam(defaultValue = "5") int pageSize) {
        return employeeService.findAllEmployees(pageNo, pageSize);
    }
}
