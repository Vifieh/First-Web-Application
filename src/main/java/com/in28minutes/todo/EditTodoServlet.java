package com.in28minutes.todo;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/edit-todo.do")  
public class EditTodoServlet extends HttpServlet {
	
	private TodoService todoService = new TodoService();
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			  throws ServletException, IOException {
		 
		 int id = Integer.parseInt(request.getParameter("id"));
		 request.setAttribute("id", id);
		 Todo todo = todoService.getTodosId(id);
		 request.setAttribute("todo", todo);
		 request.getRequestDispatcher("/WEB-INF/views/edit-todo.jsp").forward(request, response); 
	  }
	
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			  throws ServletException, IOException {
		    
		int id = Integer.parseInt(request.getParameter("id"));
	  	Todo todo = todoService.getTodosId(id);
	  	String prevTodo = request.getParameter("name");
		String category = request.getParameter("category");
	  	todo.setName(prevTodo);
	  	todo.setCategory(category);
	
		  response.sendRedirect("/list-todos.do"); 
	  }
	  
}
