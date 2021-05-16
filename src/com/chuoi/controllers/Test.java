package com.chuoi.controllers;
import com.chuoi.views.StudentView;
import com.chuoi.controllers.StudentController;

public class Test {
	public static void main(String[] args)
	{
		StudentView view = new StudentView();
		StudentController controller = new StudentController(view);
		controller.showStudentAppView();
	}
}
