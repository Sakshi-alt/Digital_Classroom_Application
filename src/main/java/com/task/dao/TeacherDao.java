package com.task.dao;

import com.task.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.task.repository.TeacherRepository;

@Repository
public interface TeacherDao extends CrudRepository<TeacherRepository, Long>, JpaSpecificationExecutor<TeacherRepository> {
    Teacher findByEmail(String email);

    Teacher findByUsername(String username);
}
