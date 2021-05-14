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
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;

public class ThongKe extends JFrame {

	private JPanel contentPane;
	private JTable thonKeTable;

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
	public ThongKe() {
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
