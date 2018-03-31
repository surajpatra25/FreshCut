<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate var="year" value="${now}" pattern="yyyy" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<link rel="shortcut icon" href="http://www.cns-inc.com/sites/all/themes/cnsi/favicon.ico" type="image/vnd.microsoft.icon" />

  		<title>FMS | CNSI</title>
  		<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet" />
  		<link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet" />
  <script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.3.js" />"></script>
  <script type="text/javascript" src="<c:url value="/resources/js/jquery-ui-1.11.4.custom/jquery-ui.js" />"></script>
			

  
  		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
		<script>
		  function validateLogin() {
		        var userName = document.loginform.userName.value;
		        var password = document.loginform.password.value;
		        if (userName == "") {
		        	alert("Username should not be blank!");
		        	return false;
		        } else if(password == "") {
		            alert("Password should not be blank!");
		        	return false;
		        }
		        return true;
		  }
		</script>
	</head>
	<body class="html">
<div id="wrapper">
  <!-- ______________________ HEADER _______________________ -->

<style>
@-webkit-keyframes logo-rotating /* Safari and Chrome */ {
  from {
    -ms-transform: rotate(0deg);
    -moz-transform: rotate(0deg);
    -webkit-transform: rotate(0deg);
    -o-transform: rotate(0deg);
    transform: rotate(0deg);
  }
  to {
    -ms-transform: rotate(360deg);
    -moz-transform: rotate(360deg);
    -webkit-transform: rotate(360deg);
    -o-transform: rotate(360deg);
    transform: rotate(360deg);
  }
}
@keyframes logo-rotating {
  from {
    -ms-transform: rotate(0deg);
    -moz-transform: rotate(0deg);
    -webkit-transform: rotate(0deg);
    -o-transform: rotate(0deg);
    transform: rotate(0deg);
  }
  to {
    -ms-transform: rotate(360deg);
    -moz-transform: rotate(360deg);
    -webkit-transform: rotate(360deg);
    -o-transform: rotate(360deg);
    transform: rotate(360deg);
  }
}
.logo-container:hover img.logo-circle {
  -webkit-animation: logo-rotating 0.5s ease-in-out ;
  -moz-animation: logo-rotating 0.5s ease-in-out ;
  -ms-animation: logo-rotating 0.5s ease-in-out ;
  -o-animation: logo-rotating 0.5s ease-in-out ;
  animation: logo-rotating 0.5s ease-in-out ;
}
.logo-container img {
	display: inline-block;
}
.logo-container img.logo-circle {
	width: 40px;
}
.logo-container img:not(.logo-circle) {
	width: 120px;
	margin-left: 5px;
}
</style>

	<header class="">
      <div class="header-container ">
          <div class="logo-container hvr-float-shadow">
            <a href="<c:url value='/homepage'/>" title="Home" rel="home" class="logo_link">
              <img class="logo-circle" src="<c:url value="/resources/images/cnsi-white-circle-only.png" />" alt="Home"/><img src="<c:url value="/resources/images/cnsi-white-letters-only.png" />" alt="Home"/>
            </a>
          </div>
          <div class="title-container">
            <span class="title hvr-float-shadow">${properties['app.app_title']}</span>
          </div>
      </div>
    </header>

  <!-- ______________________ MAIN _______________________ -->

  <div id="main" style="background:rgba(0,0,0,.05);">
      <div class="content-inner" id="login">
		<h2>Sign In</h2>
		<form:form method="POST" action="perform-login" name="loginform" onsubmit="return validateLogin();">
	   		 <fieldset>
	   		 	<c:if test="${param.error==''}">
				    <p><b>InvalidLogin: Username and Password do not match.</b></p>
				</c:if>
				<c:if test="${param.logout=='' }">
				    <p><b>You have been successfully logged out.</b></p>
				</c:if>
	   		 	<p><b><c:out value="${validatelogin}"/></b></p>
	   		 	<p><b><c:out value="${newpassword}"/></b></p>
	   		 	<p><b><c:out value="${passwordChanged}"/></b></p>
            	<p><form:label path="userName">${properties['app.username_label']}</form:label></p>
            	<p><form:input path="userName" value="${fmsuserbean.userName}" autofocus="autofocus" /></p>

            	<p><form:label path="password">${properties['app.password_label']}</form:label></p>
            	<p><form:password path="password" value="${fmsuserbean.password}"/></p>

            	<p style="overflow: hidden"><input type="submit" value="Sign In" /></p>
            	<p><span><a id="forgot-password" href="<c:url value='/forgot-password' />">Forgot Password?</a></span></p>
            	<br>
            	<p><span><a id="forgot-username" href="<c:url value='/forgot-username' />">Forgot Username?</a></span></p>
          	</fieldset>
		</form:form>
	</div> <!-- end login -->
    
  </div>
  <div id="footer-spacer"></div>
</div>

  <!-- ______________________ FOOTER _______________________ -->

  
	<footer id="footer">
	    <div class="cc-full">
	        <div class="">
	          <div class="cc-lg">
	            
	            <div class="row small-links">
	              <div class="col col-1 f-center padded">
	                <span class="f-xsm">${properties['app.cnsi_label']} ${year}</span>
	              </div>
	            </div>
	          </div>
	        </div>
	    </div>
    </footer>

<script type="text/javascript" src="<c:url value="/resources/js/libs.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/app.js" />"></script>
</body>
</html>