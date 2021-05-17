package com.chuoi.app;
import com.chuoi.views.LoginView;
import com.chuoi.controllers.LoginController;

public class App {

	public static void main(String[] args) {
		LoginView loginView = new LoginView();
		LoginController loginController = new LoginController(loginView);
<<<<<<< HEAD
		loginController.showLoginView();
		
=======

		loginController.showLoginView();
>>>>>>> f529b972b16cbb09d1019ccaa6c3454bb1699ba7
	}
}