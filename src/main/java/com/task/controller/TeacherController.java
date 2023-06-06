package com.task.controller;


import com.task.model.Teacher;
import com.task.repository.DocumentRepository;
import com.task.repository.TeacherRepository;
import com.task.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @RequestMapping("/")
    public ResponseEntity<TeacherRepository> createTeacher(@RequestBody TeacherRepository teacher) {
        TeacherRepository createdTeacher = teacherService.saveTeacher(teacher);
        return ResponseEntity.ok(createdTeacher);
    }

    @GetMapping("/get-t/{emailId}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable String emailId) {
        Teacher teacher = teacherService.getTeacherByEmail(emailId);
        if (teacher != null) {
            return ResponseEntity.ok(teacher);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam("username") String username,
                                        @RequestParam("password") String password) {
        if (teacherService.login(username, password)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }


    @PostMapping("/{teacherId}/classes/{classId}/documents")
    public ResponseEntity<DocumentRepository> uploadDocument(@PathVariable("teacherId") Long teacherId,
                                                             @PathVariable("classId") Long classId,
                                                             @RequestParam("title") String title,
                                                             @RequestParam("url") String url) {
        DocumentRepository document = teacherService.uploadDocument(teacherId, classId, title, url);

        if (document != null) {
            return ResponseEntity.ok(document);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    // Other endpoints for teacher-related operations
}
