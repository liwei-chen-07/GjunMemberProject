package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEx3 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="1234";
		String SQL="select * from member where id>=? and id<=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,user,password);
			PreparedStatement  ps=conn.prepareStatement(SQL);
			ps.setInt(1, 2);
			ps.setInt(2, 6);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			System.out.println("id:"+rs.getInt("id")+
					"\tname:"+rs.getString("name")+
					"\tusername:"+rs.getString("username")+
					"\tpassword:"+rs.getString("password")+
					"\taddress:"+rs.getString("address")+
					"\tphone:"+rs.getString("phone")+
					"\ttype:"+rs.getInt("type"));
			}
			
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
