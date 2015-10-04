package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aeronave;
import to.AeronaveTO;
import factory.TOFactory;

/**
 * Servlet implementation class IncluirChamadoController
 */
@WebServlet("/incluir_aeronave.do")
public class IncluirAeronaveController extends HttpServlet {
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
		
		int codigo = Integer.parseInt(request.getParameter("cod_aeronave"));
		String nome = request.getParameter("nome_aeronave");
		int qtdAssentos = Integer.parseInt(request.getParameter("qtd_assentos"));
		String tipo = request.getParameter("tipo");
		
		Aeronave aeronave = new Aeronave();
		AeronaveTO to = TOFactory.getAeronaveTO();
		to.codigo = codigo;
		to.nome = nome;
		to.qtdAssentos = qtdAssentos;
		to.tipo = tipo;
		to = aeronave.incluir(to);
		
		request.setAttribute("aeronave", to);
		//RequestDispatcher view = request.getRequestDispatcher("TelaMostraChamado.jsp");
		//view.forward(request, response);
			
	}

}
