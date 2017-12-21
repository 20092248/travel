package com.infotel.travel.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.infotel.travel.exceptions.TravelException;
import com.infotel.travel.model.Accomodation;

public class AbstractDaoJdbc {

	static Connection cnx = null;

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		if (cnx == null) {
			String url = "jdbc:mysql://localhost:3306/travel";
			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection(url, "root", "");
			cnx.setAutoCommit(true);
		}
		return cnx;
	}

	protected void close(Connection cn, Statement st, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
		}

		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
		}

		try {
			if (cn != null)
				cn.close();
		} catch (SQLException e) {
		}
	}

}
