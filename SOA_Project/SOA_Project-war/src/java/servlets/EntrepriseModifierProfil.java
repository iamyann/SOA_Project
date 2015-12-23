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
 * @author TOSHIBA
 */
public class EntrepriseModifierProfil extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EntrepriseModifierProfil</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EntrepriseModifierProfil at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        //Récupération des différentes données de l'entreprise de la BD
        String nom = Data.getElementwithID(c1,id,"NOM","GUI.COMPANY");
        String siret = Data.getElementwithID(c1,id,"SIRET","GUI.COMPANY");
        String domaine = Data.getElementwithID(c1,id,"DOMAINE","GUI.COMPANY");
        String taille = Data.getElementwithID(c1,id,"TAILLE","GUI.COMPANY");
        String  adresse = Data.getElementwithID(c1,id,"ADRESSE","GUI.COMPANY");
        String codepostal = Data.getElementwithID(c1,id,"CODEPOSTAL","GUI.COMPANY");
        String ville = Data.getElementwithID(c1,id,"VILLE","GUI.COMPANY");
        String pays = Data.getElementwithID(c1,id,"PAYS","GUI.COMPANY");
        String telephone = Data.getElementwithID(c1,id,"TELEPHONE","GUI.COMPANY");
        String siteweb = Data.getElementwithID(c1,id,"SITEWEB","GUI.COMPANY");
        
        request.setAttribute("nomEnt", nom);
        request.setAttribute("siretEnt", siret);
        request.setAttribute("domaineEnt", domaine);
        request.setAttribute("tailleEnt", taille);
        request.setAttribute("adresseEnt", adresse);
        request.setAttribute("codepostalEnt", codepostal);
        request.setAttribute("villeEnt", ville);
        request.setAttribute("paysEnt", pays);
        request.setAttribute("telephoneEnt", telephone);
        request.setAttribute("sitewebEnt", siteweb);
        
        if (c1 != null) {
                try {
                    c1.close();
                } catch (SQLException ignore) {
                }
        }
        
        this.getServletContext().getRequestDispatcher("/entrepriseModifierProfil.jsp").forward(request, response);
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
       Connection c1 = null;
        try {
            c1 = Data.connectionDatabase1();
            
        } catch (SQLException ex) {
            Logger.getLogger(VoirProfilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        /****************************************************/
         HttpSession session = ((HttpServletRequest) request).getSession(false);
         session = request.getSession();  
         // récupération des champs du formulaire
            
            String nom = request.getParameter("nom");
            System.out.println(nom);
            String siret = request.getParameter("siret");
            System.out.println(siret);
            String domaine = request.getParameter("domaine");
            System.out.println(domaine);
            String taille = request.getParameter("taille");
            System.out.println(taille);
            String adresse = request.getParameter("adresse");
            System.out.println(adresse);
            String code = request.getParameter("code_postal");
            System.out.println(code);
            String ville = request.getParameter("ville");
            System.out.println(ville);
            String pays  = request.getParameter("pays");
            System.out.println(pays);
            String telephone = request.getParameter("telephone");
            System.out.println(telephone);
            String siteweb = request.getParameter("siteweb");
            System.out.println(siteweb);
            
            String id=(String)session.getAttribute("id");
            // update de dans la bdd
            Data.updateElementCompanyGui(c1, id, nom, siret, domaine, taille, adresse, code, ville, pays, telephone, siteweb);                
                    
            
            session.setAttribute( "nomEnt", nom);
            System.out.println("ID = "+id);
            
            if (c1 != null) {
                try {
                    c1.close();
                } catch (SQLException ignore) {
                }
        }
            RequestDispatcher rd = request.getRequestDispatcher("EntrepriseAfficherProfilEntreprise");       
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
