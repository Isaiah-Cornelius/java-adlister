import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name = "AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Ad> ads = new ListAdsDao().all();

        String html = "";

        for (int i = 0; i < ads.size(); i++){
            long id = ads.get(i).getId();
            long userid = ads.get(i).getUserId();
            String title = ads.get(i).getTitle();
            String description = ads.get(i).getDescription();

            html += "<h1>" + title + "</h1> <h3>" + description + "</h3> <p> id = " + id + "</p> <p> userid = " + userid + "</p>";
        }

        req.setAttribute("html", html);
        req.getRequestDispatcher("ads/index.jsp").forward(req, resp);
    }
}
