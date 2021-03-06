package com.examples.empapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examples.empapp.model.Employee;
import com.examples.empapp.service.EmployeeService;


@WebServlet("/EmployeeController")
public class AddEmployeeController extends HttpServlet implements Servlet {
	
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		Employee e = new Employee();
		EmployeeService eSer = new EmployeeService();
		
		
		int id = Integer.parseInt(request.getParameter("empid"));
		String name = request.getParameter("empname");
		String designation = request.getParameter("empdesig");
		String country = request.getParameter("empcountry");
//		
		System.out.println(id);
		System.out.println(name);
		System.out.println(designation);
		System.out.println(country);
		
		e.setId(id);
		e.setName(name);
		e.setDesignation(designation);
		e.setCountry(country);
		
		eSer.addEmployee(e);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("listEmployees.do");
		rd.forward(request, response);
		
		
	
	}

}