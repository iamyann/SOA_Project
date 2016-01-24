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
                                Proposer un sujet de stage
                            </h1>
                            <ol class="breadcrumb">
                                <li>
                                    <i class="fa fa-dashboard"></i>  <a href="entrepriseTableauBord.jsp">Tableau de bord</a>
                                </li>
                                <li class="active">
                                    <i class="fa fa-edit"></i> Stage
                                </li>
                            </ol>
                        </div>
                    </div>

                    <!-- /.row -->

                    <div class="row">
                        <div class="col-lg-6">

                            <form role="form" method="POST" action="EntrepriseProposerStageServlet">

                                <div class="form-group">
                                    <label>Type de Contrat  </label>
                                    <label class="radio-inline">
                                        <input type="radio" name="typeContrat" id="optionsRadiosInline1" value="Stage" checked>Stage
                                    </label>
                                    <label class="radio-inline">
                                        <input type="radio" name="typeContrat" id="optionsRadiosInline2" value="CDD">CDD
                                    </label>
                                    <label class="radio-inline">
                                        <input type="radio" name="typeContrat" id="optionsRadiosInline3" value="CDI">CDI
                                    </label>
                                </div>
                                <div class="form-group">
                                    <label>Titre du Sujet</label>
                                    <input type="text" name="titreSujet" class="form-control" required>
                                    <!--<span class="input-group-btn"><button class="btn btn-default" type="button"><i class="fa fa-search"></i></button></span>-->
                                </div>  

<!--                                <div class="form-group">
                                    <label>Missions</label>
                                    <input type="file">
                                </div>-->
                                <div class="form-group">
                                    <label>Description du Sujet</label>
                                    <textarea name="descriptionSujet" class="form-control" rows="3" required></textarea>
                                </div> 
                                <div class="form-group ">
                                    <label>Sp�cialit�</label>
                                    <select name="specialite" multiple class="form-control" size="3" multiple required>
                                            <option value="GB">G�nie Biochimique</option>
                                            <option value="GC">G�nie Civil</option>
                                            <option value="AE">Automatique, Electronique</option>
                                            <option value="IR">Informatique et R�seaux</option>
                                            <option value="GMM">G�nie Math�matique et Mod�lisation</option>
                                            <option value="GM">G�nie M�canique</option>
                                            <option value="GPh">G�nie Physique</option>
                                            <option value="GPr">G�nie des Proc�d�s</option>
                                    </select>
                                </div>
                                
                                <div class="form-group">
                                    <label>Niveau d'�tudes</label>
                                    <select name="niveauEtude" multiple class="form-control" size="3" multiple required>
                                        <option value="Bac+5">Bac+5</option>
                                        <option value="Bac+4">Bac+4</option>
                                        <option value="Bac+3">Bac+3</option>
                                        <option value="Bac+2">Bac+2</option>
                                        <option value="Bac+1">Bac+1</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>Dur�e</label>
                                    <input type="text" name="duree" class="form-control" required/>
                                </div> 
                                <div class="form-group">
                                    <label>R�mun�ration</label>
                                    <input type="text" name="remuneration" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Adresse du lieu de stage</label>
                                    <textarea name="adresse" class="form-control" rows="2" required></textarea>
                                </div>
                                <div class="form-group">
                                    <label>Personne � contacter</label>
                                    <input type="text" name="contactName" class="form-control" required/>
                                </div>
                                
                                <div class="form-group">
                                    <label>T�l�phone</label>
                                    <input type="text" name="contactTel" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Email</label>
                                    <input type="text" name="contactWeb" class="form-control" required>
                                </div>

                                <button type="submit" class="btn btn-default">Valider</button>
                                <button type="reset" class="btn btn-default">Reinitialiser</button>

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
