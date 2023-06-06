package com.task.service;

import com.task.model.Document;
import com.task.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService
{
    void joinClass(Class clazz);
    List<Document> viewDocuments(Class clazz);

    StudentRepository createStudent(StudentRepository student);


    Optional<StudentRepository> getStudentById(Long studentId);
     boolean login(String username, String password);
}
