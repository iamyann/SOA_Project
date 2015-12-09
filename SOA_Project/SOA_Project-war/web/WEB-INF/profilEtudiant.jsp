<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        Ceci est la page de profil de : 
        <%
            out.println(request.getAttribute("prenom"));
            out.println(request.getAttribute("nom"));
            out.println(request.getAttribute("email"));  
            out.println(request.getAttribute("mdp"));
            out.println(request.getAttribute("pays"));
            
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
            ResultSet resultat = statement.executeQuery( "SELECT adresse FROM THOMAS.ETUDIANTS" );
            while ( resultat.next() ) 
            {
                String adresse = resultat.getString( "adresse" );                
            }            
            //out.println(adresse);
        }
        catch (SQLException e) // gérer les éventuelles erreurs ici
        {
            request.setAttribute("fail", e);
            this.getServletContext().getRequestDispatcher("/WEB-INF/fail.jsp").forward(request, response);
        } 
        %>
    </body>
</html>
