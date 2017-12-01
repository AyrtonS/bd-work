package onclick.bdwork.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
	
	private static final String USER_NAME = "root"; 
	private static final String DB_NAME = "university";
	private static final String PASSWORD = "root";
	private static final String SERVER_IP = "localhost"; 
	private static final String URL = "jdbc:mysql://"+ SERVER_IP + "/" + DB_NAME; 
	private static Connection connection = null;
	public static String status = "";
	
	public ConnectionDatabase() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static Connection getConnection(){
	
		
		String driverName = "com.mysql.jdbc.Driver";
		
		try {
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAA");
			Class.forName(driverName);
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);	
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
			return null;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
			
		}

		 
        if (connection != null) {

            status = ("STATUS--->Conectado com sucesso!");

        } else {

            status = ("STATUS--->Não foi possivel realizar conexão");

        }

		return connection;
	}
	

	
	public static boolean closeConnection(){
		
		try {
			
			ConnectionDatabase.getConnection().close();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static Connection restartConnection(){
		
		closeConnection();
		return ConnectionDatabase.getConnection();
	
		
	}	

	
}







