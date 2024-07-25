package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }
    
    @Autowired  
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        // Check if students already exist in the database
       /* if (studentRepository.count() == 0) {
            // If no students are found, insert new students
            Student student1 = new Student("Ramesh", "Potla", "rameshpotla6118@gmail.com");
            studentRepository.save(student1);
            Student student2 = new Student("Srikanth", "Pasam", "srikanthpasam6118@gmail.com");
            studentRepository.save(student2);
           Student student3 = new Student("Dadavali", "Shaik", "dadavalishaik6118@gmail.com");
            studentRepository.save(student3);
        } else {
            System.out.println("Students already exist in the database.");
        }*/
    }
}
