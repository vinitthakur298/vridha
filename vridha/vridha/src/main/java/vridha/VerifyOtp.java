package vridha;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/verifyotp")
public class VerifyOtp extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int userotp = Integer.parseInt(req.getParameter("otp"));
		 
		 HttpSession session = req.getSession();
		 
		  
		 
		 int sessionOtp =
	                (Integer) session.getAttribute("otp");
		 
		 if(userotp == sessionOtp) {
			 
			 
			 resp.sendRedirect("dashboard.jsp");
		 }
		 else {
			 resp.setContentType("text/html");
			 resp.getWriter().println(
	                    "<h2 style='color:red'>Wrong OTP</h2>");
			 
			 
		 }

		 
		 
		 
		 
	}

}
