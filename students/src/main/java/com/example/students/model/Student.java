package com.example.students.model;

public class Student {
    private Long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;

    public Student() {
    }

    public Student(Long id, String name, String surname, int exam) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        this.mark = calculateMark(exam);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
        this.mark = calculateMark(exam);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    private String calculateMark(int examScore) {
        if (examScore >= 90) {
            return "A";
        } else if (examScore >= 75) {
            return "B";
        } else if (examScore >= 60) {
            return "C";
        } else if (examScore >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public boolean isFailed() {
        return "F".equals(mark);
    }
}