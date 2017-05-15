package StatementsPreparedStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*CREATE TABLE public.Users (
		  id serial NOT NULL PRIMARY KEY,
		  name varchar(20) NOT NULL DEFAULT '',
		  email varchar(20) NOT NULL DEFAULT '',
		  country varchar(20) DEFAULT 'INDIA',
		  password varchar(20) NOT NULL DEFAULT ''
		) ;

		INSERT INTO public.Users (id, name, email, country, password)
		VALUES
			(1, 'Abhishek', 'abc@apple.com', 'INDIA', 'abhishek123'),
			(4, 'Neha', 'neha@gmail.com', 'INDIA', 'david123'),
			(5, 'Cherry', 'cherry@google.com', '', 'cherry123');*/

public class DBConnection {

/*	public final static String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public final static String DB_URL = "jdbc:mysql://localhost:3306/UserDB";
	public final static String DB_USERNAME = "pankaj";
	public final static String DB_PASSWORD = "pankaj123";*/

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		/* // load the Driver Class
		Class.forName(DB_DRIVER_CLASS);
		// create the connection now
		con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);*/
		
		
		Class.forName("org.postgresql.Driver");
		Connection connection = null;
		connection = DriverManager.getConnection(
		   "jdbc:postgresql://localhost:5432/postgres","postgres", "password");
		//connection.close();
		System.out.println("DB Connection created successfully");
		return connection;
	}
}