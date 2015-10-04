/**
 * 
 */
package model;

import to.AeronaveTO;
import factory.DAOFactory;

/**
 * @author hugosa
 *
 */
public class Aeronave {
	
	private int codigo; 
	private int qtdAssentos;
	private String nome;
	private String tipo;
	
	public AeronaveTO incluir(AeronaveTO to){
		return DAOFactory.getAeronaveDAO().incluir(to);
	}
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the qtdAssentos
	 */
	public int getQtdAssentos() {
		return qtdAssentos;
	}
	/**
	 * @param qtdAssentos the qtdAssentos to set
	 */
	public void setQtdAssentos(int qtdAssentos) {
		this.qtdAssentos = qtdAssentos;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aeronave [codigo=" + codigo 
				+ ", qtdAssentos=" + qtdAssentos 
				+ ", nome=" + nome 
				+ ", tipo=" + tipo+ "]";
	}
	
}
