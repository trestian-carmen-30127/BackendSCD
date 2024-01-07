package com.utcn.backend.v1.Employee;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/employee")
@Data
@CrossOrigin
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }


    @GetMapping
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }
}
