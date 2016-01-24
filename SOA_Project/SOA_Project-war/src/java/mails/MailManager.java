package mails;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Classe gérant l'envoi de mail à travers le serveur SMTP.
 *
 * @author Yann
 */
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailManager {

    public static String mailUtil = "noreply.smartdb@gmail.com";
    public static String passUtil = "1*smart-db*2";

    /**
     * Envoi d'un nouveau mot de passe newPasswd à l'adresse mail "address"
     */
    public static void sendNewPassword(String address, String newPasswd) {
        MailManager.sendMail(address, "Bonjour,\n" + "Votre mot de passe a été réinitialisé avec succès.\n\n"
                + "Votre nouveau mot de passe est : " + newPasswd + "\n\n\n"
                + "Pour toute réclamation, veuillez contactez l'administrateur à l'adresse mail : lachegur@etud.insa-toulouse.fr", "Réinitialisation de votre mot de passe sur Sopra Covoiturage");
    }

    /**
     * Envoi d'une confirmation lors de la création d'un compte à l'adresse
     * "address" avec le mot de passe "mdp"
     */
    public static void sendCreateConfirmation(String adresse) {
        String mess = "Bonjour,\n" + "Votre compte sur SmartDB a été crée avec succès.\n\n\n" + "A bientôt sur SmartDB\n\n\n"
                + "Pour toute réclamation, veuillez contacter l'administrateur à l'adresse mail : lachegur@etud.insa-toulouse.fr";
        String subject = "Création de votre compte SmartDB";
        MailManager.sendMail(adresse, mess, subject);
    }
    
    
     /**
     * Envoi d'une confirmation lors de la création d'un compte à l'adresse
     * "address" avec le mot de passe "mdp"
     */
    public static void sendAnswerP(String adresse,String name) {
       String mess = "Bonjour,\n" + "Ce mail vous a été envoyé car vous avez été retenu(e) par "+name+" pour votre Stage.\n\n\n" + "Cordialement\n\n\n"+ "L'equipe RH "+name+"\n\n\n"      ;
        String subject = "["+name+"]Suite candidature de stage";
        MailManager.sendMail(adresse, mess, subject);
    }
    
    public static void sendAnswerN(String adresse,String name) {
       String mess = "Bonjour,\n" + "Ce mail vous a été envoyé car vous n'avez pas été retenu(e) par "+name+" pour votre Stage malgré la richesse de votre CV.\n\n\n" + "Cordialement\n\n\n"+ "L'equipe RH "+name+"\n\n\n"      ;
        String subject = "["+name+"]Suite candidature de stage";
        MailManager.sendMail(adresse, mess, subject);
    }
     /**
     * Envoi d'une confirmation lors de la création d'un compte à l'adresse
     * "address" avec le mot de passe "mdp"
     */
    public static void sendConvocation(String adresse, String name) {
        String mess = "Bonjour,\n" + "Ce mail vous a été envoyé car vous êtes convoqué par "+name+" pour votre Stage.\n\n\n" + "Cordialement\n\n\n"+ "L'equipe RH "+name+"\n\n\n"      ;
        String subject = "["+name+"]Convocation de Stage";
        MailManager.sendMail(adresse, mess, subject);
    }

    /**
     * Fonction générique pour envoyez un mail à l'adresse "address" dont le
     * contenu est "msg" et le sujet "subject"
     */
    public static void sendMail(String address, String msg, String subject) {
        try {
            // Step1
            Properties mailServerProperties = System.getProperties();
            mailServerProperties.put("mail.smtp.port", "587");
            mailServerProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            mailServerProperties.put("mail.smtp.auth", "true");
            mailServerProperties.put("mail.smtp.starttls.enable", "true");
            
            // Step2
            Session getMailSession = Session.getDefaultInstance(mailServerProperties, null);
            MimeMessage generateMailMessage = new MimeMessage(getMailSession);
            generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(address));
            generateMailMessage.setSubject(subject);
            generateMailMessage.setContent(msg, "text/html");
            
            // Step3
            Transport transport = getMailSession.getTransport("smtp");
            
            // Enter your correct gmail UserID and Password
            // if you have 2FA enabled then provide App Specific Password
            transport.connect("smtp.gmail.com", mailUtil, passUtil);
            transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
            transport.close();
        } catch (MessagingException ex) {
            Logger.getLogger(MailManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Fonction utile uniquement pour les tests, n'est absolument pas utilisée
     * lors du déroulement de l'application
     */
    public static void main(String[] args) {
        //SMTPManager.sendMail("squallih@etud.insa-toulouse.fr", "Voici mon message,"
        //        + "\n Hehe cocoo !", "Ca marche !");
        MailManager.sendCreateConfirmation("yann.mb94@gmail.com");
    }
}
