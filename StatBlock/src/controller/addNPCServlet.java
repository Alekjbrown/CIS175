package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NPC;


/**
 * Servlet implementation class addNPCServlet
 */
@WebServlet("/addNPCServlet")
public class addNPCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addNPCServlet() {
        super();
        // Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("name");
		String userRace = request.getParameter("race");
		String userAge = request.getParameter("age");
		String userDesc = request.getParameter("desc");
		
		NPC n = new NPC(
				format(userName),
				format(userRace),
				Integer.parseInt(userAge),
				format(userDesc)
				);
		
		request.setAttribute("userInfo", n);
		
		getServletContext().getRequestDispatcher("/NPCInfo.jsp").forward(request, response);
		
	}
	
	protected String format(String s) {
		String result="NULL";
		if(s.length()>0) {
		result = s.substring(0,1).toUpperCase();
		}
		if(s.length()>1) {
		result += s.substring(1).toLowerCase();
		}
		return result;
	}

}
