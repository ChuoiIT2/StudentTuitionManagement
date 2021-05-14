package com.chuoi.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class ThemSinhVien extends JFrame {

	private JPanel contentPane;
	private JTextField showName;
	private JTextField showMSSV;
	private JTextField showMajor;
	private JTextField showTC;
	private JTextField showHP;
	private JTextField showHocPhi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDien frame = new GiaoDien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ThemSinhVien() {
		setResizable(false);
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 18, 697, 233);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Nh\u1EADp Th\u00F4ng Tin Sinh Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel hoVaTenLaybel = new JLabel("Họ Và Tên:");
		hoVaTenLaybel.setBounds(51, 26, 81, 16);
		panel.add(hoVaTenLaybel);
		
		showName = new JTextField();
		showName.setBounds(158, 21, 190, 26);
		panel.add(showName);
		showName.setColumns(10);
		
		JLabel mssvLabel = new JLabel("MSSV :");
		mssvLabel.setBounds(392, 26, 61, 16);
		panel.add(mssvLabel);
		
		showMSSV = new JTextField();
		showMSSV.setBounds(497, 21, 130, 26);
		panel.add(showMSSV);
		showMSSV.setColumns(10);
		
		JLabel majorLabel = new JLabel("Chuyên Ngành :");
		majorLabel.setBounds(51, 54, 100, 16);
		panel.add(majorLabel);
		
		showMajor = new JTextField();
		showMajor.setColumns(10);
		showMajor.setBounds(158, 49, 190, 26);
		panel.add(showMajor);
		
		JLabel hinhThucHocLabel = new JLabel("Hình Thức Học :");
		hinhThucHocLabel.setBounds(51, 82, 130, 16);
		panel.add(hinhThucHocLabel);
		
		JCheckBox tinChiCheckBox = new JCheckBox("Theo Tín Chỉ");
		tinChiCheckBox.setBounds(158, 78, 180, 23);
		panel.add(tinChiCheckBox);
		
		JCheckBox theoMauCheckBox = new JCheckBox("Theo Chương Trình Mẫu");
		theoMauCheckBox.setBounds(372, 79, 196, 23);
		panel.add(theoMauCheckBox);
		
		JLabel soTCLabel = new JLabel("Số Tín Chỉ :");
		soTCLabel.setBounds(51, 110, 81, 16);
		panel.add(soTCLabel);
		
		showTC = new JTextField();
		showTC.setBounds(158, 105, 130, 26);
		panel.add(showTC);
		showTC.setColumns(10);
		
		JLabel soHPLabel = new JLabel("Số Học Phần");
		soHPLabel.setBounds(394, 113, 116, 16);
		panel.add(soHPLabel);
		
		showHP = new JTextField();
		showHP.setBounds(497, 105, 130, 26);
		panel.add(showHP);
		showHP.setColumns(10);
		
		JButton chinhSuaButton = new JButton("Đặt Lại ");
		chinhSuaButton.setBounds(131, 176, 81, 29);
		panel.add(chinhSuaButton);
		
		JButton xoaSVButton = new JButton("Thêm");
		xoaSVButton.setBounds(497, 176, 92, 29);
		panel.add(xoaSVButton);
		
		JButton themSVButton = new JButton("Xóa");
		themSVButton.setBounds(309, 176, 92, 29);
		panel.add(themSVButton);
		
		JLabel hocPhiLabel = new JLabel("Học Phí :");
		hocPhiLabel.setBounds(51, 138, 61, 16);
		panel.add(hocPhiLabel);
		
		showHocPhi = new JTextField();
		showHocPhi.setBounds(158, 133, 130, 26);
		panel.add(showHocPhi);
		showHocPhi.setColumns(10);
		
		JLabel VNDLabel = new JLabel("(VNĐ)");
		VNDLabel.setBounds(300, 138, 61, 16);
		panel.add(VNDLabel);
		
	}
	
	
}
