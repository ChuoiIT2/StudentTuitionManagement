package com.chuoi.models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Iterator;
import com.chuoi.models.Account;
//import com.chuoi.models.Database;

public class AccountDao extends Database {
	public AccountDao() {
		super("accounts.json");
	}

	public boolean checkAdminAccount(String username, String password) {
		JSONArray listAccounts = this.readArray();

		Iterator accountIterator = listAccounts.iterator();
		while (accountIterator.hasNext()) {
			JSONObject curObject = (JSONObject) accountIterator.next();
			Account curAccount = new Account((String) curObject.get("username"), (String) curObject.get("password"));
			if (username.equals(curAccount.getUsername()) && password.equals(curAccount.getPassword())) {
				return true;
			}
		}
		return false;
	}
}
