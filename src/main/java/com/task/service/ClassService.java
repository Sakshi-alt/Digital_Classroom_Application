package com.task.service;

import com.task.model.Document;
import com.task.model.Student;
import com.task.repository.ClassRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ClassService
{
    void addStudent(Student student);
    void uploadDocument(Document document);

     ClassRepository createClass(ClassRepository classObj);

    Optional<ClassRepository> getClassById(Long classId);
}
