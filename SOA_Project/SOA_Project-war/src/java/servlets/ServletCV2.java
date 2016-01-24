/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import database.Data;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yann
 */
public class ServletCV2 extends HttpServlet {

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
        try {
            c1 = Data.connectionDatabase1();
        } catch (SQLException ex) {
            Logger.getLogger(VoirProfilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }        
             
        HttpSession session = ((HttpServletRequest) request).getSession(false);
        String id= (String) session.getAttribute("monid");
        String prenom= (String) session.getAttribute("prenom");
        ResultSet result = Data.getCVwithID(c1, id, "STUDENT");
        try {
                if (result.next())
                {
                    Blob blob = result.getBlob("CV");
                    InputStream inputStream = blob.getBinaryStream();
                    int fileLength = inputStream.available();
                    
                    OutputStream outputStream = response.getOutputStream();
                    response.setContentType ("application/pdf");
                    response.setHeader ("Content-Disposition", "attachment; filename= CV_"+prenom);                  

                    int bytesRead = -1;
                    byte[] buffer = new byte[4096];
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }

                    inputStream.close();
                    outputStream.close();
                    System.out.println("File saved");
                }
            } catch (SQLException ex) {
            System.out.println("[ServletCV] ERROR ");
        } 
        //Fermeture de la Connexion à la BD
        if (c1 != null) {
            try {
                c1.close();
                System.out.println("Fermeture de la connexion");
            } catch (SQLException ignore) {
            }
        }
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
