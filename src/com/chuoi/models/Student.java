package com.chuoi.models;

public class Student {
	private int id;
	private String name;
	private String major;
	private int studyProgramId;
	private int creditCount;
	private int subjectCount;

	public Student(int id, String name, String major, int studyProgramId, int creditCount, int subjectCount) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.studyProgramId = studyProgramId;
		this.creditCount = creditCount;
		this.subjectCount = subjectCount;
	}

	public int getId() {
		return id;
	}

	public void setMSSV(int id) {
		this.id = id;
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
