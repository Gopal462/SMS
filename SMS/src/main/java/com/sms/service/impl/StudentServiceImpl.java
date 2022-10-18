package com.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repositry.StudentRepository;
import com.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository studentrepo;
	

	public StudentServiceImpl(StudentRepository studentrepo) {
		super();
		this.studentrepo = studentrepo;
	}


	
	public List<Student> getAllStudents() {
		
		return studentrepo.findAll();
	}



	public Student saveStudent(Student student) {
		
		return studentrepo.save(student);
	}



	@Override
	public Student getStudentId(Long id) {
		
		return studentrepo.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		
		return studentrepo.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
		studentrepo.deleteById(id);
		
	}

}
