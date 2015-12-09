/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.EntrepriseBean;
import forms.CreationEntrepriseForm;
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
public class ServletCreerCompteEntreprise extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        EntrepriseBean entreprise = new EntrepriseBean();
        
        CreationEntrepriseForm form = new CreationEntrepriseForm();
        
        entreprise=form.creerCompteEntreprise(request);
        
       request.setAttribute("entrepriseBean",entreprise);
       this.getServletContext().getRequestDispatcher("/WEB-INF/confirmerCreationEntreprise.jsp").forward(request, response);  
    }

    
}
