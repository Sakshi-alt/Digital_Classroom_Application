package com.task.service.implementation;



import com.task.dao.ClassDao;
import com.task.dao.TeacherDao;
import com.task.model.Teacher;
import com.task.repository.ClassRepository;
import com.task.repository.DocumentRepository;
import com.task.repository.TeacherRepository;
import com.task.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService
{

    @Autowired
    TeacherDao teacherDao;

    @Autowired
    ClassDao classDao;

    public TeacherRepository saveTeacher(TeacherRepository teacher) {
        TeacherRepository t = teacherDao.save(teacher);
        return t;
    }

    public Teacher getTeacherByEmail(String email) {
        return teacherDao.findByEmail(email);
    }

    public boolean login(String username, String password) {
        Teacher teacher = teacherDao.findByUsername(username);

        if (teacher != null && teacher.getPassword().equals(password)) {
            return true;
        }

        return false;
    }

    public DocumentRepository uploadDocument(Long teacherId, Long classId, String title, String url) {
        // Retrieve the teacher and class from the repository
        TeacherRepository teacher = teacherDao.findById(teacherId).orElse(null);
        Optional<ClassRepository> clazz = Optional.ofNullable(classDao.findById(classId).orElse(null));
        ClassRepository class2 ;
        if (teacher != null && clazz != null) {
            // Create a new document
            DocumentRepository document = new DocumentRepository();
            document.setName(title);
            document.setFileUrl(url);
          class2 =  clazz.get();
            document.setClazz(class2);

            // Add the document to the class and save the changes
            class2.getDocuments().add(document);
            classDao.save(clazz.get());

            return document;
        }

        return null;
    }


}
