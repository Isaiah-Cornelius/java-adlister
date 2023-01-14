<%--
  Created by IntelliJ IDEA.
  User: isaiahcornelius
  Date: 1/13/23
  Time: 8:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <div>${msg}</div>
        <form action="/register" method="post">
            <div class="form-group">
            <label for="username">Enter a username</label>
            <input id="username" name="username" type="text">
            </div>
            <div class="form-group">
            <label for="email">Enter your email</label>
            <input id="email" name="email" type="text">
            </div>
            <div class="form-group">
            <label for="password">Enter a password</label>
            <input id="password" name="password" type="text">
            </div>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
