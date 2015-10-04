/**
 * 
 */
package factory;

import dao.AeronaveDAO;
import dao.AeronaveDAOMySQL;
import dao.AeronaveDAOPostgreSQL;



/**
 * @author hugosa
 *
 */
public class DAOFactory {
	
	public static AeronaveDAO getAeronaveDAO() {
		switch (ConnFactory.getBanco()) {
		case ConnFactory.MYSQL:
			return new AeronaveDAOMySQL();
		case ConnFactory.POSTGRE:
			return new AeronaveDAOPostgreSQL();
		default:
			return null;
		}
	}

}
