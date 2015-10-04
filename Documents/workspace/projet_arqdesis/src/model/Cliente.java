/**
 * 
 */
package model;

import to.AeronaveTO;
import to.ClienteTO;
import factory.DAOFactory;

/**
 * @author hugosa
 *
 */
public class Cliente {
	
	   private int cpf;
	   private String nome;
	   private String sobreNome;
	   private String dataNasc;
	   private String fone;
	   private String email;
	   private String tipo;
	   private String formaTr;
	   
		public ClienteTO incluir(ClienteTO to){
			return DAOFactory.getClienteDAO().incluir(to);
		}
	/**
	 * @return the cpf
	 */
	public int getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
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
	 * @return the sobreNome
	 */
	public String getSobreNome() {
		return sobreNome;
	}
	/**
	 * @param sobreNome the sobreNome to set
	 */
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	/**
	 * @return the dataNasc
	 */
	public String getDataNasc() {
		return dataNasc;
	}
	/**
	 * @param dataNasc the dataNasc to set
	 */
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	/**
	 * @return the fone
	 */
	public String getFone() {
		return fone;
	}
	/**
	 * @param fone the fone to set
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	/**
	 * @return the formaTr
	 */
	public String getFormaTr() {
		return formaTr;
	}
	/**
	 * @param formaTr the formaTr to set
	 */
	public void setFormaTr(String formaTr) {
		this.formaTr = formaTr;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf 
				+ ", nome=" + nome 
				+ ", sobreNome=" + sobreNome 
				+ ", dataNasc=" + dataNasc
				+ ", fone=" + fone 
				+ ", email=" + email 
				+ ", tipo=" + tipo 
				+ ", formaTr=" 
				+ formaTr + "]";
	}	   
}

