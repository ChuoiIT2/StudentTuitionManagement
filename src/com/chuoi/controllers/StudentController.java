package com.chuoi.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import com.chuoi.services.StudentService;
import com.chuoi.views.StudentView;
import com.chuoi.configs.Constant;
import com.chuoi.models.Student;

public class StudentController {
	private StudentService studentService;
	private StudentView studentView;

	public StudentController(StudentView studentView) {
		this.studentView = studentView;
		studentService = new StudentService();

		studentView.addButtonListener(new AddButtonListener());
		studentView.editButtonListener(new EditButtonListener());
		studentView.deleteButtonListener(new DeleteButtonListener());
		studentView.findingButtonListener(new FindingButtonListener());
	}

	public void showStudentAppView() {
		studentView.setFrameVisible();
		studentView.showListStudent(studentService.getStudents());
		studentView.settingTotal();
		studentView.settingTotal(calTotalTuition(studentService.getStudents()));
	}

	class AddButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			try {
				Student student = studentView.getStudentInfo();
				if (studentService.addStudent(student)) {
					studentView.clearAllContent();
					studentView.showMessage("Thêm thông tin thành công");
				} else {
					studentView.showMessage("Thông tin sinh viên đã trùng. Vui lòng nhập lại");
					studentView.showListStudent(studentService.getStudents());

				}
				studentView.showListStudent(studentService.getStudents());
				studentView.settingTotal();
				studentView.settingTotal(calTotalTuition(studentService.getStudents()));
			} catch (Exception e2) {
				// TODO: handle exception
				studentView.showMessage("Hãy nhập đầy đủ thông tin");
			}
		}
	}

	class EditButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				Student student = studentView.getStudentInfo();
				studentService.editStudent(student.getStudentCode(), student.getName(), student.getMajor(),
						student.getStudyProgramId(), student.getCreditCount(), student.getSubjectCount());
				studentView.showListStudent(studentService.getStudents());
				studentView.settingTotal();
				studentView.settingTotal(calTotalTuition(studentService.getStudents()));
				studentView.showMessage("Sửa thành công");
				studentView.clearAllContent();
			} catch (Exception e2) {
				// TODO: handle exception
				studentView.showMessage("Chọn thông tin cần chỉnh sửa");
			}
		}

	}

	class DeleteButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			studentView.showListStudent(studentService.getStudents());
			studentView.settingTotal();
			String idSelect = studentView.getDeleteOption();
			studentService.deleteStudent(idSelect);
			studentView.showListStudent(studentService.getStudents());
			studentView.settingTotal();
			studentView.settingTotal(calTotalTuition(studentService.getStudents()));
		}
	}

	class FindingButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String inputSearching = studentView.getInputSearching();
			int listOption = getListOptionShow();
			if(studentView.getTitleDisplayComboBox().equals("Học theo TC"))
			{
				listOption = Constant.STUDY_PROGRAM_CREDIT_ID;
			}
			else if(studentView.getTitleDisplayComboBox().equals("Học theo CT mẫu"))
			{
				listOption =  Constant.STUDY_PROGRAM_MODEL_ID;
			}
			else
			{
				listOption = Constant.DEFAULT_STUDY_PROGRAM_ID;
			}
			
			if(studentView.getTitleFindingComboBox().equals("Theo Tên"))
			{
				studentView.showListStudent(studentService.getStudentsWithFilter(inputSearching, "",
						Constant.DEFAULT_CREDIT_COUNT, listOption));
				
			}
			else if(studentView.getTitleFindingComboBox().equals("Theo MSSV"))
			{
				studentView.showListStudent(studentService.getStudentsWithFilter("", inputSearching,
						Constant.DEFAULT_CREDIT_COUNT, listOption));
			}
			else
			{
				studentView.showListStudent(studentService.getStudentsWithFilter("", "",
						Integer.parseInt(inputSearching), listOption));
			}
			studentView.settingTotal();
			studentView.settingTotal(calTotalTuition(studentService.getFilteredStudents()));
			
		}
	}
	private int getListOptionShow()
	{
		int listOption;
		if(studentView.getTitleDisplayComboBox().equals("Học theo TC"))
		{
			listOption = Constant.STUDY_PROGRAM_CREDIT_ID;
		}
		else if(studentView.getTitleDisplayComboBox().equals("Học theo CT mẫu"))
		{
			listOption =  Constant.STUDY_PROGRAM_MODEL_ID;
		}
		else
		{
			studentView.showListStudent(studentService.getStudentsWithFilter("", "",
					Constant.DEFAULT_CREDIT_COUNT, Constant.DEFAULT_STUDY_PROGRAM_ID));
			listOption = Constant.DEFAULT_STUDY_PROGRAM_ID;
		}
		return listOption;
	}
	
	private double calTotalTuition(List<Student> studentList)
	{
		double totalTuition = 0;
		for(Student student : studentList)
		{
			totalTuition +=student.getTotalTuition();
		}
		return totalTuition;
	}
	
}