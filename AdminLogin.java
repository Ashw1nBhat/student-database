package student_database;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class AdminLogin extends JFrame {

	
	private JPanel contentPane;
	private JTextField AdminName;
	private JPasswordField AdminPass;
	private JButton BktoMn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		AdminName = new JTextField();
		AdminName.setBounds(160, 69, 145, 33);
		contentPane.add(AdminName);
		AdminName.setColumns(10);
		
		AdminPass = new JPasswordField();
		AdminPass.setBounds(160, 117, 145, 33);
		contentPane.add(AdminPass);
		
		JButton AdLogin = new JButton("Login");
		AdLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(AdminName.getText().contentEquals("Admin")&& new String(AdminPass.getPassword()).contentEquals("Admin123"))
				{
					AddStudent obj1=new AddStudent();
					obj1.setVisible(true);
					dispose();
				}
				else JOptionPane.showMessageDialog(null,"Wrong Password or Username");
				
			}
		});
		AdLogin.setBackground(Color.GRAY);
		AdLogin.setFont(new Font("Verdana", Font.BOLD, 12));
		AdLogin.setBounds(237, 187, 109, 33);
		contentPane.add(AdLogin);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel.setBounds(60, 74, 90, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(60, 127, 90, 23);
		contentPane.add(lblNewLabel_1);
		
		BktoMn = new JButton("Back");
		BktoMn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow obj=new MainWindow();
				obj.setVisible(true);
				dispose();
				
			}
		});
		BktoMn.setForeground(Color.WHITE);
		BktoMn.setFont(new Font("Verdana", Font.BOLD, 12));
		BktoMn.setBackground(Color.RED);
		BktoMn.setBounds(98, 187, 109, 33);
		contentPane.add(BktoMn);
	}
}

