package com.task.controller;

import com.task.repository.ClassRepository;
import com.task.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @PostMapping
    public ResponseEntity<ClassRepository> createClass(@RequestBody ClassRepository classObj) {

     ClassRepository createdClass= classService.createClass(classObj);
        return ResponseEntity.ok(createdClass);
    }

    @GetMapping("/{classId}")
    public ResponseEntity<Optional<ClassRepository>> getClassById(@PathVariable Long classId) {
        Optional<ClassRepository> classObj = classService.getClassById(classId);
        if (classObj != null) {
            return ResponseEntity.ok(classObj);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
