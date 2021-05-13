package com.chuoi.services;

import java.util.List;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.chuoi.models.Student;
import com.chuoi.utils.DatabaseUtil;
import com.chuoi.utils.FileUtil;

public class StudentService {
	private String databaseUrl;
	private List<Student> students;

	public StudentService() {
		this.databaseUrl = DatabaseUtil.getDatabaseUrl("students");
		this.readFromDatabase();
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student newStudent) {
		this.readFromDatabase();
		Gson gson = new Gson();

		boolean isDuplicatedStudentCode = false;
		

		this.students.add(newStudent);

		FileUtil.writeFile(databaseUrl, gson.toJson(students));
	}

	private void readFromDatabase() {
		Gson gson = new Gson();
		this.students = new ArrayList<Student>();

		Type studentListType = new TypeToken<List<Student>>() {
		}.getType();
		this.students = gson.fromJson(FileUtil.getFileReader(this.databaseUrl), studentListType);
		if (this.students == null) {
			this.students = new ArrayList<Student>();
		}
	}
}
