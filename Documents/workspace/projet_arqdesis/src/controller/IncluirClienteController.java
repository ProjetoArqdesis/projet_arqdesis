package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import to.ClienteTO;
import factory.TOFactory;

/**
 * Servlet implementation class IncluirChamadoController
 */
@WebServlet("/incluir_cliente.do")
public class IncluirClienteController extends HttpServlet {
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
		
		int cpf = Integer.parseInt(request.getParameter("cpf"));
		String nome = request.getParameter("nome");
		String sobreNome = request.getParameter("sobrenome");
		String dataNasc = request.getParameter("dt_nasc");
		String fone = request.getParameter("celular");
		String email = request.getParameter("email");
		String tipo = request.getParameter("tipo_passageiro");
		String formaTr = request.getParameter("forma_tratamento");
		
		Cliente cliente = new Cliente();
		ClienteTO to = TOFactory.getClienteTO();
		to.cpf = cpf;
		to.nome = nome;
		to.sobreNome = sobreNome;
		to.dataNasc = dataNasc;
		to.fone = fone;
		to.email = email;
		to.tipo = tipo;
		to.formaTr = formaTr;
		to = cliente.incluir(to);
		
		request.setAttribute("cliente", to);
		//RequestDispatcher view = request.getRequestDispatcher("TelaMostraChamado.jsp");
		//view.forward(request, response);
			
	}

}
