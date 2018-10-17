<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  body {
      position: relative; 
  }
  #section1 {padding-top:40px;height:350px;color: #fff; background-color: #F1948A;}
  #section2 {padding-top:50px;height:200px;color: #fff; background-color: #F1948A;}
  #section3 {padding-top:100px;height:600px;color: #fff; background-color: #F1948A;}
  #section41 {padding-top:50px;height:250px;color: #fff; background-color: #F1948A ;}
  #section42 {padding-top:50px;height:250px;color: #fff; background-color: #F1948A;}
  #section43 {padding-top:50px;height:500px;color: #fff; background-color: #F1948A;}
  </style>
  
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
    box-sizing: border-box;
}

body {
    margin: 0;
    font-family: Arial, Helvetica, sans-serif;
}

/* The grid: Three equal columns that floats next to each other */
.column {
    float: left;
    width: 33.33%;
    padding: 50px;
    text-align: center;
    font-size: 25px;
    cursor: pointer;
    color: white;
}

.containerTab {
    padding: 20px;
    color: white;
}


</style>
<style>
.grid-container {
  display: grid;
  grid-template-columns: auto auto auto auto;
  grid-row-gap: 40px;
  grid-column-gap: 20px;
  background-color: #F1948A;
  padding: 30px;
}
.grid-container>div {
  background-color: #F1948A;
  text-align: center;
  padding:20px 0;
  font-size: 30px;
}
</style>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
  <style type="text/css">
	.badge1 {
		position:relative;
	}
	.badge1[data-badge]:after {
		content:attr(data-badge);
		position:absolute;
		top:-9px;
		right:-9px;
		font-size:.7em;
		background:red;
		color:white;
		width:18px;height:18px;
		text-align:center;
		line-height:18px;
		border-radius:30%;
		box-shadow:0 0 1px #333;
	}
    </style>
	<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body data-spy="scroll" data-target=".navbar" data-offset="50">

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>                        
      </button><br>
      <p><a class="navbar-brand" href="#">NTU e-notice board</a></p>
    </div>
    <div>
      <div class="collapse navbar-collapse" id="myNavbar">
       <p> <ul class="nav navbar-nav"></P>
          <li><a href="#section1">Home</a></li>
          <li><a href="#section2">Search</a></li>
          <li><a href="#section3">Events</a></li>
		  <li><a href="#section41">Volunteering</a></li>
		  <li><a href="#section42">For Sale</a></li>
		  <li><a href="#section43">Lost/Found</a></li>
		</ul>
		
		<ul class="nav navbar-nav navbar-right"><p>
		<li><a href="" class="badge1"data-badge="27"><i class="fa fa-bell" style="font-size:17px;color:white"></a></i></li>
     	   <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Logout<span class="caret"></span></a>
		   <ul class="dropdown-menu">
          <li><a href="#">My Profile</a></li>
          <li><a href="#">Sign Out</a></li>
        </ul>
		</div>
    </div>
  </div>
</nav>    

<div id="section1" class="container-fluid"><br><br>
  <font size="6">Current Events<font>
  <marquee behavior="scroll" direction="left" scrollamount="5" onmouseover="this.stop();" onmouseout="this.start();">
    <div class="row">
  	<a href="https://www.tcs.com/" role="button" ><div class="col-sm-3"><img src="images/tcs.jpg" width="300" height="250" alt="Natural" /><p><font color="white"><center><font size="3">Sep 28-Code vita</font></center></font></p></div></a>
	<a href="rough.html"><div class="col-sm-3"><img src="lt.jpg" width="300" height="250" alt="Natural" /><p><font color="white"><center><font size="3">Oct 1-Graduation Day</font></center></font></p></div></a>
	<a href="rough.html"><div class="col-sm-3"><img src="cts.jpg" width="300" height="250" alt="Natural" /><p><font color="white"><center><font size="3">Oct 3-workshop</font></center></font></p></div></a>
	<a href="rough.html"><div class="col-sm-3"><img src="aaa.jpg" width="300" height="250" alt="Natural" /><p><font color="white"><center><font size="3">July 5&6- 3D printing workshop</font></center></font></p></div></a>
    	  	  	  
	  </marquee> 
  </div>
</div>

<div id="section2" class="container-fluid"><br>
  <font size="6">Search<font>
  
  <!-- Three columns -->
