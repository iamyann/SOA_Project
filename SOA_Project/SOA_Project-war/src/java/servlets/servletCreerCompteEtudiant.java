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
        String url = "jdbc:derby://localhost:1527/test"; // à modifier selon matthieu
        String utilisateur = "thomas";
        String motDePasse = "thomasthomas";
        Connection connexion = null;
        try // Ici, nous placerons nos requêtes vers la BDD
        {
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse); // connexion à la bdd en mode admin
            Statement statement = connexion.createStatement();  // création de l'objet gérant les requêtes
            String email = request.getParameter("email");
            String mdp = request.getParameter("mdp"); 
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
            int id = Integer.parseInt(request.getParameter("telephone"));
            String etab = request.getParameter("etablissement_scolaire");
            String spe = request.getParameter("spe");
            //int statut = statement.executeUpdate("INSERT INTO TABLETEST (email, id) VALUES ('bla', "+ id + ")");
            //this.getServletContext().getRequestDispatcher("/WEB-INF/fail.jsp").forward(request, response);
            //int statut = statement.executeUpdate("INSERT INTO ETUDIANT (email, mot_de_passe prenom, nom) "
            //        + "VALUES ('" + email + "','" + mdp "','" + prenom "','" + nom "');");
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
        //this.getServletContext().getRequestDispatcher("/WEB-INF/fail.jsp").forward(request, response);     
        this.getServletContext().getRequestDispatcher("/WEB-INF/profilEtudiant.jsp").forward(request, response);     
    }
}