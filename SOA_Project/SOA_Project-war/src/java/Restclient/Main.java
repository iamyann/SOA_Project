/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restclient;

/**
 *
 * @author yann
 */

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Main {
 public static void main(String arg[]) throws Exception{
	 
     ClientWS_DB db1 = new ClientWS_DB();        
     String result= db1.getOffreStage("ISS");      
     
   String xmlRecords = result;

   DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
   InputSource is = new InputSource();
   is.setCharacterStream(new StringReader(xmlRecords));

   Document doc = db.parse(is);
   NodeList nodes = doc.getElementsByTagName("stages");

   for (int i = 0; i < nodes.getLength(); i++) {
     Element element = (Element) nodes.item(i);

     NodeList name = element.getElementsByTagName("reference");
     Element line = (Element) name.item(0);
     System.out.println("REFERENCE_Stage: " + getCharacterDataFromElement(line));

     NodeList title = element.getElementsByTagName("titresujet");
     line = (Element) title.item(0);
     System.out.println("Intitulé: " + getCharacterDataFromElement(line));
     
     NodeList Entreprise = element.getElementsByTagName("siret");
     line = (Element) Entreprise.item(0);
     System.out.println("Siret: " + getCharacterDataFromElement(line));
     
     NodeList Lieu = element.getElementsByTagName("adresse");
     line = (Element) Lieu.item(0);
     System.out.println("Lieu: " + getCharacterDataFromElement(line));
     
     NodeList Rem = element.getElementsByTagName("remuneration");
     line = (Element) Rem.item(0);
     System.out.println("REMUNERATION: " + getCharacterDataFromElement(line));
   }

 }

 public static String getCharacterDataFromElement(Element e) {
   Node child = e.getFirstChild();
   if (child instanceof CharacterData) {
     CharacterData cd = (CharacterData) child;
     return cd.getData();
   }
   return "";
 }
}
