package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestController() {
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			DBconnect.connectHive();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
