package com.revature.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	//implements serializable
	//not needed but it is nice to have for serialzable interface
	private static final long serrialVersionUID=1L;
	
	public HelloServlet() {
		super();
	}
	
	//want to override do post or do get method
	//in httpsevlet do get is protected
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		//object printwrite that comes with servlet dependency (method) that will write to response object (html?)
		PrintWriter out = res.getWriter();
		out.print("<h1> Hello from your doGet method");
	}
	
	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		out.print("<h1> Hello from your doPost method");
	}
}

