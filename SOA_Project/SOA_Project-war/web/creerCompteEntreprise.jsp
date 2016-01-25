<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Création de Compte Entreprise</title>

        <!-- Bootstrap Core CSS -->
        <link href="EntrepriseCSS/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="EntrepriseCSS/css/sb-admin.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="EntrepriseCSS/css/plugins/morris.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="EntrepriseCSS/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <div id="wrapper">

            



            <!--  Debut *************************************************************************-->

            <div id="page-wrapper">

                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">
                                Créez un compte pour votre entreprise
                            </h1>
                            <ol class="breadcrumb">
                                <li>
                                    <i class="fa fa-dashboard"></i>  <a href="entrepriseTableauBord.jsp">Compte</a>
                                </li>
                                <li class="active">
                                    <i class="fa fa-edit"></i> Entreprise
                                </li>
                            </ol>
                        </div>
                    </div>

                    <!-- /.row -->

                    <div class="row">
                        <div class="col-lg-6">


                            <form method="post" action="ServletCreerCompteEntreprise">
                                <fieldset>
                                <legend>Enregistrement</legend>
                                    <label for="email">Email<red>*</red></label>
                                        <input type="email" name="email" id="email" class="form-control" size="20" maxlength="30" required><br> <!-- remettre en mail!!!-->
                                    <label for="mdp">Mot de passe<red>*</red></label>
                                        <input  type="password" name="mdp1" id="mdp1" class="form-control" size="20" maxlength="20" required><br>
                                    <label for="mdp">Confirmation Mot de passe<red>*</red></label>
                                        <input  type="password" name="mdp2" id="mdp2" class="form-control" size="20" maxlength="20" required><br>
                                </fieldset><br>
                                <fieldset>
                                <legend>Profil</legend>
                                    <div class="form-group">
                                        <label for="type">Type<red>*</red></label></td>
                                            <label class="radio-inline">
                                                <input type="radio" name="type" value="entreprise" id="optionsRadiosInline1" checked/>Entreprise
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="type" value="laboratoire" id="optionsRadiosInline2"/>Laboratoire<br>
                                            </label>  
                                    </div>
                                <br><label for="nom">Nom<red>*</red></label>
                                        <input type="text" id="nom" name="nom" class="form-control" size="20" maxlength="20" required/><br>   
                                    <label for="siret">Numéro de SIRET
                                                    (pour les entreprises françaises)<red>*</red></label>
                                        <input type="text" id="siret" name="siret" class="form-control" size="14" maxlength="14" required/><br><br>
                                    <label for="domaine">Domaine d'activité<red>*</red></label>
                                        <select name="domaine" id="domaine" class="form-control" required>
                                            <option>Choisir un domaine</option>
                                            <option value="Eco Industrie, environnement et aménagement">Eco Industrie, environnement et aménagement</option>
                                            <option value="Eco conception">Eco conception</option>
                                            <option value="Industrie agroalimentaire">Industrie agroalimentaire</option>
                                            <option value="Industrie chimique, parachimique, pharmaceutique, cosmétique">Industrie chimique, parachimique, pharmaceutique, cosmétique</option>
                                            <option value="Energie">Energie</option>
                                            <option value="Industrie automobile, navale, ferroviaire">Industrie automobile,navale,ferroviaire</option>
                                            <option value="Matériaux, métallurgie">Matériaux, métallurgie</option>
                                            <option value="Nanotechnologies">Nanotechnologies</option>
                                            <option value="Instrumentation">Instrumentation</option>
                                            <option value="Industrie électronique et microéléctronique">Industrie électronique et microéléctronique</option>
                                            <option value="Informatique">Informatique</option>
                                            <option value="SSII">SSII</option>
                                            <option value="Opérateur de télécommunication">Opérateur de télécommunication</option>
                                            <option value="Réseaux">Réseaux</option>
                                            <option value="Institution financière/banque/assurance">Institution financière/banque/assurance</option>
                                            <option value="Société de conseil">Société de conseil</option>
                                            <option value="Administration d'Etat, territoriale, hospitalière">Administration d'Etat, territoriale, hospitalière</option>
                                            <option value="Bâtiment travaux publics">Bâtiment travaux publics</option>
                                            <option value="Autres secteurs industriels">Autres secteurs industriels</option>
                                        </select><br>                
                                    <label for="taille">Taille de l'établissement<red>*</red></label>
                                        <select name="taille" class="form-control" required>                   
                                            <option>Choisir une taille</option>
                                            <option value="TPE">1 à 49 (TPE)</option>
                                            <option value="PME">50 à 249 (PME)</option>
                                            <option value="ETI">250 à 4999</option>
                                            <option value="GGR">>5000 (Grand Groupe)</option>
                                        </select><br>
                                    <label for="adresse">Adresse<red>*</red></label>
                                        <input type="text" id="adresse" name="adresse" class="form-control" size="30" maxlength="30" required/><br>
                                    <label for="code_postal">Code Postal<red>*</red></label>
                                        <input type="text" id="code_postal" name="code_postal" class="form-control" size="5" maxlength="5" required/><br>
                                    <label for="ville">Ville<red>*</red></label>
                                        <input type="text" id="ville" name="ville" size="20" class="form-control" maxlength="20" required/><br>
                                    <label for="pays">Pays<red>*</red></label>
                                        <!--<input type="text" id="pays" name="pays" size="20" maxlength="20" required/><br>-->
                                        <select id="pays" name="pays" class="form-control" required>
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
                                        <input type="tel" id="telephone" name="telephone" size="10" class="form-control" maxlength="10" required/><br>
                                    <label for="siteweb">Site Web</label>
                                        <input type="text" id="siteweb" name="siteweb" class="form-control" size="20" maxlength="30"/><br>
                                </fieldset><br>
                                <input  type="submit" value="Valider" id="send"/>
                            </form>
        <!--<script>
            function testData(){
            return (/^[0-9]{14}$/.test(document.getElementById('siret').value)
            && /^[0-9]{5}$/.test(document.getElementById('code_postal').value)
            && /^[0-9]{10}$/.test(document.getElementById('telephone').value)
            && document.getElementById('mdp1').value == document.getElementById('mdp2').value);
            }

            document.getElementById('siret').onkeyup = function(e){
                if(testData()){
                    document.getElementById('send').disabled = false;
                }
                else{
                    document.getElementById('send').disabled = true;
                }
            }

            document.getElementById('code_postal').onkeyup = function(e){
                if(testData()){
                    document.getElementById('send').disabled = false;
                }
                else{
                    document.getElementById('send').disabled = true;
                }
            }

            document.getElementById('telephone').onkeyup = function(e){
                if(testData()){
                    document.getElementById('send').disabled = false;
                }
                else{
                    document.getElementById('send').disabled = true;
                }
            }

            document.getElementById('mdp1').onkeyup = function(e){
                if(testData()){
                    document.getElementById('send').disabled = false;
                }
                else{
                    document.getElementById('send').disabled = true;
                }
            }

        document.getElementById('mdp2').onkeyup = function(e){
            if(testData()){
                document.getElementById('send').disabled = false;
            }
            else{
                document.getElementById('send').disabled = true;
            }
        }
        </script>-->
                        </div>
                        <!-- FIN******************************************************************** -->

                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- /#page-wrapper -->

            </div>
            <!-- /#wrapper -->

            <!-- jQuery -->
            <script src="EntrepriseCSS/js/jquery.js"></script>

            <!-- Bootstrap Core JavaScript -->
            <script src="EntrepriseCSS/js/bootstrap.min.js"></script>

    </body>

</html>
