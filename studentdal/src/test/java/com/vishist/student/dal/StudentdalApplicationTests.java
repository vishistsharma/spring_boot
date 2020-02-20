package com.vishist.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vishist.student.dal.entities.Student;
import com.vishist.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Movis");
		student.setCourse("Machine Learning");
		student.setFees(120f);
		
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudentById() {
		Optional<Student> findById = studentRepository.findById(1l);
		if(findById.isPresent()) {
			Student student = findById.get();
			System.out.println(student);
		}
	}
	
	@Test
	public void testUpdateStudent() {
		Optional<Student> findById = studentRepository.findById(1l);
		if(findById.isPresent()) {
			Student student = findById.get();
			student.setName("Movis Sharma");
			
			studentRepository.save(student);
		}
	}
	
	@Test
	public void testDelete() {
		Optional<Student> findById = studentRepository.findById(1l);
		if(findById.isPresent()) {
			Student student = findById.get();
			studentRepository.delete(student);
		}
	}
	
}
