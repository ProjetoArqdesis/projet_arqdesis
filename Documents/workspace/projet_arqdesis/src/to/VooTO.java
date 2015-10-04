/**
 * 
 */
package to;

import java.io.Serializable;

import model.Aeronave;

/**
 * @author hugosa
 *
 */
public class VooTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    public String imagem;
    public double preco;
    public String origem;
    public String destino;
    public String horario;
    public int codigo;
    public String escala;
    public String data;
    public String hora;
    public Aeronave tipo;
    public String situacao;
}
