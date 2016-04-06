package cn.stu.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtil {
	
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(JdbcUtil.class.getResourceAsStream("/cn/stu/jdbc/jdbc.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//同一个线程同一个连接
	public static Connection getConn(){
		Connection conn = tl.get();
		if(conn == null){
			try {
				Class.forName("");
				conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),
						prop.getProperty("password"));
				tl.set(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	
}
