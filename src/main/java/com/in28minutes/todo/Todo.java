package com.in28minutes.todo;

public class Todo {
	
	private String name;
	private String category;
	private int todoID;
	
	//constructor
	public Todo() {
		
	}
	public Todo(String name, String category) {
		this.name = name;
		this.category = category;
		}
	
	public Todo(int todoID,String name, String category) {
		this.name = name;
		this.category = category;
		this.todoID = todoID;
	}
	
	public int getTodoID() {
		return todoID;
	}

	public void setTodoID(int todoID) {
		this.todoID = todoID;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Todo [name=" + name + ", category=" + category + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
