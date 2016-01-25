/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Restclient.ClientWS_DB;
import bean.Stage;
import com.google.gson.Gson;
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
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author yann
 */
public class EntrepriseConsulterStage extends HttpServlet {

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
         Connection c1 = null;
            HttpSession session = ((HttpServletRequest) request).getSession(false);
            String id= (String) session.getAttribute("id");
            
            try {
                c1 = Data.connectionDatabase1();
            } catch (SQLException ex) {
                Logger.getLogger(VoirProfilServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^ID ="+id);
            
            
            String offresStage="";
            try {
                offresStage = Data.getOffreStageEntreprise(c1,id);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(OffreStageServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
            Logger.getLogger(OffreStageServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            request.setAttribute("offres", offresStage); // This will be available as ${offres}
            RequestDispatcher rd = request.getRequestDispatcher("entrepriseConsulterStage.jsp");
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
