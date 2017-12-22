<%@page import="java.util.List"%>
<%@page import="com.infotel.travel.model.Flight"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>Falcon Flight - Flight List</title>
<script src="https://code.jquery.com/jquery.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/home.css">
<link href="http://limpidthemes-demo.com/Themeforest/html/cruise-demo/dark/assets/css/owl.carousel.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!--<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Open+Sans" />-->
</head>
<body class="flight-img-home">

<!-- HEADER -->
<%@include file="header.jsp" %>

<%-- <jsp:useBean id="f1" class="com.infotel.travel.model.Flight"></jsp:useBean> --%>

<% List<Flight> vols = (List<Flight>) session.getAttribute("vols");%>

<!--CONTAINER-->
<div class="row modify-search modify-flight">
		<div class="container clear-padding">
			<form>
				<div class="col-md-2 col-sm-6">
					<div class="form-gp">
						<label>Leaving From</label>
						<div class="input-group margin-bottom-sm">
							<input type="text" name="departure_city" class="form-control" required placeholder="E.g. London">
							<span class="input-group-addon"><i class="fa fa-map-marker fa-fw"></i></span>
						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-6">
					<div class="form-gp">
						<label>Leaving To</label>
						<div class="input-group margin-bottom-sm">
							<input type="text" name="destination_city" class="form-control" required="" placeholder="E.g. New York">
							<span class="input-group-addon"><i class="fa fa-map-marker fa-fw"></i></span>
						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-6 col-xs-6">
					<div class="form-gp">
						<label>Departure</label>
						<div class="input-group margin-bottom-sm">
							<input type="text" id="departure_date" name="departure_date" class="flight-search form-control hasDatepicker2" required="" placeholder="DD/MM/YYYY">
							<span class="input-group-addon"><i class="fa fa-calendar fa-fw"></i></span>
						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-6 col-xs-6">
					<div class="form-gp">
						<label>Return</label>
						<div class="input-group margin-bottom-sm">
							<input type="text" id="return_date" name="return_date" class="form-control hasDatepicker2" required="" placeholder="DD/MM/YYYY">
							<span class="input-group-addon"><i class="fa fa-calendar fa-fw"></i></span>
						</div>
					</div>
				</div>
				<div class="col-md-1 col-sm-6 col-xs-3">
					<div class="form-gp">
						<label>Adult</label>
						<select style="background-color: white; height: 45px" class="selectpicker bs-select-hidden">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6</option>
						</select>
					</div>
				</div>
				<div class="col-md-1 col-sm-6 col-xs-3">
					<div class="form-gp">
						<label>Child</label>
						<select style="background-color: white; height: 45px" class="selectpicker bs-select-hidden">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6</option>
						</select>
					</div>
				</div>
				<div class="col-md-2 col-sm-6 col-xs-6">
					<div class="form-gp">
						<button type="submit" class="modify-search-button btn transition-effect">MODIFY SEARCH</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	
