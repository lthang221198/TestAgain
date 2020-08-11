package bai1;

import java.sql.*;


public class TestJDBC {
	Connection connection = null;
	
	String driverName = "com.mysql.cj.jdbc.Driver";
	
	String serverName="localhost";
	String portNumber = "3306";
	String sid ="dbclass1";
	
	String url = "jdbc:mysql://"+ serverName + ":3306/TestCon";
	
	String username = "root";
	String password = "204658";
	
	public TestJDBC() {}
	
	public boolean doConnection() {
		try {
			Class.forName(driverName);
			
			connection = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: "+e.getMessage());
			return false;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		TestJDBC con = new TestJDBC();
		System.out.println("Connection: "+ con.doConnection());
	}

}







