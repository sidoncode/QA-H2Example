package com.QA.H2Example.StudentController;

import com.QA.H2Example.Student;
import com.QA.H2Example.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    // creating a GET mapping that retrives all the Student detail from the database
    @GetMapping("/student")
    private List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    // creating a GET mapping that retrives the detail of a specific Student
    @GetMapping("/student/{id}")
    private Student getStudent(@PathVariable("id") int id){
        return studentService.getStudentByID(id);
    }

    // creating a DELETE mapping that Delete the detail of a specific Student
    @DeleteMapping("/student/{id}")
    private Student deleteStudent(@PathVariable("id") int id){
        return studentService.delete(id);
    }

    // creating a POST mapping that Post the Student detail to the database
    @PostMapping("/student")
    private int saveStudent(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student.getId();
    }

}
