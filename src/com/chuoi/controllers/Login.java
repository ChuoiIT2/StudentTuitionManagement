package com.chuoi.controllers;
import com.chuoi.views.LoginView;

public class Login {
	public static void main(String[] args)
	{
		LoginView view = new LoginView();
		LoginController controller = new LoginController(view);
		controller.showLoginView();
	}
}
