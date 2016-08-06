package com.doctor.service.impl;

import com.doctor.dao.StudentDao;
import com.doctor.entity.Student;
import com.doctor.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public int addStudent(Student student) {
		return studentDao.insertStudent(student);
	}

	@Override
	public int updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

	@Override
	public int delStudent(Student student) {
		return studentDao.deleteStudent(student);
	}

}
