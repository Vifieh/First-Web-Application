<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	
	<div class="container">
	
		<H1>Your New Action Item:</H1>
		
	<form action="/add-todo.do" method="post">
		
		<fieldset class="form-group">
			<label>Description</label>
		 	<input class="form-control" type="text" name="todo"/>  
		</fieldset>
		<fieldset class="form-group">
			<label>Category</label>
		 	<input class="form-control" type="text" name="category"/> <br><br>
		</fieldset>
		<input class="btn btn-success" name="add" type="submit" value="Submit"/> 
	</form>

	</div>
	
	<%@ include file="../common/footer.jspf" %>
	
