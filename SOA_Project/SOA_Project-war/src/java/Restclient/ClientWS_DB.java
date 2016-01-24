package Restclient;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
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
import org.json.JSONObject;

/**
 *
 * @author Ayoub
 */
public final class ClientWS_DB {
    
    private final String USER_AGENT = "Mozilla/5.0";
    private final String url = "http://localhost:8080/CompanyDB/webresources";
    
    
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
    private String sendPost(String complement, String param) throws Exception {
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

			if (httpConnection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ httpConnection.getResponseCode());
			}

			BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
					(httpConnection.getInputStream())));

			
			System.out.println("Output from Server:\n");
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

     public String fromStageToJson(Stage stage){
        
        String result;        
        JSONObject jsonObject = new JSONObject(stage);
        result  =jsonObject.toString();
        
        return result;
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
    
    public void addStage(Stage st){
    	try{   		
    		String json = "{"+
    		        "siret"+":"+"12356987447150"+","+
    		        "titresujet"+":"+ "Jayce"+","+
    		        "reference"+":"+"ref010"+","+
    		        "descriptionsujet"+":"+"DescrSuj"+","+
    		        "remuneration"+":"+"1000/mois"+","+
    		        "adresse" +":"+"adresse"+","+
    		        "contactname"+":"+"contactname"+","+
    		        "contacttel"+":"+"0258741963"+","+
    		        "contactweb"+":"+"http://www.ex.ent.fr"+","+
    		        "typecontrat"+":"+"stage"+","+
    		        "duree"+":"+"7 mois"+","+
    		        "specialite"+":"+"RT"+","+
    		        "niveauetude"+":"+"4A"+"}";
                json= fromStageToJson(st);
    		System.out.println("json: "+json);
    		String result=this.sendPost("/entities.stages", json); 
    		System.out.println("insertStage: "+result);
        }catch(Exception e){
            System.out.println("NBstage: Exception raised.");
        }
    }    
    
    
    public static void main(String[] args) {
        
        ClientWS_DB db = new ClientWS_DB();
         Stage st = new Stage ("blagnac","jayce","0435498279","stage renforce","7 mois"
		 ,"bac+5", "TI-ST1458", "1200", "1234656879","IR","ingenieur reseau","stage","http://www.orange.com");
        db.addStage(st);
        // System.out.println(db.getOffreStage("ISS")); 
        // System.out.println(db.getMesCandidatures("etud"));
        // System.out.println(db.getMaRef("UnSujet"));
        // System.out.println(db.getMaRef("testSujet")); 
        
    }
}
