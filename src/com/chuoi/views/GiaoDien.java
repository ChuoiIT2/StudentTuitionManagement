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

public class GiaoDien extends JFrame {

	private JPanel contentPane;
	private JTextField showName;
	private JTextField showMSSV;
	private JTextField showMajor;
	private JTextField showTC;
	private JTextField showHP;
	private JTable showListSV;
	private JTextField showHocPhi;
	private JTextField inputSearch;

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
	public GiaoDien() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 18, 741, 217);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Th\u00F4ng Tin Sinh Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel hoVaTenLaybel = new JLabel("Họ Và Tên");
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
		
		JLabel hinhThucHocLabel = new JLabel("Hình Thức Học");
		hinhThucHocLabel.setBounds(51, 82, 130, 16);
		panel.add(hinhThucHocLabel);
		
		JCheckBox tinChiCheckBox = new JCheckBox("Theo Tín Chỉ");
		tinChiCheckBox.setBounds(158, 78, 180, 23);
		panel.add(tinChiCheckBox);
		
		JCheckBox theoMauCheckBox = new JCheckBox("Theo Chương Trình Mẫu");
		theoMauCheckBox.setBounds(365, 78, 196, 23);
		panel.add(theoMauCheckBox);
		
		JLabel soTCLabel = new JLabel("Số Tín Chỉ");
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
		
		JButton chinhSuaButton = new JButton("Chỉnh Sửa");
		chinhSuaButton.setBounds(95, 176, 117, 29);
		panel.add(chinhSuaButton);
		
		JButton xoaSVButton = new JButton("Xóa Sinh Viên");
		xoaSVButton.setBounds(266, 176, 117, 29);
		panel.add(xoaSVButton);
		
		JButton themSVButton = new JButton("+ Sinh Viên Mới");
		themSVButton.setBounds(447, 176, 163, 29);
		panel.add(themSVButton);
		
		JLabel hocPhiLabel = new JLabel("Học Phí");
		hocPhiLabel.setBounds(51, 138, 61, 16);
		panel.add(hocPhiLabel);
		
		showHocPhi = new JTextField();
		showHocPhi.setBounds(158, 133, 130, 26);
		panel.add(showHocPhi);
		showHocPhi.setColumns(10);
		
		JLabel VNDLabel = new JLabel("(VNĐ)");
		VNDLabel.setBounds(300, 138, 61, 16);
		panel.add(VNDLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Danh S\u00E1ch Sinh Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(6, 247, 759, 313);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		showListSV = new JTable();
		showListSV.setBorder(new LineBorder(new Color(0, 0, 0)));
		showListSV.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "H\u1ECD V\u00E0 T\u00EAn", "MSSV", "Chuy\u00EAn Ng\u00E0nh", "H\u00ECnh Th\u1EE9c H\u1ECDc", "S\u1ED1 TC", "S\u1ED1 HP", "H\u1ECDc Ph\u00ED"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, String.class, String.class, Integer.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		showListSV.getColumnModel().getColumn(0).setPreferredWidth(38);
		showListSV.getColumnModel().getColumn(1).setPreferredWidth(127);
		showListSV.getColumnModel().getColumn(2).setPreferredWidth(60);
		showListSV.getColumnModel().getColumn(3).setPreferredWidth(129);
		showListSV.getColumnModel().getColumn(4).setPreferredWidth(144);
		showListSV.getColumnModel().getColumn(5).setPreferredWidth(47);
		showListSV.getColumnModel().getColumn(6).setPreferredWidth(45);
		showListSV.getColumnModel().getColumn(7).setPreferredWidth(116);
		showListSV.setBounds(27, 58, 710, 238);
		panel_1.add(showListSV);
		
		JButton searchButton = new JButton("Tìm Kiếm");
		searchButton.setBounds(27, 16, 109, 29);
		panel_1.add(searchButton);
		
		JComboBox searchComboBox = new JComboBox();
		searchComboBox.setModel(new DefaultComboBoxModel(new String[] {"Tên", "MSSV", "Số Tín Chỉ"}));
		searchComboBox.setBounds(163, 20, 117, 27);
		panel_1.add(searchComboBox);
		
		inputSearch = new JTextField();
		inputSearch.setBounds(301, 21, 181, 26);
		panel_1.add(inputSearch);
		inputSearch.setColumns(10);
		
	}
	public JTable getTable_1() {
		return showListSV;
	}
}
