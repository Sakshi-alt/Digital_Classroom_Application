package com.task.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.task.repository.StudentRepository;

import java.util.Optional;

@Repository
public interface StudentDao extends CrudRepository<StudentRepository, Long>, JpaSpecificationExecutor<StudentRepository> {
    Optional<StudentRepository> findById(Long id);
    Optional<StudentRepository> findByUsername(String username);
}
