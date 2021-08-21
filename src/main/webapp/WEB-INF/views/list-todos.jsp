<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	
	<div class="container">
		<H1>Welcome ${name}</H1>

Your Todos are:
	<table class="table table-striped">
	<caption></caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Category</th>
				<th colspan="2">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
			<tr>
				<td>${todo.name}</td>
				<td>${todo.category}</td>
				<td><a class="btn btn-danger" href="/delete-todo.do?todo=${todo.name}& category=${todo.category}">Delete</a></td>
				<td><a class="btn btn-success" href="/edit-todo.do?id=${todos.indexOf(todo)}&todo=${todo.name}& category=${todo.category}">Edit</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

	<a class="btn btn-success" href="/add-todo.do"> Add New Todo</a>

	</div>
	<%@ include file="../common/footer.jspf" %>