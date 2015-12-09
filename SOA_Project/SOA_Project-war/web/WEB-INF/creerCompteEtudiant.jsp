<%@page contentType="text/html" pageEncoding="ISO8859-1"%>
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
            <legend>Enregistrement</legend>
                <label for="email">Email<red>*</red></label>
                    <input type="text" name="email" id="email" size="20" maxlength="30" required><br> <!-- remettre en mail!!!-->
                <label for="mdp">Mot de passe<red>*</red></label>
                    <input id="mdp1" type="password" name="mdp1" id="mdp1" size="20" maxlength="20" required><br>
                <label for="mdp">Confirmation Mot de passe<red>*</red></label>
                    <input id="mdp2" type="password" name="mdp2" id="mdp2" size="20" maxlength="20" required><br>
            </fieldset><br>
            <fieldset>
                <legend>Profil</legend>
                <label for="civilite">Sexe<red>*</red></label>
                    <input type="radio" name="sexe" value="M" checked/>Homme
                    <input type="radio" name="sexe" value="F"/>Femme</label><br>
                <label for="prenom">Prénom<red>*</red></label>
                    <input type="text" id="prenom" name="prenom" size="20" maxlength="20" required/><br>
                <label for="nom">Nom<red>*</red></label>
                    <input type="text" id="nom" name="nom" size="20" maxlength="20" required/><br>
                <label for="date_de_naissance">Date de naissance<red>*</red></label>
                    <!--<input type="text" name="date" id="date" size="10" maxlength="10" required><br>-->
                    <select id="jour" name="jour" required>
                        <option value="01">01</option><option value="02">02</option><option value="3">03</option>
                        <option value="04">04</option><option value="05">05</option><option value="6">06</option>
                        <option value="07">07</option><option value="08">08</option><option value="9">09</option>
                        <option value="10">10</option><option value="11">11</option><option value="12">12</option>
                        <option value="13">13</option><option value="14">14</option><option value="15">15</option>
                        <option value="16">16</option><option value="17">17</option><option value="18">18</option>
                        <option value="19">19</option><option value="20">20</option><option value="21">21</option>
                        <option value="22">22</option><option value="23">23</option><option value="24">24</option>
                        <option value="25">25</option><option value="26">26</option><option value="27">27</option>
                        <option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option>
                    </select>
                    /                   
                    <select id="mois" name="mois" required>
                        <option value="01">janvier</option><option value="02">février</option><option value="03">mars</option>
                        <option value="04">avril</option><option value="05">mai</option><option value="06">juin</option>
                        <option value="07">juillet</option><option value="08">août</option><option value="09">septembre</option>
                        <option value="10">octobre</option><option value="11">novembre</option><option value="12">décembre</option>
                    </select>
                    /
                    <select id="annee" name="annee" required>
                        <option value="1990">1990</option><option value="1991">1991</option><option value="1992">1992</option>
                        <option value="1993">1993</option><option value="1994">1994</option><option value="1995">1995</option>
                        <option value="1996">1996</option><option value="1997">1997</option><option value="1998">1998</option>
                        <option value="1999">1999</option><option value="2000">2000</option><option value="2001">2001</option>   
                    </select><br>
                <label for="adresse">Adresse<red>*</red></label>
                    <input type="text" id="adresse" name="adresse" size="30" maxlength="30" required/><br>
                <label for="code_postal">Code Postal<red>*</red></label>
                    <input type="text" id="code_postal" name="code_postal" size="5" maxlength="5" required/><br>
                <label for="ville">Ville<red>*</red></label>
                    <input type="text" id="ville" name="ville" size="20" maxlength="20" required/><br>
                <label for="pays">Pays<red>*</red></label>
                    <!--<input type="text" id="pays" name="pays" size="20" maxlength="20" required/><br>-->
                    <select id="pays" name="pays" required>
                        <option value="1">Choisir Pays</option>
                        <option value="Afghanistan">Afghanistan </option>
                        <option value="Afrique_Centrale">Afrique_Centrale </option>
                        <option value="Afrique_du_sud">Afrique_du_Sud </option>
                        <option value="Albanie">Albanie </option>
                        <option value="Algerie">Algerie </option>
                        <option value="Allemagne">Allemagne </option>
                        <option value="Andorre">Andorre </option>
                        <option value="Angola">Angola </option>
                        <option value="Anguilla">Anguilla </option>
                        <option value="Arabie_Saoudite">Arabie_Saoudite </option>
                        <option value="Argentine">Argentine </option><option value="Armenie">Armenie </option><option value="Australie">Australie </option><option value="Autriche">Autriche </option><option value="Azerbaidjan">Azerbaidjan </option><option value="Bahamas">Bahamas </option><option value="Bangladesh">Bangladesh </option><option value="Barbade">Barbade </option><option value="Bahrein">Bahrein </option><option value="Belgique">Belgique </option><option value="Belize">Belize </option><option value="Benin">Benin </option><option value="Bermudes">Bermudes </option><option value="Bielorussie">Bielorussie </option><option value="Bolivie">Bolivie </option><option value="Botswana">Botswana </option><option value="Bhoutan">Bhoutan </option><option value="Boznie_Herzegovine">Boznie_Herzegovine </option><option value="Bresil">Bresil </option><option value="Brunei">Brunei </option><option value="Bulgarie">Bulgarie </option><option value="Burkina_Faso">Burkina_Faso </option><option value="Burundi">Burundi </option><option value="Caiman">Caiman </option><option value="Cambodge">Cambodge </option><option value="Cameroun">Cameroun </option><option value="Canada">Canada </option><option value="Canaries">Canaries </option><option value="Cap_vert">Cap_Vert </option><option value="Chili">Chili </option><option value="Chine">Chine </option><option value="Chypre">Chypre </option><option value="Colombie">Colombie </option><option value="Comores">Colombie </option><option value="Congo">Congo </option><option value="Congo_democratique">Congo_democratique </option><option value="Cook">Cook </option><option value="Coree_du_Nord">Coree_du_Nord </option><option value="Coree_du_Sud">Coree_du_Sud </option><option value="Costa_Rica">Costa_Rica </option><option value="Cote_d_Ivoire">Cote_d_Ivoire </option><option value="Croatie">Croatie </option><option value="Cuba">Cuba </option><option value="Danemark">Danemark </option><option value="Djibouti">Djibouti </option><option value="Dominique">Dominique </option><option value="Egypte">Egypte </option><option value="Emirats_Arabes_Unis">Emirats_Arabes_Unis </option><option value="Equateur">Equateur </option><option value="Erythree">Erythree </option><option value="Espagne">Espagne </option><option value="Estonie">Estonie </option><option value="Etats_Unis">Etats_Unis </option><option value="Ethiopie">Ethiopie </option><option value="Falkland">Falkland </option><option value="Feroe">Feroe </option><option value="Fidji">Fidji </option><option value="Finlande">Finlande </option><option value="France">France </option><option value="Gabon">Gabon </option><option value="Gambie">Gambie </option>
                        <option value="Georgie">Georgie </option>
                        <option value="Ghana">Ghana </option>
                        <option value="Gibraltar">Gibraltar </option>
                        <option value="Grece">Grece </option>
                        <option value="Grenade">Grenade </option>
                        <option value="Groenland">Groenland </option>
                        <option value="Guadeloupe">Guadeloupe </option>
                        <option value="Guam">Guam </option>
                        <option value="Guatemala">Guatemala</option>
                        <option value="Guernesey">Guernesey </option>
                        <option value="Guinee">Guinee </option>
                        <option value="Guinee_Bissau">Guinee_Bissau </option>
                        <option value="Guinee equatoriale">Guinee_Equatoriale </option>
                        <option value="Guyana">Guyana </option>
                        <option value="Guyane_Francaise ">Guyane_Francaise </option>
                        <option value="Haiti">Haiti </option>
                        <option value="Hawaii">Hawaii </option>
                        <option value="Honduras">Honduras </option>
                        <option value="Hong_Kong">Hong_Kong </option>
                        <option value="Hongrie">Hongrie </option>
                        <option value="Inde">Inde </option>
                        <option value="Indonesie">Indonesie </option>
                        <option value="Iran">Iran </option>
                        <option value="Iraq">Iraq </option>
                        <option value="Irlande">Irlande </option>
                        <option value="Islande">Islande </option>
                        <option value="Israel">Israel </option>
                        <option value="Italie">italie </option>
                        <option value="Jamaique">Jamaique </option>
                        <option value="Jan Mayen">Jan Mayen </option>
                        <option value="Japon">Japon </option>
                        <option value="Jersey">Jersey </option>
                        <option value="Jordanie">Jordanie </option>
                        <option value="Kazakhstan">Kazakhstan </option>
                        <option value="Kenya">Kenya </option>
                        <option value="Kirghizstan">Kirghizistan </option>
                        <option value="Kiribati">Kiribati </option>
                        <option value="Koweit">Koweit </option>
                        <option value="Laos">Laos </option>
                        <option value="Lesotho">Lesotho </option>
                        <option value="Lettonie">Lettonie </option>
                        <option value="Liban">Liban </option>
                        <option value="Liberia">Liberia </option>
                        <option value="Liechtenstein">Liechtenstein </option>
                        <option value="Lituanie">Lituanie </option>
                        <option value="Luxembourg">Luxembourg </option>
                        <option value="Lybie">Lybie </option>
                        <option value="Macao">Macao </option>
                        <option value="Macedoine">Macedoine </option>
                        <option value="Madagascar">Madagascar </option>
                        <option value="MadÃ¨re">MadÃ¨re </option>
                        <option value="Malaisie">Malaisie </option>
                        <option value="Malawi">Malawi </option>
                        <option value="Maldives">Maldives </option>
                        <option value="Mali">Mali </option>
                        <option value="Malte">Malte </option>
                        <option value="Man">Man </option>
                        <option value="Mariannes du Nord">Mariannes du Nord </option>
                        <option value="Maroc">Maroc </option>
                        <option value="Marshall">Marshall </option>
                        <option value="Martinique">Martinique </option>
                        <option value="Maurice">Maurice </option>
                        <option value="Mauritanie">Mauritanie </option>
                        <option value="Mayotte">Mayotte </option>
                        <option value="Mexique">Mexique </option>
                        <option value="Micronesie">Micronesie </option>
                        <option value="Midway">Midway </option>
                        <option value="Moldavie">Moldavie </option>
                        <option value="Monaco">Monaco </option>
                        <option value="Mongolie">Mongolie </option>
                        <option value="Montserrat">Montserrat </option>
                        <option value="Mozambique">Mozambique </option>
                        <option value="Namibie">Namibie </option>
                        <option value="Nauru">Nauru </option>
                        <option value="Nepal">Nepal </option>
                        <option value="Nicaragua">Nicaragua </option>
                        <option value="Niger">Niger </option>
                        <option value="Nigeria">Nigeria </option>
                        <option value="Niue">Niue </option>
                        <option value="Norfolk">Norfolk </option>
                        <option value="Norvege">Norvege </option>
                        <option value="Nouvelle_Caledonie">Nouvelle_Caledonie </option>
                        <option value="Nouvelle_Zelande">Nouvelle_Zelande </option>
                        <option value="Oman">Oman </option>
                        <option value="Ouganda">Ouganda </option>
                        <option value="Ouzbekistan">Ouzbekistan </option>
                        <option value="Pakistan">Pakistan </option>
                        <option value="Palau">Palau </option>
                        <option value="Palestine">Palestine </option>
                        <option value="Panama">Panama </option>
                        <option value="Papouasie_Nouvelle_Guinee">Papouasie_Nouvelle_Guinee </option>
                        <option value="Paraguay">Paraguay </option>
                        <option value="Pays_Bas">Pays_Bas </option>
                        <option value="Perou">Perou </option>
                        <option value="Philippines">Philippines </option>
                        <option value="Pologne">Pologne </option>
                        <option value="Polynesie">Polynesie </option>
                        <option value="Porto_Rico">Porto_Rico </option>
                        <option value="Portugal">Portugal </option>
                        <option value="Qatar">Qatar </option>
                        <option value="Republique_Dominicaine">Republique_Dominicaine </option>
                        <option value="Republique_Tcheque">Republique_Tcheque </option>
                        <option value="Reunion">Reunion </option>
                        <option value="Roumanie">Roumanie </option>
                        <option value="Royaume_Uni">Royaume_Uni </option>
                        <option value="Russie">Russie </option>
                        <option value="Rwanda">Rwanda </option>
                        <option value="Sahara Occidental">Sahara Occidental </option>
                        <option value="Sainte_Lucie">Sainte_Lucie </option>
                        <option value="Saint_Marin">Saint_Marin </option>
                        <option value="Salomon">Salomon </option>
                        <option value="Salvador">Salvador </option>
                        <option value="Samoa_Occidentales">Samoa_Occidentales</option>
                        <option value="Samoa_Americaine">Samoa_Americaine </option>
                        <option value="Sao_Tome_et_Principe">Sao_Tome_et_Principe </option>
                        <option value="Senegal">Senegal </option>
                        <option value="Seychelles">Seychelles </option>
                        <option value="Sierra Leone">Sierra Leone </option>
                        <option value="Singapour">Singapour </option>
                        <option value="Slovaquie">Slovaquie </option>
                        <option value="Slovenie">Slovenie</option>
                        <option value="Somalie">Somalie </option>
                        <option value="Soudan">Soudan </option>
                        <option value="Sri_Lanka">Sri_Lanka </option>
                        <option value="Suede">Suede </option>
                        <option value="Suisse">Suisse </option>
                        <option value="Surinam">Surinam </option>
                        <option value="Swaziland">Swaziland </option>
                        <option value="Syrie">Syrie </option>
                        <option value="Tadjikistan">Tadjikistan </option>
                        <option value="Taiwan">Taiwan </option>
                        <option value="Tonga">Tonga </option>
                        <option value="Tanzanie">Tanzanie </option>
                        <option value="Tchad">Tchad </option>
                        <option value="Thailande">Thailande </option>
                        <option value="Tibet">Tibet </option>
                        <option value="Timor_Oriental">Timor_Oriental </option>
                        <option value="Togo">Togo </option>
                        <option value="Trinite_et_Tobago">Trinite_et_Tobago </option>
                        <option value="Tristan da cunha">Tristan de cuncha </option>
                        <option value="Tunisie">Tunisie </option>
                        <option value="Turkmenistan">Turmenistan </option>
                        <option value="Turquie">Turquie </option>
                        <option value="Ukraine">Ukraine </option>
                        <option value="Uruguay">Uruguay </option>
                        <option value="Vanuatu">Vanuatu </option>
                        <option value="Vatican">Vatican </option>
                        <option value="Venezuela">Venezuela </option>
                        <option value="Vierges_Americaines">Vierges_Americaines </option>
                        <option value="Vierges_Britanniques">Vierges_Britanniques </option>
                        <option value="Vietnam">Vietnam </option>
                        <option value="Wake">Wake </option>
                        <option value="Wallis et Futuma">Wallis et Futuma </option>
                        <option value="Yemen">Yemen </option>
                        <option value="Yougoslavie">Yougoslavie </option>
                        <option value="Zambie">Zambie </option>
                        <option value="Zimbabwe">Zimbabwe </option>
                    </select><br>
                <label for="telephone">Téléphone<red>*</red></label>
                    <input type="tel" id="telephone" name="telephone" size="10" maxlength="10" required/><br>
                <label for="etablissement_scolaire">Etablissement scolaire<red>*</red></label>
                    <!--<input type="text" id="etablissement_scolaire" name="etablissement_scolaire" size="20" maxlength="20" required/><br>-->
                    <select id="etablissement_scolaire" name="etablissement_scolaire" required>
                        <option value="INSA" id="INSA">INSA</option>
                    </select><br>
                <label for="specialite">Spécialité<red>*</red></label>
                        <select id="spe" name="spe" required>
                        <option value="GB" id="GB">Génie Biochimique</option>
                        <option value="GC" id="GC">Génie Civil</option>
                        <option value="AE" id="AE">Automatique, Electronique</option>
                        <option value="IR" id="IR">Informatique et Réseaux</option>
                        <option value="GMM" id="GMM">Génie Mathématique et Modélisation</option>
                        <option value="GM" id="GM">Génie Mécanique</option>
                        <option value="GPh" id="GPh">Génie Physique</option>
                        <option value="GPr" id="GPr">Génie des Procédés</option> 
                    </select><br>
            </fieldset><br>
            <input disabled type="submit" value="Valider" id="send"/>
        </form>
        <script>
            document.getElementById('mdp1').onkeyup = function(e) {
                if(document.getElementById('mdp1').value == document.getElementById('mdp2').value)  {
                    document.getElementById('send').disabled = false;
                }
                else{
                    document.getElementById('send').disabled = true;
                }
            }
            document.getElementById('mdp2').onkeyup = function(e) {
                if(document.getElementById('mdp1').value == document.getElementById('mdp2').value)  {
                    document.getElementById('send').disabled = false;
                }
                else{
                    document.getElementById('send').disabled = true;
                }
            }           
        </script>
    </body>
</html>