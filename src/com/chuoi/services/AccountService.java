package com.chuoi.services;

import com.google.gson.Gson;

import com.chuoi.models.Account;
import com.chuoi.utils.DatabaseUtil;
import com.chuoi.utils.FileUtil;

public class AccountService {
	private String databaseUrl;
	private Account[] accounts;

	public AccountService() {
		this.databaseUrl = DatabaseUtil.getDatabaseUrl("accounts");
		this.readAccounts();
	}

	private void readAccounts() {
		Gson gson = new Gson();
		this.accounts = gson.fromJson(FileUtil.getFileReader(databaseUrl), Account[].class);
	}

	public boolean checkAdminAccount(String username, String password) {
		for (int i = 0, length = accounts.length; i < length; i++) {
			if (username.equals(accounts[i].getUsername()) && password.equals(accounts[i].getPassword())) {
				return true;
			}
		}
		return false;
	}
}
