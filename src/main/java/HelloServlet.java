import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            String userName = request.getParameter("name");
            if (!userName.equals(null)) {
                out.println("<h1>Hello, " + userName + "</h1>");
            }
        } catch (NullPointerException npe){
            out.println("<h1>Hello, World!</h1>");
        }
    }
}