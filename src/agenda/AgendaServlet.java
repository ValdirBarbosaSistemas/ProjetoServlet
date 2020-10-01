package agenda;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgendaServlet
 */
@WebServlet("/AgendaServlet")
public class AgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// System.out.println(">>>>>>>>>>>>>> REQUEST" + request.getMethod());
		PrintWriter resposta = response.getWriter();
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		/*
		 * System.out.println("O nome que veio na requisição é: " + login);
		 * System.out.println("O nome que veio na requisição é: " + senha);
		 */

		request.setAttribute("login", login);
		if (login.equals("valdir@gmail.com") && senha.equals("12345")) {
			RequestDispatcher rd = request.getRequestDispatcher("bemvindo.jsp");
			rd.forward(request, response);
			// response.sendRedirect("bemvindo.html");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			resposta.print("Desculpe, login ou senha inválidos!");
			rd.include(request, response);
			// response.sendRedirect("Desculpe, login ou senha inválidos!");
		}
	}
}
