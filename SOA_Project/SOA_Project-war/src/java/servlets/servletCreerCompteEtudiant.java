package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletCreerCompteEtudiant extends HttpServlet {

    // Handles the HTTP <code>POST</code> method.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        request.setAttribute("email", request.getParameter("email"));
        //request.setAttribute("mdp1", request.getParameter("mdp1"));
        //request.setAttribute("mdp2", request.getParameter("mdp2"));
        
        request.setAttribute("prenom", request.getParameter("prenom"));
        request.setAttribute("nom", request.getParameter("nom"));
        
               
        this.getServletContext().getRequestDispatcher("/profilEtudiant.jsp").forward(request, response);
    }
}