<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Créer Compte Etudiant</title>

    <!-- Bootstrap Core CSS -->
    <link href="/SOA_Project-war/yann/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/SOA_Project-war/yann/css/agency.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/SOA_Project-war/yann/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
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

<body id="page-top" class="index" onLoad="cacherLesChamps()">

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">Site de Gestion de Stage</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>                    
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- Header -->
    <header>
        <div class="container">
            <div class="intro-text">          
                <div align="center">   
                   <form method="post" action="afficherProfilEtudiant">
					   <div class="row">
                            <div class="col-lg-12 text-center"> 
                            
                            <fieldset>
								<legend>
									<div class="col-lg-12 text-center">
										<h3 class="section-heading">Enregistrement</h3>                    
									</div>
								</legend>
								<div class="form-group">
									   <div><input name="email" placeholder="Email *" class="form-control" type="email" id="email"/></div>
								 </div> 
								<div class="form-group">
									   <div><input name="mdp" placeholder="Mot de Passe *" class="form-control" type="password" id="mdp1"/></div>
								 </div>
								 <div class="form-group">
									   <div><input name="mdp" placeholder="Confirmer mot de Passe *" class="form-control" type="password" id="mdp2"/></div>
								 </div>								
							</fieldset><br>
							
							<fieldset>
								<legend>
									<div class="col-lg-12 text-center">
										<h3 class="section-heading">Profil</h3>                    
									</div>
								</legend>
								<div class="form-group">
									<div>
										<SELECT name="civilite" id="required"  class="btn btn-primary" >
												<OPTION VALUE="Sir">Civilite</OPTION>
												<OPTION VALUE="M">Homme</OPTION>
												<OPTION VALUE="F">Femme</OPTION>
										</SELECT>
									</div>
								</div>
								<div class="form-group">
								   <div><input name="Nom" size="20" maxlength="20" placeholder="Nom *" class="form-control" type="text" id="Nom"/></div>
								</div>	
								<div class="form-group">
								   <div><input name="Prenom" size="20" maxlength="20" placeholder="Prenom *" class="form-control" type="text" id="Prenom"/></div>
								</div>	
								<div class="form-group">
								   <div><input name="date" size="20" maxlength="20" placeholder="Date *" class="form-control" type="date" id="date"/></div>
								</div>	
								<div class="form-group">
								   <div><input name="code_postal" size="20" maxlength="20" placeholder="Code Postal *" class="form-control" type="text" id="code_postal"/></div>
								</div>	
								<div class="form-group">
								   <div><input name="ville" size="20" maxlength="20" placeholder="Ville *" class="form-control" type="text" id="ville"/></div>
								</div>
								<div class="form-group">
									<div>
										<SELECT name="pays" id="pays"  class="btn btn-primary" >
												<OPTION value="1">Pays</OPTION>
												<option value="2" >Afghanistan</option>
												<option value="3" >Afrique du Sud</option>
												<option value="4" >Albanie</option>
												<option value="5" >Algérie</option><option value="6" >Allemagne</option><option value="7" >Andorre</option><option value="8" >Angola</option><option value="9" >Antigua-et-Barbuda</option><option value="10" >Arabie saoudite</option><option value="11" >Argentine</option><option value="12" >Arménie</option><option value="13" >Australie</option><option value="14" >Autriche</option><option value="15" >Azerbaïdjan</option><option value="16" >Bahamas</option><option value="17" >Bahreïn</option><option value="18" >Bangladesh</option><option value="19" >Barbade</option><option value="20" >Belau</option><option value="21" >Belgique</option><option value="22" >Belize</option><option value="23" >Bénin</option><option value="24" >Bhoutan</option><option value="25" >Biélorussie</option><option value="26" >Birmanie</option><option value="27" >Bolivie</option><option value="28" >Bosnie-Herzégovine</option><option value="29" >Botswana</option><option value="30" >Brésil</option><option value="31" >Brunei</option><option value="32" >Bulgarie</option><option value="33" >Burkina</option><option value="34" >Burundi</option><option value="35" >Cambodge</option><option value="36" >Cameroun</option><option value="37" >Canada</option><option value="38" >Cap-Vert</option><option value="39" >Chili</option><option value="40" >Chine</option><option value="41" >Chypre</option><option value="42" >Colombie</option><option value="43" >Comores</option><option value="44" >Congo</option><option value="45" >Congo  (ex-Zaïre)</option><option value="46" >Cook (les Îles)</option><option value="47" >Corée du Nord</option><option value="48" >Corée du Sud</option><option value="49" >Costa Rica</option><option value="50" >Côte d'Ivoire</option><option value="51" >Croatie</option><option value="52" >Cuba</option><option value="53" >Danemark</option><option value="54" >Djibouti</option><option value="55" >Dominique</option><option value="56" >Égypte</option><option value="57" >Émirats arabes unis</option><option value="58" >Équateur</option><option value="59" >Érythrée</option><option value="60" >Espagne</option><option value="61" >Estonie</option><option value="62" >États-Unis</option><option value="63" >Éthiopie</option><option value="64" >Fidji</option><option value="65" >Finlande</option><option value="1" >France</option><option value="67" >Gabon</option><option value="68" >Gambie</option><option value="69" >Géorgie</option><option value="70" >Ghana</option><option value="71" >Grèce</option><option value="72" >Grenade</option><option value="73" >Guatemala</option><option value="74" >Guinée</option><option value="75" >Guinée-Bissao</option><option value="76" >Guinée équatoriale</option><option value="77" >Guyana</option><option value="78" >Haïti</option><option value="79" >Honduras</option><option value="80" >Hongrie</option><option value="81" >Inde</option><option value="82" >Indonésie</option><option value="83" >Iran</option><option value="84" >Iraq</option><option value="85" >Irlande</option><option value="86" >Islande</option><option value="87" >Israël</option><option value="88" >Italie</option><option value="89" >Jamaïque</option><option value="90" >Japon</option><option value="91" >Jordanie</option><option value="92" >Kazakhstan</option><option value="93" >Kenya</option><option value="94" >Kirghizistan</option><option value="95" >Kiribati</option><option value="96" >Koweït</option><option value="97" >Laos</option><option value="98" >Lesotho</option><option value="99" >Lettonie</option><option value="100" >Liban</option><option value="101" >Liberia</option><option value="102" >Libye</option><option value="103" >Liechtenstein</option><option value="104" >Lituanie</option><option value="105" >Luxembourg</option><option value="106" >Macédoine</option><option value="107" >Madagascar</option><option value="108" >Malaisie</option><option value="109" >Malawi</option><option value="110" >Maldives</option><option value="111" >Mali</option><option value="112" >Malte</option><option value="113" >Maroc</option><option value="114" >Marshall (les Îles)</option><option value="115" >Maurice</option><option value="116" >Mauritanie</option><option value="117" >Mexique</option><option value="118" >Micronésie</option><option value="119" >Moldavie</option><option value="120" >Monaco</option><option value="121" >Mongolie</option><option value="122" >Mozambique</option><option value="123" >Namibie</option><option value="124" >Nauru</option><option value="125" >Népal</option><option value="126" >Nicaragua</option><option value="127" >Niger</option><option value="128" >Nigeria</option><option value="129" >Niue</option><option value="130" >Norvège</option><option value="131" >Nouvelle-Zélande</option><option value="132" >Oman</option><option value="133" >Ouganda</option><option value="134" >Ouzbékistan</option><option value="135" >Pakistan</option><option value="136" >Panama</option><option value="137" >Papouasie - Nouvelle Guinée</option><option value="138" >Paraguay</option><option value="139" >Pays-Bas</option><option value="140" >Pérou</option><option value="141" >Philippines</option><option value="142" >Pologne</option><option value="143" >Portugal</option><option value="144" >Qatar</option><option value="145" >République centrafricaine</option><option value="146" >République dominicaine</option><option value="147" >République tchèque</option><option value="148" >Roumanie</option><option value="149" >Royaume-Uni</option><option value="150" >Russie</option><option value="151" >Rwanda</option><option value="152" >Saint-Christophe-et-Niévès</option><option value="153" >Sainte-Lucie</option><option value="154" >Saint-Marin</option><option value="155" >Saint-Siège , ou leVatican</option><option value="156" >Saint-Vincent-et-les Grenadines</option><option value="157" >Salomon (les Îles)</option><option value="158" >Salvador</option><option value="159" >Samoa occidentales</option><option value="160" >Sao Tomé-et-Principe</option><option value="161" >Sénégal</option><option value="162" >Seychelles</option><option value="163" >Sierra Leone</option><option value="164" >Singapour</option><option value="165" >Slovaquie</option><option value="166" >Slovénie</option><option value="167" >Somalie</option><option value="168" >Soudan</option><option value="169" >Sri Lanka</option><option value="170" >Suède</option><option value="171" >Suisse</option><option value="172" >Suriname</option><option value="173" >Swaziland</option><option value="174" >Syrie</option><option value="175" >Tadjikistan</option><option value="196" >Taïwan</option><option value="176" >Tanzanie</option><option value="177" >Tchad</option><option value="178" >Thaïlande</option><option value="179" >Togo</option><option value="180" >Tonga</option><option value="181" >Trinité-et-Tobago</option><option value="182" >Tunisie</option><option value="183" >Turkménistan</option><option value="184" >Turquie</option><option value="185" >Tuvalu</option><option value="186" >Ukraine</option><option value="187" >Uruguay</option><option value="188" >Vanuatu</option><option value="189" >Venezuela</option><option value="190" >Viêt Nam</option><option value="191" >Yémen</option><option value="192" >Yougoslavie</option><option value="193" >Zaïre  voir Congo</option><option value="194" >Zambie</option><option value="195" >Zimbabwe</option>										
										</SELECT>
									</div>
								 </div>		
								<div class="form-group">
								   <div><input name="telephone" size="20" maxlength="20" placeholder="Telephone *" class="form-control" type="tel" id="telephone"/></div>
								</div>
								<div class="form-group">
								   <div><input name="etablissement_scolaire" size="20" maxlength="20" placeholder="Etablissement Scolaire *" class="form-control" type="text" id="etablissement_scolaire"/></div>
								</div>	
								<div class="form-group">
								   <div><input name="specialite" size="20" maxlength="20" placeholder="Spécialite *" class="form-control" type="text" id="specialite"/></div>
								</div>							
							</fieldset><br>
							<div> 
								<input  class="btn btn-primary" type="submit" id="cacher5" value="Valider"/>
							</div>                            							  
						   </div>
					   </div>
				   </form>           
                </div>
                
            </div>
        </div>
    </header>
  
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <span class="copyright">Copyright &copy; Internship Website</span>
                </div>
                <div class="col-md-4">
                    <ul class="list-inline social-buttons">
                        <li><a href="http://twitter.com"><i class="fa fa-twitter"></i></a>
                        </li>
                        <li><a href="http://facebook.com/"><i class="fa fa-facebook"></i></a>
                        </li>
                        <li><a href="http://linkedin.com/"><i class="fa fa-linkedin"></i></a>
                        </li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <ul class="list-inline quicklinks">
                        <li><a href="#">Privacy Policy</a>
                        </li>
                        <li><a href="#">Terms of Use</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="js/classie.js"></script>
    <script src="js/cbpAnimatedHeader.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/agency.js"></script>

</body>

</html>
