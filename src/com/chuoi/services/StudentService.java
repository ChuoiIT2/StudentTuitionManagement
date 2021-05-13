package com.chuoi.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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

	// Return true if add student successfully
	public boolean addStudent(Student newStudent) {
		this.readFromDatabase();
		Gson gson = new Gson();

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentCode().equals(newStudent.getStudentCode())) {
				return false;
			}
		}

		this.students.add(newStudent);

		FileUtil.writeFile(databaseUrl, gson.toJson(students));

		return true;
	}

	// Nếu không filter name, studentCode thì để chuỗi rỗng
	// Nếu không filter creditCount hoặc studyProgramId thì truyền vào -1
	public List<Student> getStudentsWithFilter(String name, String studentCode, int creditCount, int studyProgramId) {
		List<Student> filteredStudents = students.stream()
				.filter(_student -> _student.getName().toLowerCase().contains(name)
						&& (creditCount != -1 ? _student.getStudentCode().toLowerCase().contains(studentCode) : true)
						&& (studyProgramId != -1
								? _student.getCreditCount() == creditCount
										&& _student.getStudyProgramId() == studyProgramId
								: true))
				.collect(Collectors.toList());

		return filteredStudents;
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
