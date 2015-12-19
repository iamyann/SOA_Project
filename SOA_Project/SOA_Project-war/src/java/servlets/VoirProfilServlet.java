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
import javax.servlet.http.HttpSession;

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
         HttpSession session = ((HttpServletRequest) request).getSession(false);
         String id= (String) session.getAttribute("id");
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
       
        
//            c1.close();
//            c2.close();
              String voirprofil=""
                      + " <tr>\n" +
"                                <td>"+Data.getElementwithID(c1, id,"DESCRIPTION", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElementwithID(c1, id,"ETAB", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElementwithID(c1, id,"TELEPHONE", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElementwithID(c1, id,"EMAIL", "STUDENT")+"</td>\n" +
"                                <td>"+Data.getElementwithID(c1, id,"ADRESSE", "STUDENT")+" , "+Data.getElementwithID(c1, id,"VILLE", "STUDENT")+" </td>\n" +
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
