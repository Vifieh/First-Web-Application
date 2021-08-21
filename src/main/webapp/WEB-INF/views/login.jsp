<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>


<div class="container">
	
	<form action="/login.do" method="POST">
		<h1>Login</h1>
		<div class="alert alert-danger">
			<strong >${errorMessage}</strong>
		</div>
		
		<div class="form-group">
			<label for="name">Name</label>
		 	<input class="form-control" name="name" type="text" />
		 </div>
		 <div class="form-group">
		 	<label for="pwd">Password</label>
		 	<input class="form-control" name="password" type="password" />
		 	</div> <br>
		  <input class="btn btn-success" type="submit" value="Login" />
	</form>

	</div>

	<%@ include file="../common/footer.jspf" %>