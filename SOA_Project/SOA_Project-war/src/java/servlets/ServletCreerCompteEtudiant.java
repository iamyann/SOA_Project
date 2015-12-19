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

public class ServletCreerCompteEtudiant extends HttpServlet 
{
    // Handles the HTTP <code>POST</code> method.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {     
        /**************** Fonction me permettant de me connnecter à la Database et faire des scripts par la suite************************************/
        /*===> Thomas ne supprime pas ce que je fais, ça modifie pas ton code, je fais un lien avec ma page profil**/
        /*Suite à notre discussion, La connection c1 te permet de te connecter directement sur ta BDD [voir Classe DATA.java ]*/
        Connection c1 = null;
        try {
            c1 = Data.connectionDatabase1();
        } catch (SQLException ex) {
            Logger.getLogger(VoirProfilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        /****************************************************/
/* Chargement du driver JDBC pour MySQL */
        try 
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver" );
        } 
        catch (ClassNotFoundException e) // gérer les éventuelles erreurs ici
        {
            request.setAttribute("fail", e);
            this.getServletContext().getRequestDispatcher("/WEB-INF/fail.jsp").forward(request, response);
        }
/* Connexion à la base de données  et inscription de l'utilisateur */
        String url = "jdbc:derby://localhost:1527/GUI"; // à modifier selon matthieu
        String utilisateur = "root";
        String motDePasse = "root";
        Connection connexion = null;
        
         HttpSession session = ((HttpServletRequest) request).getSession(false);
        session = request.getSession();  
         // récupération des champs du formulaire
            String email = request.getParameter("email");
            String mdp = request.getParameter("mdp1"); // on assume que les deux mots de passes sont identiques du fait du js
            String mdp2 = request.getParameter("mdp2");
            String sexe = request.getParameter("sexe");
            String prenom = request.getParameter("prenom");
            String nom = request.getParameter("nom");
            String id = null;
            int jour = Integer.parseInt(request.getParameter("jour"));
            int mois = Integer.parseInt(request.getParameter("mois"));
            int annee = Integer.parseInt(request.getParameter("annee"));
            String adresse = request.getParameter("adresse");
            String code = request.getParameter("code_postal");
            String ville = request.getParameter("ville");
            String pays  = request.getParameter("pays");
            String telephone = request.getParameter("telephone");
            String etab = request.getParameter("etablissement_scolaire");
            String spe = request.getParameter("spe");
            // mise en forme des champs pour insertion dans la bdd
            String date = String.valueOf(jour)+"/"+String.valueOf(mois)+"/"+String.valueOf(annee);
            
        
        if(mdp.equalsIgnoreCase(mdp2)) //si le mdp1 = mdp 2, on peut ecrire dans la BDD
        {
            // Thomas tu pourrais juste avec cette ligne, ajouter des data dans ta BDD, je t'ai mis en commentaire ce
            // qui existait avant, à toi de choisir ce qui est plus simple [voir classe Data.java où toutes les fonctions existent déja]
            Data.addElementStudentGui(c1,email, mdp,sexe,prenom,nom,date,adresse,code,ville,pays,telephone,etab,spe);                 
                    
            /* redirection [Thomas ne supprime rien, car c'est ça qui me permet d'identifier chaque etudiant] */
            session.setAttribute( "prenom", prenom);
            id=Data.getElement(c1, nom, mdp, "ID", "STUDENT");
            System.out.println("[creation Etudiant]ID = "+id);
            session.setAttribute( "id", id);
            RequestDispatcher rd = request.getRequestDispatcher("index-etud.jsp");       
            rd.forward(request, response);   
            
                       /* try // Ici, nous placerons nos requêtes vers la BDD
            {                
                connexion = DriverManager.getConnection(url, utilisateur, motDePasse); // connexion à la bdd en mode admin
                Statement statement = connexion.createStatement();  // création de l'objet gérant les requêtes
               // insertion dans la bdd
                int statut = statement.executeUpdate("INSERT INTO GUI.STUDENT (EMAIL, MDP, SEXE, PRENOM, NOM, DATE, ADRESSE, CODEPOSTAL, VILLE, PAYS, TELEPHONE, ETAB, SPE) "
                        + "VALUES ('"+email+"', '"+mdp+"', '"+sexe+"', '"+prenom+"', '"+nom+"', '"+date+"', '"+adresse+"', '"+code+"', '"+ville+"', '"+pays+"', '"+telephone+"', '"+etab+"', '"+spe+"')");
            } 
            catch (SQLException e) // gérer les éventuelles erreurs ici
            {
                request.setAttribute("fail", e);
                this.getServletContext().getRequestDispatcher("/WEB-INF/fail.jsp").forward(request, response);
            } 
            finally 
            {
                if (connexion != null)
                    try 
                    {
                        connexion.close(); // Fermeture de la connexion 
                    } 
                    catch (SQLException ignore) {} // Si une erreur survient lors de la fermeture, il suffit de l'ignorer
            }*/
        }
        else
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");       
            rd.forward(request, response);
        }
        
        
        
        
        
    }
}