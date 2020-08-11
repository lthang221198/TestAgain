package bai1;

import java.sql.*;
import java.util.Scanner;

public class TestJDBC {
	Connection connection = null;
	String driverName = "com.mysql.cj.jdbc.Driver";
	String serverName = "localhost";
	String portNumber = "3306";
	String url = "jdbc:mysql://" + serverName + ":3306/TestCon";
	String username = "root";
	String password = "204658";

	public TestJDBC() {
	}

	public boolean doConnection() {
		try {
			Class.forName(driverName);
			// Create a connection to the database
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// Could not find the database driver
			System.out.println("ClassNotFoundException: " + e.getMessage());
			return false;
		} catch (SQLException e) {
			// Could not connect to the database
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
// find data in mySQL
	
	public static void main(String[] args) {
		TestJDBC con = new TestJDBC();
		System.out.println("Connection: " + con.doConnection());

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name ");
		scanner.nextLine();

		String data = con.getCountryNameFromCountry("D");
		if (data != "-1")
			System.out.println(data);
		else
			System.out.println("Error");
	}

	public String getCountryCodeFromCountry(String countryName) {
		String query = "SELECT * FROM country WHERE countryName =" + countryName + "";
		try {
			Statement s = connection.createStatement();
			ResultSet rs = s.executeQuery(query);
			while (rs.next()) {
				String name = rs.getString(1);
				String country = rs.getString(2);
				String province = rs.getString(3);
				String population = rs.getString(4);
				return name + "|" + country + "|" + province + "|" + population;

			}

			s.close();
		} catch (SQLException e) {
			System.out.println(e);
			return "-1";
		}
		return "Not found";
	}
	
	

}
