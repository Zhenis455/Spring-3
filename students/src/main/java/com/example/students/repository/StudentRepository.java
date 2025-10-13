package com.example.students.repository;

import com.example.students.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class StudentRepository {
    private final List<Student> students = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public StudentRepository() {
        students.add(new Student(idCounter.getAndIncrement(), "Ilyas", "Zhuanyshev", 88));
        students.add(new Student(idCounter.getAndIncrement(), "Serik", "Erikov", 91));
        students.add(new Student(idCounter.getAndIncrement(), "Erik", "Serikov", 65));
        students.add(new Student(idCounter.getAndIncrement(), "Nurzhan", "Bolatov", 48));
        students.add(new Student(idCounter.getAndIncrement(), "Partick", "Zuckerberg", 100));
        students.add(new Student(idCounter.getAndIncrement(), "Sabina", "Assetova", 33));
        students.add(new Student(idCounter.getAndIncrement(), "Madina", "Adletova", 77));
        students.add(new Student(idCounter.getAndIncrement(), "Karina", "Serzhanova", 51));
    }

    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    public Student save(Student student) {
        if (student.getId() == null) {
            student.setId(idCounter.getAndIncrement());
        } else {
            students.removeIf(s -> s.getId().equals(student.getId()));
        }
        students.add(student);
        return student;
    }

    public List<Student> findByNameOrSurnameContaining(String search) {
        if (search == null || search.trim().isEmpty()) {
            return findAll();
        }
        String searchLower = search.toLowerCase();
        return students.stream()
                .filter(student -> student.getName().toLowerCase().contains(searchLower) ||
                        student.getSurname().toLowerCase().contains(searchLower))
                .toList();
    }
}