package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aeronave;
import model.Voo;
import to.VooTO;
import factory.TOFactory;

/**
 * Servlet implementation class IncluirChamadoController
 */
@WebServlet("/incluir_voo.do")
public class IncluirVooController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int codigo = Integer.parseInt(request.getParameter("cod_voo"));
	    //String imagem;
	    double preco = Double.parseDouble(request.getParameter("preco"));
	    String origem = request.getParameter("origem");
	    String destino = request.getParameter("destino");
	    String escala = request.getParameter("escala");
	    String data = request.getParameter("data");
	    String hora = request.getParameter("hora");
	    //Aeronave tipo = request.getParameter("tipo");
	    String situacao = request.getParameter("situacao");
		
		Voo voo = new Voo();
		VooTO to = TOFactory.getVooTO();
		to.codigo = codigo;
		to.preco = preco;
		to.origem = origem;
		to.destino = destino;
		to.escala = escala;
		to.data = data;
		to.hora = hora;
		to.situacao = situacao;
		to = voo.incluir(to);
		
		request.setAttribute("voo", to);
		//RequestDispatcher view = request.getRequestDispatcher("TelaMostraChamado.jsp");
		//view.forward(request, response);
			
	}

}
