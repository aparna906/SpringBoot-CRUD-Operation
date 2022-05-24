package com.springboot.crud.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String city;
    private String birthdate;

}

