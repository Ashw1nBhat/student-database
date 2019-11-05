package student_database;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StuDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StuDetails frame = new StuDetails();
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
	public StuDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblName.setBounds(54, 55, 87, 24);
		contentPane.add(lblName);
		
		JLabel lblSemester = new JLabel("Semester:");
		lblSemester.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSemester.setBounds(54, 110, 87, 24);
		contentPane.add(lblSemester);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblBranch.setBounds(54, 171, 87, 24);
		contentPane.add(lblBranch);
		
		JLabel lblSection = new JLabel("Section:");
		lblSection.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSection.setBounds(54, 230, 87, 24);
		contentPane.add(lblSection);
		
		JLabel lblEmailid = new JLabel("Email-ID:");
		lblEmailid.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblEmailid.setBounds(54, 289, 87, 24);
		contentPane.add(lblEmailid);
		
		JLabel lblMobileNo = new JLabel("Mobile no:");
		lblMobileNo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMobileNo.setBounds(54, 349, 87, 24);
		contentPane.add(lblMobileNo);
		
		textField = new JTextField();
		textField.setBounds(144, 50, 203, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 109, 203, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(144, 170, 203, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(144, 229, 203, 29);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(144, 288, 203, 29);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(144, 348, 203, 29);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton StuSubmit = new JButton("Submit");
		StuSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		StuSubmit.setBackground(Color.GRAY);
		StuSubmit.setFont(new Font("Verdana", Font.BOLD, 12));
		StuSubmit.setBounds(241, 411, 122, 39);
		contentPane.add(StuSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentEntry obj=new StudentEntry();
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(Color.RED);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Verdana", Font.BOLD, 12));
		btnBack.setBounds(87, 411, 122, 39);
		contentPane.add(btnBack);
	}

}
