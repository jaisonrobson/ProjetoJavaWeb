package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int idFormulario; //1-clientes; 2-cursos; 3-pagamentos
		int tipoFormulario; //1.1 consulta ...
		
		idFormulario = Integer.parseInt(request.getParameter("idFormulario"));
		tipoFormulario = Integer.parseInt(request.getParameter("tipoFormulario"));
		
		switch (idFormulario) {
		case 1: {//Clientes
					
			break;
		}
		case 2: {//Cursos
			
			break;
		}
		case 3: {//Pagamentos
			
			break;
		}
		default:
			throw new IllegalArgumentException("Formulario invalido");
		}
			
	}

}
