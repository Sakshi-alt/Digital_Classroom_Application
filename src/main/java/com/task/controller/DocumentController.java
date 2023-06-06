package com.task.controller;

import com.task.model.Document;
import com.task.repository.DocumentRepository;
import com.task.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @PostMapping("/{classId}/upload")
    public ResponseEntity<Document> uploadDocument(
            @PathVariable Long classId,
            @RequestParam("file") MultipartFile file
    ) {
        Document document = new Document();


        Document uploadedDocument = documentService.uploadDocument(document, file, classId);
        return ResponseEntity.ok(uploadedDocument);
    }

    @GetMapping("/{documentId}")
    public ResponseEntity<Optional<DocumentRepository>> getDocumentById(@PathVariable Long documentId) {
        Optional<DocumentRepository> document = documentService.getDocumentById(documentId);
        if (document != null) {
            return ResponseEntity.ok(document);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    // Other endpoints for document-related operations
}
