/**
 * 
 */
package model;

/**
 * @author hugosa
 *
 */
public class Passagem {
	
	   private int codigo;
	   private double valor;
	   private double taxa;
	   private double totalGastos;
	   private double valorTotalPgto;
	   private String origem;
	   private String destino;
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
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	/**
	 * @return the taxa
	 */
	public double getTaxa() {
		return taxa;
	}
	/**
	 * @param taxa the taxa to set
	 */
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	/**
	 * @return the totalGastos
	 */
	public double getTotalGastos() {
		return totalGastos;
	}
	/**
	 * @param totalGastos the totalGastos to set
	 */
	public void setTotalGastos(double totalGastos) {
		this.totalGastos = totalGastos;
	}
	/**
	 * @return the valorTotalPgto
	 */
	public double getValorTotalPgto() {
		return valorTotalPgto;
	}
	/**
	 * @param valorTotalPgto the valorTotalPgto to set
	 */
	public void setValorTotalPgto(double valorTotalPgto) {
		this.valorTotalPgto = valorTotalPgto;
	}
	/**
	 * @return the origem
	 */
	public String getOrigem() {
		return origem;
	}
	/**
	 * @param origem the origem to set
	 */
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}
	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Passagem [codigo=" + codigo 
				+ ", valor=" + valor 
				+ ", taxa=" + taxa 
				+ ", totalGastos=" + totalGastos
				+ ", valorTotalPgto=" + valorTotalPgto 
				+ ", origem=" + origem 
				+ ", destino=" + destino + "]";
	}	   
}

