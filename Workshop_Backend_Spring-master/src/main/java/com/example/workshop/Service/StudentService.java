package com.example.workshop.Service;

import com.example.workshop.Repository.StudentRepo;
import com.example.workshop.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final StudentRepo studentRepo;

    public UserService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}
