<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Insa - Gestion de stage</title>

    <!-- Bootstrap Core CSS -->
    <link href="yann/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="yann/css/agency.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="yann/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
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

            
        </div>
        <!-- /.container-fluid -->
    </nav>
    
       <!-- Sign Section -->
    <section id="contact">
        <div class="container">
            <div class="row">
				<br>
                <br>
                <br>
                <br>
                <div class="col-lg-12 text-center">
                    <h3 class="section-heading">Entrer vos identifiants!</h3>                    
                </div>
                <br>
                <br>
                <br>
            </div>
            <div class="row">
                <div class="col-lg-12">
					<form method="POST" action="SignServlet"> 
					    <div class="row">
                            <div class="col-lg-12 text-center"> 					                       
								  <div class="form-group">
									   <div><input name="username" placeholder="email@test.com" class="form-control" type="text" id="Id Utilisateur"/></div>
								  </div>                                 
								  <div class="form-group">
										<div><input name="password" placeholder="mot de passe" class="form-control" type="password" id="Mot de Passe"/></div>
								  </div>                                 
								  <div class="form-group">
										 <input  class="btn btn-primary" type="submit" value="Se connecter"/>
								  </div>
							</div>
						</div>
                      </form>                                
                </div>
            </div>
            
            <form method="post" action="CreationCompte">
						  <div class="row">
                            <div class="col-lg-12 text-center"> 
                                <h6 class="section-heading">Pas de compte? Créer en un <a href="#" onClick="afficherLesChamps()">Ici</a></h6>                           	                    
								<p>
									<input type="radio" name="typeCompte" value="etudiant" id="cacher1"/> 
									<label for="etudiant" id="cacher2">Etudiant  <label/>
									<input type="radio" name="typeCompte" value="entreprise" id="cacher3"/>
									<label for="entreprise" id="cacher4">  Entreprise<label/><br/>
								</p>
								<div> 
									<input  class="btn btn-primary" type="submit" id="cacher5" value="Valider"/>
								</div>   
							</div>
						</div>                             
            </form>    
        </div>
    </section>  
        
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