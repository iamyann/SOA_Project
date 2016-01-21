package servlets;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*	goji.Get("/api/v1/stations", getAll)
*       goji.Get("/api/v1/stations/:id", get)
*	goji.Post("/api/v1/stations/update/:station", update)
*	goji.Post("/api/v1/stations/:name/:ip", insert)
*	goji.Options("/api/v1/stations/all", DeleteAll)
*	goji.Options("/api/v1/stations/:id", Delete)
*/


import com.sun.corba.se.impl.orbutil.ObjectWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;

import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Ayoub
 */
public final class ClientWS_DB {
    
    private final String USER_AGENT = "Mozilla/5.0";
    private final String url = "http://localhost:8080/WEB-INF/webresources";
    
    
    public ClientWS_DB() {
        //createConnection();
    }
    
    // HTTP GET request
    private String sendGet(String complement) throws Exception {
                
        URL obj = new URL(url+complement);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        
        // optional default is GET
        con.setRequestMethod("GET");
        
        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Content-Type", "application/json");
        
        int responseCode = con.getResponseCode();
        System.out.println("\n Sending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        //print result
        System.out.println(response.toString());
        return response.toString();
        
    }
    
    // HTTP POST request
    private String sendPost(String complement, String param) throws Exception {
        
        URL obj = new URL(url+complement);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        
        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        
        String urlParameters = param;
        
        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();
        
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);
        
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        //print result
        System.out.println(response.toString());
        return response.toString();
        
    }
    
    public String sendDelete(String complement) throws Exception{
        
        URL obj = new URL(url+complement);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        
        // optional default is GET
        con.setRequestMethod("DELETE");
        
        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Content-Type", "application/json");
        
        int responseCode = con.getResponseCode();
        System.out.println("\n Sending 'DELETE' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        //print result
        System.out.println(response.toString());
        return response.toString();
        
    }
    
   
   
    
    public void deletestage(String id){
        try{
            String result;
            result=this.sendDelete("entities.stages/count");
            System.out.println("deleteParking: "+result);
        }catch(Exception e){
            System.out.println("deleteParking: Exception raised.");
        }       
    }
    public void getNbrStage(){
        try{
            String result;
            result=this.sendGet("/entities.stages/count");
            System.out.println("NBstage: "+result);
        }catch(Exception e){
            System.out.println("NBstage: Exception raised.");
        }
    }
    /*------------------------------------------------------         METHODES POUR LE PARSING       -----------------------------------------------------------------*/
    
   //-------------------------------------------------         MAIN POUR LES TESTS       -----------------------------------------------------------------------*/
    
    public static void main(String[] args) {
        
        ClientWS_DB db = new ClientWS_DB();
        
        db.getNbrStage();
//        
        
    }
}
