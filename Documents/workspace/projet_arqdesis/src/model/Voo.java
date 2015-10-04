/**
 * 
 */
package model;

import factory.DAOFactory;
import to.ClienteTO;

/**
 * @author hugosa
 *
 */
public class Voo {
	
    private String imagem;
    private double preco;
    private String origem;
    private String destino;
    private int codigo;
    private String escala;
    private String data;
    private String hora;
    private Aeronave tipo;
    private String situacao;
    
	public VooTO incluir(VooTO to){
		return DAOFactory.getVooDAO().incluir(to);
	}
    
	/**
	 * @return the imagem
	 */
	public String getImagem() {
		return imagem;
	}
	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}
	/**
	 * @return the origem
	 */
	public String getOrigem() {
		return origem;
	}
	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @return the escala
	 */
	public String getEscala() {
		return escala;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * @return the tipo
	 */
	public Aeronave getTipo() {
		return tipo;
	}
	/**
	 * @return the situacao
	 */
	public String getSituacao() {
		return situacao;
	}
	/**
	 * @param imagem the imagem to set
	 */
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	/**
	 * @param origem the origem to set
	 */
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @param escala the escala to set
	 */
	public void setEscala(String escala) {
		this.escala = escala;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Aeronave tipo) {
		this.tipo = tipo;
	}
	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}

