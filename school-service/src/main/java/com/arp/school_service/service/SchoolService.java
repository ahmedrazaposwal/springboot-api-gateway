package com.arp.school_service.service;

import com.arp.school_service.models.School;
import com.arp.school_service.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public School addSchool(School school) {
        return schoolRepository.save(school);
    }

    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    public School getSchoolByID(int id) {
        return schoolRepository.findById(id).orElse(null);
    }
}
