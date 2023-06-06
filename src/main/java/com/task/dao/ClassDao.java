package com.task.dao;


import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.task.repository.ClassRepository;

import java.util.Optional;

@Repository
public interface ClassDao extends CrudRepository<ClassRepository, Long>, JpaSpecificationExecutor<ClassRepository> {
    Optional<ClassRepository> findById(Long id);
}
