/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TOSHIBA
 */
public class ServletConfirmation extends HttpServlet {

     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String soumettre=request.getParameter("soumettre");
        
        if(soumettre.equals("editer")) {
           this.getServletContext().getRequestDispatcher("/WEB-INF/creerCompteEntreprise.jsp").forward(request, response);
        } else {
           this.getServletContext().getRequestDispatcher("/WEB-INF/profilEtudiant.jsp").forward(request, response);
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   

}
