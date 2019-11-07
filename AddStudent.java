package student_database;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

@SuppressWarnings("serial")
public class AddStudent extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent frame = new AddStudent();
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
	public AddStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ViewDB = new JButton("View Database");
		ViewDB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				StudentTable obj=new StudentTable();
				obj.setVisible(true);
			}
			});
		ViewDB.setBackground(Color.GRAY);
		ViewDB.setFont(new Font("Verdana", Font.BOLD, 12));
		ViewDB.setBounds(150, 44, 139, 43);
		contentPane.add(ViewDB);
		
		JButton EditDB = new JButton("Edit Database");
		EditDB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStudent obj=new ViewStudent();
				obj.setVisible(true);
			}
			});
		EditDB.setFont(new Font("Verdana", Font.BOLD, 12));
		EditDB.setBackground(Color.GRAY);
		EditDB.setBounds(150, 116, 139, 43);
		contentPane.add(EditDB);
		
		JButton BacktoALgn = new JButton("Back");
		BacktoALgn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin obj=new AdminLogin();
				obj.setVisible(true);
				dispose();
			}
		});
		BacktoALgn.setForeground(Color.WHITE);
		BacktoALgn.setFont(new Font("Verdana", Font.BOLD, 12));
		BacktoALgn.setBackground(Color.RED);
		BacktoALgn.setBounds(150, 190, 139, 43);
		contentPane.add(BacktoALgn);
		
		
	}
}
