<%@page import="com.infotel.travel.model.Airport"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>Falcon Flight - Accueil</title>
<script src="https://code.jquery.com/jquery.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/jquery-ui.css">
<link rel="stylesheet" href="css/home.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!--<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Open+Sans" />-->
<script src="https://code.jquery.com/ui/jquery-ui-git.js"></script>
</head>
<body class="bg-home">
<jsp:useBean id="user" scope="session" class="java.util.Date"></jsp:useBean>

<!--HEADER-->
<nav style="background-color: rgba(10, 49, 82, 0.5); border-color:#0A3152; border-radius:0px; border:0px" class="navbar navbar-default navbar-inverse" role="navigation">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#"><i class="fa fa-plane"></i> Falcon Flight</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Accueil</a></li>
        <li><a href="#">Vols</a></li>
        <li><a href="#">Hebergement</a></li>
        <li><a href="#">Presentation</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Services <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="">
        </div>
        <button type="submit" class="btn btn-success">Rechercher</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><p class="navbar-text">Déjà client?</p></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><b>Login</b> <span class="caret"></span></a>
			<ul id="login-dp" class="dropdown-menu">
				<li>
					 <div class="row">
							<div class="col-md-12">
								Se connecter via
								<div class="social-buttons">
									<a href="#" class="btn btn-fb">Facebook</a>
									<a href="#" style="background-color: #DD4B39; color:white" class="btn btn-gplus">Google +</a>
								</div>
                                ou
								 <form class="form" role="form" action="compte/MonCompte" accept-charset="UTF-8" id="login-nav">
										<div class="form-group">
											 <label class="sr-only" for="exampleInputEmail2">Username</label>
											 <input type="text" name="username" class="form-control" id="exampleInputEmail2" placeholder="Username" required="" autocomplete="off">
										</div>
										<div class="form-group">
											 <label class="sr-only" for="exampleInputPassword2">Password</label>
											 <input type="password" name="password" class="form-control" id="exampleInputPassword2" placeholder="Password" required="" autocomplete="off">
                                             <div class="help-block text-right"><a href="">Mot de passe oublié ?</a></div>
										</div>
										<div class="form-group">
											 <button type="submit" class="btn btn-primary btn-block">Sign in</button>
										</div>
										<div class="checkbox">
											 <label>
											 <input type="checkbox"> Maintenir la connection
											 </label>
										</div>
								 </form>
							</div>
							<div class="bottom text-center">
								Nouveau client ? <a href="#"><b>Nous joindre</b></a>
							</div>
					 </div>
				</li>
			</ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>



  <div class="container clear-padding" style="margin-top:25px; margin-bottom:25px">
	<div class="col-md-8 search-section">
		
		<div role="tabpanel">
					<!-- BEGIN: CATEGORY TAB -->
					<ul class="nav nav-tabs search-top" role="tablist" id="searchTab">
						<li role="presentation" class="active text-center">
							<a href="#flight" aria-controls="flight" role="tab" data-toggle="tab">
								<i class="fa fa-plane"></i> 
								<span>VOL</SPAN>
							</a>
						</li>
						<li role="presentation" class="text-center">
							<a href="#hotel" aria-controls="hotel" role="tab" data-toggle="tab">
								<i class="fa fa-bed"></i> 
								<span>HEBERGEMENT</span>
							</a>
						</li>
						<li role="presentation" class="text-center">
							<a href="#holiday" aria-controls="holiday" role="tab" data-toggle="tab">
								<span><i class="fa fa-plane"></i> 
								<span>VOL</SPAN> + <i class="fa fa-bed"></i> 
								<span>HEBERGEMENT</span></span>
							</a>
						</li>						
					</ul>
					<!-- END: CATEGORY TAB -->

					<!-- BEGIN: TAB PANELS -->
					<div class="tab-content">
							<!-- BEGIN: FLIGHT SEARCH -->
							<div role="tabpanel" class="tab-pane active" id="flight">
								<form autocomplete="off" action="FindFlight">
									<div class="col-md-12 product-search-title">Réservation de vols</div>
									<div class="clearfix"></div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Origine</label>
										<div class="input-group">
											<input type="text" name="depart_city" class="form-control" id="autocomplete_dep" placeholder="Paris" required=""/>
											<!--type="text" name="username" class="form-control" id="exampleInputEmail2" placeholder="Username" required="" autocomplete="off"-->
											<span class="input-group-addon"><i class="fa fa-map-marker fa-fw"></i></span>											
										</div>
									</div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Destination</label>
										<div class="input-group">
											<input type="text" name="arrival_city" class="form-control" id="autocomplete_des" placeholder="E.g. London" required=""/>
											<span class="input-group-addon"><i class="fa fa-map-marker fa-fw"></i></span>
										</div>
									</div>
									<div class="clearfix"></div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Depart le</label>
										<div class="input-group">
											<input type="time" id="departure_date" name="departure_date" class="form-control" placeholder="DD/MM/YYYY">
											<span class="input-group-addon"><i class="fa fa-calendar fa-fw"></i></span>
										</div>
									</div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Retour le</label>
										<div class="input-group">
											<input type="time" id="return_date" class="form-control" name="return_date" placeholder="DD/MM/YYYY">
											<span class="input-group-addon"><i class="fa fa-calendar fa-fw"></i></span>
										</div>
									</div>
									<div class="clearfix"></div>
									<div class="col-md-4 col-sm-4 search-col-padding">
										<label>Personne</label><br>
										<input id="adult_count" name="adult_count" value="1" class="form-control quantity-padding">
									</div>
									<div class="col-md-4 col-sm-4 search-col-padding">
										<label>Class<i>(beta)</i></label><br>
										<select class="selectpicker">
											<option class="select-style">Business</option>
											<option class="select-style">Economy</option>
										</select>
									</div>
									<div class="clearfix"></div>
									<div class="col-md-12 search-col-padding">
										<button type="submit" class="search-button btn transition-effect">Chercher des vols</button>
									</div>
									<div class="clearfix"></div>
								</form>
							</div>
							<!-- END: FLIGHT SEARCH -->
							
							<!-- START: HOTEL SEARCH -->
							<div role="tabpanel" class="tab-pane" id="hotel">
								<form >
									<div class="col-md-12 product-search-title">RÉSERVATION D'HEBERGEMENT</div>
									<div class="col-md-12 search-col-padding">
										<label>Lieu</label>
										<div class="input-group">
											<input type="text" name="destination-city" class="form-control" required placeholder="E.g. New York">
											<span class="input-group-addon"><i class="fa fa-map-marker fa-fw"></i></span>
										</div>
									</div>
									<div class="clearfix"></div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Date entrée</label>
										<div class="input-group">
											<input type="text" name="check-in" id="check_in" class="form-control" placeholder="DD/MM/YYYY">
											<span class="input-group-addon"><i class="fa fa-calendar fa-fw"></i></span>
										</div>
									</div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Date sortie</label>
										<div class="input-group">
											<input type="text" name="check-out" id="check_out" class="form-control" placeholder="DD/MM/YYYY">
											<span class="input-group-addon"><i class="fa fa-calendar fa-fw"></i></span>
										</div>
									</div>
									<div class="clearfix"></div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Personnes</label><br>
										<input id="hotel_adult_count" name="adult_count" value="1" class="form-control quantity-padding">
									</div>
									<div class="col-md-3 col-sm-3 search-col-padding">
										<label>Pièces</label><br>
										<select class="selectpicker" name="rooms">
											<option>1</option>
											<option>2</option>
											<option>3</option>
											<option>4</option>
											<option>5</option>
											<option>6</option>
										</select>
									</div>
									<div class="col-md-3 col-sm-3 search-col-padding">
										<label>Nuit</label><br>
										<select class="selectpicker" name="nights">
											<option>1</option>
											<option>2</option>
											<option>3</option>
											<option>4</option>
											<option>5</option>
											<option>6</option>
										</select>
									</div>
									<div class="clearfix"></div>
									<div class="col-md-12 search-col-padding">
										<button type="submit" class="search-button btn transition-effect">Search Hotels</button>
									</div>
									<div class="clearfix"></div>
								</form>
							</div>
							<!-- END: HOTEL SEARCH -->
								
							<!-- START: BEGIN HOLIDAY -->
							<div role="tabpanel" class="tab-pane" id="holiday">
								<form >
									<div class="col-md-12 product-search-title">Packages Vol + Hebergement</div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Depart</label>
										<div class="input-group">
											<input type="text" name="pack-departure-city" class="form-control" required placeholder="E.g. New York">
											<span class="input-group-addon"><i class="fa fa-map-marker fa-fw"></i></span>
										</div>
									</div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Destination</label>
										<div class="input-group">
											<input type="text" name="pack-destination-city" class="form-control" required placeholder="E.g. New York">
											<span class="input-group-addon"><i class="fa fa-map-marker fa-fw"></i></span>
										</div>
									</div>
									<div class="clearfix"></div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Date depart</label>
										<div class="input-group">
											<input type="text" id="package_start" class="form-control" placeholder="DD/MM/YYYY">
											<span class="input-group-addon"><i class="fa fa-calendar fa-fw"></i></span>
										</div>
									</div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Durée<i>(beta)</i></label><br>
										<select class="selectpicker" name="holiday_duration">
											<option>3 Jours</option>
											<option>5 Jours</option>
											<option>1 Semaine</option>
											<option>2 Semaines</option>
											<option>1 Mois</option>
											<option>1+ Mois</option>
										</select>
									</div>
									<div class="clearfix"></div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Package Type(Optional)</label><br>
										<select class="selectpicker" name="package_type">
											<option>Group</option>
											<option>Family</option>
											<option>Individual</option>
											<option>Honeymoon</option>
										</select>
									</div>
									<div class="col-md-6 col-sm-6 search-col-padding">
										<label>Budget(Optional)</label><br>
										<select class="selectpicker" name="package_budget">
											<option>500</option>
											<option>1000</option>
											<option>1000+</option>
										</select>
									</div>
									<div class="clearfix"></div>
									<div class="col-md-12 search-col-padding">
										<button type="submit" class="search-button btn transition-effect">Search Packages</button>
									</div>
									<div class="clearfix"></div>
								</form>
							</div>
							<!-- END: HOLIDAYS -->							
						</div>
						<!-- END: TAB PANE -->
					</div>
		
	</div>
	<!--<div class="col-md-4">
		<div class="wrap" style="float:right; margin:100px 0">
			<h1 style="color:white; font-size:40px" class="hero__title">Votre voyage idéal</h1>
			<p style="color:white; font-size:20px; text-align: right;" class="hero__subtitle"><i>Facile et tranquille</i></p>
		</div>
	</div>-->
	<!-- CARROUSEL-->
  
  
  
  </div>

  
  <!-- FOOTER -->
  <footer class="container-fluid">
  <div class="main-footer-nav row"  style="width:100%;z-index: 2;">
			<div class="container clear-padding">
				<div class="col-md-6 col-sm-5">
					<p>Copyright © 2017 <i>Falcon Flight</i> All Rights Reserved.</p>
				</div>
				<div class="col-md-6 col-sm-5">
					<ul>
						<li><a href="#">FLIGHTS</a></li>
						<li><a href="#">TOURS</a></li>
						<li><a href="#">CARS</a></li>
						<li><a href="#">HOTELS</a></li>
						<li><a href="#">BLOG</a></li>
					</ul>
				</div>
			</div>
		</div>
 </footer>
  
<script>
$( "#autocomplete_dep" ).autocomplete({source: [ 
	<c:forEach items="${airports}" var="a">"${a.city}",</c:forEach>
	]});
$( "#autocomplete_dep" ).autocomplete( "option", "minLength", 3);

$( "#autocomplete_des" ).autocomplete({source: [ 
	<c:forEach items="${airports}" var="a">"${a.city}",</c:forEach>
	]});
$( "#autocomplete_des" ).autocomplete( "option", "minLength", 3);
</script>
</body>
</html>
  
</body>
</html>