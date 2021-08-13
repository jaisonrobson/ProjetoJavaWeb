<jsp:directive.page import="java.sql.*" />

<jsp:declaration>
	static String url = "jdbc:mysql://localhost:3306/javaWeb";
	static String usuario = "root";
	static String senha = "admin";
	static Connection conexao;
	
	public void init() throws ServletException {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(url, usuario, senha);
			conexao.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
</jsp:declaration>

<jsp:scriptlet>
	String cpfmask = request.getParameter("cpf");
	cpfmask = cpfmask.replaceAll("[.-]", "");
	String senha = request.getParameter("senha");		
	String consulta = "SELECT * FROM login WHERE cpf ='"+ cpfmask +"' AND senha='"+senha+"'";
	
	Statement statement;
	
	try {
		statement = conexao.createStatement();		
		ResultSet rs = statement.executeQuery(consulta);
		
		if(rs.next()) {
			session.setAttribute("mensagem", "Usuario autenticado");			
			session.setAttribute("login", "true");
			response.sendRedirect("../index.jsp");
		}
		else {
			session.setAttribute("mensagem", "Usuario inexistente ou invalido");
			session.setAttribute("login", "false");
			response.sendRedirect("../login.jsp");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
</jsp:scriptlet>