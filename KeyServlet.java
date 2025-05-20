package wad;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class KeyServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String firstname = request.getParameter("firstname");
        String dob = request.getParameter("dob");

        String key = firstname.substring(0, 2).toLowerCase() + dob;

        out.println("<h2>Welcome, " + firstname + "</h2>");
        out.println("<p>Your Generated Key: <b>" + key + "</b></p>");
    }
}
