/*
 * @file : App.java
 * @author : Bùi Đức Nhật 20194345
 * @author : Ninh Trung Kiên 20194310
 * */

package com.chuoi.app;

import mdlaf.*;
import mdlaf.themes.*;

import javax.swing.*;
import com.chuoi.views.LoginView;
import com.chuoi.controllers.LoginController;
import com.chuoi.configs.Constant;

public class App {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new MaterialLookAndFeel());
			if (UIManager.getLookAndFeel() instanceof MaterialLookAndFeel) {
				MaterialLookAndFeel.changeTheme(new MaterialLiteTheme());
			}
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		LoginView loginView = new LoginView();
		LoginController loginController = new LoginController(loginView);
		loginController.showLoginView(Constant.DEFAULT_FRAME_SHOW);
	}
}