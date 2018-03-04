<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FreshCut</title>
<link rel="stylesheet" href="resources/css/CommonStyle.css">
<script defer
	src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
<script src="resources/js/jquery-3.3.1.min.js"></script>
<script>
	var signInOpen=false;
	var signUpopen=false;
	
	$(document).ready(function() {
		$("#signInIcon").click(function() {
			$("#signUp").hide();
			$("#signIn").show(500);
		});
		$("#signUpIcon").click(function() {
			$("#signIn").hide();
			$("#signUp").show(500);
		});
		$("#OnlineCheckInIcon").click(function() {
			$("#signIn").hide();
			$("#signUp").hide();
			$("#onlineCheckInDiv").show(500);
		});
		$(".closeButton").click(function() {
			$("#signUp").hide();
			$("#signIn").hide();

		})
	});
</script>
</head>
<body>
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
					<div id="icons">

						<div id="signUpIcon">
							<label>Sign UP&nbsp; </label><i class="fas fa-user-plus"></i>
						</div>
						<div id="signInIcon">
							<label>Sign IN&nbsp;</label><i class="fas fa-sign-in-alt"></i>
						</div>
						<div id="MainMenuIcon">
							<i class="fas fa-bars"></i>
						</div>
						<div id="OnlineCheckInIcon">
							<a href="#onlineCheckInDiv"><i class="fas fa-check-circle"></i></a>
						</div>
						<div id="OnlineCouponsIcon">
							<a href="#onlineCouponsDiv"><img src="resources/img/coupons.png" alt="coupons" height="42" width="42"/></a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="signIn">
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
		</div>
		<div id="signUp">
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
				</tbody>
			</table>
		</div>



	</div>
	<div id="onlineCheckInDiv" align="center">
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
	<div id="onlineCouponsDiv" align="center">
		<div class="coupons">
			<div class="coupon">
				<div class="container">
					<h3>Company Logo</h3>
				</div>
				<img src="hamburger.jpg" alt="Avatar" style="width: 100%;">
				<div class="container" style="background-color: white">
					<h2>
						<b>20% OFF YOUR PURCHASE</b>
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
			<div class="coupon">
				<div class="container">
					<h3>Company Logo</h3>
				</div>
				<img src="hamburger.jpg" alt="Avatar" style="width: 100%;">
				<div class="container" style="background-color: white">
					<h2>
						<b>20% OFF YOUR PURCHASE</b>
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
			<div class="coupon">
				<div class="container">
					<h3>Company Logo</h3>
				</div>
				<img src="hamburger.jpg" alt="Avatar" style="width: 100%;">
				<div class="container" style="background-color: white">
					<h2>
						<b>20% OFF YOUR PURCHASE</b>
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
			<div class="coupon">
				<div class="container">
					<h3>Company Logo</h3>
				</div>
				<img src="hamburger.jpg" alt="Avatar" style="width: 100%;">
				<div class="container" style="background-color: white">
					<h2>
						<b>20% OFF YOUR PURCHASE</b>
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
			<div class="coupon">
				<div class="container">
					<h3>Company Logo</h3>
				</div>
				<img src="hamburger.jpg" alt="Avatar" style="width: 100%;">
				<div class="container" style="background-color: white">
					<h2>
						<b>20% OFF YOUR PURCHASE</b>
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
			<div class="coupon">
				<div class="container">
					<h3>Company Logo</h3>
				</div>
				<img src="hamburger.jpg" alt="Avatar" style="width: 100%;">
				<div class="container" style="background-color: white">
					<h2>
						<b>20% OFF YOUR PURCHASE</b>
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
			<div class="coupon">
				<div class="container">
					<h3>Company Logo</h3>
				</div>
				<img src="hamburger.jpg" alt="Avatar" style="width: 100%;">
				<div class="container" style="background-color: white">
					<h2>
						<b>20% OFF YOUR PURCHASE</b>
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
		</div>
	</div>


	</div>

</body>

</html>