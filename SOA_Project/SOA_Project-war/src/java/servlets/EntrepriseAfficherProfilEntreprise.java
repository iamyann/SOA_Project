/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import database.Data;
import java.io.IOException;
import java.io.InputStream;
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
import javax.servlet.http.Part;

/**
 *
 * @author TOSHIBA
 */
public class EntrepriseAfficherProfilEntreprise extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

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
        Connection c2 = null;
        try {
            c2 = Data.connectionDatabase2();
        } catch (SQLException ex) {
            Logger.getLogger(VoirProfilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }        
        //Récupération des différentes données de l'entreprise de la BD
        String nom = Data.getElementwithID(c2,id,"NOM","ROOT.COMPANY");
        String siret = Data.getElementwithID(c2,id,"SIRET","ROOT.COMPANY");
        String domaine = Data.getElementwithID(c2,id,"DOMAINE","ROOT.COMPANY");
        String taille = Data.getElementwithID(c2,id,"TAILLE","ROOT.COMPANY");
        String  adresse = Data.getElementwithID(c2,id,"ADRESSE","ROOT.COMPANY");
        String codepostal = Data.getElementwithID(c2,id,"CODEPOSTAL","ROOT.COMPANY");
        String ville = Data.getElementwithID(c2,id,"VILLE","ROOT.COMPANY");
        String pays = Data.getElementwithID(c2,id,"PAYS","ROOT.COMPANY");
        String telephone = Data.getElementwithID(c2,id,"TELEPHONE","ROOT.COMPANY");
        String siteweb = Data.getElementwithID(c2,id,"SITEWEB","ROOT.COMPANY");
        
        request.setAttribute("nomEnt", nom);
        request.setAttribute("siretEnt", siret);
        request.setAttribute("domaineEnt", domaine);
        request.setAttribute("tailleEnt", taille);
        request.setAttribute("adresseEnt", adresse);
        request.setAttribute("codepostalEnt", codepostal);
        request.setAttribute("villeEnt", ville);
        request.setAttribute("paysEnt", pays);
        request.setAttribute("telephoneEnt", telephone);
        
        this.getServletContext().getRequestDispatcher("/entrepriseProfil.jsp").forward(request, response); 
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
        String id= (String) session.getAttribute("id");
        Connection c2 = null;
        try {
            c2 = Data.connectionDatabase2();
        } catch (SQLException ex) {
            Logger.getLogger(VoirProfilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }        
        //Récupération des différentes données de l'entreprise de la BD
        String nom = Data.getElementwithID(c2,id,"NOM","ROOT.COMPANY");
        String siret = Data.getElementwithID(c2,id,"SIRET","ROOT.COMPANY");
        String domaine = Data.getElementwithID(c2,id,"DOMAINE","ROOT.COMPANY");
        String taille = Data.getElementwithID(c2,id,"TAILLE","ROOT.COMPANY");
        String  adresse = Data.getElementwithID(c2,id,"ADRESSE","ROOT.COMPANY");
        String codepostal = Data.getElementwithID(c2,id,"CODEPOSTAL","ROOT.COMPANY");
        String ville = Data.getElementwithID(c2,id,"VILLE","ROOT.COMPANY");
        String pays = Data.getElementwithID(c2,id,"PAYS","ROOT.COMPANY");
        String telephone = Data.getElementwithID(c2,id,"TELEPHONE","ROOT.COMPANY");
        String siteweb = Data.getElementwithID(c2,id,"SITEWEB","ROOT.COMPANY");
        
        request.setAttribute("nomEnt", nom);
        request.setAttribute("siretEnt", siret);
        request.setAttribute("domaineEnt", domaine);
        request.setAttribute("tailleEnt", taille);
        request.setAttribute("adresseEnt", adresse);
        request.setAttribute("codepostalEnt", codepostal);
        request.setAttribute("villeEnt", ville);
        request.setAttribute("paysEnt", pays);
        request.setAttribute("telephoneEnt", telephone);
        
        this.getServletContext().getRequestDispatcher("/entrepriseProfil.jsp").forward(request, response); 
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
