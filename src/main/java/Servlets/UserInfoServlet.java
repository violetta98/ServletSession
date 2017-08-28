package Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Violetta on 2017-08-28.
 */
public class UserInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        // get UserInfo object after user login successful
        UserInfo userInfo = (UserInfo) session.getAttribute(Constants.SESSION_USER_KEY);
        // if it's not logined redirect to login page
        if (userInfo == null) {
            resp.sendRedirect(this.getServletContext().getContextPath() + "/login");
            return;
        }
        out.print("<html>");
        out.print("<head><title>Session example</title><head>");
        out.print("<body>");
        out.print("<h3>User info: </h3>");
        out.print("<p>User Name: " + userInfo.getName() + "</p>");
        out.print("<p>User Country: " + userInfo.getCountry() + "</p>");
        out.print("<p>User Post: " + userInfo.getPost() + "</p>");
        out.print("<a href='login'> Come back</a>");
        out.print("</body>");
        out.print("</html>");
    }
}
