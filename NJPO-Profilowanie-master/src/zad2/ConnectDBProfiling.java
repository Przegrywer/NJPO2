package zad2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class ConnectDBProfiling {
	
	private ConnectDBProfiling(){};
	private static volatile ConnectDBProfiling instance = null;
	
	Connection c;

	
	
	
	public static synchronized ConnectDBProfiling inst() {
		if (instance == null) {
            synchronized (ConnectDBProfiling.class) {
                if (instance == null) {
                    instance = new ConnectDBProfiling();
                }
            }
        }
        return instance;
	}
	
	
	
    public void connect(){
    	
    	String JDBC_DRIVER = null;
    	String DB_URL = null;
    	String USER = null;
    	String PASS = null;
    	
    	try {
    		try {
				Class.forName(JDBC_DRIVER);
			} catch (ClassNotFoundException e) {
			
				e.printStackTrace();
			}
			this.c = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
    }
    
    public ResultSet executeQuery(String query) throws SQLException{
    	PreparedStatement p = c.prepareStatement(query);
        return p.executeQuery();
    	
    }
    
    
    public int executeUpdate(String query) throws SQLException{
    	PreparedStatement p = c.prepareStatement(query);
    	return p.executeUpdate(query);
    	
    }
	

}