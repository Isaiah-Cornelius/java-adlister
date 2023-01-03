<%--
  Created by IntelliJ IDEA.
  User: isaiahcornelius
  Date: 1/2/23
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Pick Color" />
  </jsp:include>
</head>
<body>
  <jsp:include page="partials/navbar.jsp" />
  <form action="/pick-color" method="post">
    <label for="pickColor">Pick the color</label>
    <input type="text" id="pickColor" name="pickColor">
    <input type="submit" value="Submit">
  </form>

</body>
</html>
