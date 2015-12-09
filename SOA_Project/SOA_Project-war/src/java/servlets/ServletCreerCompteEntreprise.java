package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCreerCompteEntreprise extends HttpServlet 
{
    // Handles the HTTP <code>POST</code> method.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {        
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
        String url = "jdbc:derby://localhost:1527/etudiants"; // à modifier selon matthieu
        String utilisateur = "thomas";
        String motDePasse = "thomas";
        Connection connexion = null;
        try // Ici, nous placerons nos requêtes vers la BDD
        {
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse); // connexion à la bdd en mode admin
            Statement statement = connexion.createStatement();  // création de l'objet gérant les requêtes
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
            int statut = statement.executeUpdate("INSERT INTO THOMAS.ENTREPRISE (EMAIL, MDP, TYPE, NOM, SIRET, DOMAINE, TAILLE, ADRESSE, CODEPOSTAL, VILLE, PAYS, TELEPHONE, SITEWEB) "
                    + "VALUES ('"+email+"', '"+mdp+"', '"+type+"', '"+nom+"', '"+siret+"', '"+domaine+"','"+taille+"','"+adresse+"', '"+code+"', '"+ville+"', '"+pays+"', '"+telephone+"', '"+siteweb+"')");
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
                    connexion.close(); // Fermeture de la connexion */
                } 
                catch (SQLException ignore) {} // Si une erreur survient lors de la fermeture, il suffit de l'ignorer
        }
/* redirection */
        this.getServletContext().getRequestDispatcher("/WEB-INF/profilEntreprise.jsp").forward(request, response);     
    }
}