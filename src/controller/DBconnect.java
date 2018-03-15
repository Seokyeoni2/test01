package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBconnect
 */
@WebServlet("/connect")
public class DBconnect extends HttpServlet {
	private static String driverName = "org.apache.hive.jdbc.HiveDriver";

	public static void connectHive() throws SQLException {
		System.out.println(1);
		try {
			Class.forName(driverName);
			System.out.println(2);
		} catch (ClassNotFoundException e) {
			System.out.println(3);
			e.printStackTrace();
			System.exit(1);
		}
		// replace "hive" here with the name of the user the queries should run as
		Connection con = DriverManager.getConnection("jdbc:hive2://10.1.43.232:10000/default", "kpc", "kpc");
		System.out.println(1);
		String tableName = "nasdaq1";

		Statement stmt = con.createStatement();
		String sql = "select * from " + tableName + " limit 10";
		System.out.println("Running: " + sql);
		ResultSet res = stmt.executeQuery(sql);
		while (res.next()) {
			System.out.println(String.valueOf(
					res.getString(1) + "\t" + res.getString(2) + "\t" + res.getString(3) + "\t" + res.getString(4)
							+ "\t" + res.getString(5) + "\t" + res.getString(6) + "\t" + res.getString(7)));
		}

	}

}
