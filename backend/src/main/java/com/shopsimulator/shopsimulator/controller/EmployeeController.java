package com.shopsimulator.shopsimulator.controller;

import com.shopsimulator.shopsimulator.entity.Employee;
import com.shopsimulator.shopsimulator.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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






}

