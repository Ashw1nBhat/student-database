package student_database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class StuDetails extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	private JTextField Sem;
	private JTextField Branch;
	private JTextField Section;
	private JTextField Email;
	private JTextField Mobile;
	private JTextField USN;

	
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
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblName.setBounds(54, 25, 87, 24);
		contentPane.add(lblName);
		
		JLabel lblSemester = new JLabel("Semester:");
		lblSemester.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSemester.setBounds(54, 133, 87, 24);
		contentPane.add(lblSemester);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblBranch.setBounds(54, 185, 87, 24);
		contentPane.add(lblBranch);
		
		JLabel lblSection = new JLabel("Section:");
		lblSection.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSection.setBounds(54, 241, 87, 24);
		contentPane.add(lblSection);
		
		JLabel lblEmailid = new JLabel("Email-ID:");
		lblEmailid.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblEmailid.setBounds(54, 299, 87, 24);
		contentPane.add(lblEmailid);
		
		JLabel lblMobileNo = new JLabel("Mobile no:");
		lblMobileNo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMobileNo.setBounds(54, 349, 87, 24);
		contentPane.add(lblMobileNo);
		
		Name = new JTextField();
		Name.setBounds(144, 24, 203, 29);
		contentPane.add(Name);
		Name.setColumns(10);
		
		Sem = new JTextField();
		Sem.setBounds(144, 132, 203, 29);
		contentPane.add(Sem);
		Sem.setColumns(10);
		
		Branch = new JTextField();
		Branch.setBounds(144, 184, 203, 29);
		contentPane.add(Branch);
		Branch.setColumns(10);
		
		Section = new JTextField();
		Section.setBounds(144, 240, 203, 29);
		contentPane.add(Section);
		Section.setColumns(10);
		
		Email = new JTextField();
		Email.setBounds(144, 298, 203, 29);
		contentPane.add(Email);
		Email.setColumns(10);
		
		Mobile = new JTextField();
		Mobile.setBounds(144, 348, 203, 29);
		contentPane.add(Mobile);
		Mobile.setColumns(10);
		
		JButton StuSubmit = new JButton("Submit");
		StuSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=Name.getText();
				int sem=Integer.parseInt(Sem.getText());
				String branch=Branch.getText();
				String sec=Section.getText();
				String email=Email.getText();
				String mob=Mobile.getText();
				String usn=USN.getText();
				
				Student s=new Student(name,usn,sem,branch,sec,email,mob);
			    int status=StudentDAO.save(s);
			    
			    if(status>0) {
			    	JOptionPane.showMessageDialog(StuDetails.this,"Student added successfully!");
					Name.setText("");
					USN.setText("");
					Sem.setText("");
					Branch.setText("");
					Section.setText("");
					Email.setText("");
					Mobile.setText("");
					
				}else{
					JOptionPane.showMessageDialog(StuDetails.this,"Sorry, Unable to add student!");
				}
			    }
				
				
			}
		);
		StuSubmit.setBackground(Color.GRAY);
		StuSubmit.setFont(new Font("Verdana", Font.BOLD, 12));
		StuSubmit.setBounds(241, 411, 122, 39);
		contentPane.add(StuSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentChoice obj=new StudentChoice();
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(Color.RED);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Verdana", Font.BOLD, 12));
		btnBack.setBounds(87, 411, 122, 39);
		contentPane.add(btnBack);
		
		JLabel Usn = new JLabel("USN:");
		Usn.setFont(new Font("Verdana", Font.PLAIN, 12));
		Usn.setBounds(54, 76, 87, 24);
		contentPane.add(Usn);
		
		
		USN = new JTextField();
		USN.setBounds(144, 75, 203, 29);
		contentPane.add(USN);
		USN.setColumns(10);
		
	}
}
