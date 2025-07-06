package com.example.employeemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    // Many employees belong to one department
    @ManyToOne
    @JoinColumn(name = "department_id")  // FK column in employee table
    private Department department;
}
