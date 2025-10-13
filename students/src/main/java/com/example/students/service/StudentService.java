package com.example.students.service;

import com.example.students.model.Student;
import com.example.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> searchStudents(String search) {
        return studentRepository.findByNameOrSurnameContaining(search);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
}