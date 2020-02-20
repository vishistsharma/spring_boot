package com.vishist.student.dal.repos;



import org.springframework.data.jpa.repository.JpaRepository;

import com.vishist.student.dal.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
