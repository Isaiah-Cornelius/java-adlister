<%--
  Created by IntelliJ IDEA.
  User: isaiahcornelius
  Date: 1/2/23
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="View Color" />
    </jsp:include>
    <style>
        body {background-color: ${userColor}}
    </style>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<a href="pick-color.jsp">Pick another color</a>

</body>
</html>
