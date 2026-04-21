package com.arp.school_service.controller;

import com.arp.school_service.models.School;
import com.arp.school_service.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping
    public School addSchool(@RequestBody School school) {
        return schoolService.addSchool(school);
    }

    @GetMapping
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @GetMapping("/{id}")
    public School getSchoolById(@PathVariable int id) {
        return schoolService.getSchoolByID(id);
    }
}
