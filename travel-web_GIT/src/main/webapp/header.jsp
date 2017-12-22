<nav style="background-color: rgba(255, 255, 255, 1); border-color:#0A3152; border-radius:0px; border:0px; padding:10px 0" class="navbar navbar-default navbar-inverse" role="navigation">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#" style="color:#07253F"><i class="fa fa-plane"></i> Falcon Flight</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#" style="color:#07253F; background-color:transparent">Accueil</a></li>
        <li><a href="#" style="color:#07253F">Presentation</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color:#07253F">Services <span class="caret"></span></a>
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
        <li><p class="navbar-text" style="color:#07253F">Déjà client?</p></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false" style="color:#07253F"><b>Login</b> <span class="caret"></span></a>
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
								 <form class="form" role="form" method="post" action="login" accept-charset="UTF-8" id="login-nav">
										<div class="form-group">
											 <label class="sr-only" for="exampleInputEmail2">Email address</label>
											 <input type="email" class="form-control" id="exampleInputEmail2" placeholder="Email address" required="">
										</div>
										<div class="form-group">
											 <label class="sr-only" for="exampleInputPassword2">Password</label>
											 <input type="password" class="form-control" id="exampleInputPassword2" placeholder="Password" required="">
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
