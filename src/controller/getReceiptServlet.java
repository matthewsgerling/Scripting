package controller;

import model.ReceiptCalculator;


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
@WebServlet("/getReceiptServlet")
public class getReceiptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getReceiptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userReceipt8 = request.getParameter("8x10");
		String userReceipt4 = request.getParameter("4x6");
		String userReceiptW = request.getParameter("Wallet");
		
		ReceiptCalculator receipt = new ReceiptCalculator(Integer.parseInt(userReceipt8), Integer.parseInt(userReceipt4), Integer.parseInt(userReceiptW));
		//ReceiptCalculator hello = new ReceiptCalculator();
		
		request.setAttribute("userReceipt", receipt);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(hello.toString());
		//writer.close();
	}

}
