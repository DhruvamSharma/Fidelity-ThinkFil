<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ThinkFil</title>
<link rel="stylesheet" href="/views/login/login.css" type="text/css">



<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Bootstrap core CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Material Design Bootstrap -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.4/css/mdb.min.css"
	rel="stylesheet">


<!-- JQuery -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Bootstrap tooltips -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.13.0/umd/popper.min.js"></script>
<!-- Bootstrap core JavaScript -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0/js/bootstrap.min.js"></script>
<!-- MDB core JavaScript -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.4/js/mdb.min.js"></script>


<!-- JS FILE INCLUSION -->
<script type="text/javascript" src="/views/login/login.js"></script>

</head>
<body>

	<!-- Main navigation -->
	<header>


		<!-- Full Page Intro -->
		<div class="view"
			style="background-image: url('/resources/BANNER.png'); background-repeat: no-repeat; background-size: cover; background-position: center center;">
			<!-- Mask & flexbox options-->
			<div
				class="mask d-flex justify-content-center align-items-center">
				<!-- Content -->
				<div class="container">
					<!--Grid row-->
					<div class="row mt-5">
						<!--Grid column-->
						<div
							class="col-md-6 mb-5 mt-md-0 mt-5 white-text text-center text-md-left">
							<h1 class="h1-responsive font-weight-bold wow fadeInLeft"
								data-wow-delay="0.3s">Start Asking and Solving!</h1>
							<hr class="hr-light wow fadeInLeft" data-wow-delay="0.3s">
							<h6 class="mb-3 wow fadeInLeft" data-wow-delay="0.3s">Lorem
								ipsum dolor sit amet, consectetur adipisicing elit. Rem
								repellendus quasi fuga nesciunt dolorum nulla magnam veniam
								sapiente, fugiat! Commodi sequi non animi ea dolor molestiae,
								quisquam iste, maiores. Nulla.</h6>
								
							
							


						</div>
						<!--Grid column-->
						<!--Grid column-->
						<div class="col-md-6 col-xl-5 mb-4">
						
						
						
						<jsp:include page="/views/login/form.jsp"></jsp:include>
						
							
						</div>
						<!--Grid column-->
					</div>
					<!--Grid row-->
				</div>
				<!-- Content -->
			</div>
			<!-- Mask & flexbox options-->
		</div>
		<!-- Full Page Intro -->







		<jsp:include page="features.jsp"></jsp:include>




		


	</header>
	<!-- Main navigation -->

</body>
</html>