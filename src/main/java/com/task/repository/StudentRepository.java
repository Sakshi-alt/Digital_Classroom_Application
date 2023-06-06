package com.task.repository;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Student")
@Data
@AllArgsConstructor
public class StudentRepository
{
public StudentRepository(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String password;

    @ManyToMany(mappedBy = "students")
    private List<ClassRepository> classes = new ArrayList<>();
}
