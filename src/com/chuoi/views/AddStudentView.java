package com.chuoi.views;

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

public class AddStudentView extends JFrame {

	private JPanel contentPane;
	private JTextField nameInput;
	private JTextField studentCodeInput;
	private JTextField majorInput;
	private JTextField creditCountInput;
	private JTextField subjectCountInput;

	
	public AddStudentView() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 11, 623, 198);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Nh\u1EADp Th\u00F4ng Tin Sinh Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel nameLabel = new JLabel("Họ Và Tên");
		nameLabel.setBounds(51, 26, 81, 16);
		panel.add(nameLabel);
		
		nameInput = new JTextField();
		nameInput.setBounds(158, 21, 190, 26);
		panel.add(nameInput);
		nameInput.setColumns(10);
		
		JLabel StudentLabel = new JLabel("MSSV :");
		StudentLabel.setBounds(392, 26, 61, 16);
		panel.add(StudentLabel);
		
		studentCodeInput = new JTextField();
		studentCodeInput.setBounds(440, 21, 116, 26);
		panel.add(studentCodeInput);
		studentCodeInput.setColumns(10);
		
		JLabel majorLabel = new JLabel("Chuyên Ngành :");
		majorLabel.setBounds(51, 54, 100, 16);
		panel.add(majorLabel);
		
		majorInput = new JTextField();
		majorInput.setBounds(158, 49, 190, 26);
		majorInput.setColumns(10);
		panel.add(majorInput);
		
		JLabel studyProgramIdLabel = new JLabel("Hình Thức Học");
		studyProgramIdLabel.setBounds(51, 82, 130, 16);
		panel.add(studyProgramIdLabel);
		
		JCheckBox theoTCCheckBox = new JCheckBox("Theo Tín Chỉ");
		theoTCCheckBox.setBounds(158, 78, 130, 23);
		panel.add(theoTCCheckBox);
		
		JCheckBox theoMauCheckBox = new JCheckBox("Theo Chương Trình Mẫu");
		theoMauCheckBox.setBounds(288, 79, 196, 23);
		panel.add(theoMauCheckBox);
		
		JLabel creditCountLabel = new JLabel("Số Tín Chỉ");
		creditCountLabel.setBounds(51, 110, 81, 16);
		panel.add(creditCountLabel);
		
		creditCountInput = new JTextField();
		creditCountInput.setBounds(158, 105, 89, 26);
		panel.add(creditCountInput);
		creditCountInput.setColumns(10);
		
		JLabel subjectCountLabel = new JLabel("Số Học Phần");
		subjectCountLabel.setBounds(341, 110, 89, 16);
		panel.add(subjectCountLabel);
		
		subjectCountInput = new JTextField();
		subjectCountInput.setBounds(440, 109, 116, 26);
		panel.add(subjectCountInput);
		subjectCountInput.setColumns(10);
		
		JButton ResetButton = new JButton("\u0110\u1EB7t L\u1EA1i");
		ResetButton.setBounds(168, 155, 89, 23);
		panel.add(ResetButton);
		
		JButton saveButton = new JButton("L\u01B0u");
		saveButton.setBounds(329, 155, 89, 23);
		panel.add(saveButton);
		
	}
}







