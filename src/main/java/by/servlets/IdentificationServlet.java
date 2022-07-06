package by.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IdentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IdentificationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		switch(request.getParameter("hiddenField")) {
		case ("authorization"):
		authorization(request, response);
		break;
		case ("registration"):
			registration(request, response);
		break;
		}
		
			}
	
	private void authorization(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		response.setContentType("text/html");
		
		 
		   PrintWriter out = response.getWriter();
		   
		   
		   out.println("Пользователь" + request.getParameter("login") + " успешно авторизовался");
		   
	}
	
	private void registration(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		response.setContentType("text/html");
		
		   String login = request.getParameter("login");
		   String password = request.getParameter("password");
			
		   PrintWriter out = response.getWriter();
		   
		   out.println(" Поздравляем, " +request.getParameter("firstName")+" "+request.getParameter("firstName")+ "вы успешно зарегистрировались !!!<br/> " );
		   
		   out.println("<br />Your login: " + request.getParameter("login"));
		   out.println("<br />Your name: " + request.getParameter("firstName"));
		   out.println("<br />Your lastName: " + request.getParameter("lastName"));
		   out.println("<br />Your e-mail: " + request.getParameter("e-mail"));
		   
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
