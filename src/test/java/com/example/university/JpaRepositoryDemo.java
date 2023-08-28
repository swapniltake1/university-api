package com.example.university;

import com.example.university.domain.Department;
import com.example.university.repo.DepartmentRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * Demonstrate JPA Repository methods with DepartmentRepository
 * <p>
 * Created by maryellenbowman
 */

@SpringBootTest
class JpaRepositoryDemo {
    @Autowired
    private DepartmentRepository departmentRepository;

    /**
     * Exercise JPA Repository methods.
     */
    @Test
    void runJpaRepositoryMethods() {

        departmentRepository.save(new Department("Humanities"));
        departmentRepository.flush();

        departmentRepository.saveAndFlush(new Department("Fine Arts"));

        departmentRepository.save(new Department("Social Science"));

        System.out.println("\n*************3 Departments*************");
        departmentRepository.findAll().forEach(System.out::println);

        departmentRepository.deleteAllInBatch(
                departmentRepository.findAll().subList(0,1));

        System.out.println("\n*************1 Less Departments*************");
        departmentRepository.findAll().forEach(System.out::println);
        departmentRepository.deleteAllInBatch();
        System.out.println("\n*************Zero Departments*************");
        departmentRepository.findAll().forEach(System.out::println);

    }

    @BeforeEach
    @AfterEach
    void banner() {
        System.out.println("\n\n-------------------------------------------------" +
                "-------------------------------------\n");
    }
}