<!-- 2EME CONTAINER-->
<div class="row" style="background-color:white">
	<div class="container">
		<!-- START: FILTER AREA -->
		<div class="col-md-3 clear-padding">
			<div class="filter-head text-center">
				<h4>25 Result Found Matching Your Search.</h4>
			</div>
			<div class="filter-area">
				<div class="name-filter filter">
					<h5><i class="fa fa-plane"></i> Airline Name</h5>
					<div class="input-group margin-bottom-sm">
						<input type="text" name="airline_name" class="form-control" required="" placeholder="E.g. Vistara">
						<span class="input-group-addon"><i class="fa fa-search fa-fw"></i></span>
					</div>
				</div>
				<div class="airline-filter filter">
					<h5><i class="fa fa-plane"></i> Airline</h5>
					<ul>
						<li><input type="checkbox"><img src="http://limpidthemes-demo.com/Themeforest/html/cruise-demo/dark/assets/images/airline/vistara-2x.png" alt="cruise"> Vistara</li>
						<li><input type="checkbox"><img src="http://limpidthemes-demo.com/Themeforest/html/cruise-demo/dark/assets/images/airline/indigo-2x.png" alt="cruise"> Indigo</li>
						<li><input type="checkbox"><img src="http://limpidthemes-demo.com/Themeforest/html/cruise-demo/dark/assets/images/airline/spicejet-2x.png" alt="cruise"> Spicejet</li>
						<li><input type="checkbox"><img src="http://limpidthemes-demo.com/Themeforest/html/cruise-demo/dark/assets/images/airline/jet-2x.png" alt="cruise"> Jet</li>
					</ul>
				</div>
				<div class="stop-filter filter">
					<h5><i class="fa fa-stop"></i> Stops</h5>
						<div class="btn-group" data-toggle="buttons">
							<label class="btn btn-primary">
								<input type="radio" name="options" id="option1"> 0 <br>Stop
							</label>
							<label class="btn btn-primary">
								<input type="radio" name="options" id="option2"> 1 <br>Stops
							</label>
							<label class="btn btn-primary">
								<input type="radio" name="options" id="option3"> 1+ <br>Stops
							</label>
						</div>
				</div>
				<div class="filter">
					<h5><i class="fa fa-list"></i> Class</h5>
					<ul>
						<li><input type="checkbox"> Economy</li>
						<li><input type="checkbox"> Business</li>
						<li><input type="checkbox"> All</li>
					</ul>
				</div>
				<div class="facilities-filter filter">
					<h5><i class="fa fa-list"></i> Airline Facilities</h5>
					<ul>
						<li><input type="checkbox"> <i class="fa fa-wifi"></i> Wifi</li>
						<li><input type="checkbox"> <i class="fa fa-cab"></i> Parkings</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- END: FILTER AREA -->
		
		<!-- START: INDIVIDUAL LISTING AREA -->
		<div class="col-md-9 flight-listing">
	
			<!-- START: LOWEST FARE SLIDER -->
			<div class="lowest-fare-slider col-md-12">
				<div class="owl-carousel owl-theme owl-loaded owl-responsive-1000" id="lowest-fare">
					
					
					
					
					
					
					
				<!--	
				<div class="owl-stage-outer"><div class="owl-stage" style="transform: translate3d(-1771px, 0px, 0px); transition: 0.25s; width: 2898px;"><div class="owl-item cloned" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>25 Aug</h5>
						<span>From $200</span>
					</div></div><div class="owl-item cloned" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>26 Aug</h5>
						<span>From $150</span>
					</div></div><div class="owl-item cloned" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>27 Aug</h5>
						<span>From $300</span>
					</div></div><div class="owl-item cloned" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>28 Aug</h5>
						<span>From $400</span>
					</div></div><div class="owl-item cloned" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>29 Aug</h5>
						<span>From $500</span>
					</div></div><div class="owl-item" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>22 Aug</h5>
						<span>From $129</span>
					</div></div><div class="owl-item" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>23 Aug</h5>
						<span>From $119</span>
					</div></div><div class="owl-item" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>24 Aug</h5>
						<span>From $299</span>
					</div></div><div class="owl-item" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>25 Aug</h5>
						<span>From $200</span>
					</div></div><div class="owl-item" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>26 Aug</h5>
						<span>From $150</span>
					</div></div><div class="owl-item" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>27 Aug</h5>
						<span>From $300</span>
					</div></div><div class="owl-item active" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>28 Aug</h5>
						<span>From $400</span>
					</div></div><div class="owl-item active" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>29 Aug</h5>
						<span>From $500</span>
					</div></div><div class="owl-item cloned active" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>22 Aug</h5>
						<span>From $129</span>
					</div></div><div class="owl-item cloned active" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>23 Aug</h5>
						<span>From $119</span>
					</div></div><div class="owl-item cloned active" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>24 Aug</h5>
						<span>From $299</span>
					</div></div><div class="owl-item cloned" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>25 Aug</h5>
						<span>From $200</span>
					</div></div><div class="owl-item cloned" style="width: 151px; margin-right: 10px;"><div class="text-center">
						<h5>26 Aug</h5>
						<span>From $150</span>
					</div></div></div></div><div class="owl-controls"><div class="owl-nav"><div class="owl-prev" style=""><i class="fa fa-chevron-left owl-navigation-icon-blue"></i></div><div class="owl-next" style=""><i class="fa fa-chevron-right owl-navigation-icon-blue"></i></div></div><div class="owl-dots" style="display: block;"><div class="owl-dot"><span></span></div><div class="owl-dot active"><span></span></div></div></div></div>
				-->
			</div>
			<!-- END: LOWEST FARE SLIDER -->
	
			<!-- START: SORT AREA -->
			<div class="sort-area col-md-12">
				<div class="col-md-3 col-sm-3 col-xs-6 sort">
					<select style="width: 101%;" class="selectpicker bs-select-hidden">
						<option>Price</option>
						<option> Low to High</option>
						<option> High to Low</option>
					</select>
				</div>
				<div class="col-md-3 col-sm-3 col-xs-6 sort">
					<select style="width: 101%;" class="selectpicker bs-select-hidden">
						<option>Airline</option>
						<option> Vistara</option>
						<option> Indigo</option>
						<option> Jet</option>
						<option> Spicejet</option>
					</select>
				</div>
				<div class="col-md-3 col-sm-3 col-xs-6 sort">
					<select style="width: 101%;" class="selectpicker bs-select-hidden">
						<option>User Rating</option>
						<option> Low to High</option>
						<option> High to Low</option>
					</select>
				</div>
				<div class="col-md-3 col-sm-3 col-xs-6 sort">
					<select style="width: 101%;" class="selectpicker bs-select-hidden">
						<option>Name</option>
						<option> Ascending</option>
						<option> Descending</option>
					</select>
				</div>
			</div>
			<!-- END: SORT AREA -->
			<div class="clearfix"></div>
			
			
			<!-- START: FLIGHT LIST VIEW -->
			<%for(Flight f : vols) {%>
			<div class="flight-list-view">
				<div class="airline-logo col-md-2 text-center clear-padding">
					<img width="60" height="60" src="images/airlines/<%=f.getAirline_id().getId()%>.png" alt="<%=f.getAirline_id().getName()%>" onerror="this.src='images/airlines/default.png'">
					<h6><%=f.getAirline_id().getName() %></h6>
				</div>
				<div class="col-md-6 col-sm-6 col-xs-8 text-center clear-padding flight-desc">
					<div class="take-off">
						<h4><i class="fa fa-plane"></i> <%=f.getDeparture()%> mercredi 20 Nov.</h4> 
						<h5><i class="fa fa-map-marker"></i> <%=f.getDestAirport().getCountry()%> - <%=f.getDestAirport().getCity()%> (<%=f.getDestAirport().getIata()%>), <%=f.getSourceAirport().getCountry()%> - <%=f.getSourceAirport().getCity()%> (<%=f.getSourceAirport().getIata()%>)</h5>
					</div>
					<div class="landing">
						<h4><i class="fa fa-plane fa-rotate-90"></i> <%=f.getArrival()%> Mon, Aug 3</h4> 
						<h5><i class="fa fa-map-marker"></i> <%=f.getDestAirport().getCountry()%> - <%=f.getSourceAirport().getCity()%> (<%=f.getSourceAirport().getIata()%>), <%=f.getSourceAirport().getCountry()%> - <%=f.getDestAirport().getCity()%> (<%=f.getDestAirport().getIata()%>)</h5>
					</div>
				</div>
				<div class="col-md-2 col-sm-6 col-xs-4 clear-padding flight-desc text-center">
					<div class="duration">
						<h4><i class="fa fa-clock-o"></i> 02h 00m</h4>
						<h4>1 Stop</h4>
					</div>
				</div>
				<div class="clearfix visible-sm-block visible-xs-block"></div>
				<div class="col-md-2 flight-book text-center clear-padding">
					<div class="price">
						<h4><%=(int)(500*Math.random())+300%>€</h4>
						<h5>Par Personne</h5>
					</div>
					<div class="book">
						<form action="GetFlightNo">
						<input name="flightid" value="<%=f.getId()%>" type="hidden" value="OK"/>
						<button style="border:0;font-weight: bold;color: #ffffff;background: #A28753;padding: 8px 20px;display: inline-block;text-decoration: none;">BOOK</button></form>
						<h6 data-toggle="modal" data-target=".flight-details">Voir Details <i class="fa fa-plus"></i></h6>
					</div>
				</div>
			</div>
			<%} %>
			<div class="clearfix"></div>		
			<!-- END: FLIGHT LIST VIEW -->
			
			
			
			<!-- START: PAGINATION -->
			<div class="bottom-pagination">
				<nav class="pull-right">
					<ul class="pagination pagination-lg">
						<li><a href="#" aria-label="Previous"><span aria-hidden="true">Â«</span></a></li>
						<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
						<li><a href="#">2 <span class="sr-only">(current)</span></a></li>
						<li><a href="#">3 <span class="sr-only">(current)</span></a></li>
						<li><a href="#">4 <span class="sr-only">(current)</span></a></li>
						<li><a href="#">5 <span class="sr-only">(current)</span></a></li>
						<li><a href="#">6 <span class="sr-only">(current)</span></a></li>
						<li><a href="#" aria-label="Previous"><span aria-hidden="true">Â»</span></a></li>
					</ul>
				</nav>
			</div>
			<!-- END: PAGINATION -->
		</div>
		<!-- END: INDIVIDUAL LISTING AREA -->
	</div>
</div>
<!--FIN 2EME CONTAINER-->

  
  <!-- FOOTER -->
  <%@include file="footer.jsp" %>
  
</body>
</html>
  
</body>
</html>