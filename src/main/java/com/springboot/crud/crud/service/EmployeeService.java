package com.springboot.crud.crud.service;

import com.springboot.crud.crud.entity.Employee;
import com.springboot.crud.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
private EmployeeRepository repository;
 public Employee saveEmployee(Employee employee){
   return repository.save(employee);
 }

    public List<Employee>saveEmployees(List<Employee>employees){
        return repository.saveAll(employees);
    }

    public List<Employee> getEmployees(){
        return repository.findAll();
    }

    public Employee getEmployeeById(int id){
        return repository.findById(id).orElse(null);
    }

    public Employee getEmployeeByName(String name){
        return repository.findByName(name);
    }
    public Employee getEmployeeByBirthdate(String birthdate){
        return repository.findByBirthdate(birthdate);
    }

    public List<Employee> getEmployeeByCity(String city){
        return repository.findByCity(city);
    }

    public Employee updateEmployee(Employee employee){
     Employee existingEmployee = repository.findById(employee.getId()).orElse(null);
     existingEmployee.setName(employee.getName());
     existingEmployee.setBirthdate(employee.getBirthdate());
     existingEmployee.setCity(employee.getCity());
     return repository.save(existingEmployee);
 }


    public String deleteEmployee(int id){
      repository.deleteById(id);
      return "Employee deleted || " +id;
    }


}
