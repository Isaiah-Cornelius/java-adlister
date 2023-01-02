<%--
  Created by IntelliJ IDEA.
  User: isaiahcornelius
  Date: 12/16/22
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Pizza Order" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />
    <div class="container">
        <h1>Pizza Order</h1>
        <form action="/pizza-order" method="POST">
            <div class="form-group">
                <label for="crust_type">Crust Type</label>
                <select id="crust_type" name="crust_type" class="form-control">
                    <option value="Thin_Crust">Thin Crust</option>
                    <option value="Regular_Crust">Regular Crust</option>
                    <option value="Deep_Dish">Deep Dish</option>
                </select>
            </div>
            <div class="form-group">
                <label for="sauce_type">Sauce Type</label>
                <select id="sauce_type" name="sauce_type" class="form-control">
                    <option value="Marinara_Sauce">Marinara</option>
                    <option value="Buffalo_Sauce">Buffalo</option>
                    <option value="Pesto_Sauce">Pesto</option>
                </select>
            </div>
            <div class="form-group">
                <label for="pizza_size">Pizza Size</label>
                <select id="pizza_size" name="pizza_size" class="form-control">
                    <option value="Small_10_inch">Small (10 inch)</option>
                    <option value="Medium_12_inch">Medium (12 inch)</option>
                    <option value="Large_14_inch">Large (14 inch)</option>
                </select>
            </div>
            <div class="form-group">
                <fieldset>
                    <legend>Pizza Toppings</legend>
                    <div>
                        <input type="checkbox" id="Pepperoni" name="Pepperoni">
                        <label for="Pepperoni">Pepperoni</label>
                    </div>
                    <div>
                        <input type="checkbox" id="Olives" name="Olives">
                        <label for="Olives">Olives</label>
                    </div>
                    <div>
                        <input type="checkbox" id="Cheese" name="Cheese">
                        <label for="Cheese">Cheese</label>
                    </div>
                    <div>
                        <input type="checkbox" id="Sausage" name="Sausage">
                        <label for="Sausage">Sausage</label>
                    </div>
                </fieldset>
            </div>
            <div class="form-group">
                <label for="delivery_address">Delivery Address</label>
                <input type="text" id="delivery_address" name="delivery_address">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Submit Order">
        </form>
    </div>


</body>
</html>
