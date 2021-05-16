package com.chuoi.views;

import com.chuoi.models.Student;
import com.chuoi.configs.Constant;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.util.List;

public class StudentView {
	//tạo các attribute liên quan
	private JFrame frame;
	private JPanel studentPanel,tablePanel;
	private JTable table;
	private JScrollPane scrollTable;
	private JTextField setName;
	private JTextField setMajor;
	private JTextField setStudentCode;
	private JRadioButton creditSelected,subjectSelected;
	private JTextField setCredit;
	private JTextField setSubject;
	private JLabel creditLabel;
	private JLabel subjectLabel;
	private JButton addButton;
	private JButton deleteButton;
	private JButton editButton;
	private JButton findingButton;
	private ButtonGroup buttonGroup;
	private DefaultTableModel model;
	
	private Object [] column = {"MSSV", "Họ và tên", "Chuyên ngành", "Hình thức học" , "Số TC", "Số HP", "Học phí"};
	
	private int studyProgramID = Constant.DEFAULT_STUDY_PROGRAM_ID;
	
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
		
		//tạo panel chứa table
		tablePanel = new JPanel();
		tablePanel.setBounds(12, 321, 735, 386);
		tablePanel.setBorder(new TitledBorder(null, "Danh sách sinh viên", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(tablePanel);
		tablePanel.setLayout(null);
		// panel chứa thông tin sinh viên
		studentPanel = new JPanel();
		studentPanel.setBounds(12, 12, 735, 297);
		studentPanel.setBorder(new TitledBorder(null, "Thông tin sinh viên", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(studentPanel);
		studentPanel.setLayout(null);
		
		// gọi các method làm các chức năng
		setStudentTable();
		setContentPanel();
		frame.setVisible(false);
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
		
		setStudentCode = new JTextField();
		setStudentCode.setColumns(10);
		setStudentCode.setBounds(514, 26, 130, 26);
		setStudentCode.setVisible(true);
		studentPanel.add(setStudentCode);
		
		creditSelected = new JRadioButton("Theo Tín Chỉ");
		creditSelected.setFont(new Font("Dialog", Font.BOLD, 12));
		creditSelected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(creditSelected.isSelected())
				{
					studyProgramID= Constant.STUDY_PROGRAM_CREDIT_ID;
					setCredit.setText("");
					setSubject.setText("0");
					setCredit.setEnabled(true);
					setSubject.setEnabled(false);
				}
			}
		});
		creditSelected.setBounds(148, 110, 184, 31);
		studentPanel.add(creditSelected);
		
		subjectSelected = new JRadioButton("Theo Chương Trình Mẫu");
		subjectSelected.setFont(new Font("Dialog", Font.BOLD, 12));
		subjectSelected.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(subjectSelected.isSelected())
				{
					studyProgramID = Constant.STUDY_PROGRAM_MODEL_ID;
					setSubject.setText("");
					setCredit.setText("0");
					setSubject.setEnabled(true);
					setCredit.setEnabled(false);
				}
			}
		});
		subjectSelected.setBounds(394, 110, 222, 31);
		studentPanel.add(subjectSelected);
		
		buttonGroup = new ButtonGroup();
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
		//tạo các JLabel, những cái này ko dùng nhiều, nên có thể tạo local
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
		//tạo các button và sự kiện liên quan
		addButton = new JButton("Thêm");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addButtonListener(this);
			}
		});
		addButton.setBounds(41, 221, 137, 25);
		studentPanel.add(addButton);
		
		deleteButton = new JButton("Xóa");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteButton.setBounds(378, 221, 137, 25);
		studentPanel.add(deleteButton);
		
		editButton = new JButton("Sửa");
		editButton.setBounds(208, 221, 137, 25);
		studentPanel.add(editButton);
		
		findingButton = new JButton("Tìm");
		findingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		findingButton.setBounds(548, 221, 137, 25);
		studentPanel.add(findingButton);
	}
	//method tạo bảng danh sách sinh viên
	private void setStudentTable()
	{
		//tạo ScrollPane chứa table, có thể co/kéo thanh công cụ tùy ý và tạo scroll cho table
		scrollTable = new JScrollPane();
		scrollTable.setBounds(12, 29, 711, 345);
		tablePanel.add(scrollTable);
		
		table = new JTable() {
			/**
			 * @author kiennt
			 * 
			 * disable edit cell in table,set to read only
			 */
			private static final long serialVersionUID = 1L;

			public boolean editCellAt(int row,int column, java.util.EventObject e) {
				return false;
			}
		};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		scrollTable.setViewportView(table);
		//tạo sự kiện cho table
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				/*
				 * Nhấn vào các hàng để lấy dữ liệu sinh viên 
				 * */
				int selectedRow = table.getSelectedRow();
				setStudentCode.setText(model.getValueAt(selectedRow, 0).toString());
				setName.setText(model.getValueAt(selectedRow, 1).toString());
				setMajor.setText(model.getValueAt(selectedRow, 2).toString());
				if(model.getValueAt(selectedRow, 3).toString().equals("Tín chỉ"))
				{
					creditSelected.setSelected(true);
				}
				else if(model.getValueAt(selectedRow, 3).toString().equals("Chương trình mẫu"))
				{
					subjectSelected.setSelected(true);
				}
				else {
					buttonGroup.clearSelection();
				}
				setCredit.setText(model.getValueAt(selectedRow, 4).toString());
				setSubject.setText(model.getValueAt(selectedRow, 5).toString());


			}
		});
		
	}
	public Student getStudentInfo() {
		String studentCode = setStudentCode.getText();
		String studentName = setName.getText();
		String studentMajor = setMajor.getText();
		int studyProgramID = this.studyProgramID;
		int studentCredit = Integer.parseInt(setCredit.getText().trim());
		int studentSubject = Integer.parseInt(setSubject.getText().trim());
		Student student = new Student(studentCode, studentName, studentMajor, studyProgramID, studentCredit, studentSubject);
		return student;
	}
	
	public void showListStudent(List<Student> studentList)
	{
		int size = studentList.size();
		/*
		 * Khởi tạo lại model
		 * 
		 * */
		model = new DefaultTableModel();
		model.setColumnIdentifiers(column);
		table.setModel(model);
		Object [][] students = new Object[size][7];
		for(int i=0;i<size;i++)
		{
			students[i][0]=studentList.get(i).getStudentCode();
			students[i][1]=studentList.get(i).getName();
			students[i][2]=studentList.get(i).getMajor();
			if(studentList.get(i).getStudyProgramId()==1)
			{
				students[i][3]="Tín chỉ";
			}
			else if(studentList.get(i).getStudyProgramId()==2) {
				students[i][3]="Chương trình mẫu";
			}
			else {
				students[i][3]="Chọn đi";	
			}
			students[i][4]=studentList.get(i).getCreditCount();
			students[i][5]=studentList.get(i).getSubjectCount();
			model.addRow(students[i]);
		}
	}
	
	public void showMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	public String getDeleteOption()
	{
		String idSelect = JOptionPane.showInputDialog(frame, "Nhập MSSV muốn xóa: ","Xóa sinh viên",JOptionPane.DEFAULT_OPTION);
		return idSelect;
	}
	
	public String searchByName()
	{	
		String name = JOptionPane.showInputDialog(frame,"Nhập tên muốn tìm: ","Tìm kiếm bằng tên",JOptionPane.DEFAULT_OPTION);
		return name;
	}
	public void clearAllContent()
	{
		setName.setText("");
		setMajor.setText("");
		setStudentCode.setText("");
		buttonGroup.clearSelection();
		setCredit.setEnabled(true);
		setCredit.setText("");
		setSubject.setEnabled(true);
		setSubject.setText("");
	}
	// method các sự kiện của các phím chức năng
	public void addButtonListener(ActionListener listener)
	{
		addButton.addActionListener(listener);
	}
	
	
	public void deleteButtonListener(ActionListener listener)
	{
		deleteButton.addActionListener(listener);
	}
	
	public void editButtonListener(ActionListener listener)
	{
		editButton.addActionListener(listener);
	}
	
	public void findingButtonListener(ActionListener listener)
	{
		findingButton.addActionListener(listener);
	}
	public void setFrameVisible()
	{
		frame.setVisible(true);
	}
	

}
