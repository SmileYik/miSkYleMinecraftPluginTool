package com.github.miskyle.mcpt.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.github.miskyle.mcpt.server.Logger;

public class MySQLManager {
	private static String url;
	private static String userName;
	private static String password;
	private static Connection connection;
	
	public static void setupMySQl(String host,int port,
			String database,String userName,String userPassword) {
		url  = "jdbc:mysql://" + host + ":" + port + "/" 
							+ database + "?autoReconnect=true";
		MySQLManager.userName = userName;
		MySQLManager.password = userPassword;
	}
	
	public static boolean connect() {
		try {
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			Logger.logger.warning("MySQL 连接失败. 将使用YAML储存数据");
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static PreparedStatement execute(String sql) {
		try {
			return connection.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void disconnect() {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
