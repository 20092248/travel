<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>Falcon Flight - Search</title>
<script src="https://code.jquery.com/jquery.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/home.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!--<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Open+Sans" />-->
</head>
<body class="flight-img-home">

<!--HEADER-->
<%@include file="header.jsp" %>


<!--CONTAINER-->
<section>
	<div class="row flight-search single-search">
		<div class="container clear-padding">
			<div class="col-md-12 clear-padding search-section">
				<h2 class="text-center">TROUVER VOTRE VOL</h2>
				<!-- START: HOTEL SEARCH -->
					<div role="tabpanel" class="tab-pane" id="hotel">
						<form action="FindFlight">
							<div class="col-md-3 col-sm-3 search-col-padding">
								<label class="label-search">Origine</label>
								<div class="input-group">
									<input type="text" name="dep-city" class="form-control hasTextpicker" required="" placeholder="E.g. New York">
									<span class="input-group-addon"><i class="fa fa-map-marker fa-fw"></i></span>
								</div>
							</div>
							<div class="col-md-3 col-sm-3 search-col-padding">
								<label class="label-search">Retour</label>
								<div class="input-group">
									<input type="text" name="des-city" class="form-control hasTextpicker" required="" placeholder="E.g. London">
									<span class="input-group-addon"><i class="fa fa-map-marker fa-fw"></i></span>
								</div>
							</div>
							<div class="col-md-2 col-sm-2 search-col-padding">
								<label class="label-search">Depart</label>
								<div class="input-group">
									<input type="text" name="dep_date" id="departure_date" class="form-control hasDatepicker" placeholder="MM/DD/YYYY">
									<span class="input-group-addon"><i class="fa fa-calendar fa-fw"></i></span>
								</div>
							</div>
							<div class="col-md-2 col-sm-2 search-col-padding">
								<label class="label-search">Retour</label>
								<div class="input-group">
									<input type="text" name="return_date" id="return_date" class="form-control hasDatepicker" placeholder="MM/DD/YYYY">
									<span class="input-group-addon"><i class="fa fa-calendar fa-fw"></i></span>
								</div>
							</div>
							<div class="col-md-2 col-sm-2 search-col-padding">
								<label class="label-search">Personne(s)</label><br>
								<select class="selectpicker bs-select-hidden select-color" name="guests">
									<option style="color:black">1</option>
									<option style="color:black">2</option>
									<option style="color:black">3</option>
									<option style="color:black">4</option>
									<option style="color:black">5</option>
								</select>
							</div>
							<div class="clearfix"></div>
							<div class="col-md-12 text-center search-col-padding">
								<button type="submit" class="search-button btn transition-effect" style="margin-top: 30px;">Chercher un vol</button>
							</div>
							<div class="clearfix"></div>
						</form>
					</div>
					<!-- END: HOTEL SEARCH -->
				</div>
		</div>
	</div>
</section>
<section id="how-it-work">
		<div class="row work-row">
			<div class="container">
				<div class="work-step">
					<div class="col-md-4 col-sm-4 first-step text-center">
						<i class="fa fa-search"></i>
						<h5>CHERCHER</h5>
					</div>
					<div class="col-md-4 col-sm-4 second-step text-center">
						<i class="fa fa-heart-o"></i>
						<h5>SELECTIONNER</h5>
					</div>
					<div class="col-md-4 col-sm-4 third-step text-center">
						<i class="fa fa-shopping-cart"></i>
						<h5>RESERVER</h5>
					</div>
				</div>
			</div>
		</div>
