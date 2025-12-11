package ru.mentee.power.devtools.student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList;  // нарушение: snake_case
    private int countStudent;
    private String namingStudent;

    public StudentList() {
        studentList = new ArrayList<>();
    }

    // нарушение: имя метода
    public void addStudent(Student student) {
        if (student != null) {
            studentList.add(student);
        }
    } //

    // нарушение: длинная строка (>120 символов)
    public List<Student> soBigString(String city) {
        return studentList.stream().filter(s -> s.city().equals(city)).toList();
    }

    static void main() {
        StudentList studentList = new StudentList();
        studentList.addStudent(new Student("Олег", "Москва"));
        studentList.addStudent(new Student("Геннадий", "Москва"));
        studentList.addStudent(new Student("Серега", "Москва"));
    }
}