<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Offres de Stage</title>

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
                                        <h5 class="media-heading"><strong>${sessionScope.prenom}</strong>
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
                        <a href="entrepriseConsulterProfil.jsp"><i class="fa fa-fw fa-desktop"></i> Consulter un Profil</a>
                    </li>
                    <li>
                        <a href="entrepriseConsulterStage.jsp"><i class="fa fa-fw fa-table"></i> Offres de Stage</a>
                    </li>                    
                    <li>
                        <a href="entrepriseConvoquerEtudiant.jsp"><i class="fa fa-fw fa-table"></i> Convoquer un Etudiant</a>
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
                            Gestion des offres de Stage
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="entrepriseTableauBord.jsp">Tableau de Bord</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-table"></i> Stages
                            </li>
                        </ol>
                    </div>
                </div>
                
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-6">
                        <h2>Les offres de stage</h2>
                        <%-- Un code java au niveau de la servlet qui r�cupere de la base de donn�es les offres
                        de stage et les affiches au niveau de la jsp sous forme de tableau.
                        --%>
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        <th>Intitule</th>
                                        <th>Lieu</th>
                                        <th>Niveau</th>
                                        <th>Remuneration</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="active">
                                        <td>Developpeur Web</td>
                                        <td>Paris</td>
                                        <td>Bac+4</td>
                                        <td>$800</td>
                                        <td>
                                            <form method="post" action="/SOA_Project-war/EditerStageServlet">
                                                <button type="submit" class="btn btn-default">Editer</button>
                                            </form>
                                        </td>
                                        <td>
                                            <form method="post" action="/SOA_Project-war/SupprimerOffreServlet">
                                                <button type="submit" class="btn btn-default">Supprimer</button>
                                            </form>
                                        </td>
                                    </tr>
                                    
                                    <tr class="success">
                                        <td>Developeur Java</td>
                                        <td>Toulouse</td>
                                        <td>Bac+4</td>
                                        <td>$1200</td>
                                    </tr>
                                    <tr class="warning">
                                        <td>Chef de projet</td>
                                        <td>Paris</td>
                                        <td>Bac+5</td>
                                        <td>$1000</td>
                                    </tr>
                                    <tr class="danger">
                                        <td>Architecte Reseau</td>
                                        <td>Blagnac</td>
                                        <td>Bac+5</td>
                                        <td>$1500</td>
                                    </tr>
                                    <tr>
                                        <td>Ingenieur Securite</td>
                                        <td>Blagnac</td>
                                        <td>Bac+5</td>
                                        <td>$1200</td>
                                    </tr>
                                    <tr>
                                        <td>Ingenieur Cloud</td>
                                        <td>Montpellier</td>
                                        <td>Bac+5</td>
                                        <td>$1200</td>
                                    </tr>
                                    <tr>
                                        <td>Technicien Réseau</td>
                                        <td>Narbonne</td>
                                        <td>Bac+2</td>
                                        <td>$500</td>
                                    </tr>
                                </tbody>
                            </table>
                            <form method="post" action="/SOA_Project-war/EntrepriseProposerStageServlet">
                                <button type="submit" class="btn btn-default">Ajouter une offre de stage</button>
                            </form>
                        </div>
                    </div>              
                    
                    
                    
                </div>
                <!-- FIN ***************************************************************************************** -->

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
