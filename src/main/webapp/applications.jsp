<%@ page import="java.util.List" %>
<%@ page import="model.Application" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Applications</title>
</head>
<body>
    <h1>Applications: </h1>
    <% List<Application> applicationList = (List<Application>)request.getAttribute("application-list"); %>

    <% for(Application appl : applicationList) { %>
    <p> =================== </p>
    <p> <%=appl.getId()%></p>
    <p> <%=appl.getFullName()%></p>
    <p> <%=appl.getCourse()%></p>
    <p> <%=appl.getIsOnline()%></p>
    <p> <%=appl.getEmail()%></p>
    <% } %>
    <a href="index.jsp">Главная страница</a>
</body>
</html>
