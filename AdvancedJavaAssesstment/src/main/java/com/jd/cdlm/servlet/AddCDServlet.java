package com.jd.cdlm.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jd.cdlm.bean.CDBean;


import con.jd.cdlm.dao.CDdao;

/**
 * Servlet implementation class AddCDServlet
 */
public class AddCDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCDServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cdId = Integer.parseInt(request.getParameter("cdId"));
		String cdName = request.getParameter("cdName");
		int releaseYear = Integer.parseInt(request.getParameter("releaseYear"));
		Double price = Double.parseDouble(request.getParameter("price"));
		CDBean eb = new CDBean(cdId,cdName,releaseYear,price);
		CDdao dao = new CDdao();
		try {
			boolean hasAdded = dao.addCD(eb);
			if(hasAdded) {
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("failure.jsp");
				rd.forward(request, response);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
