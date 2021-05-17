package com.chuoi.app;
import com.chuoi.views.LoginView;
import com.chuoi.controllers.LoginController;

public class App {

	public static void main(String[] args) {
		LoginView loginView = new LoginView();
		LoginController loginController = new LoginController(loginView);
		loginController.showLoginView();
	}
}
