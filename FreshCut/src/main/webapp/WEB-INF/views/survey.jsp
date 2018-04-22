<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
   <title>Ubercut Survey</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type="text/css" href="resources/Survey/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="resources/Survey/font-awesome/css/font-awesome.min.css" />

    <script type="text/javascript" src="resources/Survey/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="resources/Survey/bootstrap/js/bootstrap.min.js"></script>
    
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.1/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>

<div class="container">    

<div class="page-header">
    <h1>UberCut <small>Ubercut Feedback</small></h1>
</div>

<!-- Contact Form - START -->
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="well well-sm">
                <form class="form-horizontal" method="post" modelAttribute="survey" action="saveSurvey">
                    <fieldset>
                        <legend class="text-center header">Feedback</legend>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="fname" name="firstName" type="text" placeholder="First Name" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="lname" name="lastName" type="text" placeholder="Last Name" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="email" name="emailAddres" type="text" placeholder="Email Address" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="phone" name="phone" type="text" placeholder="Phone" class="form-control">
                            </div>
                       </div>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-pencil-square-o bigicon"></i></span>
                            <div class="col-md-8">
                                <textarea class="form-control" id="message" name="customerNote" placeholder="Enter your massage for us here. We will get back to you within 2 business days." rows="7"></textarea>
                            </div>
                        </div>
                        
<div class="feedback">

<h2 class="text-feedback headerfeedback">question1</h2>
<label class="container1">Strongly Agree  <input type="radio" name="radio" ><span class="checkmark"></span></label>
<label class="container1"> Agree          <input type="radio" name="radio" ><span class="checkmark"></span></label>
<label class="container1">Somewhat Agree  <input type="radio" name="radio" ><span class="checkmark"></span></label>
<label class="container1">Disagree        <input type="radio" name="radio" ><span class="checkmark"></span></label>

<h2 class="text-feedback headerfeedback">question2</h2>
<label class="container1">Strongly Agree <input type="radio" name="radio1" ><span class="checkmark"></span></label>
<label class="container1"> Agree         <input type="radio" name="radio1" ><span class="checkmark"></span></label>
<label class="container1">Somewhat Agree <input type="radio" name="radio1" ><span class="checkmark"></span></label>
<label class="container1">Disagree       <input type="radio" name="radio1" ><span class="checkmark"></span></label>

<h2 class="text-feedback headerfeedback">question3</h2>
<label class="container1">Strongly Agree <input type="radio" name="radio2" ><span class="checkmark"></span></label>
<label class="container1"> Agree         <input type="radio" name="radio2" ><span class="checkmark"></span></label>
<label class="container1">Somewhat Agree <input type="radio" name="radio2" ><span class="checkmark"></span></label>
<label class="container1">Disagree       <input type="radio" name="radio2" ><span class="checkmark"></span></label>

<h2 class="text-feedback headerfeedback">question4</h2>
<label class="container1">Strongly Agree <input type="radio" name="radio3" ><span class="checkmark"></span></label>
<label class="container1"> Agree         <input type="radio" name="radio3" ><span class="checkmark"></span></label>
<label class="container1">Somewhat Agree <input type="radio" name="radio3" ><span class="checkmark"></span></label>
<label class="container1">Disagree       <input type="radio" name="radio3" ><span class="checkmark"></span></label>

<h2 class="text-feedback headerfeedback">question5</h2>
<label class="container1">Strongly Agree <input type="radio" name="radio3" ><span class="checkmark"></span></label>
<label class="container1"> Agree         <input type="radio" name="radio3" ><span class="checkmark"></span></label>
<label class="container1">Somewhat Agree <input type="radio" name="radio3" ><span class="checkmark"></span></label>
<label class="container1">Disagree       <input type="radio" name="radio3" ><span class="checkmark"></span></label>



</div>
</body>

               <div class="form-group">
                            <div class="col-md-12 text-center">
                                <button type="submit" class="btn btn-primary btn-lg">Submit</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>

<style>
    .header {
        color: #36A0FF;
        font-size: 27px;
        padding: 10px;
    }
    
     .headerfeedback {
        color: #36A0FF;
        font-size: 15px;
        
    }
    

    .bigicon {
        font-size: 35px;
        color: #36A0FF;
    }
    
    /***********Service ****************/
.feedback{
 -webkit-margin-start: 20%;
    position: relative;
        font-size: 1.5em;
}
/* The container */
.container1 {

   /*  display: block; */
    position: relative;
    padding-left: 35px;
   /*  margin-bottom: 12px; */
    cursor: pointer;
    font-size: 12px;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
}

/* Hide the browser's default radio button */
.container1 input {
    position: absolute;
    opacity: 0;
    cursor: pointer;
}

/* Create a custom radio button */
.checkmark {
    position: absolute;
    top: 0;
    left: 0;
    height: 20px;
    width: 20px;
    background-color: #eee;
    border-radius: 50%;
}

/* On mouse-over, add a grey background color */
.container1:hover input ~ .checkmark {
    background-color: #ccc;
}

/* When the radio button is checked, add a blue background */
.container1 input:checked ~ .checkmark {
    background-color: #2196F3;
}

/* Create the indicator (the dot/circle - hidden when not checked) */
.checkmark:after {
    content: "";
    position: absolute;
    display: none;
}

/* Show the indicator (dot/circle) when checked */
.container1 input:checked ~ .checkmark:after {
    display: block;
}

/* Style the indicator (dot/circle) */
.container1 .checkmark:after {
 	top: 9px;
	left: 9px;
	width: 8px;
	height: 8px;
	border-radius: 50%;
	background: white;
}
</style>

<!-- Contact Form - END -->

</div>

</body>
</html>