<div class="row">
  <div class="column" style="background:pink;">
   
	<div class="search-container">
    <form action="/action_page.php">
	<p id="rcorners1">Event</p>
        <input type="text" placeholder="Search.." name="search" style="width: 200px; height: 37px"> <button type="submit" ><i class="fa fa-search" ></i></button>
    </form>
  </div>
  </div>
  
  <div class="column"  style="background:pink;">
    <div class="search-container">
    <form action="/action_page.php">
	<p id="rcorners1">In</p>
        <input type="text" placeholder="Search.." name="search" style="width: 200px; height: 37px"> <button type="submit"><i class="fa fa-search"></i></button>
    </form>
  </div>
  </div>
  
  <div class="column"  style="background:pink;">
   <div class="search-container">
    <form action="/action_page.php">
	<p id="rcorners1">On</p>
        <input type="text" placeholder="Search.." name="search" style="width: 200px; height: 37px"> <button type="submit"><i class="fa fa-search"></i></button>
    </form>
  </div>
  </div>
</div>
</div>

<div id="section3" class="container-fluid"><br>
  <font size="6">Events<font>

  <div class="item1"><a href="rough.html"><div class="col-sm-3"><img src="images/tcs.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Sep 28-Code vita</font></p></div></a></div>
  <div class="item2"><a href="rough.html"><div class="col-sm-3"><img src="images/lt.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Oct 1-Graduation Day</font></p></div></a></div>
  <div class="item3"><a href="rough.html"><div class="col-sm-3"><img src="images/cts.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Oct 3-workshop</font></p></div></a></div>  
  <div class="item4"><a href="rough.html"><div class="col-sm-3"><img src="images/aaa.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">July 5&6- 3D printing workshop</font></p></div></a></div>
  <div class="item5"><a href="rough.html"><div class="col-sm-3"><img src="images/dbs.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Aug 21- DBS workshop</font></p></div></a></div>
  <div class="item6"><a href="rough.html"><div class="col-sm-3"><img src="images/conf.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">May 3&5-Conference </font></p></div></a></div>
  <div class="item6"><a href="rough.html"><div class="col-sm-3"><img src="images/cls.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Aug 19-Masterclass </font></p></div></a></div>
  <div class="item6"><a href="rough.html"><div class="col-sm-3"><img src="images/des.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Nov 1-Design summit</font></p></div></a></div>

</div>



<div id="section41" class="container-fluid">
  <font size="6">Volunteering<font>
  <div class="item1"><a href="rough.html"><div class="col-sm-3"><img src="images/vol.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Diabetes Research</font></p></div></a></div>
  <div class="item2"><a href="rough.html"><div class="col-sm-3"><img src="images/Vol1.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Career Talk </font></p></div></a></div>
  <div class="item3"><a href="rough.html"><div class="col-sm-3"><img src="images/volu.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">National Day Parade </font></p></div></a></div>
  <div class="item4"><a href="rough.html"><div class="col-sm-3"><img src="images/vol3.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Art Project</font></p></div></a></div>
</div>


<div id="section42" class="container-fluid">
  <font size="6">For Sale<font>
  <div class="item1"><a href="rough.html"><div class="col-sm-3"><img src="images/cot.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Cot-$50</font></p></div></a></div>
  <div class="item2"><a href="rough.html"><div class="col-sm-3"><img src="images/fridge.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Fridge-$80 </font></p></div></a></div>
  <div class="item3"><a href="rough.html"><div class="col-sm-3"><img src="images/washing.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Washing Machine-$90 </font></p></div></a></div>
  <div class="item4"><a href="rough.html"><div class="col-sm-3"><img src="images/iron.jpg" width="200" height="200" alt="Natural" /><p><font color="white" size="3">Iron Table-$35</font></p></div></a></div>
  
</div>



<div id="section43" class="container-fluid">
 <font size="6">Lost /Found<font>
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
       <center> <img src="images/wallet.jpg" style="width:25%;"></center>
		<div class="carousel-caption"></div>
        <center><p><font size="3">Wallet found in North Spine</font></p></center>
      </div>

      <div class="item">
        <center><img src="images/key.jpg" alt="Chicago" style="width:25%;"></center>
        <div class="carousel-caption"></div>
          <center><p><font size="3">Key found near LT 4</font></p></center>
        
      </div>
    
      <div class="item">
        <center><img src="images/ezlink.jpg" alt="New York" style="width:25%;"></center>
        <div class="carousel-caption"></div>
         <center> <p><font size="3">ezlink card found near blk 55</font></p></center>
        
      </div>
     <div class="item">
        <center><img src="images/pendrive.jpg" alt="New York" style="width:25%;"></center>
        <div class="carousel-caption"> </div>
         <center> <p><font size="3">Pendrive found near lab 3</font></p></center>
    
  
    </div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</div>
</div>

</body>
</html>