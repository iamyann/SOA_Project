package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class servletCreerCompteEtudiant extends HttpServlet {

    // Handles the HTTP <code>POST</code> method.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = ((HttpServletRequest) request).getSession(false);
        session = request.getSession();
        
        //request.setAttribute("email", request.getParameter("email"));
        //request.setAttribute("mdp1", request.getParameter("mdp1"));
        //request.setAttribute("mdp2", request.getParameter("mdp2"));        
        //request.setAttribute("prenom", request.getParameter("prenom"));
        //request.setAttribute("nom", request.getParameter("nom"));
        String nom=request.getParameter("nom");
        String prenom=request.getParameter("prenom");
        session.setAttribute( "nom", nom );
        session.setAttribute( "prenom", prenom);
        
        //RequestDispatcher rd = request.getRequestDispatcher("redex.jsp");
        //rd.include(request, response);      
        this.getServletContext().getRequestDispatcher("/WEB-INF/profilEtudiant.jsp").forward(request, response);
    }
}