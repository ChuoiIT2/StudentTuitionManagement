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

public class StudentView extends JFrame {

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
	 * Create the frame.
	 */
	public StudentView() {
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
				"STT", "Họ Và Tên", "MSSV", "Nguyễn Ngành", "Hình Thức Học", "Số TC", "Số HP", "Học Phí"
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

////// Chỉnh sửa thông tin
class EditInformationView extends JFrame {

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
	


public EditInformationView () {
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
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Sửa Thông Tin Sinh Viên", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		
		JButton huyBoButton = new JButton("Hủy Bỏ");
		huyBoButton.setBounds(131, 176, 81, 29);
		panel.add(huyBoButton);
		
		JButton capNhatButton = new JButton("Cập Nhật");
		capNhatButton.setBounds(497, 176, 92, 29);
		panel.add(capNhatButton);
		
		JButton xoaButton = new JButton("Xóa");
		xoaButton.setBounds(309, 176, 92, 29);
		panel.add(xoaButton);
		
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

//// Lớp thêm sinh viên
class AddStudentView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	/**
	 * Create the frame.
	 */
	public AddStudentView() {
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

// Lớp thống kê

class ReckonStudentView extends JFrame {

	private JPanel contentPane;
	private JTable thonKeTable;
	 /* Create the frame.
	 */
	public ReckonStudentView() {
		setResizable(false);
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 697, 457);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Th\u1ED1ng K\u00EA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel hinhThucHocLabel = new JLabel("Hình Thức Học :");
		hinhThucHocLabel.setBounds(49, 39, 130, 16);
		panel.add(hinhThucHocLabel);
		
		JCheckBox tinChiCheckBox = new JCheckBox("Theo Tín Chỉ");
		tinChiCheckBox.setBounds(148, 36, 110, 23);
		panel.add(tinChiCheckBox);
		
		JCheckBox theoMauCheckBox = new JCheckBox("Theo Chương Trình Mẫu");
		theoMauCheckBox.setBounds(258, 36, 196, 23);
		panel.add(theoMauCheckBox);
		
		thonKeTable = new JTable();
		thonKeTable.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, SystemColor.activeCaption, null, null));
		thonKeTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"STT", "H\u1ECD V\u00E0 T\u00EAn", "MSSV", "Chuy\u00EAn Ng\u00E0nh", "H\u1ECDc Ph\u00ED"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		thonKeTable.getColumnModel().getColumn(0).setPreferredWidth(43);
		thonKeTable.getColumnModel().getColumn(1).setPreferredWidth(127);
		thonKeTable.getColumnModel().getColumn(2).setPreferredWidth(81);
		thonKeTable.getColumnModel().getColumn(3).setPreferredWidth(175);
		thonKeTable.getColumnModel().getColumn(4).setPreferredWidth(137);
		thonKeTable.setBounds(49, 92, 608, 291);
		panel.add(thonKeTable);
		
		JLabel tongLabel = new JLabel("Tổng:");
		tongLabel.setBounds(10, 369, 49, 14);
		panel.add(tongLabel);
		
	}
}


