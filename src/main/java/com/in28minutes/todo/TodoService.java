package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo(1, "Learn Web Application", "Study"));
		todos.add(new Todo(2, "Learn Spring MVC", "Study"));
		todos.add(new Todo(3, "Learn Spring Rest Services","Study"));
		todos.add(new Todo(4, "Learn to Write Quality Code", "Study"));
		todos.add(new Todo(5, "Learn to Refactoring", "Study"));
	}
	
	public List<Todo> retrieveTodos() {
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}

	public Todo getTodosId(int id) {
		return todos.get(id);
	}
	
	

}
