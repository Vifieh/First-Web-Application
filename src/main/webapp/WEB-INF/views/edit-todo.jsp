<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	
	<div class="container">
	
		<H1>Your New Action Item:</H1>
		
	<form action="/edit-todo.do?id=${id}" method="post">
		
		<fieldset class="form-group">
			<label>Description</label>
		 	<input class="form-control" type="text" name="name"  value="${todo.name}"/>  
		</fieldset>
		<fieldset class="form-group">
			<label>Category</label>
		 	<input class="form-control" type="text" name="category" value="${todo.category}"/> <br>
		</fieldset>
		<input class="btn btn-success" name="add" type="submit" value="Update"/> 
	</form>

	</div>
	
	<%@ include file="../common/footer.jspf" %>
	
