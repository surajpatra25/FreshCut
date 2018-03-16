<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="google-signin-client_id" content="freshcut-1520596257623.apps.googleusercontent.com">
<title>FreshCut</title>
<link rel="stylesheet" href="resources/css/CommonStyle.css">


<script defer
	src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
<script src="resources/js/jquery-3.3.1.min.js"></script>
<script src="https://apis.google.com/js/platform.js" async defer></script>
<script>
	var signInOpen=false;
	var signUpopen=false;
	
	$(document).ready(function() {
		$("#signInIcon").click(function() {
			$("#signUp").hide();
			$("#signIn").toggle(500);
		});
		
		$("#signUpIcon").click(function() {
			$("#signIn").hide();
			$("#signUp").toggle(500);
		});
		$("#OnlineCheckInIcon").click(function() {
			$("#signIn").hide();
			$("#signUp").hide();
			$("#onlineCheckInDiv").toggle(500);
		});
		$(".closeButton").click(function() {
			$("#signUp").hide();
			$("#signIn").hide();

		});
		$("#MainMenuIcon").click(function() {
			$("#signUp").hide();
			$("#Menu").toggle();

		});
		
		$("#AboutUsIcon").click(function() {
			$("#signIn").hide();
			$("#signUp").hide();
			$("#AboutUsDiv").toggle(500);

		});
		$("div.headerMenu").click(function() {
			
				$(this).find(".subMenu").toggle();
			
		});
		
	});
</script>
</head>
<body>
<div id= "FirstImage">
	<div id="container">
		<div id="banner">
			<div id="homePage">
				<div id="header">
					<h2>Fresh Cut</h2>
					<h3>
						<a href="hello?name=Sunanda">Click Here</a>
					</h3>
				</div>
				<div id="collapsedMenu">
					
						<div id="AboutUsIcon">
								<a href="#AboutUsDiv"><i class="fab fa-adn"></i></a>
							</div>
						<div id="signUpIcon">
							<label>Sign UP&nbsp; </label><i class="fas fa-user-plus"></i>
						</div>
						<div id="signInIcon">
							<label>Sign IN&nbsp;</label><i class="fas fa-sign-in-alt"></i>
						</div>
						<div id="hiddenicon"><i class="fas fa-cog"></i>	</div>
					<!-- 	<div id="staticicons" > -->
							<div id="MainMenuIcon">
								<i class="fas fa-bars"></i>
							</div>
							<div id="OnlineCheckInIcon">
								<a href="#onlineCheckInDiv"><i class="fas fa-check-circle"></i></a>
							</div>
							
							<div id="OnlineCouponsIcon">
								<a href="#onlineCouponsDiv"><i class="fas fa-cut"></i></a>
							</div>
							
							
						<!-- </div> -->
				</div>
	
 
    <div id="map"></div>
    <script>
      function initMap() {
        var uluru = {lat: -25.363, lng: 131.044};
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 4,
          center: uluru
        });
        var marker = new google.maps.Marker({
          position: uluru,
          map: map
        });
      }
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAP1MP4yZxlVgdeQZTlwgxyxlVS3zmkn90&callback=initMap">
    </script>
      
				
			</div> 
			
		</div>
	<div id ="FrontPageText">
				<Label>FreshCut - A Look That Redifines The Idea Of Elegance With A Stroke Of Confidence</Label>
				<BR>
				<BR>
				<label>A Rebellious Look Worth A Thousand Celebrations. Be Smart! Be Charming!</label>
				</div>
	<div id="AboutUsDiv">
		<div >
	<h1>KUNUKUNU</h1>
			
			
		</div>		
	</div>
		<div id="signIn">
		<form action="login">
			<table>
				<tbody>
					<tr>
						<td><input type="text" placeholder="user name"><br></td>
					</tr>
					<tr>
						<td><input type="password" placeholder="password"><br></td>
					</tr>
					<tr>
						<td colspan="2"><button>Sign IN</button>
							<button class="closeButton">Close</button></td>
					</tr>
				</tbody>
			</table>
			</form>
		</div>
		<div id="Menu">
			
			<div class="headerMenu">Details<i class="fas fa-plus"></i>
				<div class="subMenu">
					<ul>			
					<li>About Us</li>
					<li>Contact Us</li>
					<li>Locations</li>
					<li>Hours</li>
				</ul>
			</div>
			</div>
			<div class="headerMenu">Our Solutions<i class="fas fa-plus"></i>
			
				<div class="subMenu">
				<ol>
					<li>Products</li>
					<li>Offers</li>
					<li>Check In</li>
					<li>Jobs</li>
				</ol>
				</div>
			</div>
			<div class="headerMenu">Chat With Us<i class="fas fa-plus"></i></div>
			<div class="headerMenu">TBD<i class="fas fa-plus"></i></div>
		</div>
		<div id="signUp">
		<form action="signup">
			<table>
				<tbody>
					<tr>
						<td><input type="text" placeholder="user name"><br></td>
					</tr>
					<tr>
						<td><input type="email" placeholder="email"><br></td>
					</tr>
					<tr>
						<td><input type="password" placeholder="password"><br></td>
					</tr>
					<tr>
						<td><input type="password" placeholder="password"><br></td>
					</tr>
					<tr>
						<td colspan="2"><button>Sign UP</button>
							<button class="closeButton">Close</button></td>
					</tr>
					<tr><td><div class="g-signin2" data-onsuccess="onSignIn"></div></td></tr>
				</tbody>
			</table>
			</form>
		</div>

</div></div>

	
	<div id="onlineCheckInDiv">
		<table>
			<tbody>
				<tr>
					<td><label>Online Check IN</label><br></td>
				</tr>
				<tr>
				<tr>
					<td><input type="text" placeholder="user name"><br></td>
				</tr>
				<tr>
					<td><input type="date" datetime="date"
						placeholder="Schedule Date"><br></td>
				</tr>
				<tr>

					<td><input type="time" datetime="hh:mm:ssTZD"
						placeholder="Schedule time"><br></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="location"><br></td>
				</tr>
				<tr>
					<td colspan="2"><button>Check in</button>
						<button class="closeButton">Close</button></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div id="onlineCouponsDiv">
		<div class="coupons">
		   <c:forEach var="coupon" items="${coupons}" varStatus="status">
			<div class="coupon">
				<div class="container">
					<h3>Company Logo</h3>
				</div>
				<img src="hamburger.jpg" alt="Avatar" style="width: 100%;">
				<div class="container" style="background-color: rgba(0, 0, 255, 0.1)" >
					<h2>
						<b>${coupon.couponText}</b>
					</h2>
					<p>Lorem ipsum..</p>
				</div>
				<div class="container">
					<p>
						Use Promo Code: <span class="promo">BOH232</span>
					</p>
					<p class="expire">Expires: Jan 03, 2017</p>
				</div>
			</div>
			</c:forEach>
			</div>
	</div>
	

	



</body>

</html>