package com.jd.cdlm.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jd.cdlm.bean.CDBean;

import con.jd.cdlm.dao.CDdao;

/**
 * Servlet implementation class ViewSearchedServlet
 */
public class ViewSearchedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewSearchedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int releaseYear = Integer.parseInt(request.getParameter("releaseYear"));
		
		CDdao edao=new CDdao();
        List<CDBean> eList;
		try {
			eList = edao.viewSearchedCDs(releaseYear);
			if(eList.size()>0) {
				request.setAttribute("cdBean", eList);
				RequestDispatcher red=request.getRequestDispatcher("viewCD.jsp");
		        red.forward(request, response);	
			}
			else {
				RequestDispatcher red=request.getRequestDispatcher("notAvailable.jsp");
		        red.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
