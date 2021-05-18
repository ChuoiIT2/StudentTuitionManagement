package com.chuoi.controllers;

import com.chuoi.views.LoginView;
import com.chuoi.views.StudentView;
import com.chuoi.services.AccountService;
import com.chuoi.configs.Constant;
import com.chuoi.models.Account;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
	private AccountService accountService;
	private LoginView loginView;

	public LoginController(LoginView loginView) {
		this.loginView = loginView;
		this.accountService = new AccountService();
		loginView.addLoginListener(new LoginListener());
	}

	public void showLoginView(boolean setFrame) {
		loginView.setFrameVisible(setFrame);
	}

	class LoginListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Account account = loginView.getUser();
			if (!accountService.checkAdminAccount(account.getUsername(), account.getPassword())) {
				loginView.showMess("Wrong Username or Password!Try again");
			} else {
				loginView.showMess("");
				showLoginView(!Constant.DEFAULT_FRAME_SHOW);
				StudentView studentView = new StudentView();
				StudentController studentController = new StudentController(studentView);
				studentController.showStudentAppView();

			}
		}
	}
}
