package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {
	
	private String ip;
	private String port;
	private String login;
	private String password;
	private String nameDB;
	
	private Connection connection;
	
	
	//construtor
	public ConnectionMySQL(String ip, String port, String login, String password, String nameDB) {
		
		this.ip = ip;
		this.port = port;
		this.login = login;
		this.password = password;
		this.nameDB = nameDB;
		
	}

	
	public Connection getConnection() {
		return connection;
	}
	

	//abrir conexao com o banco de dados
	public void openConnection() {
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String address = "jdbc:mysql://" + this.ip + ":" + this.port + "/" + this.nameDB + "?serverTimezone=UTC";
			
			this.connection = DriverManager.getConnection(address, this.login, this.password);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	//fechar conexao com o BD
	public void closeConnection() {
		
		try {
			
			if (this.connection != null) {
				
				this.connection.close();
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	
	
}









