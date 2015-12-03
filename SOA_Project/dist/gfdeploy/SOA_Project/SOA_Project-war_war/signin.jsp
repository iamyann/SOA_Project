<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Pratt - Free Bootstrap 3 Theme">
        <meta name="author" content="Alvarez.is - BlackTie.co">
        <link rel="shortcut icon" href="yann/assets/ico/favicon.png">

        <title></title>

        <!-- Bootstrap core CSS -->
        <link href="yann/assets/css/bootstrap.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="yann/assets/css/main.css" rel="stylesheet">

        <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,700' rel='stylesheet' type='text/css'>

    </head>

    <body data-spy="scroll" data-offset="0" data-target="#navigation">

        <!-- Fixed navbar -->
        <div id="navigation" class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
            </div>
        </div>


        <section id="home" name="home"></section>
        <div id="headerwrap">
            <div class="container">
                <div class="row centered">
                    <div class="col-lg-12">
                        <h3>Enter your id, here !</h3>
                        <br>
                        <br>
                        <div>
                            <form method="POST" action="SignServlet">
                               
                                <div class="form-group">
                                    <div><input name="username" placeholder="username" class="form-control" type="text" id="UserFirstname"/></div>
                                </div>                                 
                                <div class="form-group">
                                    <div><input name="password" placeholder="password" class="form-control" type="password" id="UserPassword"/></div>
                                </div>                                 
                                <div class="form-group">
                                   <!--  <button id="submit" type="submit">Submit</button>
                                  <!--  <a href="<%=request.getContextPath()+"/SignServlet"%>" class="btn btn-success btn btn-success" type="submit">Submit</a><!-- -->
                                    <!--<input type="submit" value="Se connecter"></p> /SOA_Project-war/yann/request.getContextPath()+-->
                                    <input  class="btn btn-success btn btn-success" type="submit" value="Submit"/>
                                </div>
                            </form>
                                <div>
                                    <p style="text-align:center">No account ? Create one <a href="#services" target="_blank">here</a></p>
                                </div>
                                
                            
                        </div>
                    </div>
                </div>
            </div>
        </div> <!--/ .container -->
    </div><!--/ #headerwrap -->



    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <!--<script src="assets/js/bootstrap.js"></script>
    <script>
        $('.carousel').carousel({
            interval: 3500
        })
    </script>-->
    
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
