package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.User;
import bean.SqliteConnexion;
import java.sql.*;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection ;
	PreparedStatement PreparedStatement ;
	ResultSet ResultSet ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/login.jsp").forward(request, response);
    } 


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String username=request.getParameter("username") ; 
        String userpassword = request.getParameter("userpassword") ;
        String query = "SELECT * FROM Users WHERE username=? AND password=?" ; 
        
        try {
            PreparedStatement = connection.prepareStatement(query) ;
            PreparedStatement.setString(1,username);
            PreparedStatement.setString(2,userpassword) ;
            ResultSet = PreparedStatement.executeQuery() ;
            if(ResultSet.next()){
                request.setAttribute("username", username);
                this.getServletContext().getRequestDispatcher("welcome.jsp").forward(request, response) ; 
            }}
            catch (SQLException e) {
    			e.printStackTrace();	
    	}

     

}
}
