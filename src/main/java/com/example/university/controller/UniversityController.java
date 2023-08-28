package com.example.university.controller;


import com.example.university.domain.Student;
import com.example.university.domain.Department;
import com.example.university.domain.Course;
import com.example.university.repo.StudentRepository;
import com.example.university.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UniversityController {

    private final StudentRepository studentRepository;
    private final DepartmentRepository departmentRepository;
   //

    @Autowired
    public UniversityController(
            StudentRepository studentRepository,
            DepartmentRepository departmentRepository,
          //  CourseRepository courseRepository
    ) {
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
      //  this.courseRepository = courseRepository;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @PostMapping("/departments")
    public Department createDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }
}
