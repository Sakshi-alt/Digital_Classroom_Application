package com.task.service.implementation;

import com.task.dao.ClassDao;
import com.task.model.Document;
import com.task.model.Student;
import com.task.repository.ClassRepository;
import com.task.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Component
public class ClassServiceImpl implements ClassService
{
    @Autowired
    private ClassDao classDao;
    /**
     * @param student
     */
    @Override
    public void addStudent(Student student) {

    }

    /**
     * @param document
     */
    @Override
    public void uploadDocument(Document document) {

    }


    /**
     * @param classObj
     * @return
     */
    @Override
    public ClassRepository createClass(ClassRepository classObj) {
        ClassRepository classRepository  = new ClassRepository();
        classRepository= classDao.save(classObj);
        return classRepository;
    }

    /**
     * @param classId
     * @return
     */
    @Override
    public Optional<ClassRepository> getClassById(Long classId) {
        return classDao.findById(classId);
    }
}
