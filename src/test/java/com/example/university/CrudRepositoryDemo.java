package com.example.university;

import com.example.university.domain.Person;
import com.example.university.domain.Student;
import com.example.university.repo.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Demonstrate Creation, Reading, Updating, and Deletion of Students with StudentRepository
 * <p>
 * Created by maryellenbowman
 */
@SpringBootTest
class CrudRepositoryDemo {


    @Autowired
    StudentRepository studentRepository;

    /**
     * Exercise CrudRepository methods.
     */
    @Test
    void simpleStudentCrudExample() {
        boolean fullTime = true;
        studentRepository.save(new Student(new Person("jane", "doe"), fullTime, 20));
        studentRepository.save(new Student(new Person("john", "doe"), fullTime, 22));
        studentRepository.save(new Student(new Person("mike", "smith"), fullTime, 18));
        studentRepository.save(new Student(new Person("ally", "kim"), !fullTime, 19));

        System.out.println("\n*************Original Students*************");
        studentRepository.findAll().forEach(System.out::println);

        //age up the students
        studentRepository.findAll().forEach(student -> {
            student.setAge(student.getAge() + 1);
            studentRepository.save(student);
        });

        System.out.println("\n*************Students a year older*************");
        studentRepository.findAll().forEach(System.out::println);

        studentRepository.deleteAll();
        System.out.println("\n*************Students removed*************");
        studentRepository.findAll().forEach(System.out::println);

    }


}
