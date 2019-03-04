package controller;

import model.FormCreator;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getReceiptServlet
 */
@WebServlet("/FormatServlet")
public class FormatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String age = request.getParameter("age");
		
		FormCreator format = new FormCreator();
		//ReceiptCalculator hello = new ReceiptCalculator();
		
		request.setAttribute("Format", format);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(hello.toString());
		//writer.close();
	}

}
