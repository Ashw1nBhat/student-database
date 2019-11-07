package student_database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class StudentChoice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentChoice frame = new StudentChoice();
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
	public StudentChoice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton AddDetails = new JButton("Add Details");
		AddDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuDetails obj=new StuDetails();
				obj.setVisible(true);
			}
		});
		AddDetails.setFont(new Font("Verdana", Font.BOLD, 12));
		AddDetails.setBackground(Color.GRAY);
		AddDetails.setBounds(142, 70, 145, 38);
		contentPane.add(AddDetails);
				
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow obj=new MainWindow();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Verdana", Font.BOLD, 12));
		btnBack.setBackground(Color.RED);
		btnBack.setBounds(159, 150, 108, 38);
		contentPane.add(btnBack);
	}
}
