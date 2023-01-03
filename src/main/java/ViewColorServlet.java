import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "ViewColorServlet", urlPatterns = "/ViewColorServlet")
public class ViewColorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String colors = "red, orange, yellow, green, blue, indigo, violet";
        String userColor = (String) request.getAttribute("userColor");

        if (colors.indexOf(userColor.toLowerCase()) != -1){
            request.setAttribute("userColor", userColor.toLowerCase());
            request.getRequestDispatcher("/view-color.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/pick-color.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/view-color").forward(request, response);
    }
}

