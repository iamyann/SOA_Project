/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import beans.EntrepriseBean;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author TOSHIBA
 */
public class CreationEntrepriseForm {
    
    //fonction permettant de récuperer les valeurs des paramètres
    private String getValeurChamp(HttpServletRequest request,String nomChamp) {
        String valeur=request.getParameter(nomChamp);
        return valeur;
    }
    
    public EntrepriseBean creerCompteEntreprise(HttpServletRequest request) {
        
        String email = getValeurChamp(request,"emailEtab");
        String motDePasse = getValeurChamp(request,"mdp1");
        String type = getValeurChamp(request,"typeEtab");
        String nom = getValeurChamp(request,"nomEntreprise");
        String siret = getValeurChamp(request,"siret");
        String domaine = getValeurChamp(request,"domaineAct");
        String taille = getValeurChamp(request,"tailleEtab");
        String adresse = getValeurChamp(request,"adresseEtab");
        String codePostal = getValeurChamp(request,"codePos");
        String ville = getValeurChamp(request,"villeEtab");
        String pays = getValeurChamp(request,"paysEtab");
        String telephone = getValeurChamp(request,"telEtab");
        String siteWeb = getValeurChamp(request,"siteWebEtab"); 

        EntrepriseBean entreprise = new EntrepriseBean();
        
        /* Avant d'affecter les données au bean , on appelera 
           les fonctions vérifications , mais bon je fais 
           ici l'affecttion sans vérification d'abord,
           j'y reviendrai
        */
        
        entreprise.setEmail(email);
        entreprise.setMotDePasse(motDePasse);
        entreprise.setType(type);
        entreprise.setNom(nom);
        entreprise.setSiret(siret);
        entreprise.setDomaine(domaine);
        entreprise.setTaille(taille);
        entreprise.setAdresse(adresse);
        entreprise.setCodePostal(codePostal);
        entreprise.setVille(ville);
        entreprise.setPays(pays);
        entreprise.setTelephone(telephone);
        entreprise.setSiteWeb(siteWeb);
        
        return entreprise;
    }
    
    //fonction permettant de vérifier si l'email n'existe pas dans la base de données
    private void verifierEmail(String email) {
     //a implémenter   
    }
    
    //fonction permettant de vérifier si le nom n'existe pas dans la base de données
    private void verifierNom (String nom) {
        //a implémenter
    }
   
    
}
