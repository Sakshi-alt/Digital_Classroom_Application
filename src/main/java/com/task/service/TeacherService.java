package com.task.service;

import com.task.model.Teacher;
import com.task.repository.DocumentRepository;
import com.task.repository.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService
{
    TeacherRepository saveTeacher(TeacherRepository teacher);
    Teacher getTeacherByEmail(String email);
     boolean login(String username, String password);
     DocumentRepository uploadDocument(Long teacherId, Long classId, String title, String url);
}
