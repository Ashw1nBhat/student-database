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

public class StudentEntry extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton BacktoMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentEntry frame = new StudentEntry();
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
	public StudentEntry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterUsn = new JLabel("Enter USN:");
		lblEnterUsn.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblEnterUsn.setBounds(66, 92, 96, 28);
		contentPane.add(lblEnterUsn);
		
		textField = new JTextField();
		textField.setBounds(162, 95, 167, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton USN = new JButton("Next");
		USN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuDetails obj=new StuDetails();
				obj.setVisible(true);
				dispose();
			}
		});
		USN.setFont(new Font("Verdana", Font.BOLD, 12));
		USN.setBackground(Color.GRAY);
		USN.setBounds(239, 168, 111, 34);
		contentPane.add(USN);
		
		BacktoMain = new JButton("Back");
		BacktoMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow obj=new MainWindow();
				obj.setVisible(true);
				dispose();
			}
		});
		BacktoMain.setBackground(Color.RED);
		BacktoMain.setForeground(Color.WHITE);
		BacktoMain.setFont(new Font("Verdana", Font.BOLD, 12));
		BacktoMain.setBounds(93, 168, 111, 34);
		contentPane.add(BacktoMain);
	}
}
