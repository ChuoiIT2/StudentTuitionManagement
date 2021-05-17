package com.chuoi.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.chuoi.services.StudentService;
import com.chuoi.views.StudentView;
import com.chuoi.models.Student;
import com.chuoi.configs.Constant;
public class StudentController {
	private StudentService studentService;
	private StudentView studentView;
	
	public StudentController(StudentView studentView)
	{
		this.studentView=studentView;
		studentService = new StudentService();
		
		studentView.addButtonListener(new AddButtonListener());
		studentView.editButtonListener(new EditButtonListener());
		studentView.deleteButtonListener(new DeleteButtonListener());
		studentView.findingButtonListener(new FindingButtonListener());
	}
	
	public void showStudentAppView()
	{
		studentView.setFrameVisible();
		studentView.showListStudent(studentService.getStudents());
	}
	class AddButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			try {
				Student student = studentView.getStudentInfo();
				if(studentService.addStudent(student))
				{
					studentView.clearAllContent();
					studentView.showMessage("Naice");
				}
				else {
					studentView.showMessage("Trùng cmm rồi nhập cl");
					studentView.showListStudent(studentService.getStudents());
					
				}
				studentView.showListStudent(studentService.getStudents());
			} catch (Exception e2) {
				// TODO: handle exception	
				studentView.showMessage("Nhập như lồn");
			}
		}
	}
	
	class EditButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			try {
				Student student = studentView.getStudentInfo();
				studentService.editStudent(student.getStudentCode(), student.getName(), student.getMajor(), student.getStudyProgramId(), student.getCreditCount(), student.getSubjectCount());
				studentView.showListStudent(studentService.getStudents());
				studentView.showMessage("Sửa thành công");
				studentView.clearAllContent();
			} catch (Exception e2) {
				// TODO: handle exception
				studentView.showMessage("Chọn thông tin rồi sửa, ngu vừa thôi");
			}
		}
		
	}
	class DeleteButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			studentView.showListStudent(studentService.getStudents());
			String idSelect = studentView.getDeleteOption();
			studentService.deleteStudent(idSelect);
			studentView.showListStudent(studentService.getStudents());
		}
	}
	
	class FindingButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String nameSearch = studentView.searchByName();
			studentView.showListStudent(studentService.getStudentsWithFilter(nameSearch, "20194310", 0, 0));
		}
	}
	
}