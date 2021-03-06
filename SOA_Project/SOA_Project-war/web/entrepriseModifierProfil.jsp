<%-- 
    Document   : entrepriseModifierProfil
    Created on : 21 d�c. 2015, 20:32:33
    Author     : TOSHIBA
--%>

<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Proposer Stage Etudiant</title>

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

            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="entrepriseTableauBord.jsp">Profil</a>
                </div>
                <!-- Top Menu Items -->
                <ul class="nav navbar-right top-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                        <ul class="dropdown-menu message-dropdown">                      
                            <li class="message-preview">
                                <a href="#">
                                    <div class="media">
                                        <span class="pull-left">
                                            <img class="media-object" src="http://placehold.it/50x50" alt="">
                                        </span>
                                        <div class="media-body">
                                            <h5 class="media-heading"><strong>${sessionScope.nomEnt}}</strong>
                                            </h5>
                                            <p class="small text-muted"><i class="fa fa-clock-o"></i> Hier à 10:32 </p>
                                            <p>Ceci est un test</p>
                                        </div>
                                    </div>
                                </a>
                            </li>                        
                            <li class="message-footer">
                                <a href="#">Lire tous les messages</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                        <ul class="dropdown-menu alert-dropdown">
                            <li>
                                <a href="#">offre-stage<span class="label label-default">Alert Badge</span></a>
                            </li>                        
                            <li>
                                <a href="#">stage-valid<span class="label label-success">Alert Badge</span></a>
                            </li>                        
                            <li>
                                <a href="#">stage-cours<span class="label label-warning">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">stage-refus<span class="label label-danger">Alert Badge</span></a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">Voir Tout</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> ${sessionScope.nomEnt}<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="EntrepriseAfficherProfilEntreprise"><i class="fa fa-fw fa-user"></i> Profil</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-fw fa-envelope"></i> Message</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-fw fa-gear"></i> Parametres</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="/SOA_Project-war/index.jsp"><i class="fa fa-fw fa-power-off"></i> Deconnexion</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav side-nav">
                        <li class="active">
                            <a href="entrepriseTableauBord.jsp"><i class="fa fa-fw fa-dashboard"></i> Tableau de bord</a>
                        </li>
                        <li>
                            <a href="/SOA_Project-war/Consulter_Profil"><i class="fa fa-fw fa-desktop"></i> Consulter un Profil</a>
                        </li>
                        <li>
                            <a href="/SOA_Project-war/EntrepriseConsulterStage"><i class="fa fa-fw fa-table"></i> Offres de Stage</a>
                        </li>                    
                        <li>
                            <a href="/SOA_Project-war/ConvocationEntreprise"><i class="fa fa-fw fa-table"></i> Convoquer un Etudiant</a>
                        </li>
                        <li>
                            <a href="entrepriseEnvoyerReponse.jsp"><i class="fa fa-fw fa-table"></i> Envoyer une Reponse</a>
                        </li> 

                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>



            <!--  Debut *************************************************************************-->

            <div id="page-wrapper">

                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">
                                Modifier votre profil
                            </h1>
                            <ol class="breadcrumb">
                                <li>
                                    <i class="fa fa-dashboard"></i>  <a href="entrepriseTableauBord.jsp">Tableau de bord</a>
                                </li>
                                <li class="active">
                                    <i class="fa fa-edit"></i> Modifier profil
                                </li>
                            </ol>
                        </div>
                    </div>

                    <!-- /.row -->

                    <div class="row">
                        <div class="col-lg-6">

                            <form role="form" method="POST" action="EntrepriseModifierProfil">


                                <div class="form-group">
                                    <label>Nom</label>
                                    <input type="text" name="nom" size="20" maxlength="20" class="form-control" value="${nomEnt}" required>
                                </div>  
                                
                                <div class="form-group">
                                    <label>Siret</label>
                                    <input type="text" name="siret" size="14" maxlength="14" class="form-control" value="${siretEnt}">
                                </div>
                                <div class="form-group">
                                    <label>Domaine d'activit�</label> <br/>
                                    <select name="domaine" class="form-control" id="domaine" required>
                                        <option value="${domaineEnt}">${domaineEnt}</option>
                                        <option value="Eco Industrie, environnement et am�nagement">Eco Industrie, environnement et am�nagement</option>
                                        <option value="Eco conception">Eco conception</option>
                                        <option value="Industrie agroalimentaire">Industrie agroalimentaire</option>
                                        <option value="Industrie chimique, parachimique, pharmaceutique, cosm�tique">Industrie chimique, parachimique, pharmaceutique, cosm�tique</option>
                                        <option value="Energie">Energie</option>
                                        <option value="Industrie automobile, navale, ferroviaire">Industrie automobile,navale,ferroviaire</option>
                                        <option value="Mat�riaux, m�tallurgie">Mat�riaux, m�tallurgie</option>
                                        <option value="Nanotechnologies">Nanotechnologies</option>
                                        <option value="Instrumentation">Instrumentation</option>
                                        <option value="Industrie �lectronique et micro�l�ctronique">Industrie �lectronique et micro�l�ctronique</option>
                                        <option value="Informatique">Informatique</option>
                                        <option value="SSII">SSII</option>
                                        <option value="Op�rateur de t�l�communication">Op�rateur de t�l�communication</option>
                                        <option value="R�seaux">R�seaux</option>
                                        <option value="Institution financi�re/banque/assurance">Institution financi�re/banque/assurance</option>
                                        <option value="Soci�t� de conseil">Soci�t� de conseil</option>
                                        <option value="Administration d'Etat, territoriale, hospitali�re">Administration d'Etat, territoriale, hospitali�re</option>
                                        <option value="B�timent travaux publics">B�timent travaux publics</option>
                                        <option value="Autres secteurs industriels">Autres secteurs industriels</option>
                                    </select><br>
                                </div>

                                <div class="form-group">
                                    <label>Taille de l'�tablissement</label> <br/>
                                    <select name="taille" class="form-control" id="taille" required>                   
                                        <option value="${tailleEnt}">${tailleEnt}</option>
                                        <option value="TPE">1 � 49 (TPE)</option>
                                        <option value="PME">50 � 249 (PME)</option>
                                        <option value="ETI">250 � 4999</option>
                                        <option value="GGR">>5000 (Grand Groupe)</option>
                                    </select><br>

                                </div>

                                <div class="form-group">
                                    <label>Adresse</label>
                                    <input type="text" name="adresse" size="30" maxlength="30" class="form-control" value="${adresseEnt}" required>
                                </div>

                                <div class="form-group">
                                    <label>Code Postal</label>
                                    <input type="text" name="code_postal" size="5" maxlength="5" class="form-control" value="${codepostalEnt}" size="5" maxlength="5" required >
                                </div>

                                <div class="form-group">
                                    <label>Ville</label>
                                    <input type="text" name="ville" size="20" maxlength="20" class="form-control" value="${villeEnt}" required>
                                </div>

                                <div class="form-group">
                                    <label>Pays</label> <br/>
                                    <select id="pays" class="form-control" name="pays" required>
                                        <option value="${paysEnt}">${paysEnt}</option>
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
                                        <option value="Madère">Madère </option>
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
                                </div>
                                        
                                <div class="form-group">
                                    <label>T�l�phone</label>
                                    <input type="tel" name="telephone" size="13" maxlength="13" class="form-control" value="${telephoneEnt}" required>
                                </div>
                                
                                <div class="form-group">
                                    <label>Site web</label>
                                    <input type="tel" name="siteweb" size="30" maxlength="30" class="form-control" value="${sitewebEnt}" >
                                </div>

                                <button type="submit" class="btn btn-default">Valider</button>
                                

                            </form>                   
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
