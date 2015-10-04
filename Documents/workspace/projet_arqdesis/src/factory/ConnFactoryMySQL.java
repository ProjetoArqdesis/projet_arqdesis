/**
 * 
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author hugosa
 *
 */
public class ConnFactoryMySQL extends ConnFactory {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection conectar() throws SQLException {
		return DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/servicedesk?user=aluno&password=alunos");
	}
}
