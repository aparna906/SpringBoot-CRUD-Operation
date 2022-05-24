package com.springboot.crud.crud.controller;


import com.springboot.crud.crud.entity.Employee;
import com.springboot.crud.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    @PostMapping("/addEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee>employees){
        return service.saveEmployees(employees);
    }

    @GetMapping("/employees")
    public List<Employee>findAllEmployees(){
        return service.getEmployees();
    }

    @GetMapping("/employeeById/{id}")
    public Employee findEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }

    @GetMapping("/employeeByName/{name}")
    public Employee findEmployeeByName(@PathVariable String name){
        return service.getEmployeeByName(name);
    }

    @GetMapping("/employeeByBirthdate/{birthdate}")
    public Employee findEmployeeByBirthdate(@PathVariable String birthdate){
        return service.getEmployeeByBirthdate(birthdate);
    }

    @GetMapping("/employeeByCity/{city}")
    public List<Employee> findEmployeeByCity(@PathVariable String city){
        return service.getEmployeeByCity(city);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return service.deleteEmployee(id);
    }
}
