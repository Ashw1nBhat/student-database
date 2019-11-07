package student_database;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ViewStudent extends JFrame {

	private JPanel contentPane;
	private JTextField Usn;
	private JTextField Name;
	private JTextField Sem;
	private JTextField Branch;
	private JTextField Sec;
	private JTextField Email;
	private JTextField Mob;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStudent frame = new ViewStudent();
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
	public ViewStudent() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblName.setBounds(54, 90, 87, 24);
		contentPane.add(lblName);
		
		JLabel lblSemester = new JLabel("Semester:");
		lblSemester.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSemester.setBounds(54, 145, 87, 24);
		contentPane.add(lblSemester);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblBranch.setBounds(54, 201, 87, 24);
		contentPane.add(lblBranch);
		
		JLabel lblSection = new JLabel("Section:");
		lblSection.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSection.setBounds(54, 254, 87, 24);
		contentPane.add(lblSection);
		
		JLabel lblEmailid = new JLabel("Email-ID:");
		lblEmailid.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblEmailid.setBounds(54, 312, 87, 24);
		contentPane.add(lblEmailid);
		
		JLabel lblMobileNo = new JLabel("Mobile no:");
		lblMobileNo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMobileNo.setBounds(54, 365, 87, 24);
		contentPane.add(lblMobileNo);
		
		
		JLabel LblUSN = new JLabel("Enter USN to view:");
		LblUSN.setFont(new Font("Verdana", Font.PLAIN, 12));
		LblUSN.setBounds(10, 24, 203, 29);
		contentPane.add(LblUSN);
		
		Usn = new JTextField();
		Usn.setBounds(130, 25, 160, 29);
		contentPane.add(Usn);
		Usn.setColumns(10);
		
		Name = new JTextField();
		Name.setBounds(154, 89, 182, 29);
		contentPane.add(Name);
		Name.setColumns(10);
		
		Sem = new JTextField();
		Sem.setBounds(154, 144, 182, 29);
		contentPane.add(Sem);
		Sem.setColumns(10);
		
		Branch = new JTextField();
		Branch.setBounds(154, 200, 182, 29);
		contentPane.add(Branch);
		Branch.setColumns(10);
		
		Sec = new JTextField();
		Sec.setBounds(154, 253, 182, 29);
		contentPane.add(Sec);
		Sec.setColumns(10);
		
		Email = new JTextField();
		Email.setBounds(154, 311, 182, 29);
		contentPane.add(Email);
		Email.setColumns(10);
		
		Mob = new JTextField();
		Mob.setBounds(154, 364, 182, 29);
		contentPane.add(Mob);
		Mob.setColumns(10);
		
		
		JButton btnSubmit = new JButton("Update");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=Name.getText();
				String USN=Usn.getText();
				int sem=Integer.parseInt(Sem.getText());
				String branch=Branch.getText();
				String sec=Sec.getText();
				String email=Email.getText();
				String mobile=Mob.getText();
				
				Student s=new Student(name,USN,sem,branch,sec,email,mobile);
				int status=StudentDAO.update(s);
				
				if(status>0){
					JOptionPane.showMessageDialog(ViewStudent.this,"Student updated successfully!");
					AddStudent obj=new AddStudent();
					obj.setVisible(true);
					dispose();
				}else{
					JOptionPane.showMessageDialog(ViewStudent.this,"Sorry, Unable to add student!");
				}
			}
			}
		);
		btnSubmit.setFont(new Font("Verdana", Font.BOLD, 12));
		btnSubmit.setBackground(Color.GRAY);
		btnSubmit.setBounds(233, 422, 103, 35);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent obj=new AddStudent();
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Verdana", Font.BOLD, 12));
		btnBack.setBackground(Color.RED);
		btnBack.setBounds(82, 422, 103, 35);
		contentPane.add(btnBack);
		
		JButton btnLoadRecord = new JButton("Load Record");
		btnLoadRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String USN=Usn.getText();
				if(USN==null||USN.trim().equals("")){
					JOptionPane.showMessageDialog(ViewStudent.this,"Please enter USN first!");
				}else{			
				Student s=StudentDAO.getStudentByUSN(USN);
				Name.setText(s.getName());
				Email.setText(s.getEmail());
				Sec.setText(s.getSection());
				Sem.setText(String.valueOf(s.getSem()));
				Mob.setText(s.getMobile());
				Branch.setText(s.getBranch());
				}
			}
			}
		);
		btnLoadRecord.setFont(new Font("Verdana", Font.BOLD, 12));
		btnLoadRecord.setBackground(Color.GRAY);
		btnLoadRecord.setBounds(300, 24, 126, 29);
		contentPane.add(btnLoadRecord);
		
		
		
	}
}
