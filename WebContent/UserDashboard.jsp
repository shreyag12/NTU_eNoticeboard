<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Virtual Noticeboard</title>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Karma">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/notice.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="js/notice.js"></script>
</head>
<body>

	<!-- Sidebar (hidden by default) -->
	<nav
		class="w3-sidebar w3-bar-block w3-card w3-top w3-xlarge w3-animate-left"
		style="display: none; z-index: 2; width: 40%; min-width: 300px"
		id="mySidebar">
		<a href="javascript:void(0)" onclick="w3_close()"
			class="w3-bar-item w3-button">Close Menu</a> <a href="#food"
			onclick="w3_close()" class="w3-bar-item w3-button">Notices</a> <a
			href="#about" onclick="w3_close()" class="w3-bar-item w3-button">About</a>
	</nav>

	<!-- Top menu -->
	<div class="w3-top">
		<div class="w3-white w3-xlarge"
			style="max-width: 1200px; margin: auto">
			<div class="w3-button w3-padding-16 w3-left" onclick="w3_open()">
				<img src="images/menu.png" style="width: 20px;">
			</div>
			<!-- <div class="w3-right w3-padding-16">Mail</div> -->
			<div class="w3-center w3-padding-16">
				<h2>Notic'E' Board</h2>
			</div>
		</div>
	</div>

	<!-- !PAGE CONTENT! -->
	<div class="w3-content" style="max-width: 2000px; margin-top: 46px">
		<!-- Carousel Slideshow Images -->
		<div class="container">

			<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner">

					<div class="item active">
						<img src="images/Artificial Intelligence.jpg" alt="Los Angeles"
							style="width: 100%;">
						<div class="carousel-caption">
							<h3>Artificial Intelligence</h3>
							<p>
								<b>Share your ideas for machine to think!</b>
							</p>
						</div>
					</div>

					<div class="item">
						<img src="images/Dance.jpg" alt="Chicago" style="width: 100%;">
						<div class="carousel-caption">
							<h3>Contemporary</h3>
							<p>
								<b>Contemporary dance!</b>
							</p>
						</div>
					</div>

					<div class="item">
						<img src="images/Korean.png" alt="New York" style="width: 100%;">
						<div class="carousel-caption">
							<h3>Korean</h3>
							<p>
								<b>Come and dance your soul out!</b>
							</p>
						</div>
					</div>

				</div>

				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#myCarousel"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>




			<!-- Second Photo Grid-->
			<h2>Popular Events</h2>
			<div class="w3-row-padding w3-padding-16 w3-center">
				<div class="w3-quarter">
					<img src="images/Destination NTU.jpg" alt="Popsicle"
						style="width: 100%">
					<h3>Destination NTU</h3>
					<p>A fun-filled event for Graduate Students</p>
					<p>
						<b>Date: </b>9th November
					</p>
					<p>
						<b>Time: </b>6:30 PM
					</p>
					<p>
						<b>Venue: </b>Canopy Stage
					</p>
				</div>
				<div class="w3-quarter">
					<img src="images/IGS Open Games.png" alt="Salmon"
						style="width: 100%">
					<h3>IGS Open Games</h3>
					<p>Exclusive Game tournament for Graduate Students</p>
					<p>
						<b>Date: </b>13th October to 4th November
					</p>
					<p>
						<b>Venue: </b>The Hive, Recreation Center
					</p>
				</div>
				<div class="w3-quarter">
					<img src="images/Karoke Night.png" alt="Sandwich"
						style="width: 100%">
					<h3>The Perfect Sandwich, A Real Classic</h3>
					<p>Just some random text, lorem ipsum text praesent tincidunt
						ipsum lipsum.</p>
				</div>
				<div class="w3-quarter">
					<img src="images/CareerConnect.png" alt="Croissant"
						style="width: 100%">
					<h3>Le French</h3>
					<p>Lorem lorem lorem lorem ipsum text praesent tincidunt ipsum
						lipsum.</p>
				</div>
			</div>

			<!-- Pagination -->
			<div class="w3-center w3-padding-32">
				<div class="w3-bar">
					<a href="#" class="w3-bar-item w3-button w3-hover-black">«</a> <a
						href="#" class="w3-bar-item w3-black w3-button">1</a> <a href="#"
						class="w3-bar-item w3-button w3-hover-black">2</a> <a href="#"
						class="w3-bar-item w3-button w3-hover-black">3</a> <a href="#"
						class="w3-bar-item w3-button w3-hover-black">4</a> <a href="#"
						class="w3-bar-item w3-button w3-hover-black">»</a>
				</div>
			</div>

			<!-- Browse Category -->
			<h2>Browse By Category</h2>
			<div class="row">
				<div class="columnStyle">
				<a href="/NTU-eNoticeBoard/BrowseNotice.jsp">
					<img src="images/Events.jpg" style="width: 100%; height: 97%">
					<div class="textStyle" style="width: 98%">
						<h2>Events</h2>

					</div>
				</div>
				<div class="columnStyle">
					<a href="/NTU-eNoticeBoard/BrowseNotice.jsp"> <img
						src="images/Notices.jpg" style="width: 100%">
						<div class="textStyle" style="width: 98%">
							<h2>Notices</h2>

						</div>
				</div>
			</div>
			<div class="row">
				<div class="columnStyle">
				<a href="/NTU-eNoticeBoard/BrowseNotice.jsp">
					<img src="images/for sale.jpeg" style="width: 100%">
					<div class="textStyle" style="width: 98%">
						<h2>For Sale</h2>

					</div>
				</div>
				<div class="columnStyle">
				<a href="/NTU-eNoticeBoard/BrowseNotice.jsp">
					<img src="images/lostandfound.jpg" style="width: 100%; height: 85%">
					<div class="textStyle" style="width: 98%">
						<h2>Lost & Found</h2>

					</div>

				</div>
				<div class="columnStyle">
				<a href="/NTU-eNoticeBoard/BrowseNotice.jsp">
					<img src="images/workshop1.jpg" alt="workshop" style="width: 100%">
					<div class="textStyle" style="width: 98%">
						<h2>Workshops</h2>

					</div>

				</div>


			</div>

			<hr id="about">

			<!-- About Section -->
			<div class="w3-container w3-padding-32 w3-center">
				<h3>About NTU E-Notice Board</h3>
				<br> <img src="images/Notice.jpg" alt="Me" class="w3-image"
					style="display: block; margin: auto" width="800" height="533">
				<div class="w3-padding-32">
					<h4>
						<b>Stay in track of what's happening around!</b>
					</h4>
					<h6>
						<i>Don't miss any information. Everything at one place!</i>
					</h6>
					<p>
						You can view notices, posters, information of events across NTU.
						Seamlessly share them with your friends through social media.
						Locate lost and found item in one location. You can also send your
						poster to publish here at <a>enoticeboard@ntu.e.edu.sg</a>
					</p>
				</div>
			</div>
			<hr>

			<!-- Footer -->
			<!-- <footer class="w3-row-padding w3-padding-32">
			<div class="w3-third">
				<h3>FOOTER</h3>
				<p>Praesent tincidunt sed tellus ut rutrum. Sed vitae justo
					condimentum, porta lectus vitae, ultricies congue gravida diam non
					fringilla.</p>
				<p>
					Powered by <a href="https://www.w3schools.com/w3css/default.asp"
						target="_blank">w3.css</a>
				</p>
			</div>

			<div class="w3-third">
				<h3>BLOG POSTS</h3>
				<ul class="w3-ul w3-hoverable">
					<li class="w3-padding-16"><img src="images/workshop.jpg"
						class="w3-left w3-margin-right" style="width: 50px"> <span
						class="w3-large">Lorem</span><br> <span>Sed mattis
							nunc</span></li>
					<li class="w3-padding-16"><img src="images/gondol.jpg"
						class="w3-left w3-margin-right" style="width: 50px"> <span
						class="w3-large">Ipsum</span><br> <span>Praes tinci
							sed</span></li>
				</ul>
			</div> -->
			<footer>
			<div class="w3-third w3-serif">
				<h3>POPULAR TAGS</h3>
				<p>
					<span class="w3-tag w3-black w3-margin-bottom">Sports</span> <span
						class="w3-tag w3-dark-grey w3-small w3-margin-bottom">Recreation</span>
					<span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">Lost
						Item</span> <span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">GSA</span>
					<span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">Volunteering</span>
					<span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">Workshops</span>
					<span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">Events</span>
					<span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">Schedule</span>
					<span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">Food</span>
					<span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">Donation</span>
					<span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">Charity</span>
					<span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">Alumini</span>
					<span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">Poster</span>
					<span class="w3-tag w3-dark-grey w3-small w3-margin-bottom">NTU</span>
				</p>
			</div>
			</footer>
		</div>

		<!-- End page content -->
	</div>


</body>
</html>