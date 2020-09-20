package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StatBlock;

/**
 * Servlet implementation class getStatsServlet
 */
@WebServlet("/getStatsServlet")
public class getStatsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getStatsServlet() {
        super();
        // Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Auto-generated method stub
		
		String userSTR = request.getParameter("str");
		String userDEX = request.getParameter("dex");
		String userCON = request.getParameter("con");
		String userINT = request.getParameter("int");
		String userWIS = request.getParameter("wis");
		String userCHA = request.getParameter("cha");
		
		StatBlock sb = new StatBlock(
				Integer.parseInt(userSTR),
				Integer.parseInt(userDEX),
				Integer.parseInt(userCON),
				Integer.parseInt(userINT),
				Integer.parseInt(userWIS),
				Integer.parseInt(userCHA)
				);
		
		request.setAttribute("userStats",sb);
		
		getServletContext().getRequestDispatcher("/StatBlock.jsp").forward(request, response);
		
//		PrintWriter writer = response.getWriter();
//		writer.println(sb.toString());
//		writer.close();
	}

}
