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
		String nome, email, site, cpfMascara, nomeCurso;
		long cpf, cdCurso, valorCurso;
		
		switch (idFormulario) {
			case 1: {//Clientes
				switch (tipoFormulario) {
					case 11: { //Consultar todos
						
						break;
					}
					case 12: { //Consultar
						cpfMascara = request.getParameter("cpf");
						cpfMascara = cpfMascara.replaceAll("[.-]", "");
						cpf = Long.parseLong(cpfMascara);
						
						out.println("<h2>Clientes => Consultar =>"+cpf+" </h2>");
						break;
					}
					case 13: { //Cadastrar
						cpfMascara = request.getParameter("cpf");
						nome = request.getParameter("nome");
						email = request.getParameter("email");
						cpfMascara = cpfMascara.replaceAll("[.-]", "");
						cpf = Long.parseLong(cpfMascara);
						
						out.println("<h2>Clientes => Cadastrar =>"+cpf+"-"+nome+"-"+email+"</h2>");
						break;
					}
					case 14: { //Alterar
						cpfMascara = request.getParameter("cpf");
						nome = request.getParameter("nome");
						email = request.getParameter("email");
						cpfMascara = cpfMascara.replaceAll("[.-]", "");
						cpf = Long.parseLong(cpfMascara);
						
						out.println("<h2>Clientes => Alterar =>"+cpf+"-"+nome+"-"+email+"</h2>");
						break;
					}
					case 15: { //Excluir
						cpfMascara = request.getParameter("cpf");
						cpfMascara = cpfMascara.replaceAll("[.-]", "");
						cpf = Long.parseLong(cpfMascara);
						
						out.println("<h2>Clientes => Excluir =>"+cpf+" </h2>");
						break;
					}
					default:
						throw new IllegalArgumentException("Tipo de formulario invalido");
				}
				
				break;
			}
			case 2: {//Cursos
				switch (tipoFormulario) {
					case 21: { //Consultar todos
						
						break;
					}
					case 22: { //Consultar
						cdCurso = Long.parseLong(request.getParameter("cdcurso"));
						
						out.println("<h2>Cursos => Consultar =>"+cdCurso+" </h2>");
						break;
					}
					case 23: { //Cadastrar
						cdCurso = Long.parseLong(request.getParameter("cdcurso"));
						nomeCurso = request.getParameter("nome");
						valorCurso = Long.parseLong(request.getParameter("valor"));
						site = request.getParameter("site");
						
						out.println("<h2>Cursos => Cadastrar =>"+cdCurso+"-"+nomeCurso+"-"+valorCurso+"-"+site+"</h2>");
						break;
					}
					case 24: { //Alterar
						cdCurso = Long.parseLong(request.getParameter("cdcurso"));
						nomeCurso = request.getParameter("nome");
						valorCurso = Long.parseLong(request.getParameter("valor"));
						site = request.getParameter("site");
						
						out.println("<h2>Cursos => Alterar =>"+cdCurso+"-"+nomeCurso+"-"+valorCurso+"-"+site+"</h2>");
						break;
					}
					case 25: { //Excluir
						cdCurso = Long.parseLong(request.getParameter("cdcurso"));
						
						out.println("<h2>Cursos => Excluir =>"+cdCurso+" </h2>");
						break;
					}
					default:
						throw new IllegalArgumentException("Tipo de formulario invalido");
				}
				
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
