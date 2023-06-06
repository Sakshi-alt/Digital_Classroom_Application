package com.task.repository;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Entity(name = "Teacher")
@Data
@AllArgsConstructor
public
class TeacherRepository
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String username;
    private String password;
    @OneToMany(mappedBy = "teacher")
    private List<ClassRepository> classes = new ArrayList<>();

}
