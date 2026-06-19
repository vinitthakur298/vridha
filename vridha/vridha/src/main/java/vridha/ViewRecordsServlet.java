 package vridha;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/viewrecords")
public class ViewRecordsServlet extends HttpServlet {


@Override
protected void doGet(HttpServletRequest req,
        HttpServletResponse resp)
        throws IOException {


    resp.setContentType("text/html");

    PrintWriter out = resp.getWriter();


    try {


        Class.forName("org.postgresql.Driver");


        Connection con = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5433/userdb",
        "postgres",
        "vinit@123"
        );


        PreparedStatement ps =
        con.prepareStatement(
        "select * from pension"
        );


        ResultSet rs = ps.executeQuery();



        out.println("<html>");
        out.println("<head>");

        out.println("<style>");

        out.println(
        "body{font-family:Arial;background:#f4f6f9;}"
        );

        out.println(
        "h1{text-align:center;color:#2c3e50;}"
        );


        out.println(
        "table{width:90%;margin:40px auto;"
        +"border-collapse:collapse;background:white;"
        +"box-shadow:0 0 10px gray;}"
        );


        out.println(
        "th{background:#007bff;color:white;padding:12px;}"
        );


        out.println(
        "td{padding:10px;text-align:center;"
        +"border:1px solid #ddd;}"
        );


        out.println(
        ".btn{padding:7px 12px;"
        +"color:white;text-decoration:none;"
        +"border-radius:5px;}"
        );


        out.println(
        ".approve{background:green;}"
        );

        out.println(
        ".reject{background:red;}"
        );

        out.println(
        ".dead{background:black;}"
        );


        out.println("</style>");

        out.println("</head>");

        out.println("<body>");



        out.println(
        "<h1>All Pension Records</h1>"
        );



        out.println("<table>");

        out.println(
        "<tr>"
        +"<th>ID</th>"
        +"<th>Name</th>"
        +"<th>Age</th>"
        +"<th>Aadhaar</th>"
        +"<th>Status</th>"
        +"<th>Action</th>"
        +"</tr>"
        );



        while(rs.next()) {



            out.println("<tr>");



            out.println(
            "<td>"+rs.getInt("id")+"</td>"
            );


            out.println(
            "<td>"+rs.getString("name")+"</td>"
            );


            out.println(
            "<td>"+rs.getInt("age")+"</td>"
            );


            out.println(
            "<td>"+rs.getString("aadhaar")+"</td>"
            );


            // yaha database ka status aayega
            out.println(
            "<td>"+rs.getString("status")+"</td>"
            );



            out.println(
            "<td>"

            +"<a class='btn approve' href='approve?id="
            +rs.getInt("id")+"'>Approve</a> "

            +"<a class='btn reject' href='reject?id="
            +rs.getInt("id")+"'>Reject</a> "

            +"<a class='btn dead' href='dead?id="
            +rs.getInt("id")+"'>Deceased</a>"

            +"</td>"
            );



            out.println("</tr>");

        }



        out.println("</table>");

        out.println("</body>");

        out.println("</html>");



        rs.close();
        ps.close();
        con.close();



    }
    catch(Exception e){

        out.println(
        "Error : "+e.getMessage()
        );

    }


}


}