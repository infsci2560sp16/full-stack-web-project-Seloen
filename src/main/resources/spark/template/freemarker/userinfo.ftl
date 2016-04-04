<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Movie Reviewer</title>
		<link rel="stylesheet" type="text/css" media="screen" href="stylesheets/screen.css">
		<link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,700italic,300,700' rel='stylesheet' type='text/css'>
	

	    <style>
		body {
			font-family: 'Open Sans', sans-serif;
			font-size: 16px;
			font-weight: 300;
			margin: 0;
			color: #555;
			padding: 0;

	     }
		</style>
		<script type="text/javascript" src="js/test.js"></script> 
	</head>
	<body>


		<div id="page">

			<header>
				<a class="logo" title="Movie Reviewer" href="#">Movie Reviewer</a>
				
				<a class="btn" title="Login" href="login.html">Login</a>
			    <a class="btn" title="Sign up" href="register.html">Sign up</a>
				<div class="hero">
					<h2>Movie criticism is an art just like movie itself.</h2>
				</div>
			</header>


			<nav>
				<ul>
					<li>
					    <a  title="Movie Library" href="#">Movie Library</a>
					    <ul>
					    	<li>
					    		<a title="New Released" href="#">New Released</a>
					    	</li>
					    	<li>
					    		<a title="Categories" href="cate.html">Categeries</a>
					    		  <ul>
					    			 <li>
					    			    	<a title="Sub Sub Link 1" href="#">Sub Sub Link 1</a>
					    			 </li>
					    		    	<li>
					    				    <a title="Sub Sub Link 2" href="#">Sub Sub Link 2</a>
					    			 </li>
					  			  </ul>
					    	</li>
					    </ul>
					</li>
					<li>
					    <a title="Pop things" href="#">Pop things</a>
					    <ul>
					    	<li>
					    		<a title="Sub Link 1" href="#">Sub Link 1</a>
					    	</li>
					    	<li>
					    		<a title="Sub Link 2" href="#">Sub Link 2</a>
					    	</li>
					    	<li>
					    		<a title="Sub Link 3" href="#">Sub Link 3</a>
					    		  
					    	</li>
					    </ul>
					</li>
					<li>
					    <a title="My Account" href="#">My Account</a>
					    <ul>
					    	<li>
					    		<a title="Sub Link 1" href="#">Sub Link 1</a>
					    	</li>
					    	<li>
					    		<a title="Sub Link 2" href="#">Sub Link 2</a>
					    	</li>
					    </ul>
					</li>
					<li>
					    <a title="Contact Us" href="#">Contact Us</a>
					    <ul>
					    	<li>
					    		<a title="Sub Link 1" href="#">Sub Link 1</a>
					    	</li>
					    	<li>
					    		<a title="Sub Link 2" href="#">Sub Link 2</a>
					    	</li>
					    </ul>
					</li>
				</ul>
			</nav>

		


			<section class="club">
				Hello, ${username}
				 <#if country??>
    <div id ="userinfo">You haven't marked any location yet!</div>
    <#else >

    <ul>
      <#list countries as country>
      <li> ${country}</li>
    </ul>
      </#list>
    </div>
    </#if>
				
			</section>




		</div>

<div>
<p>Please input a number between 1 and 10:</p>

<input id="numb">

<button type="button" onclick="myFunction()">Submit</button>

<p id="demo"></p>
</div>








	</body>
</html>