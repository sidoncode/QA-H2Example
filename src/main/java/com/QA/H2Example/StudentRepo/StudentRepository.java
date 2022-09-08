package com.QA.H2Example.StudentRepo;

import com.QA.H2Example.Student.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {



}
