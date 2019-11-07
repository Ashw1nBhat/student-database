package student_database;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class StudentTable extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentTable frame = new StudentTable();
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
	public StudentTable() {
		
			
			List<Student> list=StudentDAO.view();
			int size=list.size();
			
			String data[][]=new String[size][7];
			int row=0;
			for(Student s:list){
				data[row][0]=s.getName();
				data[row][1]=s.getUSN();
				data[row][2]=String.valueOf(s.getSem());
				data[row][3]=s.getBranch();
				data[row][4]=s.getSection();
				data[row][5]=s.getEmail();
				data[row][6]=s.getMobile();				
				row++;
			}
			String columnNames[]={"name","USN","sem","branch","section","email","mob"};
			getContentPane().setLayout(null);
			
			JTable jt=new JTable(data,columnNames);
			JScrollPane sp=new JScrollPane(jt);
			sp.setBounds(0, 0, 786, 363);
			getContentPane().add(sp);
			
			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 800, 400);
		}
		
	    
	}


