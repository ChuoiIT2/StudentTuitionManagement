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
		studentView.deleteButtonListener(new DeleteButtonListener());
		studentView.findingButtonListener(new FindingButtonListener());
	}
	
	public void showStudentAppView()
	{
		studentView.setFrameVisible();
	}
	class AddButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			try {
				Student student = studentView.getStudentInfo();
				if(studentService.addStudent(student))
				{
					studentView.showListStudent(studentService.getStudents());
					studentView.clearAllContent();
					studentView.showAddMessage("Naice");
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
				studentView.showAddMessage("Nhập như lồn");
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
			Student student = studentView.getStudentInfo();
			studentView.showListStudent(studentService.getStudentsWithFilter(student.getName(), student.getStudentCode(), student.getCreditCount(), student.getStudyProgramId()));	
		}
	}
	
}
