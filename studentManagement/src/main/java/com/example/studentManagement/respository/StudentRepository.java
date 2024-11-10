package com.example.studentManagement.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentManagement.entity.Student;
public interface StudentRepository extends JpaRepository<Student, Long>{

}