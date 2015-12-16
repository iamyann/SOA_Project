/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import database.Data;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yann
 */
public class VoirProfilServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
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
        
            Connection c1 = null;
        try {
            c1 = Data.connectionDatabase1();
        } catch (SQLException ex) {
            Logger.getLogger(VoirProfilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            Connection c2 = null;
        try {
            c2 = Data.connectionDatabase2();
        } catch (SQLException ex) {
            Logger.getLogger(VoirProfilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(Data.addElementStudentGui(c1,"STUDENT", "Mr","Mb","Yann","testmdp","10-03-96","yann.md@yahoo.fr","141 avenue de rangueil","31400","Toulouse","France","06.34.58.49.79","INSA Toulouse","IR","Jeune Etudiant, cherche stage"))
        {
          System.out.println("Cratch 1..."); 
        }
        else
          System.out.println("Well done 1...");
        
        if(Data.addElementStudentGui(c1,"STUDENT", "Mr","Etudiant","Etudiant","etudiant","10-03-96","etud@yahoo.fr","143 avenue de rangueil","31400","Toulouse","France","06.65.58.49.99","Epitech","IR","Jeune Etudiant, cherche stage"))
        {
          System.out.println("Cratch 2...");          
        }
        else
            System.out.println("Well done 2...");
          
        
//            c1.close();
//            c2.close();
              String voirprofil=""
                      + " <tr>\n" +
"                                <td>"+Data.getElement(c1, "Etudiant", "etudiant", "DESCRIPTION", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElement(c1, "Etudiant", "etudiant", "ETABLISSEMENT", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElement(c1, "Etudiant", "etudiant", "TELEPHONE", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElement(c1, "Etudiant", "etudiant", "EMAIL", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElement(c1, "Etudiant", "etudiant", "ADRESSE", "STUDENT")+" , "+Data.getElement(c1, "Etudiant", "etudiant", "VILLE", "STUDENT")+" </td>\n" +
"                         </tr>"
                      ;
            request.setAttribute("profil", voirprofil); // This will be available as ${profil}
            RequestDispatcher rd = request.getRequestDispatcher("voir-profil.jsp");
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
        processRequest(request, response);
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
