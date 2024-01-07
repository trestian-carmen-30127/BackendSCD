package com.utcn.backend.v1.Employee;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;
    //legatura cu baza de date ca sa creeam ceva

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public Employee create(Employee employee)
    {
        return employeeRepository.save(employee);
    }
    public List<Employee>  getAllEmployees()
    {
        return employeeRepository.findAll();
    }


}
