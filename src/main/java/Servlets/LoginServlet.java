package Servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Violetta on 2017-08-28.
 */
public class LoginServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        UserInfo userInfo = new UserInfo("Tom", "USA", 24);
        // storing user information in Session (we can retrieve user information in Session)
        session.setAttribute(Constants.SESSION_USER_KEY, userInfo);
        out.print("<html>");
        out.print("<head><title>Session example</title><head>");
        out.print("<body>");
        out.print("<h3>You are logined! Info was stored in session. </h3>");
        out.print("<a href='userInfo'>View User Info</a>");
        out.print("</body>");
        out.print("</html>");
    }

}
