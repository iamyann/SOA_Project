<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cr�ation Compte Etudiant</title>
    </head>
    <body>        
        <form method="post" action="servletCreerCompteEtudiant">
            <fieldset>
            <legend>Enregistrement</legend>
                <label for="email">Email<red>*</red></label>
                    <input type="email" name="email" id="email" required><br>
                <label for="mdp">Mot de passe<red>*</red></label>
                    <input type="password" name="mdp1" id="mdp1" required><br>
                <label for="mdp">Confirmation Mot de passe<red>*</red></label>
                    <input type="password" name="mdp2" id="mdp2" required><br>
            </fieldset><br>
            <fieldset>
                <legend>Profil</legend>
                <label for="civilite">Sexe<red>*</red></label>
                    <input type="radio" name="sexe" value="M" checked/>Homme
                    <input type="radio" name="sexe" value="F"/>Femme</label><br>
                <label for="prenom">Pr�nom<red>*</red></label>
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
                    <!--<input type="text" id="pays" name="pays" size="20" maxlength="20" required/><br>-->
                    <select name="pays" id="pays">
                        <option value="1">Choisir Pays</option>
			<option value="2" >Afghanistan</option>
			<option value="3" >Afrique du Sud</option>
			<option value="4" >Albanie</option>
			<option value="5" >Alg�rie</option><option value="6" >Allemagne</option><option value="7" >Andorre</option><option value="8" >Angola</option><option value="9" >Antigua-et-Barbuda</option><option value="10" >Arabie saoudite</option><option value="11" >Argentine</option><option value="12" >Arm�nie</option><option value="13" >Australie</option><option value="14" >Autriche</option><option value="15" >Azerba�djan</option><option value="16" >Bahamas</option><option value="17" >Bahre�n</option><option value="18" >Bangladesh</option><option value="19" >Barbade</option><option value="20" >Belau</option><option value="21" >Belgique</option><option value="22" >Belize</option><option value="23" >B�nin</option><option value="24" >Bhoutan</option><option value="25" >Bi�lorussie</option><option value="26" >Birmanie</option><option value="27" >Bolivie</option><option value="28" >Bosnie-Herz�govine</option><option value="29" >Botswana</option><option value="30" >Br�sil</option><option value="31" >Brunei</option><option value="32" >Bulgarie</option><option value="33" >Burkina</option><option value="34" >Burundi</option><option value="35" >Cambodge</option><option value="36" >Cameroun</option><option value="37" >Canada</option><option value="38" >Cap-Vert</option><option value="39" >Chili</option><option value="40" >Chine</option><option value="41" >Chypre</option><option value="42" >Colombie</option><option value="43" >Comores</option><option value="44" >Congo</option><option value="45" >Congo  (ex-Za�re)</option><option value="46" >Cook (les �les)</option><option value="47" >Cor�e du Nord</option><option value="48" >Cor�e du Sud</option><option value="49" >Costa Rica</option><option value="50" >C�te d'Ivoire</option><option value="51" >Croatie</option><option value="52" >Cuba</option><option value="53" >Danemark</option><option value="54" >Djibouti</option><option value="55" >Dominique</option><option value="56" >�gypte</option><option value="57" >�mirats arabes unis</option><option value="58" >�quateur</option><option value="59" >�rythr�e</option><option value="60" >Espagne</option><option value="61" >Estonie</option><option value="62" >�tats-Unis</option><option value="63" >�thiopie</option><option value="64" >Fidji</option><option value="65" >Finlande</option><option value="1" >France</option><option value="67" >Gabon</option><option value="68" >Gambie</option><option value="69" >G�orgie</option><option value="70" >Ghana</option><option value="71" >Gr�ce</option><option value="72" >Grenade</option><option value="73" >Guatemala</option><option value="74" >Guin�e</option><option value="75" >Guin�e-Bissao</option><option value="76" >Guin�e �quatoriale</option><option value="77" >Guyana</option><option value="78" >Ha�ti</option><option value="79" >Honduras</option><option value="80" >Hongrie</option><option value="81" >Inde</option><option value="82" >Indon�sie</option><option value="83" >Iran</option><option value="84" >Iraq</option><option value="85" >Irlande</option><option value="86" >Islande</option><option value="87" >Isra�l</option><option value="88" >Italie</option><option value="89" >Jama�que</option><option value="90" >Japon</option><option value="91" >Jordanie</option><option value="92" >Kazakhstan</option><option value="93" >Kenya</option><option value="94" >Kirghizistan</option><option value="95" >Kiribati</option><option value="96" >Kowe�t</option><option value="97" >Laos</option><option value="98" >Lesotho</option><option value="99" >Lettonie</option><option value="100" >Liban</option><option value="101" >Liberia</option><option value="102" >Libye</option><option value="103" >Liechtenstein</option><option value="104" >Lituanie</option><option value="105" >Luxembourg</option><option value="106" >Mac�doine</option><option value="107" >Madagascar</option><option value="108" >Malaisie</option><option value="109" >Malawi</option><option value="110" >Maldives</option><option value="111" >Mali</option><option value="112" >Malte</option><option value="113" >Maroc</option><option value="114" >Marshall (les �les)</option><option value="115" >Maurice</option><option value="116" >Mauritanie</option><option value="117" >Mexique</option><option value="118" >Micron�sie</option><option value="119" >Moldavie</option><option value="120" >Monaco</option><option value="121" >Mongolie</option><option value="122" >Mozambique</option><option value="123" >Namibie</option><option value="124" >Nauru</option><option value="125" >N�pal</option><option value="126" >Nicaragua</option><option value="127" >Niger</option><option value="128" >Nigeria</option><option value="129" >Niue</option><option value="130" >Norv�ge</option><option value="131" >Nouvelle-Z�lande</option><option value="132" >Oman</option><option value="133" >Ouganda</option><option value="134" >Ouzb�kistan</option><option value="135" >Pakistan</option><option value="136" >Panama</option><option value="137" >Papouasie - Nouvelle Guin�e</option><option value="138" >Paraguay</option><option value="139" >Pays-Bas</option><option value="140" >P�rou</option><option value="141" >Philippines</option><option value="142" >Pologne</option><option value="143" >Portugal</option><option value="144" >Qatar</option><option value="145" >R�publique centrafricaine</option><option value="146" >R�publique dominicaine</option><option value="147" >R�publique tch�que</option><option value="148" >Roumanie</option><option value="149" >Royaume-Uni</option><option value="150" >Russie</option><option value="151" >Rwanda</option><option value="152" >Saint-Christophe-et-Ni�v�s</option><option value="153" >Sainte-Lucie</option><option value="154" >Saint-Marin</option><option value="155" >Saint-Si�ge , ou leVatican</option><option value="156" >Saint-Vincent-et-les Grenadines</option><option value="157" >Salomon (les �les)</option><option value="158" >Salvador</option><option value="159" >Samoa occidentales</option><option value="160" >Sao Tom�-et-Principe</option><option value="161" >S�n�gal</option><option value="162" >Seychelles</option><option value="163" >Sierra Leone</option><option value="164" >Singapour</option><option value="165" >Slovaquie</option><option value="166" >Slov�nie</option><option value="167" >Somalie</option><option value="168" >Soudan</option><option value="169" >Sri Lanka</option><option value="170" >Su�de</option><option value="171" >Suisse</option><option value="172" >Suriname</option><option value="173" >Swaziland</option><option value="174" >Syrie</option><option value="175" >Tadjikistan</option><option value="196" >Ta�wan</option><option value="176" >Tanzanie</option><option value="177" >Tchad</option><option value="178" >Tha�lande</option><option value="179" >Togo</option><option value="180" >Tonga</option><option value="181" >Trinit�-et-Tobago</option><option value="182" >Tunisie</option><option value="183" >Turkm�nistan</option><option value="184" >Turquie</option><option value="185" >Tuvalu</option><option value="186" >Ukraine</option><option value="187" >Uruguay</option><option value="188" >Vanuatu</option><option value="189" >Venezuela</option><option value="190" >Vi�t Nam</option><option value="191" >Y�men</option><option value="192" >Yougoslavie</option><option value="193" >Za�re  voir Congo</option><option value="194" >Zambie</option><option value="195" >Zimbabwe</option>										
                    </select><br>
                <label for="telephone">T�l�phone<red>*</red></label>
                    <input type="tel" id="telephone" name="telephone" size="10" maxlength="10" required/><br>
                <label for="etablissement_scolaire">Etablissement scolaire<red>*</red></label>
                    <!--<input type="text" id="etablissement_scolaire" name="etablissement_scolaire" size="20" maxlength="20" required/><br>-->
                    <select id="etablissement_scolaire" name="etablissement_scolaire" required>
                        <option value="INSA" id="INSA">INSA</option>
                    </select><br>
                <label for="specialite">Sp�cialit�<red>*</red></label>
                        <select id="spe" name="spe" required>
                        <option value="GB" id="GB">G�nie Biochimique</option>
                        <option value="GC" id="GC">G�nie Civil</option>
                        <option value="AE" id="AE">Automatique, �lectronique</option>
                        <option value="IR" id="IR">Informatique et R�seaux</option>
                        <option value="GMM" id="GMM">G�nie Math�matique et Mod�lisation</option>
                        <option value="GM" id="GM">G�nie M�canique</option>
                        <option value="GPh" id="GPh">G�nie Physique</option>
                        <option value="GPr" id="GPr">G�nie des Proc�d�s</option> 
                    </select><br>
            </fieldset><br>
            <input type="submit" value="Valider"/>
        </select>
    </body>
</html>