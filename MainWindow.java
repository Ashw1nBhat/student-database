package student_database;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Admin = new JButton("Administrator");
		Admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin obj=new AdminLogin();
				obj.setVisible(true);
				dispose();
			}
		});
		Admin.setBackground(Color.GRAY);
		Admin.setFont(new Font("Verdana", Font.BOLD, 12));
		Admin.setBounds(147, 75, 131, 37);
		contentPane.add(Admin);
		
		JButton Student = new JButton("Student");
		Student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentEntry obj=new StudentEntry();
				obj.setVisible(true);
				dispose();
			}
		});
		Student.setFont(new Font("Verdana", Font.BOLD, 12));
		Student.setBackground(Color.GRAY);
		Student.setBounds(147, 157, 131, 37);
		contentPane.add(Student);
	}
}
