package com.chuoi.views;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.chuoi.models.Account;

public class LoginView {
	// Assign main panel
	
	private JFrame frame;
	private JButton buttonLogin;
	private JTextField username;
	private JPasswordField password;
	private JCheckBox checkbox;
	
	// Assign label contain Logo, check username,password
	private JLabel bigLogo, labelPassIcon, labelUserIcon;
	private JLabel showMess;
	
	// Assign icon logo
	private Image img_logo = new ImageIcon(LoginView.class.getResource("/Image/Uni.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_user = new ImageIcon(LoginView.class.getResource("/Image/User.png")).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	private Image img_pass = new ImageIcon(LoginView.class.getResource("/Image/Password.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
	public LoginView()
	{
		initialize();
	}
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.getContentPane().setLayout(null);
		
		setContent();
		setLogoIcon();
		setActionListener();
	}
	private void setContent()
	{
		username = new JTextField("Username");
		username.setBounds(211, 124, 219, 26);
		frame.getContentPane().add(username);
		
		password = new JPasswordField("Yourpassword");
		password.setBounds(211, 189, 219, 26);
		frame.getContentPane().add(password);
		
		buttonLogin = new JButton("Login");
		buttonLogin.setBounds(180, 294, 250, 40);
		frame.getContentPane().add(buttonLogin);
		
		showMess = new JLabel("");
		showMess.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		showMess.setForeground(Color.RED);
		showMess.setBounds(180, 227, 250, 15);
		frame.getContentPane().add(showMess);
		
		checkbox = new JCheckBox("Show password");
		checkbox.setBounds(180, 260, 250, 26);
		frame.getContentPane().add(checkbox);
	}
	
	public void setFrameVisible()
	{
		frame.setVisible(true);
	}
	private void setLogoIcon()
	{
		//big logo
		bigLogo = new JLabel();
		bigLogo.setHorizontalAlignment(SwingConstants.CENTER);
		bigLogo.setBounds(180, 12, 250, 100);
		bigLogo.setIcon(new ImageIcon(img_logo));
		frame.getContentPane().add(bigLogo);
		
		//icon username
		labelUserIcon = new JLabel("");
		labelUserIcon.setHorizontalAlignment(SwingConstants.CENTER);
  		labelUserIcon.setBounds(180, 124, 36, 26);
  		labelUserIcon.setIcon(new ImageIcon(img_user));
		frame.getContentPane().add(labelUserIcon);
		
		//icon password
		labelPassIcon = new JLabel("");
		labelPassIcon.setBounds(180, 189, 36, 26);
		labelPassIcon.setIcon(new ImageIcon(img_pass));
		frame.getContentPane().add(labelPassIcon);
	}
	
	public Account getUser()
	{
		@SuppressWarnings("deprecation")
		Account admin = new Account(username.getText(),password.getText());
		return admin;
	}
	
	public void showMess(String mess)
	{
		showMess.setText(mess);
	}
	
	private void setActionListener()
	{
		buttonLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				addLoginListener(this);
			}
		});
		checkbox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(checkbox.isSelected())
				{
					password.setEchoChar((char)0);
				}
				else
				{
					password.setEchoChar('*');
				}
			}
		});
	}
	public void addLoginListener(ActionListener e) {
		buttonLogin.addActionListener(e);
	}
}