/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author yann
 */
public class Data {
 private static String username = "root" ;
    private static String password = "root" ;
    private static String serverName = "localhost";
    private static String portNumber="1527" ;
    private static String dbName ="GUI";
    private static String dbName2 ="COMPANY";
    
    /** Retourne le lien de connection après l'avoir établi */
    public static Connection connectionDatabase1() throws SQLException 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:derby://"+serverName+":"+portNumber+"/"+dbName, username, password);
        System.out.println("Connected to database");
        return conn;
    }
    
    /** Retourne le lien de connection après l'avoir établi */
    public static Connection connectionDatabase2() throws SQLException 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:derby://"+serverName+":"+portNumber+"/"+dbName2, username, password);
        System.out.println("Connected to database");
        return conn;
    }

    /**################################### FONCTION ##################################################"""**/
    
    /** Retourne type si l'utilisateur existe, null sinon */
    /** Retourne type si l'utilisateur existe, null sinon */
    public static boolean  addElementStudentGui(Connection con, String email, String mdp,String sexe,String prenom,String nom,String date,String adresse,String code,String ville,String pays,String telephone, String etab,String spe){
        boolean type = false ;
        try {
            Statement smt = con.createStatement() ;
            type = smt.execute("INSERT INTO STUDENT (EMAIL, MDP, SEXE, PRENOM, NOM, DATE, ADRESSE, CODEPOSTAL, VILLE, PAYS, TELEPHONE, ETAB, SPE) "
                        + "VALUES ('"+email+"', '"+mdp+"', '"+sexe+"', '"+prenom+"', '"+nom+"', '"+date+"', '"+adresse+"', '"+code+"', '"+ville+"', '"+pays+"', '"+telephone+"', '"+etab+"', '"+spe+"')");
                                          
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return type ;  
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
    
    /** Ce main sert uniquement de test, s'y référer pour voir comment appeler les fonctions */
   public static void main(String[] args){
        try {
            
            //Connection c1 = DatabaseManager.connectionDatabase() ;
            Connection c1 = Data.connectionDatabase1() ;
            Connection c2 = Data.connectionDatabase2() ;

      /*  if(addElementStudentGui(c1,"STUDENT", "Mr","Mb","Yann","testmdp","10-03-96","yann.md@yahoo.fr","141 avenue de rangueil","31400","Toulouse","France","06.34.58.49.79","INSA Toulouse","IR","Jeune Etudiant, cherche stage"))
        {
          System.out.println("Well done 1...");
        }
        else
          System.out.println("Cratch 1...");  
        
        if(addElementStudentGui(c1,"STUDENT", "Mr","Etudiant","Etudiant","etudiant","10-03-96","etud@yahoo.fr","143 avenue de rangueil","31400","Toulouse","France","06.65.58.49.99","Epitech","IR","Jeune Etudiant, cherche stage"))
            {
          System.out.println("Well done 2...");
        }
        else
          System.out.println("Cratch 2..."); */
        
        String description="resume";

        Data.setElement(c1, "Etudiant", "etudiant", description, "STUDENT", "DESCRIPTION");     
        
        c1.close();
            c2.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}