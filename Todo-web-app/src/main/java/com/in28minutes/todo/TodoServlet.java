package com.in28minutes.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {

	private TodoService todoService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("todos", todoService.retreiveTodos());

		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);

	}

}