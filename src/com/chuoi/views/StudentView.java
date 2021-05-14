package com.chuoi.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
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
import javax.swing.border.SoftBevelBorder;
import java.awt.Font;

public class StudentView extends JFrame {

	private JPanel contentPane;
	private JTextField nameShow;
	private JTextField studentCodeShow;
	private JTextField majorShow;
	private JTextField creditCountShow;
	private JTextField subjectCountShow;
	private JTable showListSV;
	private JTextField tuitionShow;
	private JTextField inputSearch;
	private JTextField totalTuitionShow;
	private JTextField totalStudentShow;
	
	public StudentView() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 11, 741, 224);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Th\u00F4ng Tin Sinh Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel nameLaybel = new JLabel("Họ Và Tên");
		nameLaybel.setBounds(51, 26, 81, 16);
		panel.add(nameLaybel);
		
		nameShow = new JTextField();
		nameShow.setBounds(158, 21, 190, 26);
		panel.add(nameShow);
		nameShow.setColumns(10);
		
		JLabel studentCodeLabel = new JLabel("MSSV :");
		studentCodeLabel.setBounds(392, 26, 61, 16);
		panel.add(studentCodeLabel);
		
		studentCodeShow = new JTextField();
		studentCodeShow.setBounds(497, 21, 130, 26);
		panel.add(studentCodeShow);
		studentCodeShow.setColumns(10);
		
		JLabel majorLabel = new JLabel("Chuyên Ngành :");
		majorLabel.setBounds(51, 54, 100, 16);
		panel.add(majorLabel);
		
		majorShow = new JTextField();
		majorShow.setBounds(158, 49, 190, 26);
		majorShow.setColumns(10);
		panel.add(majorShow);
		
		JLabel studyProgramIdLabel = new JLabel("Hình Thức Học");
		studyProgramIdLabel.setBounds(51, 82, 130, 16);
		panel.add(studyProgramIdLabel);
		
		JCheckBox creditCheckBox = new JCheckBox("Theo Tín Chỉ");
		creditCheckBox.setBounds(158, 78, 180, 23);
		panel.add(creditCheckBox);
		
		JCheckBox subjectCheckBox = new JCheckBox("Theo Chương Trình Mẫu");
		subjectCheckBox.setBounds(365, 78, 196, 23);
		panel.add(subjectCheckBox);
		
		JLabel creditCountCLabel = new JLabel("Số Tín Chỉ");
		creditCountCLabel.setBounds(51, 110, 81, 16);
		panel.add(creditCountCLabel);
		
		creditCountShow = new JTextField();
		creditCountShow.setBounds(158, 105, 130, 26);
		panel.add(creditCountShow);
		creditCountShow.setColumns(10);
		
		JLabel subjectCountLabel = new JLabel("Số Học Phần");
		subjectCountLabel.setBounds(394, 113, 116, 16);
		panel.add(subjectCountLabel);
		
		subjectCountShow = new JTextField();
		subjectCountShow.setBounds(497, 105, 130, 26);
		panel.add(subjectCountShow);
		subjectCountShow.setColumns(10);
		
		JButton editButton = new JButton("Chỉnh Sửa");
		editButton.setBounds(91, 176, 100, 29);
		panel.add(editButton);
		
		JButton deleteButton = new JButton("Xóa Sinh Viên");
		deleteButton.setBounds(238, 176, 100, 29);
		panel.add(deleteButton);
		
		JButton addButton = new JButton("+ Sinh Viên Mới");
		addButton.setBounds(554, 176, 116, 29);
		panel.add(addButton);
		
		JLabel tuitionLabel = new JLabel("Học Phí");
		tuitionLabel.setBounds(51, 138, 61, 16);
		panel.add(tuitionLabel);
		
		tuitionShow = new JTextField();
		tuitionShow.setBounds(158, 133, 130, 26);
		panel.add(tuitionShow);
		tuitionShow.setColumns(10);
		
		JLabel unitLabel = new JLabel("(VNĐ)");
		unitLabel.setBounds(300, 138, 61, 16);
		panel.add(unitLabel);
		
		JButton saveButton = new JButton("Lưu");
		saveButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		saveButton.setBounds(394, 176, 92, 29);
		panel.add(saveButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Danh S\u00E1ch Sinh Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(6, 247, 759, 419);
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
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "H\u1ECD V\u00E0 T\u00EAn", "MSSV", "Nguy\u1EC5n Ng\u00E0nh", "H\u00ECnh Th\u1EE9c H\u1ECDc", "S\u1ED1 TC", "S\u1ED1 HP", "H\u1ECDc Ph\u00ED (VN\u0110)"
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
		showListSV.setBounds(27, 58, 710, 359);
		panel_1.add(showListSV);
		
		JButton searchButton = new JButton("Tìm Kiếm");
		searchButton.setBounds(27, 16, 109, 29);
		panel_1.add(searchButton);
		
		JComboBox searchComboBox = new JComboBox();
		searchComboBox.setModel(new DefaultComboBoxModel(new String[] {"Tên", "MSSV", "Số Tín Chỉ"}));
		searchComboBox.setBounds(146, 17, 117, 27);
		panel_1.add(searchComboBox);
		
		inputSearch = new JTextField();
		inputSearch.setBounds(276, 17, 181, 26);
		panel_1.add(inputSearch);
		inputSearch.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hiển Thị Theo :");
		lblNewLabel.setBounds(485, 20, 95, 27);
		panel_1.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tất Cả Hình Thức", "SV Theo TC", "SV Theo CT Mẫu"}));
		comboBox.setBounds(590, 16, 140, 31);
		panel_1.add(comboBox);
		
		totalTuitionShow = new JTextField();
		totalTuitionShow.setBounds(548, 677, 147, 20);
		contentPane.add(totalTuitionShow);
		totalTuitionShow.setColumns(10);
		
		JLabel totalTuitionLabel = new JLabel("Tổng Học Phí (VNĐ)");
		totalTuitionLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		totalTuitionLabel.setBounds(389, 667, 149, 36);
		contentPane.add(totalTuitionLabel);
		
		JLabel totalSudentLabel = new JLabel("Số Lượng Sinh Viên :");
		totalSudentLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		totalSudentLabel.setBounds(57, 675, 164, 20);
		contentPane.add(totalSudentLabel);
		
		totalStudentShow = new JTextField();
		totalStudentShow.setBounds(245, 677, 88, 20);
		contentPane.add(totalStudentShow);
		totalStudentShow.setColumns(10);
		
	}
	public JTable getTable_1() {
		return showListSV;
	}
}







