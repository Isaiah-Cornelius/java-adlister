import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String crustType = request.getParameter("crust_type");
        System.out.println("crustType = " + crustType);

        String sauceType = request.getParameter("sauce_type");
        System.out.println("sauceType = " + sauceType);

        String pizzaSize = request.getParameter("pizza_size");
        System.out.println("pizzaSize = " + pizzaSize);

        String pepperoniTopping = request.getParameter("Pepperoni");
//        System.out.println("pepperoniTopping = " + pepperoniTopping);

        String olivesTopping = request.getParameter("Olives");
//        System.out.println("olivesTopping = " + olivesTopping);

        String cheeseTopping = request.getParameter("Cheese");
//        System.out.println("cheeseTopping = " + cheeseTopping);

        String sausageTopping = request.getParameter("Sausage");
//        System.out.println("sausageTopping = " + sausageTopping);

        String toppings = "";
        Boolean toppingsEmpty = true;

        if (pepperoniTopping != null){
            toppings += "Pepperoni";
            toppingsEmpty = false;
        }

        if (olivesTopping != null){
            if (toppingsEmpty == false) {
                toppings += ", Olives";
            } else {
                toppings += "Olives";
                toppingsEmpty = false;
            }
        }

        if (cheeseTopping != null){
            if (toppingsEmpty == false) {
                toppings += ", Cheese";
            } else {
                toppings += "Cheese";
                toppingsEmpty = false;
            }
        }

        if (sausageTopping != null){
            if (toppingsEmpty == false) {
                toppings += ", Sausage";
            } else {
                toppings += "Sausage";
                toppingsEmpty = false;
            }
        }

        if (toppingsEmpty == true){
            toppings += "None";
        }

        System.out.println("Toppings = " + toppings);
        String deliveryAddress = request.getParameter("delivery_address");
        System.out.println("Delivery Address = " + deliveryAddress);


        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);

    }
}
