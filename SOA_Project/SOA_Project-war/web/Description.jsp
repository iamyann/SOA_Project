<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Recherche Stage Etudiant</title>

    <!-- Bootstrap Core CSS -->
    <link href="Etud/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="Etud/css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="Etud/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="Etud/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

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
                <a class="navbar-brand" href="index-etud.jsp">Profil</a>
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
                                        <h5 class="media-heading"><strong>${sessionScope.prenom}</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Hier Ã  10:32 </p>
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
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> ${sessionScope.prenom}<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Profil</a>
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
                        <a href="index-etud.jsp"><i class="fa fa-fw fa-dashboard"></i> Tableau de bord</a>
                    </li>
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Profil <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo" class="collapse">
                            <li>
                                <a href="/SOA_Project-war/VoirProfilServlet"><i class="fa fa-fw fa-desktop"></i> Consulter son profil</a>
                            </li>
                            <li>
                                <a href="edit-profil.jsp"><i class="fa fa-fw fa-wrench"></i> Modifier son profil</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="/SOA_Project-war/OffreStageServlet"><i class="fa fa-fw fa-table"></i> Offres de stage</a>
                    </li>
                    <li>
                        <a href="/SOA_Project-war/SpontaneServlet"><i class="fa fa-fw fa-edit"></i> Candidature spontanee</a>
                    </li>
                    <li>
                        <a href="/SOA_Project-war/VoirCandidatureServlet"><i class="fa fa-fw fa-desktop"></i> Mes candidatures</a>
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
                            Details de ma candidature
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                 <i class="fa fa-dashboard"></i>  <a href="index-etud.jsp">Tableau de bord</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-desktop"></i> Ma candidature
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->                                                
                <div class="jumbotron"> 
                    <p><h3><a class="btn btn-primary btn-lg" role="button">Description &raquo;</a></h3></p>                    
                    <p> <i>Encadre(e) par un Chef de Projet experimente votre objectif sera de participer dans un premier
                        temps a des prestations forfaitaires pour rapidement être capable de prendre en charge tout ou
                        partie d'une demande client (du besoin du client jusqu'a la mise en oeuvre de la solution).
                        </i>
                    </p>
                    <h4><b><u>Ref.Stage</u></b></h4>
                    <p>MP/Tls/STAGE/2126</p>
                    <h4><b><u>Profil Recherche</u></b></h4>
                    <p><i>Étudiant(e) en école d'Ingénieurs ou Master 2 informatique, vous avez des compétences en
                        programmation Java, J2EE.
                        Vous maîtrisez impérativement l'anglais.
                        Vous êtes créatif(ve), curieux(se), motivé(e) et avez plaisir à travailler en équipe. Vos qualités
                        rédactionnelles, relationnelles, votre autonomie et votre rigueur seront des atouts pour ce stage.
                        </i>
                    </p>
                    <h4><b><u>Lieu</u></b></h4>
                    <p>Toulouse</p>
                    <h4><b><u>Environnement Technologique</u></b></h4>
                    <p>JAVA / J2EE</p>
                    <h4><b><u>Remuneration</u></b></h4>
                    <p>$1200</p>
                    <h4><b><u>Statut de l'offre</u></b></h4>
                    <p>N/A</p>
                    
                </div>
                    </div>    
                                

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="Etud/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="Etud/js/bootstrap.min.js"></script>

</body>

</html>
