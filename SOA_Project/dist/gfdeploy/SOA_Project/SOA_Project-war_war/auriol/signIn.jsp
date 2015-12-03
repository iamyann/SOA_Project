
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign IN</title>

        <script language="javascript">
            //fonction permettant d'afficher les cases à cocher entreprise et étudiants après le clic sur creer un compte
            function afficherLesChamps() {
                i = 1;
                for (i = 1; i <= 5; i++) {
                    document.getElementById("cacher" + i).style.visibility = "visible";
                }
            }

            //fonction permettant de cacher les cases à cocher entreprise et étudiants au chargement de la page
            function cacherLesChamps() {
                i = 1;
                for (i = 1; i <= 5; i++) {
                    document.getElementById("cacher" + i).style.visibility = "hidden";
                }
            }
        </script>
    </head>

    <body onLoad="cacherLesChamps()">
        <h1>SIGN IN</h1> 
        <br/>
        <form method="post" action="afficherProfil">
            <table>
                <tr>
                    <td width="100"><label for="login">Login</label></td>
                    <td width="100"><input type="text" id="login" name="login" placeholder="Entrez votre login" value="" size="25" maxlength="20"/></td>
                </tr>
                <tr>
                    <td width="100"><label for="password">Mot de Passe</label></td>
                    <td width="100"><input type="text" id="password" name="password" placeholder="Entrez votre mot de passe" value="" size="25" maxlength="20"/></td>
                </tr>
                <tr>
                    <td width="100"><input type="submit" value="Valider"/></td>
                </tr>   
            </table>
        </form>

        <form method="post" action="CreationCompte">
            <a href="#" onClick="afficherLesChamps()">Créer un compte</a><br/>
                <table>
                    <tr>
                        <td width="300">
                            <input type="radio" name="typeCompte" value="etudiant" id="cacher1"/> 
                            <label for="etudiant" id="cacher2">Etudiant<label/>
                            <input type="radio" name="typeCompte" value="entreprise" id="cacher3"/>
                            <label for="entreprise" id="cacher4">Entreprise/Laboratoire<label/>
                        </td>
                    </tr>
                    <tr>
                        <td width="100"><input type="submit" id="cacher5" value="Valider"></td>
                    </tr>
            </table>
        </form>
    </body>
</html>
