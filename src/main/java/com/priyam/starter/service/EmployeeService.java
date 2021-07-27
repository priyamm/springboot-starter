package com.priyam.starter.service;

import com.priyam.starter.entity.Employee;
import com.priyam.starter.model.EmployeeDTO;
import com.priyam.starter.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployee(Integer employeeId) {
        Optional<Employee> employeeOptional = employeeRepository.findById(employeeId);
        if(employeeOptional.isPresent())
            return employeeOptional.get();
        return null;
    }

    public List<Employee> getEmployeeList() {
        return employeeRepository.findAll();
    }

    public Integer addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(employeeDTO);
        employeeRepository.saveAndFlush(employee);
        return employee.getId();
    }
}
