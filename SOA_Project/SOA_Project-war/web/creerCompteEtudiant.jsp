%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Création Compte Etudiant</title>
    </head>
    <body>        
        <form method="post" action="servletCreerCompteEtudiant">
            <fieldset>
            <legend>	Enregistrement	</legend>
                <label for="email">Email<red>*</red></label>
                    <input type="email" name="email" id="email" required><br>
                <label for="mdp">Mot de passe<red>*</red></label>
                    <input type="password" name="mdp1" id="mdp1" required><br>
                <label for="mdp">Confirmation Mot de passe<red>*</red></label>
                    <input type="password" name="mdp2" id="mdp2" required><br>
            </fieldset><br>
            <fieldset>
                <legend>	Profil	</legend>
                <label for="civilite">Sexe<red>*</red></label>
                    <input type="radio" name="sexe" value="M" checked/>Homme
                    <input type="radio" name="sexe" value="F"/>Femme</label><br>
                <label for="prenom">Prénom<red>*</red></label>
                    <input type="text" id="prenom" name="prenom" size="20" maxlength="20" required/><br>
                <label for="nom">Nom<red>*</red></label>
                    <input type="text" id="nom" name="nom" size="20" maxlength="20" required/><br>
                <label for="date_de_naissance">Date de naissance<red>*</red></label>
                    <input type="date" name="date" id="date" required><br>
                <label for="adresse">Adresse<red>*</red></label>
                    <input type="text" id="adresse" name="adresse" size="30" maxlength="20" required/><br>
                <label for="code_postal">Code Postal<red>*</red></label>
                    <input type="text" id="code_postal" name="code_postal" size="5" maxlength="5" required/><br>
                <label for="ville">Ville<red>*</red></label>
                    <input type="text" id="ville" name="ville" size="20" maxlength="20" required/><br>
                <label for="pays">Pays<red>*</red></label>
                    <input type="text" id="pays" name="pays" size="20" maxlength="20" required/><br>
                <label for="telephone">Téléphone<red>*</red></label>
                    <input type="tel" id="telephone" name="telephone" size="10" maxlength="10" required/><br>
                <label for="etablissement_scolaire">Etablissement_scolaire<red>*</red></label>
                    <input type="text" id="etablissement_scolaire" name="etablissement_scolaire" size="20" maxlength="20" required/><br>
                <label for="specialite">Spécialité<red>*</red></label></td>
                    <input type="text" id="specialite" name="secialite" size="20" maxlength="20" required/><br>
            </fieldset><br>
            <input type="submit" value="Valider"/>
        </select>
    </body>
</html>