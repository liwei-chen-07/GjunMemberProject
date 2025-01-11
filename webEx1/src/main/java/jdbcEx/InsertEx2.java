package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEx2 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="1234";
		String SQL="insert into member(name,username,password,address,phone,type) "
				+ "values(?,?,?,?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,user,password);
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, "Ex");
			ps.setString(2, "Sp");
			ps.setString(3, "999");
			ps.setString(4, "宇宙");
			ps.setString(5, "999");
			ps.setInt(6, 3);
			
			ps.executeUpdate();			
			
			System.out.println("success");
		}catch(ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}

	}

}
