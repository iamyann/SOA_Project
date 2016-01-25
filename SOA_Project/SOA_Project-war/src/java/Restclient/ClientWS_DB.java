package Restclient;


//import com.sun.corba.se.impl.orbutil.ObjectWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//import org.json.*;

import javax.net.ssl.HttpsURLConnection;
//import org.json.JSONObject;

/**
 *
 * @author Ayoub
 */
public final class ClientWS_DB {
    
    private final String USER_AGENT = "Mozilla/5.0";
    private final String url = "http://192.168.0.12:8080/CompanyDB/webresources";
    
    
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
        //System.out.println("\n Sending 'GET' request to URL : " + url);
        //System.out.println("Response Code : " + responseCode);
        
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        //print result
        //System.out.println(response.toString());
        return response.toString();
        
    }
    
    // HTTP POST reques
    private String sendPost(String complement, String param) throws Exception 
    {
       String output="";
        try {

			URL targetUrl = new URL(url+complement);

			HttpURLConnection httpConnection = (HttpURLConnection) targetUrl.openConnection();
			httpConnection.setDoOutput(true);
			httpConnection.setRequestMethod("POST");
			httpConnection.setRequestProperty("Content-Type", "application/json");


			OutputStream outputStream = httpConnection.getOutputStream();
			outputStream.write(param.getBytes());
			outputStream.flush();
			
			System.out.println(outputStream.toString());
			System.out.println("code : "+httpConnection.getResponseCode());

			/*if (httpConnection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ httpConnection.getResponseCode());
			}*/
			
			//System.out.println("2");

			BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
					(httpConnection.getInputStream())));

			
			//System.out.println("Output from Server:\n");
			while ((output = responseBuffer.readLine()) != null) {
				System.out.println(output);
                                return output;
                        }
                           
			httpConnection.disconnect();

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		 }
        
            return output;
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

    
    public String getOffreStage(String spe){
    	String result="";
    	try{            
            result=this.sendGet("/entities.stages/bySpecialite/"+spe);   
        }catch(Exception e){
            System.out.println("NBstage: Exception raised.");
        }
		return result;
    }
    
    public String getStage(String siret){
    	String result="";
    	try{            
            result=this.sendGet("/com.webservice.stages/bySiret/"+siret);   
        }catch(Exception e){
            System.out.println("NBstage: Exception raised.");
        }
		return result;
    }
    
    public String getUNStage(String siret, String reference){
    	String result="";
    	try{            
            result=this.sendGet("/entities.stages/byRef/"+reference);   
        }catch(Exception e){
            System.out.println("NBstage: Exception raised.");
        }
		return result;
    }
    
    public String getMesCandidatures(String nom){
    	String result="";
    	try{            
            result=this.sendGet("/com.webservice.candidatures/CandidatureIndividuel/"+nom);   
        }catch(Exception e){
            System.out.println("NBstage: Exception raised.");
        }
		return result;
    }
    
    public String getMaRef(String title){
    	String result="";
    	try{            
            result=this.sendGet("/entities.stages/byTitle/"+title);   
        }catch(Exception e){
            System.out.println("NBstage: Exception raised.");
        }
		return result;
    }
    
    public void addStage(String siret, String titre, String ref,String desc, String rem,
    		String adresse, String contactname, String contacttel, String contactweb,
    		String type, String duree, String[] spe, String[] niveau){
    	try{   		
    		String json = "{"+
    		        "\"siret\""+":"+"\""+siret+"\""+","+
    		        "\"titresujet\""+":"+ "\""+titre+"\""+","+
    		        "\"reference\""+":"+"\""+ref+"\""+","+
    		        "\"descriptionsujet\""+":"+"\""+desc+"\""+","+
    		        "\"remuneration\""+":"+"\""+rem+"\""+","+
    		        "\"adresse\"" +":"+"\""+adresse+"\""+","+
    		        "\"contactname\""+":"+"\""+contactname+"\""+","+
    		        "\"contacttel\""+":"+"\""+contacttel+"\""+","+
    		        "\"contactweb\""+":"+"\""+contactweb+"\""+","+
    		        "\"typecontrat\""+":"+"\""+type+"\""+","+
    		        "\"duree\""+":"+"\""+duree+"\""+","+
    		        "\"specialite\""+":"+"\""+spe+"\""+","+
    		        "\"niveauetude\""+":"+"\""+niveau+"\""+"}";                
    		
    		String result=this.sendPost("/entities.stages", json); 
    		
    		System.out.println("insertStage: "+result);
        }catch(Exception e){
            System.out.println("NBstage: Exception raised.");
        }
    } 
    
    public void addStageV2(String leJson){
    	try{   	
                       
    		String result=this.sendPost("/entities.stages", leJson); 
    		
    		System.out.println("insertStage: "+result);
        }catch(Exception e){
            System.out.println("NBstage: Exception raised.");
        }
    }    
    
    
    public static void main(String[] args) {
        
        ClientWS_DB db = new ClientWS_DB();
    
        //db.addStage("12345678912344","Olga","ref010","DescrSuj","1000","adresse","contactname",
        		//"0258741963","http://www.ex.ent.fr","stage","7 mois","IR","4A" );       
    }
}
