package com.example;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class NfcServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
 
        PrintWriter pw = resp.getWriter();
        String a = "1"; 
		String b = "2";
	
        
        
        String param_a = req.getParameter("a");
        String param_b = req.getParameter("b");
        
        if (a == param_a && b == param_b)						
				pw.println("It's working!");			
		else		
			pw.println("error");
			
 
    }
}