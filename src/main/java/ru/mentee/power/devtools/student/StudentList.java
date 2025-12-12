package ru.mentee.power.devtools.student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList;  // нарушение: snake_case

    public StudentList() {
        studentList = new ArrayList<>();
    }

    // нарушение: имя метода
    public void addStudent(Student student) {
        if (student != null) {
            studentList.add(student);
        }
    } //


    static void main() {
        StudentList studentList = new StudentList();
        studentList.addStudent(new Student("Олег", "Москва"));
        studentList.addStudent(new Student("Геннадий", "Москва"));
        studentList.addStudent(new Student("Серега", "Москва"));
    }
}