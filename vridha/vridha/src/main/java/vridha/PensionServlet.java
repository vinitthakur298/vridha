 package vridha;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/pension")
public class PensionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("/pension.jsp")
           .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String gender = req.getParameter("gender");
        String aadhaar = req.getParameter("aadhaar");
        String mobile = req.getParameter("mobile");
        double income = Double.parseDouble(req.getParameter("income"));
        String address = req.getParameter("address");
        String bankAccount = req.getParameter("bankAccount");
        String nationality = req.getParameter("nationality");
        String pensionStatus = req.getParameter("pensionStatus");

        try {

            if(age >= 60 &&
               income <= 100000 &&
               aadhaar.length() == 12 &&
               mobile.length() == 10 &&
               nationality.equalsIgnoreCase("Indian") &&
               pensionStatus.equals("No")) {

                Class.forName("org.postgresql.Driver");

                Connection con = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5433/userdb",
                        "postgres",
                        "vinit@123");

                PreparedStatement ps = con.prepareStatement(
                    "insert into pension(name,age,gender,aadhaar,mobile,income,address,bank_account,nationality,pension_status) values(?,?,?,?,?,?,?,?,?,?)");

                ps.setString(1, name);
                ps.setInt(2, age);
                ps.setString(3, gender);
                ps.setString(4, aadhaar);
                ps.setString(5, mobile);
                ps.setDouble(6, income);
                ps.setString(7, address);
                ps.setString(8, bankAccount);
                ps.setString(9, nationality);
                ps.setString(10, pensionStatus);

                int count = ps.executeUpdate();

                if(count > 0) {

                    resp.getWriter().println(
                        "<h2 style='color:green'>Application Submitted Successfully</h2>");

                } else {

                    resp.getWriter().println(
                        "<h2 style='color:red'>Data Not Saved</h2>");
                }

                ps.close();
                con.close();

            } else {

                resp.getWriter().println(
                    "<h2 style='color:red'>Not Eligible For Pension</h2>");
            }

        } catch(Exception e) {

            resp.getWriter().println(
                "<h2 style='color:red'>Error : "
                + e.getMessage() + "</h2>");
        }
    }
}