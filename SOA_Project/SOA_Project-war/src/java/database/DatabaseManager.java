/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Cette classe a pour but d'intéragir avec la base de données; pour la configuration de celle-ci, veuillez vous reporter au fichier README au sein des livrables du projet.
 * @author mohamedsqualli
 */
public class DatabaseManager {
    private static String username = "root" ;
    private static String password = "root" ;
    private static String serverName = "localhost";
    private static String portNumber="1527" ;
    private static String dbName ="smartdb-members";
    
    /** Retourne le lien de connection après l'avoir établi */
    public static Connection connectionDatabase() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:derby://"+serverName+":"+portNumber+"/"+dbName, username, password);
        System.out.println("Connected to database");
        return conn;
    }
    
    /** Retourne null si cet utilisateur n'existe pas, sinon retourne "admin" ou "user"  */
    public static String verifConnection(Connection con,String email,String mdp){
        String exist = null ;
        try {
            
            Statement smt = con.createStatement() ;
            ResultSet resultset = smt.executeQuery("SELECT firstname, lastname FROM Members WHERE email = '"+email+"' AND  password = '"+mdp+"'");
            if (resultset.next()){
                String i = resultset.getString("firstname");
                String j = resultset.getString("lastname");
                System.out.println(i+j);
            } else {
                System.out.println("nothing here");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist ;
    }
    
    /** Vérifie l'existence du mail dans la table des utilisateurs, renvoie "true" s'il existe, "false" sinon */
    public static Boolean existMail(Connection con, String email){
        Boolean exist = false ;
        try {
            Statement smt = con.createStatement();
            ResultSet resultset =smt.executeQuery("SELECT email FROM Members WHERE email = '"+email+"'");
            if (resultset.next()){
                exist=true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist ;
    }
    
    /** Modifie le mot de passe de l'utilisateur ayant l'email "email" avec le nouveau mot de passe "mdp" et renvoie "true" si l'email existe dans la base de données */
    public static Boolean modifPwd(Connection con,String email, String mdp){
        Boolean exist = false;
        try {
            if (existMail(con,email)){
            Statement smt = con.createStatement() ;
            smt.executeUpdate("UPDATE Member SET password='"+mdp+"' WHERE email='"+email+"'");
            exist = true ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist ;
    }
    
    /** Supprime l'utilisateur ayant l'email "email" et renvoie "true" si cet utilisateur existait bien, "false" sinon */
    public static Boolean  deleteUser(Connection con, String email){
        Boolean exist = false ;
        try {
            if (existMail(con, email)){
                Statement smt = con.createStatement() ;
                smt.executeUpdate("DELETE FROM Members WHERE email = '"+email+"'");
                exist = true ;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist ;
        
    }
    
    /** Retourne le mot de passe de l'utilisateur dont l'email est "user" si l'utilisateur existe, null sinon */
    public static String  getPassword(Connection con, String user){
        String pass = null ;
        try {
            Statement smt = con.createStatement() ;
            ResultSet resultset =smt.executeQuery("SELECT password FROM Members WHERE email='"+user+"'");
            if(resultset.next()){
                pass = resultset.getString("password");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pass ;  
    }
    
    
   
    
    
        
    
    /** Ce main sert uniquement de test, s'y référer pour voir comment appeler les fonctions */
    public static void main(String[] args){
        try {
            
            Connection c1 = DatabaseManager.connectionDatabase() ;
            verifConnection(c1, "samih@lo.lo", "toto");
            deleteUser(c1,"samih@lo.lo");
            verifConnection(c1, "samih@lo.lo", "toto");
            c1.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}