package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("learn Web Application Development", "Study"));
		todos.add(new Todo("learn Spring MVC", "Study"));
		todos.add(new Todo("learn Spring Rest Services", "Study"));
	}

	public List<Todo> retreiveTodos() {
		return todos;
	}

	public void addTodo(Todo newTodo) {
		todos.add(newTodo);
	}

	public void deleteTodo(Todo newTodo) {
		todos.remove(newTodo);
	}
}
