package com.priyam.starter.controller;

import com.priyam.starter.model.EmployeeDTO;
import com.priyam.starter.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<?> findEmployeeList() {
        return new ResponseEntity<>(employeeService.getEmployeeList(), HttpStatus.OK);
    }


    @GetMapping("{employeeId}")
    public ResponseEntity<?> findEmployeeById(@PathVariable("employeeId") Integer employeeId) {
        return new ResponseEntity<>(employeeService.getEmployee(employeeId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return new ResponseEntity<>(employeeService.addEmployee(employeeDTO), HttpStatus.OK);
    }

}
