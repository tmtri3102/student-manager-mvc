package com.example.studentmanager.service;

import com.example.studentmanager.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements IStudentService {
    public static Map<Integer, Student> students;
    static {
        students = new HashMap<>();
        students.put(1, new Student(123, "Tri", 84));
        students.put(2, new Student(456, "Thang", 95));
        students.put(3, new Student(789, "Dung", 87));
        students.put(4, new Student(357, "Loc", 88));
    }
    @Override
    public List<Student> findAll() {
        // return all values in Map students, in an array
        return new ArrayList<>(students.values());
    }

    @Override
    public void save(Student student) {
        // pass a student object, add to map student id as key and student object as value
        students.put(student.getId(), student);
    }

    @Override
    public void update(int id, Student student) {
        // update the id input of a student
        students.put(id, student);
    }

    @Override
    public void remove(int id) {
        // remove id -> auto remove the record
        students.remove(id);
    }
}