</section>
<!-- 2EME CONTAINER -->
<!-- 3EME CONTAINER -->
<section id="top-flight-row">
	<div class="row top-flight">
		<div class="container">
			<div class="section-title text-center">
				<h2>TOP DESTINATION</h2>
				<h4>CHECK OUT FLIGHTS TO TOP DESTINATIONS</h4>
			</div>
			<div class="col-md-4 col-sm-6 tour-grid clear-padding">
				<img src="http://limpidthemes-demo.com/Themeforest/html/cruise-demo/dark/assets/images/tour1.jpg" alt="Cruise">
				<div class="tour-brief">
					<div class="pull-left">
						<h4><i class="fa fa-map-marker"></i>FRANCE</h4>
					</div>
					<div class="pull-right">
						<h4>$49/Person</h4>
					</div>
				</div>
				<div class="tour-detail text-center">
					<p><strong><i class="fa fa-plane"></i>25 Airline</strong></p>
					<p><strong>Starting $49/Person</strong></p>
					<p><a href="#">DETAIL</a></p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 tour-grid clear-padding">
				<img src="http://limpidthemes-demo.com/Themeforest/html/cruise-demo/dark/assets/images/tour3.jpg" alt="Cruise">
				<div class="tour-brief">
					<div class="pull-left">
						<h4><i class="fa fa-map-marker"></i>DUBAI</h4>
					</div>
					<div class="pull-right">
						<h4>$99/Person</h4>
					</div>
				</div>
				<div class="tour-detail text-center">
					<p><strong><i class="fa fa-plane"></i>40 Airline</strong></p>
					<p><strong>Starting $99/Person</strong></p>
					<p><a href="#">DETAIL</a></p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 tour-grid clear-padding">
				<img src="http://limpidthemes-demo.com/Themeforest/html/cruise-demo/dark/assets/images/tour2.jpg" alt="Cruise">
				<div class="tour-brief">
					<div class="pull-left">
						<h4><i class="fa fa-map-marker"></i>BANGKOK</h4>
					</div>
					<div class="pull-right">
						<h4>$69/Person</h4>
					</div>
				</div>
				<div class="tour-detail text-center">
					<p><strong><i class="fa fa-plane"></i>90 Airline</strong></p>
					<p><strong>Starting $69/Person</strong></p>
					<p><a href="#">DETAIL</a></p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 tour-grid clear-padding">
				<img src="http://limpidthemes-demo.com/Themeforest/html/cruise-demo/dark/assets/images/tour7.jpg" alt="Cruise">
				<div class="tour-brief">
					<div class="pull-left">
						<h4><i class="fa fa-map-marker"></i>AFRICA</h4>
					</div>
					<div class="pull-right">
						<h4>$90/Person</h4>
					</div>
				</div>
				<div class="tour-detail text-center">
					<p><strong><i class="fa fa-plane"></i>6 Airline</strong></p>
					<p><strong>Starting $90/Person</strong></p>
					<p><a href="#">DETAIL</a></p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 tour-grid clear-padding">
				<img src="http://limpidthemes-demo.com/Themeforest/html/cruise-demo/dark/assets/images/tour10.jpg" alt="Cruise">
				<div class="tour-brief">
					<div class="pull-left">
						<h4><i class="fa fa-map-marker"></i>BELGIUM</h4>
					</div>
					<div class="pull-right">
						<h4>$89/Person</h4>
					</div>
				</div>
				<div class="tour-detail text-center">
					<p><strong><i class="fa fa-plane"></i>8 Airline</strong></p>
					<p><strong>Starting $89/Person</strong></p>
					<p><a href="#">DETAIL</a></p>
				</div>
			</div>
			<div class="col-md-4 col-sm-6 tour-grid clear-padding">
				<img src="http://limpidthemes-demo.com/Themeforest/html/cruise-demo/dark/assets/images/tour5.jpg" alt="Cruise">
				<div class="tour-brief">
					<div class="pull-left">
						<h4><i class="fa fa-map-marker"></i>AUSTRIA</h4>
					</div>
					<div class="pull-right">
						<h4>$199/Person</h4>
					</div>
				</div>
				<div class="tour-detail text-center">
					<p><strong><i class="fa fa-plane"></i>28 Airline</strong></p>
					<p><strong>Starting $199/Person</strong></p>
					<p><a href="#">DETAIL</a></p>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- END 3EME CONTAINER -->
  
<!-- FOOTER -->
<%@include file="header.jsp" %>
  
</body>
</html>
  
</body>
</html>