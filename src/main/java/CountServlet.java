import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CountServlet", urlPatterns = "/count")

public class CountServlet extends HttpServlet {

    protected int counter = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        counter++;
        try {
            String counterReset = request.getParameter("counter");
            if(counterReset.equals("reset")){
                counter = 1;
            }
        } catch (NullPointerException npe){

        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Count page views : " + counter + "</h1>");
    }

}