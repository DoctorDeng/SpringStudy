package com.doctor.service.impl;

import org.apache.log4j.Logger;

import com.doctor.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private static Logger log = Logger.getLogger(StudentServiceImpl.class);
	
	@Override
	public void addStudent(String name) {
		log.info("添加学生:" + name);
		int i = 1/0;
	}
}
