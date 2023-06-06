package com.task.service;

import com.task.model.Document;
import com.task.repository.DocumentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
public interface DocumentService
{

    Document uploadDocument(Document document, MultipartFile file, Long classId);

    Optional<DocumentRepository> getDocumentById(Long documentId);
}
