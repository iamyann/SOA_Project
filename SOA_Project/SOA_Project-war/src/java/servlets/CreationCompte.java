/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

/**
 *
 * @author Auriol
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* Servlet permettant de vérifier quelle type de compte on souhaite créer et redirige vers la page appropriée  */
public class CreationCompte extends HttpServlet {

    /* AURIOL*/
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String typeCompte=request.getParameter("typeCompte");
       if (typeCompte.equals("entreprise")) {
            this.getServletContext().getRequestDispatcher("auriol/creerCompteEntreprise.jsp").forward(request, response);
       } else {
            this.getServletContext().getRequestDispatcher("/thomas/creerCompteEtudiant.jsp").forward(request, response);
       }
    }
}
