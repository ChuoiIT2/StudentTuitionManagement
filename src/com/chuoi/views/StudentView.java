package com.kiennt.ex6;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class StudentView {
	private JFrame frame;
	private JPanel studentPanel,tablePanel;
	private JTable table;
	private JScrollPane scrollTable;
	private DefaultTableModel model;
	private JTextField setName;
	private JTextField setMajor;
	private JTextField setID;
	
	private JRadioButton creditSelected,subjectSelected;
	private JTextField setCredit;
	private JTextField setSubject;
	private JLabel creditLabel;
	private JLabel subjectLabel;
	
	private Object [] column = {"MSSV", "Họ và tên", "Chuyên ngành", "Hình thức học" , "Số TC", "Số HP", "Học phí"};
	private Object [] data = new Object[0];
	public StudentView()
	{
		initialize();
	}
	private void initialize()
	{
		//set main frame
		frame = new JFrame();
		frame.setBounds(100, 100, 770, 750);
		frame.setTitle("Quản lý học phí sinh viên");
		frame.getContentPane().setLayout(null);
		
		//set 
		tablePanel = new JPanel();
		tablePanel.setBounds(12, 321, 735, 386);
		tablePanel.setBorder(new TitledBorder(null, "Danh sách sinh viên", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(tablePanel);
		tablePanel.setLayout(null);
		
		studentPanel = new JPanel();
		studentPanel.setBounds(12, 12, 735, 297);
		studentPanel.setBorder(new TitledBorder(null, "Thông tin sinh viên", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(studentPanel);
		studentPanel.setLayout(null);
		
		setStudentTable();
		setContentPanel();
		frame.setVisible(true);
		frame.setResizable(false);
	}
	// set label and other component
	private void setContentPanel()
	{
		setName = new JTextField();
		setName.setBounds(151, 26, 209, 26);
		studentPanel.add(setName);
		setName.setColumns(10);
		
		setMajor = new JTextField();
		setMajor.setColumns(10);
		setMajor.setBounds(151, 76, 209, 26);
		studentPanel.add(setMajor);
		
		setID = new JTextField();
		setID.setColumns(10);
		setID.setBounds(514, 26, 130, 26);
		setID.setVisible(true);
		studentPanel.add(setID);
		
		creditSelected = new JRadioButton("Theo Tín Chỉ");
		creditSelected.setFont(new Font("Dialog", Font.BOLD, 12));
		creditSelected.setBounds(148, 110, 184, 31);
		studentPanel.add(creditSelected);
		
		subjectSelected = new JRadioButton("Theo Chương Trình Mẫu");
		subjectSelected.setFont(new Font("Dialog", Font.BOLD, 12));
		subjectSelected.setBounds(394, 110, 222, 31);
		studentPanel.add(subjectSelected);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(creditSelected);
		buttonGroup.add(subjectSelected);
		
		setCredit = new JTextField();
		setCredit.setColumns(10);
		setCredit.setBounds(152, 159, 76, 26);
		studentPanel.add(setCredit);
		
		setSubject = new JTextField();
		setSubject.setColumns(10);
		setSubject.setBounds(515, 159, 76, 26);
		studentPanel.add(setSubject);
		
		JLabel nameLabel = new JLabel("Họ và tên : ");
		nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nameLabel.setBounds(28, 26, 105, 26);
		studentPanel.add(nameLabel);
		
		JLabel majorLabel = new JLabel(" Chuyên ngành : ");
		majorLabel.setBounds(12, 74, 130, 26);
		studentPanel.add(majorLabel);
		
		JLabel studyProgramLabel = new JLabel("Hình thức học :");
		studyProgramLabel.setHorizontalAlignment(SwingConstants.LEFT);
		studyProgramLabel.setBounds(22, 112, 111, 26);
		studentPanel.add(studyProgramLabel);
		
		JLabel idLabel = new JLabel("MSSV : ");
		idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		idLabel.setBounds(406, 26, 105, 26);
		studentPanel.add(idLabel);
		
		creditLabel = new JLabel("      Số tín chỉ : ");
		creditLabel.setHorizontalAlignment(SwingConstants.LEFT);
		creditLabel.setBounds(28, 158, 105, 26);
		studentPanel.add(creditLabel);
		
		subjectLabel = new JLabel(" Số học phần : ");
		subjectLabel.setHorizontalAlignment(SwingConstants.LEFT);
		subjectLabel.setBounds(406, 158, 105, 26);
		studentPanel.add(subjectLabel);
		
		JButton addButton = new JButton("Thêm");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addRow(data);
			}
		});
		addButton.setBounds(41, 221, 137, 25);
		studentPanel.add(addButton);
		
		JButton deleteButton = new JButton("Xóa");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteButton.setBounds(378, 221, 137, 25);
		studentPanel.add(deleteButton);
		
		JButton editButton = new JButton("Sửa");
		editButton.setBounds(208, 221, 137, 25);
		studentPanel.add(editButton);
		
		JButton tuitionButton = new JButton("Tính học phí");
		tuitionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		tuitionButton.setBounds(548, 221, 137, 25);
		studentPanel.add(tuitionButton);
	}
	private void setStudentTable()
	{
		scrollTable = new JScrollPane();
		scrollTable.setBounds(12, 29, 711, 345);
		tablePanel.add(scrollTable);
		
		table = new JTable();
		model = new DefaultTableModel();
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollTable.setViewportView(table);
		
	}
	
}
