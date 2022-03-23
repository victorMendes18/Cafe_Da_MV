package br.com.controle;

import java.sql.Connection;


public class conectar {
	
	private static final String USERNAME = "Milena";
	
	private static final String PASSWORD ="Banco.01";
	
	private static final String DATABASE_URL = "jbdc:mysql://localhost:3306/teste";
	
	public static Connection  createConnectionToMySQL() {
		Class.forName("com.msql.jdbc.driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
	}
}
