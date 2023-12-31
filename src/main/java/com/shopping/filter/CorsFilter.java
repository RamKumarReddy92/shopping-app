package com.shopping.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class CorsFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN,"*");
		response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS,"*");
		response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS,"*");
		
		filterChain.doFilter(request,response);
	}

}
