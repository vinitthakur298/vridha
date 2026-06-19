package vridha;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")

public class logins extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
		 
		 PrintWriter out = resp.getWriter();
		 
String	myemail =	 req.getParameter("email");

String  mypassword = req.getParameter("password");

try {
	
	
	Class.forName("org.postgresql.Driver");
	
	Connection con = DriverManager.getConnection(  "jdbc:postgresql://localhost:5433/userdb",
            "postgres",
            "vinit@123");
	
	PreparedStatement ps = con.prepareStatement("select * from usere where email=? and password=?");
	
	ps.setString(1, myemail);
	ps.setString(2, mypassword);
	
	ResultSet rs = ps.executeQuery();
	
	if(rs.next()) {
		
		
		
		// otp generate
		
		
		int otp= (int)(Math.random()* 900000)+100000;
		
		
		// session create
		
		HttpSession  session = req.getSession();
		
		session.setAttribute("otp", otp);
		session.setAttribute("email", myemail);
		
		// console mai otp aayga 
		
		System.out.println("Generated OTP ="+otp);
		
		// otp page par jao
		
		resp.sendRedirect("otp.jsp");
		
		
	}
		 
	else {
		 out.print("<h2 style='color:red'> Invalid Email or Password </h2>");
	}
	
	 rs.close();
     ps.close();
     con.close();
	
	
}
catch(Exception e) {
	 out.print("Error : " + e.getMessage());
	
	
}
		 
		 
		 
		 
	}	

}


