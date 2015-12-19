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
public class SignServlet extends HttpServlet {

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
        session = request.getSession();
        String username=request.getParameter("username");
        String password=request.getParameter("password");        
        
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

        //on se connecte avec son email
        if(Data.existID(c1, username, password, "STUDENT")) //si il existe un id dans la table student, on est redirige vers le profil etudiant
        {
            String id=Data.getElementwithEmail(c1, username, password, "ID", "STUDENT");
            String pren=Data.getElementwithID(c1, id, "PRENOM", "STUDENT");
            session.setAttribute( "id", id);
            session.setAttribute( "prenom", pren);
            RequestDispatcher rd = request.getRequestDispatcher("index-etud.jsp");       
            rd.forward(request, response); 
        }
        else if(Data.existID(c2, username, password, "COMPANY")) //si il existe un id dans la table company, on est redirige vers le profil entreprise
        {
            String id=Data.getElementwithEmail(c2, username, password, "ID", "COMPANY");
            session.setAttribute( "id", id);
            String pren=Data.getElementwithID(c1, id, "NOM", "COMPANY");
            session.setAttribute( "prenom", pren);
            RequestDispatcher rd = request.getRequestDispatcher("entrepriseTableauBord.jsp");       
            rd.forward(request, response);
        }
        else if("entreprise".equalsIgnoreCase(username)) //===> AURIOLE : tu dois supprimer cette partie plus tard
        {
            RequestDispatcher rd = request.getRequestDispatcher("entrepriseTableauBord.jsp");       
            rd.forward(request, response); 
        }
        else
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");       
            rd.forward(request, response); 
        }
                        
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
