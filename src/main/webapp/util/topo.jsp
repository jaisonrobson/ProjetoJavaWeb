<%
	if (session.getAttribute("login") != "true") {
		session.setAttribute("mensagem", "Acesso proibido! E necessario se autenticar.");
%>
		<jsp:forward page="/login.jsp" />
<%
	}
%>