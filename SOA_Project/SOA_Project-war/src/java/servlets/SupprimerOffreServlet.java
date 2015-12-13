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
public class SupprimerOffreServlet extends HttpServlet {

 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String decision=request.getParameter("buttonD");

            if (!decision.isEmpty()){
                if(decision.equals("oui")) {
                    //on supprime l'offre de la base de donnée
                }

                // on doit normalement rappeler la servlet qui appelle entrepriseConsulterStage.jsp
                this.getServletContext().getRequestDispatcher("/entrepriseConsulterStage.jsp").forward(request, response);
            }
        } catch (Exception e) {
        
        }
        
        this.getServletContext().getRequestDispatcher("/entrepriseConfirmationSuppression.jsp").forward(request, response);
    }

   
  
}
