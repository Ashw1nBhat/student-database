package student_database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	
	public static int save(Student s){
		int status=0;
		try{
			Connection con=AdminDAO.getCon();
			PreparedStatement ps=con.prepareStatement("insert into student_db(name,USN,sem,branch,sec,email,mob) values(?,?,?,?,?,?,?)");
			ps.setString(1,s.getName());
			ps.setString(2,s.getUSN());
			ps.setInt(3,s.getSem());
			ps.setString(4,s.getBranch());
			ps.setString(5,s.getSection());
			ps.setString(6,s.getEmail());
			ps.setString(7,s.getMobile());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static int update(Student s){
		int status=0;
		try{
			Connection con=AdminDAO.getCon();
			PreparedStatement ps=con.prepareStatement("update student_db set name=?,sem=?,branch=?,sec=?,email=?,mob=? where USN=?");
			ps.setString(1,s.getName());
			ps.setInt(2, s.getSem());
			ps.setString(3, s.getBranch());
			ps.setString(4,s.getSection());
			ps.setString(5,s.getEmail());
			ps.setString(6, s.getMobile());
			ps.setString(7, s.getUSN());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static Student getStudentByUSN(String USN){
		Student s=new Student();
		
		try{
			Connection con=AdminDAO.getCon();
			PreparedStatement ps=con.prepareStatement("select * from student_db where USN=?");
			ps.setString(1,USN);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				s.setName(rs.getString("name"));
				s.setUSN(rs.getString("USN"));
				s.setSem(rs.getInt("sem"));
				s.setBranch(rs.getString("branch"));
				s.setSection(rs.getString("sec"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getString("mob"));
			}
			
			con.close();
		}catch(Exception e){System.out.println(e);}
		return s;
	}
	
	public static List<Student> view(){
		List<Student> list=new ArrayList<Student>();
		try{
			Connection con=AdminDAO.getCon();
			PreparedStatement ps=con.prepareStatement("select * from student_db");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student s=new Student();
				s.setName(rs.getString("name"));
				s.setUSN(rs.getString("USN"));
				s.setSem(rs.getInt("sem"));
				s.setBranch(rs.getString("branch"));
				s.setSection(rs.getString("sec"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getString("mob"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	
	

}
