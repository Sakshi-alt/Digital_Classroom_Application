package com.task.service.implementation;

import com.task.dao.StudentDao;
import com.task.model.Document;
import com.task.model.Student;
import com.task.repository.StudentRepository;
import com.task.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentDao studentDao;
    /**
     * @param clazz
     */
    @Override
    public void joinClass(Class clazz) {

    }

    /**
     * @param clazz
     * @return
     */
    @Override
    public List<Document> viewDocuments(Class clazz) {
        return null;
    }


    /**
     * @param student
     * @return
     */
    @Override
     public  StudentRepository createStudent(StudentRepository student) {
        StudentRepository studentRepository = new StudentRepository();
      studentRepository =  studentDao.save(studentRepository);
        return studentRepository;
    }

    /**
     * @param studentId
     * @return
     */
    @Override
    public Optional<StudentRepository> getStudentById(Long studentId) {
        return studentDao.findById(studentId);
    }

    public boolean login(String username, String password) {
        Optional<StudentRepository> student = studentDao.findByUsername(username);

        if (student != null && student.get().getPassword().equals(password)) {
            return true;
        }
        return false;
    }

}
