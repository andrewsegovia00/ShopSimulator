package com.shopsimulator.shopsimulator.controller;

import com.shopsimulator.shopsimulator.entity.Employee;
import com.shopsimulator.shopsimulator.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/shopsim")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public String saveEmployee(@RequestBody Employee employee) throws ExecutionException, InterruptedException {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/employee/{name}")
    public String deleteEmployee(@PathVariable String name) throws ExecutionException, InterruptedException {
        return employeeService.deleteEmployee(name);
    }

    @GetMapping("/employee/{name}")
    public Employee getEmployee(@PathVariable String name) throws ExecutionException, InterruptedException {
        return employeeService.getEmployeeDetails(name);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() throws ExecutionException, InterruptedException {
        return employeeService.getAllEmployeeDetails();
    }
}

