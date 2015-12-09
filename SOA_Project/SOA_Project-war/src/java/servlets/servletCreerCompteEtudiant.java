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

public class servletCreerCompteEtudiant extends HttpServlet 
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
            String sexe = request.getParameter("sexe");
            String prenom = request.getParameter("prenom");
            String nom = request.getParameter("nom");
            int jour = Integer.parseInt(request.getParameter("jour"));
            int mois = Integer.parseInt(request.getParameter("mois"));
            int annee = Integer.parseInt(request.getParameter("annee"));
            String adresse = request.getParameter("adresse");
            int code = Integer.parseInt(request.getParameter("code_postal"));
            String ville = request.getParameter("ville");
            String pays  = request.getParameter("pays");
            int telephone = Integer.parseInt(request.getParameter("telephone"));
            String etab = request.getParameter("etablissement_scolaire");
            String spe = request.getParameter("spe");
            // mise en forme des champs pour insertion dans la bdd
            String date = String.valueOf(jour)+"/"+String.valueOf(mois)+"/"+String.valueOf(annee);
            // insertion dans la bdd
            int statut = statement.executeUpdate("INSERT INTO THOMAS.ETUDIANTS (EMAIL, MDP, SEXE, PRENOM, NOM, DATE, ADRESSE, CODEPOSTAL, VILLE, PAYS, TELEPHONE, ETAB, SPE) "
                    + "VALUES ('"+email+"', '"+mdp+"', '"+sexe+"', '"+prenom+"', '"+nom+"', '"+date+"', '"+adresse+"', "+code+", '"+ville+"', '"+pays+"', "+telephone+", '"+etab+"', '"+spe+"')");
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
        request.setAttribute("email", request.getParameter("email"));      
        request.setAttribute("prenom", request.getParameter("prenom"));
        request.setAttribute("nom", request.getParameter("nom"));
        request.setAttribute("mdp", request.getParameter("mdp1"));
        request.setAttribute("pays", request.getParameter("pays"));    
        this.getServletContext().getRequestDispatcher("/WEB-INF/profilEtudiant.jsp").forward(request, response);     
    }
}