package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEx {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="1234";
		String SQL="insert into member(name,username,password,address,phone,type) "
				+"values('abc','rr','123','台北市','100',1)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,user,password);
			Statement st=conn.createStatement();
			st.executeUpdate(SQL);
			System.out.println("success");
			
		}catch(ClassNotFoundException e){
			System.out.println("no Driver");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();	
		}

	}

}
