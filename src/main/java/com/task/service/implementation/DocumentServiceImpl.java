package com.task.service.implementation;

import com.task.dao.DocumentDao;
import com.task.model.Document;
import com.task.repository.DocumentRepository;
import com.task.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService
{
    @Autowired
    private DocumentDao documentDao;
    /**
     * @param document
     * @param file
     * @param classId
     * @return
     */
    @Override
    public Document uploadDocument(Document document, MultipartFile file, Long classId) {
        return null;
    }

    /**
     * @param documentId
     * @return
     */
    @Override
    public Optional<DocumentRepository> getDocumentById(Long documentId) {
        return documentDao.findById(documentId);
    }
}
