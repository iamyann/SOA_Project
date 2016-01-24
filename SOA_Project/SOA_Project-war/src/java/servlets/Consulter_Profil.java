/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import database.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yann
 */
public class Consulter_Profil extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = ((HttpServletRequest) request).getSession(false);
         String id= (String) session.getAttribute("id");
        Connection c1 = null;
        try {
            c1 = Data.connectionDatabase1();
        } catch (SQLException ex) {
            Logger.getLogger(VoirProfilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         String etudiant=Data.getStudent(c1);
         request.setAttribute("etudiant", etudiant);
         String bouton ="<button type=\"submit\" class=\"btn btn-default\">Rechercher</button>\n" +
"                            <button type=\"reset\" class=\"btn btn-default\">Reinitialiser</button>";
         request.setAttribute("bouton", bouton);
         //Fermeture de la Connexion à la BD
            if (c1 != null) {
                try {
                    c1.close();
                    System.out.println("Fermeture de la connexion");
                } catch (SQLException ignore) {
                }
            }
            RequestDispatcher rd = request.getRequestDispatcher("entrepriseConsulterProfil.jsp");
            rd.forward(request, response);
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
        
        HttpSession session = ((HttpServletRequest) request).getSession(false);
         String id1= (String) session.getAttribute("id");
        Connection c1 = null;
        try {
            c1 = Data.connectionDatabase1();
        } catch (SQLException ex) {
            Logger.getLogger(VoirProfilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String nom = request.getParameter("nomEtudiant");
        String resume ="<thead>\n" +
"                                    <tr>\n" +
"                                        <th>Resume Professionnel</th>\n" +
"                                        <th>Etablissement</th>\n" +
"                                        <th>Tel</th>\n" +
"                                        <th>Email</th>\n" +
"                                        <th>Adresse</th>\n" +
"                                        <th>CV</th>\n" +                                        
"                                    </tr>\n" +
"                                </thead>";        
        request.setAttribute("resume", resume); // This will be available as ${profil}
        
        
        String id = Data.getElementwithNAme(c1, nom);
        session = request.getSession();
        session.setAttribute( "monid", id);
         String voirprofil=""
                      + " <tr>\n" +
"                                <td>"+Data.getElementwithID(c1, id,"DESCRIPTION", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElementwithID(c1, id,"ETAB", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElementwithID(c1, id,"TELEPHONE", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElementwithID(c1, id,"EMAIL", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElementwithID(c1, id,"ADRESSE", "STUDENT")+" , "+Data.getElementwithID(c1, id,"VILLE", "STUDENT")+" </td>\n" +           
"                                <td><a href=\"/SOA_Project-war/ServletCV2\">CV</a></td>\n" +
"                         </tr>"
                      ; 
        request.setAttribute("profil", voirprofil); // This will be available as ${profil}
            //Fermeture de la Connexion à la BD
            if (c1 != null) {
                try {
                    c1.close();
                    System.out.println("Fermeture de la connexion");
                } catch (SQLException ignore) {
                }
            }
            RequestDispatcher rd = request.getRequestDispatcher("entrepriseConsulterProfil.jsp");
            rd.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
