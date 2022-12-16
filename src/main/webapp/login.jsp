<%--
  Created by IntelliJ IDEA.
  User: isaiahcornelius
  Date: 12/15/22
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%--    <c:when <%= request.getParameter("username")%> = "admin" && <%= request.getParameter("password")%> = "password">--%>
<%--        response.sendRedirect("http://localhost:8080/profile.jsp");--%>
<%--    </c:when>--%>


<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>

<%! boolean adminUsernameBool;%>
<%! String userUsernameParameter;%>
<% userUsernameParameter = request.getParameter("username");%>
<% if(userUsernameParameter!= null && userUsernameParameter.equals("admin")){
    adminUsernameBool = true;
} else {
    adminUsernameBool = false;
};%>
<%! boolean adminPasswordBool;%>
<%! String userPasswordParameter;%>
<% userPasswordParameter = request.getParameter("password");%>
<% if(userPasswordParameter != null && userPasswordParameter.equals("password")){
    adminPasswordBool = true;
} else {
    adminPasswordBool = false;
}%>

<% if(adminUsernameBool && adminPasswordBool){
    response.sendRedirect("http://localhost:8080/profile.jsp?username=" + userUsernameParameter + "&password=" + userPasswordParameter);
}%>



<form>
    <label for="username">Username:</label>
    <input type="text" name="username" id="username">
    <label for="password">Password</label>
    <input type="password" name="password" id="password">
    <input type="submit">
</form>
<p>Username: <%= request.getParameter("username")%></p>

<p>Password: <%= request.getParameter("password")%></p>

<p>adminUsernameBool : <%= adminUsernameBool%></p>

<p>adminPasswordBool : <%=adminPasswordBool%></p>


</body>
</html>
