package com.chuoi.services;

import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.chuoi.models.Student;
import com.chuoi.utils.DatabaseUtil;
import com.chuoi.utils.FileUtil;
import com.chuoi.configs.Constant;

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
		readFromDatabase();

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentCode().equals(newStudent.getStudentCode())) {
				return false;
			}
		}
		this.students.add(newStudent);

		writeToDatabase();

		return true;
	}

	// Nếu không filter name, studentCode thì để chuỗi rỗng
	// Nếu không filter creditCount hoặc studyProgramId thì truyền vào -1
	public List<Student> getStudentsWithFilter(String name, String studentCode, int creditCount, int studyProgramId) {
		List<Student> filteredStudents = students.stream().filter(_student -> _student.getName().toLowerCase()
				.contains(name) && _student.getStudentCode().toLowerCase().contains(studentCode)
				&& (creditCount != Constant.DEFAULT_CREDIT_COUNT ? _student.getCreditCount() == creditCount : true)
				&& (studyProgramId != Constant.DEFAULT_STUDY_PROGRAM_ID ? _student.getStudyProgramId() == studyProgramId
						: true))
				.collect(Collectors.toList());
		filteredStudents.sort((Student a, Student b) -> {
			return -a.getCreditCount() + b.getCreditCount();
		});

		return filteredStudents;
	}

	// Chỉnh sửa thông tin theo studentCode, pass vào name, major, studyProgramId,
	// creditCount, subjectCount
	public void editStudent(String studentCode, String name, String major, int studyProgramId, int creditCount,
			int subjectCount) {
		students.stream().forEach(_student -> {
			if (_student.getStudentCode().equals(studentCode)) {
				_student.setName((name != null && name.length() > 0) ? name : _student.getName());
				_student.setMajor((major != null && major.length() > 0) ? major : _student.getMajor());
				_student.setStudyProgramId(studyProgramId != Constant.DEFAULT_STUDY_PROGRAM_ID ? studyProgramId
						: _student.getStudyProgramId());
				_student.setCreditCount(
						creditCount != Constant.DEFAULT_CREDIT_COUNT ? creditCount : _student.getCreditCount());
				_student.setSubjectCount(
						subjectCount != Constant.DEFAULT_SUBJECT_COUNT ? subjectCount : _student.getSubjectCount());
			}
		});

		writeToDatabase();
	}

	public void deleteStudent(String studentCode) {
		students.removeIf(_student -> _student.getStudentCode().equals(studentCode));

		writeToDatabase();
	}

	private void writeToDatabase() {
		Gson gson = new Gson();
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
