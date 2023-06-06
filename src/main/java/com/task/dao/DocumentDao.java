package com.task.dao;


import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.task.repository.DocumentRepository;

import java.util.Optional;

@Repository
public interface DocumentDao extends CrudRepository<DocumentRepository, Long>, JpaSpecificationExecutor<DocumentRepository> {
    Optional<DocumentRepository> findById(Long id);
}