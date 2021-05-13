package com.chuoi.models;

public class Student {
	private String studentCode;
	private String name;
	private String major;
	private int studyProgramId;
	private int creditCount;
	private int subjectCount;

	public Student(String studentCode, String name, String major, int studyProgramId, int creditCount,
			int subjectCount) {
		super();
		this.studentCode = studentCode;
		this.name = name;
		this.major = major;
		this.studyProgramId = studyProgramId;
		this.creditCount = creditCount;
		this.subjectCount = subjectCount;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStudyProgramId() {
		return studyProgramId;
	}

	public void setStudyProgramId(int studyProgramId) {
		this.studyProgramId = studyProgramId;
	}

	public int getCreditCount() {
		return creditCount;
	}

	public void setCreditCount(int creditCount) {
		this.creditCount = creditCount;
	}

	public int getSubjectCount() {
		return subjectCount;
	}

	public void setSubjectCount(int subjectCount) {
		this.subjectCount = subjectCount;
	}

}
