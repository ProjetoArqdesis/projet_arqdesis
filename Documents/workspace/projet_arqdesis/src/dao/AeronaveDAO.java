/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;

import to.AeronaveTO;

/**
 * @author hugosa
 *
 */
public abstract class AeronaveDAO {
	
	public abstract void desconectar(Connection conn) throws SQLException;
	
	public abstract AeronaveTO incluir(AeronaveTO to);

	public abstract void alterar(AeronaveTO to);
	
	public abstract AeronaveTO consultar(AeronaveTO to);
	
	public abstract void excluir(AeronaveTO to);

}
