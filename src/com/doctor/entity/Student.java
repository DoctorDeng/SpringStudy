package com.doctor.entity;

public class Student {
	/**
	 * 学生ID
	 */
	private int id;
	/**
	 * 学生姓名
	 */
	private String name;
	/**
	 * 学生年级
	 */
	private Grade grade;

	public Student(){}
	public Student(int id, String name, Grade grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
}
