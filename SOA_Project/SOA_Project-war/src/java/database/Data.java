/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import servlets.ServletCV;


/**
 *
 * @author yann
 */
public class Data {
    //private static String username = "gui" ; //Chez moi le root marche pas comme unsername, c plutot gui (Auriole)
    private static String username = "root" ;
    private static String password = "root" ;
    private static String serverName = "localhost";
    private static String portNumber="1527" ;
    private static String dbName ="GUI";
    
    
    /** Retourne le lien de connection après l'avoir établi */
    public static Connection connectionDatabase1() throws SQLException 
    {
        try 
        {
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.apache.derby.jdbc.ClientDriver"); //le driver de ma BD (Auriole)
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:derby://"+serverName+":"+portNumber+"/"+dbName, username, password);
        System.out.println("Connected to database");
        return conn;
    }
    
    

    /**################################### FONCTION ##################################################"""**/
    
    /** Retourne type si l'utilisateur existe, null sinon */
    /** Retourne type si l'utilisateur existe, null sinon */
    public static boolean  addElementStudentGui(Connection con, String email, String mdp,String sexe,String prenom,String nom,String date,String adresse,String code,String ville,String pays,String telephone, String etab,String spe, String descr,InputStream cv){
        boolean type = false ;
        try {
           //Statement smt = con.createStatement() ;
            //type = smt.execute("INSERT INTO STUDENT (EMAIL, MDP, SEXE, PRENOM, NOM, DATE, ADRESSE, CODEPOSTAL, VILLE, PAYS, TELEPHONE, ETAB, SPE, DESCRIPTION) "
                      //  + "VALUES ('"+email+"', '"+mdp+"', '"+sexe+"', '"+prenom+"', '"+nom+"', '"+date+"', '"+adresse+"', '"+code+"', '"+ville+"', '"+pays+"', '"+telephone+"', '"+etab+"', '"+spe+"', '"+descr+"')");
            String sql = "INSERT INTO STUDENT (EMAIL, MDP, SEXE, PRENOM, NOM, DATE, ADRESSE, CODEPOSTAL, VILLE, PAYS, TELEPHONE, ETAB, SPE, DESCRIPTION, CV) VALUES ('"+email+"', '"+mdp+"', '"+sexe+"', '"+prenom+"', '"+nom+"', '"+date+"', '"+adresse+"', '"+code+"', '"+ville+"', '"+pays+"', '"+telephone+"', '"+etab+"', '"+spe+"', '"+descr+"', ? )";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setBlob(1, cv);
            int row = smt.executeUpdate();
            if (row > 0) {
                type = true ;      
            }            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return type ;  
    }
    
    
    /** Retourne type si l'utilisateur existe, null sinon */
    public static void  addElementCompanyGui(Connection con, String email, String mdp,String type,String nom,String siret,String domaine,String taille,String adresse,String code,String ville,String pays,String telephone, String siteweb)
    {
        try 
        {
             //Statement smt = con.createStatement() ;
            //smt.execute("INSERT INTO COMPANY (EMAIL, MDP,TYPE,NOM, SIRET, DOMAINE,TAILLE,ADRESSE, CODEPOSTAL, VILLE, PAYS, TELEPHONE, SITEWEB) VALUES ('"+email+"', '"+mdp+"', '"+type+"', '"+nom+"', '"+siret+"', '"+domaine+"','"+taille+"','"+adresse+"', '"+code+"', '"+ville+"', '"+pays+"', '"+telephone+"','"+siteweb+"')");      
            //Les preparedStatement sont idéals pour éviter les injections SQL (pensons à corriger notre code)
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO GUI.COMPANY (EMAIL, MDP,TYPE,NOM, SIRET, DOMAINE,TAILLE,ADRESSE, CODEPOSTAL, VILLE, PAYS, TELEPHONE, SITEWEB) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString( 1, email );
            preparedStatement.setString( 2, mdp );
            preparedStatement.setString( 3, type );
            preparedStatement.setString( 4, nom );
            preparedStatement.setString( 5, siret );
            preparedStatement.setString( 6, domaine );
            preparedStatement.setString( 7, taille );
            preparedStatement.setString( 8, adresse );
            preparedStatement.setString( 9, code );
            preparedStatement.setString( 10, ville );
            preparedStatement.setString( 11, pays );
            preparedStatement.setString( 12, telephone );
            preparedStatement.setString( 13, siteweb );
            int statut = preparedStatement.executeUpdate();
                        
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //une fonction qui permet d'update la table company
    public static void  updateElementCompanyGui(Connection con, String id,String nom,String siret,String domaine,String taille,String adresse,String code,String ville,String pays,String telephone, String siteweb)
    {
        try 
        {
             //Statement smt = con.createStatement() ;
             //int statut=smt.executeUpdate("UPDATE GUI.COMPANY SET EMAIL=email,NOM=nom, SIRET=siret, DOMAINE=domaine,TAILLE=taille,ADRESSE=adresse, CODEPOSTAL=code, VILLE=ville, PAYS=pays, TELEPHONE=telephone, SITEWEB=siteweb WHERE ID=id");      
            //Les preparedStatement sont idéals pour éviter les injections SQL (pensons à corriger notre code)
             
            PreparedStatement preparedStatement = con.prepareStatement("UPDATE GUI.COMPANY SET NOM=?, SIRET=?, DOMAINE=?, TAILLE=?, ADRESSE=?, CODEPOSTAL=?, VILLE=?, PAYS=?, TELEPHONE=?, SITEWEB=? WHERE ID=?");
            
            preparedStatement.setString( 1, nom );
            preparedStatement.setString( 2, siret );
            preparedStatement.setString( 3, domaine );
            preparedStatement.setString( 4, taille );
            preparedStatement.setString( 5, adresse );
            preparedStatement.setString( 6, code );
            preparedStatement.setString( 7, ville );
            preparedStatement.setString( 8, pays );
            preparedStatement.setString( 9, telephone );
            preparedStatement.setString( 10, siteweb );
            preparedStatement.setString( 11, id );
            int statut = preparedStatement.executeUpdate();
                        
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String  getElement(Connection con, String user, String mdp, String mot, String Table){
        String type = null ;
        try {
            Statement smt = con.createStatement() ;
            ResultSet resultset =smt.executeQuery("SELECT "+mot+" FROM "+Table+" WHERE NOM='"+user+"' AND MDP='"+mdp+"'");
            if(resultset.next()){
                type = resultset.getString(mot);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return type ;  
    }
    
    public static String  getElementwithEmail(Connection con, String user, String mdp, String mot, String Table){
        String type = null ;
        try {
            Statement smt = con.createStatement() ;
            ResultSet resultset =smt.executeQuery("SELECT "+mot+" FROM "+Table+" WHERE EMAIL='"+user+"' AND MDP='"+mdp+"'");
            if(resultset.next()){
                type = resultset.getString(mot);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return type ;  
    }
    
     public static String  getElementwithID(Connection con, String id, String mot, String Table){
        String type = null ;
        try {
            Statement smt = con.createStatement() ;
            ResultSet resultset =smt.executeQuery("SELECT "+mot+" FROM "+Table+" WHERE ID="+id);
            if(resultset.next()){
                type = resultset.getString(mot);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return type ;  
    }
     
     public static String  getCompany(Connection con){
        String recherche = "";
        try {
            Statement smt = con.createStatement() ;
            ResultSet resultset =smt.executeQuery("SELECT * FROM COMPANY");
            int nbr = 0;
            recherche ="<div class=\"form-group\">\n" +
"                                <label>Nom de l'entreprise</label>\n" +
"                                <select name=\"nomE\" class=\"form-control\">\n" ;
            while(resultset.next()){
                String nom =resultset.getString(resultset.findColumn("NOM"));
                String s = "null";
                String s1 = "" + nom;
                String rest;
                if (s.equals(s1)) {
                    rest = "-";
                } else {
                    rest = nom;
                }
                recherche +="<option>"+rest+"</option>\n";
                nbr++;
            }
            if (nbr > 0) {
                recherche += "                                </select>\n" +
"                            </div>";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return recherche ;  
    }
    
    /** Modifie le type et renvoie "true" si l'ID existe dans la base de données */
    public static Boolean setElement(Connection con,String user, String mdp, String mot, String Table, String Element){
        Boolean exist = false;
        try {
            if (existID(con,user,mdp,Table)){
            Statement smt = con.createStatement() ;
            smt.executeUpdate("UPDATE "+Table+" SET "+Element+"='"+mot+"' WHERE NOM='"+user+"' AND MDP='"+mdp+"'");
            exist = true ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist ;
    }

    /** Modifie le type et renvoie "true" si l'ID existe dans la base de données */
    public static Boolean setElementwithID(Connection con,String id, String mot, String Table, String Element){
        Boolean exist = false;
        try {
            Statement smt = con.createStatement() ;
            smt.executeUpdate("UPDATE "+Table+" SET "+Element+"='"+mot+"' WHERE ID="+id);
            exist = true ;            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist ;
    }
    
    /** Modifie le type et renvoie "true" si l'ID existe dans la base de données */
    public static Boolean setCVwithID(Connection con,String id, String mot, String Table, String Element,InputStream inputStream){
        Boolean exist = false;
        try {
            String sql = "UPDATE "+Table+" SET "+Element+"="+mot+" WHERE ID="+id;
            PreparedStatement smt = con.prepareStatement(sql);
            //smt.executeUpdate("UPDATE "+Table+" SET "+Element+"="+mot+" WHERE ID="+id);
            smt.setBlob(1, inputStream);
            int row = smt.executeUpdate();
            if (row > 0) {
                exist = true ;      
            }                  
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist ;
    }
    
    /** Modifie le type et renvoie "true" si l'ID existe dans la base de données */
    public static ResultSet getCVwithID(Connection con,String id, String Table) throws IOException{
        ResultSet result = null;
        try {
            String sql = "SELECT CV FROM "+Table+" WHERE ID="+id;
            PreparedStatement smt = con.prepareStatement(sql);
            result = smt.executeQuery();                
        } catch (SQLException ex) {
            System.out.println("[Data -> getCV] ERROR");
        }
        return result ;
    }
    
    
    /** Supprime l'utilisateur ayant l'email "email" et renvoie "true" si cet utilisateur existait bien, "false" sinon */
    public static Boolean  deleteElement(Connection con,String user, String mdp, String mot, String Table){
        Boolean exist = false ;
        try {
            if (existID(con,user,mdp,Table)){
                Statement smt = con.createStatement() ;
                smt.executeUpdate("DELETE "+mot+" FROM "+Table+" WHERE NOM='"+user+"' AND MDP='"+mdp+"'");
                exist = true ;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist ;
        
    }
  
        /** Vérifie l'existence du mail dans la table des utilisateurs, renvoie "true" s'il existe, "false" sinon */
    public static Boolean existID(Connection con, String user, String mdp, String Table){
        Boolean exist = false ;
        try {
            Statement smt = con.createStatement();
            ResultSet resultset =smt.executeQuery("SELECT ID FROM "+Table+" WHERE EMAIL='"+user+"' AND MDP='"+mdp+"'");
            if (resultset.next()){
                exist=true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist ;
    }
}