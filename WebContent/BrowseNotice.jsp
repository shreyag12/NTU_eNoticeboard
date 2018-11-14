<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Notices</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Karma">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/notice.css">
<script src="http://code.jquery.com/jquery-latest.js" type="text/javascript"></script>
<script src="js/jquery.isotope.js" type="text/javascript"></script> 
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
	<div class = "container">
 	<h1>Browse Notices</h1>
	<div class="portfolioFilter">

	<a href="#" data-filter="*" class="current">All Categories</a>
	<a href="#" data-filter=".people">People</a>
	<a href="#" data-filter=".places">Places</a>
	<a href="#" data-filter=".food">Food</a>
	<a href="#" data-filter=".objects">Objects</a>

</div>

<div class="portfolioContainer">

	<div class="objects">
		<img src="images/watch.jpg" alt="image">
	</div>
	
	<div class="people places">
		<img src="images/surf.jpg" alt="image">
	</div>	

	<div class="food">
		<img src="images/burger.jpg" alt="image">
	</div>
	
	<div class="people places">
		<img src="images/subway.jpg" alt="image">
	</div>

	<div class="places objects">
		<img src="images/trees.jpg" alt="image">
	</div>

	<div class="people food objects">
		<img src="images/coffee.jpg" alt="image">
	</div>

	<div class="food objects">
		<img src="images/wine.jpg" alt="image">
	</div>	
	
	<div class="food">
		<img src="images/salad.jpg" alt="image">
	</div>	
	
</div>
</div>
</div>
 
<script type="text/javascript">

$(window).load(function(){
    var $container = $('.portfolioContainer');
    $container.isotope({
        filter: '*',
        animationOptions: {
            duration: 750,
            easing: 'linear',
            queue: false
        }
    });
 
    $('.portfolioFilter a').click(function(){
        $('.portfolioFilter .current').removeClass('current');
        $(this).addClass('current');
 
        var selector = $(this).attr('data-filter');
        $container.isotope({
            filter: selector,
            animationOptions: {
                duration: 750,
                easing: 'linear',
                queue: false
            }
         });
         return false;
    }); 
});

</script>
</body>
</html>