<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<title>Home</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body, h1, h2, h3, h4, h5, h6 {
	font-family: "Lato", sans-serif
}

.w3-bar, h1, button {
	font-family: "Montserrat", sans-serif
}

.fa-anchor, .fa-coffee {
	font-size: 200px
}

/* Set a style for all buttons */
button {
	background-color: #e61d07;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

button:hover {
	opacity: 1;
}

/* Clear floats */
.clearfix::after {
	content: "";
	clear: both;
	display: table;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
	float: left;
	width: 50%;
}
</style>
<body>

	<!-- Navbar -->
	<div class="w3-top">
		<div class="w3-bar w3-red w3-card w3-left-align w3-large">
			<a
				class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-red"
				href="javascript:void(0);" onclick="myFunction()"
				title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a> <a
				href="#" class="w3-bar-item w3-button w3-padding-large w3-white">Home</a>
			<a href="#news" onclick="w3_close()"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">News</a>

			<a href="userprofile"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Profile</a>
			<a href="managepasswords"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Manage
				Passwords</a> <a href="logout"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Logout</a>
			<a href="#aboutus" onclick="w3_close()"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">About
				Us</a>
		</div>

		<!-- Navbar on small screens -->
		<div id="navDemo"
			class="w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium w3-large">
			<a href="#news" class="w3-bar-item w3-button w3-padding-large">News</a>
			<a href="management" class="w3-bar-item w3-button w3-padding-large">Manage
				passwords</a> <a href="home"
				class="w3-bar-item w3-button w3-padding-large">Logout</a> <a
				href="#aboutus" onclick="w3_close()"
				class="w3-bar-item w3-button w3-padding-large">About Us</a>
		</div>
	</div>
	<!-- Generate password for logged in users -->
	<div class="w3-row-padding w3-light-grey w3-padding-64 w3-container">
		<div class="w3-content">
			<div class="w3-third w3-center">
				<i class="fa fa-key w3-padding-64 w3-text-red w3-margin-right"></i>
			</div>

			<div class="w3-twothird">
				<h1>Generate password</h1>
				<form action="loggedPassgen">
					<div class="w3-section">
						<label>Length of password</label> <input
							class="w3-input w3-border" type="number" name="length" required>
					</div>
					<div class="w3-section">
						<label>Number of password</label> <input
							class="w3-input w3-border" type="number" name="num_of_passwords"
							value=1 readonly>
					</div>
					<div class="clearfix">
						<button type="submit"
							class="w3-button w3-block w3-padding-large w3-red w3-margin-bottom">Generate
							password</button>
					</div>
				</form>

				<form action="management">
					<div class="w3-section">
						<label>Website URL</label> <input class="w3-input w3-border"
							type="text" name="web_url" required>
					</div>
					<div class="w3-section">
						<label>Web Username </label> <input class="w3-input w3-border"
							type="text" name="web_username" required>
					</div>
					<div class="w3-section">
						<label>Generated password</label> <input
							class="w3-input w3-border" type="text" name="gen_password"
							value=${obj.randomPasswords[0] }>
					</div>
					<div class="clearfix">
						<button type="submit"
							class="w3-button w3-block w3-padding-large w3-red w3-margin-bottom">Save
							password</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- First Grid -->
	<div class="w3-row-padding w3-padding-64 w3-container" id="aboutus">
		<div class="w3-content">
			<div class="w3-twothird">
				<h1>About Us</h1>
				<h5 class="w3-padding-32">Lorem ipsum dolor sit amet,
					consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
					labore et dolore magna aliqua. Ut enim ad minim veniam, quis
					nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
					consequat.</h5>

				<p class="w3-text-grey">Lorem ipsum dolor sit amet, consectetur
					adipiscing elit, sed do eiusmod tempor incididunt ut labore et
					dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
					exercitation ullamco laboris nisi ut aliquip ex ea commodo
					consequat. Excepteur sint occaecat cupidatat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum consectetur
					adipiscing elit, sed do eiusmod tempor incididunt ut labore et
					dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
					exercitation ullamco laboris nisi ut aliquip ex ea commodo
					consequat.</p>
			</div>

			<div class="w3-third w3-center">
				<i class="fa fa-anchor w3-padding-64 w3-text-red"></i>
			</div>
		</div>
	</div>

	<!-- Second Grid -->
	<div class="w3-row-padding w3-light-grey w3-padding-64 w3-container">
		<div class="w3-content">
			<div class="w3-third w3-center">
				<i class="fa fa-coffee w3-padding-64 w3-text-red w3-margin-right"></i>
			</div>

			<div class="w3-twothird" id="news">
				<h1>Latest updates and news</h1>
				<h5 class="w3-padding-32">Lorem ipsum dolor sit amet,
					consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
					labore et dolore magna aliqua. Ut enim ad minim veniam, quis
					nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
					consequat.</h5>

				<p class="w3-text-grey">Lorem ipsum dolor sit amet, consectetur
					adipiscing elit, sed do eiusmod tempor incididunt ut labore et
					dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
					exercitation ullamco laboris nisi ut aliquip ex ea commodo
					consequat. Excepteur sint occaecat cupidatat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum consectetur
					adipiscing elit, sed do eiusmod tempor incididunt ut labore et
					dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
					exercitation ullamco laboris nisi ut aliquip ex ea commodo
					consequat.</p>
			</div>
		</div>
	</div>

	<div class="w3-container w3-black w3-center w3-opacity w3-padding-64">
		<h1 class="w3-margin w3-xlarge">Quote of the day: Smile more, to
			live longer...</h1>
	</div>

	<!-- Footer -->
	<footer class="w3-container w3-padding-64 w3-center w3-opacity">
		<div class="w3-xlarge w3-padding-32">
			<i class="fa fa-facebook-official w3-hover-opacity"></i> <i
				class="fa fa-instagram w3-hover-opacity"></i> <i
				class="fa fa-snapchat w3-hover-opacity"></i> <i
				class="fa fa-pinterest-p w3-hover-opacity"></i> <i
				class="fa fa-twitter w3-hover-opacity"></i> <i
				class="fa fa-linkedin w3-hover-opacity"></i>
		</div>
		<p>
			Powered by <a href="https://www.w3schools.com/w3css/default.asp"
				target="_blank">w3.css</a>
		</p>
	</footer>

	<script>
		// Used to toggle the menu on small screens when clicking on the menu button
		function myFunction() {
			var x = document.getElementById("navDemo");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}

		function w3_close() {
			document.getElementById("navDemo").style.display = "none";
			document.getElementById("myOverlay").style.display = "none";
		}
	</script>

</body>
</html>