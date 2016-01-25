/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bean.Stage;
import Restclient.ClientWS_DB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import database.Data;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;


/**
 *
 * @author TOSHIBA
 */
public class EntrepriseProposerStageServlet extends HttpServlet {

   

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String typecontrat = request.getParameter("typeContrat");
            String titresujet = request.getParameter("titreSujet"); 
            String descriptionsujet = request.getParameter("descriptionSujet");
            String specialite= request.getParameter("specialite");
            String niveauetude = request.getParameter("niveauEtude");
            String remuneration = request.getParameter("remuneration");
            String duree = request.getParameter("duree");
            String adresse = request.getParameter("adresse");
            String contactname = request.getParameter("contactName");
            String contacttel = request.getParameter("contactTel");
            String contactweb  = request.getParameter("contactWeb");
            
            HttpSession session = ((HttpServletRequest) request).getSession(false);
            String id= (String) session.getAttribute("id");
            Connection c1 = null;
            try {
                c1 = Data.connectionDatabase1();
            } catch (SQLException ex) {
                Logger.getLogger(VoirProfilServlet.class.getName()).log(Level.SEVERE, null, ex);
            }  
            String siret = Data.getElementwithID(c1,id,"SIRET","GUI.COMPANY");//recuperation du siret de l'entreprise dans la BDD
            String nom = Data.getElementwithID(c1,id,"NOM","GUI.COMPANY");//recuperation du nom de l'entreprise dans la BDD
            
            Stage stage = new Stage();
            stage.setSiret(siret);
            stage.setReference(nom);
            stage.setTypecontrat(typecontrat);
            stage.setTitresujet(titresujet);
            stage.setDescriptionsujet(descriptionsujet);
            stage.setSpecialite(specialite);
            stage.setNiveauetude(niveauetude);
            stage.setRemuneration(remuneration);
            stage.setDuree(duree);
            stage.setAdresse(adresse);
            stage.setContactname(contactname);
            stage.setContacttel(contacttel);
            stage.setContactweb(contactweb);
            
            String json = new Gson().toJson(stage);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(json);
            System.out.println(json);
            ClientWS_DB client = new ClientWS_DB();
            client.addStageV2(json);
            //client.addStage(siret,nom,"ref"+nom+"010231",descriptionsujet,remuneration,adresse,contactname,contacttel,contactweb,typecontrat,duree,specialite,niveauetude);
            
            request.setAttribute("json",json);
            if (c1 != null) {
                try {
                    c1.close();
                } catch (SQLException ignore) {
                }
            }
        this.getServletContext().getRequestDispatcher("/SOA_Project-war/EntrepriseConsulterStage").forward(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.getServletContext().getRequestDispatcher("/entrepriseProposerStage.jsp").forward(request, response);
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
