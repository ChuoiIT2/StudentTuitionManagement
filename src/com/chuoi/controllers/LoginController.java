package com.chuoi.controllers;

import com.chuoi.views.LoginView;
import com.chuoi.services.AccountService;
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

	public void showLoginView() {
		loginView.setFrameVisible();
	}

	class LoginListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Account account = loginView.getUser();
			if (!accountService.checkAdminAccount(account.getUsername(), account.getPassword())) {
				loginView.showMess("Wrong Username or Password!Try again");
			} else {
				loginView.showMess("Naice");
			}
		}

	}
}
