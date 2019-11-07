package student_database;

import java.sql.*;

public class AdminDAO {
	
	 public static Connection getCon() {
		 Connection con=null;
		 try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","0000");
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return con;
	 }
	 
	 

}
