package com.springboot.crud.crud.repository;

import com.springboot.crud.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findByName(String name);
    Employee findByBirthdate(String birthdate);
    List<Employee> findByCity(String city);
}
