package com.in28minutes.loginfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "*.do")
public class LoginRequiredFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;

		System.out.println(httpRequest.getRequestURI());

		if (httpRequest.getSession().getAttribute("name") != null) {
			chain.doFilter(request, response);
		} else {
			httpRequest.getRequestDispatcher("/login.do").forward(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}