package servlets;

import database.Data;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletCreerCompteEntreprise extends HttpServlet 
{
    // Handles the HTTP <code>POST</code> method.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {        
        /**************** Fonction me permettant de me connnecter à la Database et faire des scripts par la suite************************************/
        /*===> Auriol ne supprime pas ce que je fais, ça modifie pas ton code, je fais un lien avec ma page profil**/
        /*Suite à notre discussion, La connection c2 te permet de te connecter directement sur ta BDD [voir Classe DATA.java ]*/
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
            String email = request.getParameter("email");
            String mdp = request.getParameter("mdp1"); // on assume que les deux mots de passes sont identiques du fait du js
            //String mdp2 = request.getParameter("mdp2");
            String type = request.getParameter("type");
            String nom = request.getParameter("nom");
            String siret = request.getParameter("siret");
            String domaine = request.getParameter("domaine");
            String taille = request.getParameter("taille");
            String adresse = request.getParameter("adresse");
            String code = request.getParameter("code_postal");
            String ville = request.getParameter("ville");
            String pays  = request.getParameter("pays");
            String telephone = request.getParameter("telephone");
            String siteweb = request.getParameter("siteweb");
            
            // insertion dans la bdd
            Data.addElementCompanyGui(c1, email, mdp, type, nom, siret, domaine, taille, adresse, code, ville, pays, telephone, siteweb);                
                    
            /* redirection [Auriol ne supprime rien, car c'est ça qui me permet d'identifier chaque entreprise] */
            session.setAttribute( "prenom", nom);
            String id=Data.getElement(c1, nom, mdp, "ID", "GUI.COMPANY");
            System.out.println("[creation Entreprise]ID = "+id);
            session.setAttribute( "id", id);
            RequestDispatcher rd = request.getRequestDispatcher("entrepriseTableauBord.jsp");       
            rd.forward(request, response);            
    }
}