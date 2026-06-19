 package vridha;

import java.io.IOException;
import java.sql.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/reject")
public class RejectServlet extends HttpServlet {


protected void doGet(HttpServletRequest req,
HttpServletResponse resp)
throws IOException {


int id =
Integer.parseInt(req.getParameter("id"));


try {


Class.forName("org.postgresql.Driver");


Connection con =
DriverManager.getConnection(
"jdbc:postgresql://localhost:5433/userdb",
"postgres",
"vinit@123");


PreparedStatement ps =
con.prepareStatement(
"update pension set status='Rejected' where id=?");


ps.setInt(1,id);


ps.executeUpdate();


resp.sendRedirect("viewrecords");


}
catch(Exception e){

resp.getWriter().println(e.getMessage());

}


}

}