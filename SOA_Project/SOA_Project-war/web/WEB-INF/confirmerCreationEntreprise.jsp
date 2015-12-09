<%-- 
    Document   : confirmerCreationEntreprise
    Created on : 9 déc. 2015, 01:30:24
    Author     : TOSHIBA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation de création du compte</title>
    </head>
    <body>
        <header>
            
        </header>
        
        <nav>
            
        </nav>
        
        <section>
            <aside>
                <p>Veuillez vérifier l'exactitude des renseignements</p>
                <fieldset>  
                    <legend> VOS RENSEIGNEMENTS</legend>
                    <p>
                        Email : ${entrepriseBean.email}<br/>
                        Type : ${entrepriseBean.type}<br/>
                        Nom : ${entrepriseBean.nom}<br/>
                        Siret : ${entrepriseBean.siret}<br/>
                        Domaine : ${entrepriseBean.domaine}<br/>
                        Taille : ${entrepriseBean.taille}<br/>
                        Adresse : ${entrepriseBean.adresse}<br/>
                        Code Postal : ${entrepriseBean.codePostal}<br/>
                        Ville : ${entrepriseBean.ville}<br/>
                        Pays : ${entrepriseBean.pays}<br/>
                        Téléphone : ${entrepriseBean.telephone}<br/>
                        Site Web${entrepriseBean.siteWeb} <br/>
                    </p>

                    <form action ="ServletConfirmation" method="post">
                        <table>
                            <tr>
                                <td><input type="submit" name="soumettre" value="valider"></td>
                                <td><input type="submit" name="soumettre" value="editer"></td>
                            </tr>

                        </table>

                    </form>
                </fieldset>
        </section>
        
      
    </body>
</html>
