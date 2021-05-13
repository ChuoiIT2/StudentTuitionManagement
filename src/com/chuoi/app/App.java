package com.chuoi.app;

import com.chuoi.services.StudentService;
import com.chuoi.models.*;

public class App {

	public static void main(String[] args) {
		StudentService ss = new StudentService();

		ss.getStudentsWithFilter("", "", -1, -1).forEach(student -> System.out.println(student.getName()));
		;
	}
}
