package com.example.jpastarti;

import com.example.jpastarti.model.Student;
import com.example.jpastarti.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest //it will start up the whole sprinboot project with all the beans
class JpaStartiApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void TestStudent(){
        Student std1 = new Student();
        std1.setBorn(LocalDate.now());
        std1.setName("Anne");
        studentRepository.save(std1);

        List<Student> lst = studentRepository.findAll();
        assertEquals(3, lst.size());

        studentRepository.delete(std1);
        lst = studentRepository.findAll();
        assertEquals(2, lst.size());


     assertEquals(studentRepository.findByName("Anne"),studentRepository.findById(0));


   /*     Optional<Student> opt3 = studentRepository.findById(1);
        if (opt3.isPresent()){
            Student std3 = opt3.get();
            assertEquals(std3.getName(), "Anne");
        }*/
    }


}
