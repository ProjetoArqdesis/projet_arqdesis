/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import model.Aeronave;
import factory.ConnFactory;
import to.AeronaveTO;

/**
 * @author hugosa
 *
 */
public class AeronaveDAOMySQL extends AeronaveDAO {
	
	@Override
	public void desconectar(Connection conn) throws SQLException {
		conn.close();
	}
	
		/**
		 * Metodo para incluir Aeronave
		 */
	   public AeronaveTO incluir (AeronaveTO to) {
		   
			String inclusao = "insert into Aeronave values (?, ?, ?, ?)";
			Connection conn = null;
			PreparedStatement pst = null;
			ResultSet rs = null;   
		    try {
					conn = ConnFactory.conectar();
					pst = conn.prepareStatement(inclusao);
						//configurar parametros
					pst.setInt(1, to.codigo);
					pst.setString(2,  to.nome);
					pst.setInt(3, to.qtdAssentos);
					pst.setString(4, to.tipo);
						//fim configurar parametros
					pst.execute();  
		      }
		      catch(Exception e) {
		    	  e.printStackTrace();
		      }    
		    finally {
				if(rs != null){
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(pst != null){
					try {
						pst.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(conn != null){
					try {
						desconectar(conn);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		    
			return to;
		   }
	   
		/**
		 * Metodo para alterar Aeronave
		 */
	   public void alterar(AeronaveTO to) {
		   
		    String alterar = "update Aeronave set NOME = ?, QTDASSENTOS = ?, TIPO = ? where CODIGO = ?";
			Connection conn = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			
		   try {
				conn = ConnFactory.conectar();
				pst = conn.prepareStatement(alterar);
				
		        pst.setString(1, to.nome);
		        pst.setInt   (2, to.qtdAssentos);
		        pst.setString(3, to.tipo);
		        pst.setInt   (4, to.codigo);
		        pst.executeUpdate();
		        pst.close();
		      }
		      catch(Exception e) {
		    	  e.printStackTrace();
		      }
		   finally {
				if(rs != null){
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(pst != null){
					try {
						pst.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(conn != null){
					try {
						desconectar(conn);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}		   
	   }
	   
		/**
		 * Metodo para consultar Aeronave
		 */
	   public AeronaveTO consultar(AeronaveTO to) {
		   
		    String consultar = "select * from Aeronave where CODIGO = ?";
			Connection conn = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			
		     try {
		         
				conn = ConnFactory.conectar();
				pst = conn.prepareStatement(consultar);
		        pst.setInt(1, to.codigo);
		        rs = pst.executeQuery();
		         
		         if (rs.next()) {
		            to = new AeronaveTO();
		            pst.setInt(1, to.codigo);
		            pst.setString(2, to.nome);
		            pst.setInt(3, to.qtdAssentos);
		            pst.setString(4, to.tipo);
		         }  
		          
		         else{
		            
		            to = new AeronaveTO();
		            pst.setInt(1, to.codigo);          
		         }
		         pst.close();
		      }
		      catch(Exception e) {
					e.printStackTrace();
		      }
		     finally {
					if(rs != null){
						try {
							rs.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(pst != null){
						try {
							pst.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(conn != null){
						try {
							desconectar(conn);
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}	   
		return to;
		
	   }
	   
		/**
		 * Metodo para excluir Aeronave
		 */
	  public void excluir(AeronaveTO to) {
		  
		    String excluir = "delete from Aeronave where CODIGO = ?";
			Connection conn = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			
			try {
				conn = ConnFactory.conectar();
				pst = conn.prepareStatement(excluir);
		        pst.setInt(1, to.codigo);
		        pst.executeUpdate();
		        pst.close();
		      }
		      catch(Exception e) {
					e.printStackTrace();
		      }
			finally {
				if(rs != null){
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(pst != null){
					try {
						pst.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(conn != null){
					try {
						desconectar(conn);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
	  } 
}
