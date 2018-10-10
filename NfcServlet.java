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
        String a = "admin"; 
		String b = "qwe";
	boolean retVal1,retVal2;
        
        
        String param_a = req.getParameter("a");
        String param_b = req.getParameter("b");
        retVal1 = a.equals(param_a);
		retVal2 = b.equals(param_b);
        if (retVal1 == true && retVal2==true)						
				pw.println("It's working!");			
		else		
			pw.println("error");
			
 
    }
}