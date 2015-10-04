package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DepartamentoTI;
import to.ListaFilasTO;

/**
 * Servlet implementation class CarregarFilasController
 */
@WebServlet("/filas.do")
public class CarregarMenuController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DepartamentoTI ti = new DepartamentoTI();	
		ListaFilasTO filas = ti.listarFilas();
		
		request.setAttribute("filas", filas);
		RequestDispatcher view = request.getRequestDispatcher("Menu.html");
		view.forward(request, response);
		
	}
	
	@Override
	public void init(ServletConfig config){
		//todos os servlets do menu devem conter este metodo
		ServiceLookup.setupDB();
	}

}
