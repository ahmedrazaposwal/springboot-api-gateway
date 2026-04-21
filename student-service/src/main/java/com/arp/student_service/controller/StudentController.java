package com.arp.student_service.controller;

import com.arp.student_service.model.Student;
import com.arp.student_service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<?> fetchStudents() {
        return studentService.fetchStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> fetchStudentById(@PathVariable String id) {
        return studentService.fetchStudentById(id);
    }

    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
}
