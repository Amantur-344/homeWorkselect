<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Application form</title>
</head>
<body>
<form action="/itacademy/create-application" method="post">
    Full name: <input type="text" name="full_name" /> <br>
    <label for="course">Course:</label>
    <select id="course" name="course">
        <option value="Java">Java</option>
        <option value="C#">C#</option>
        <option value="Python">Python</option>
        <option value="Frontend">Frontend</option>
    </select>
    Online:<label for="is_online"></label>
    <select id="is_online" name="is_online">
        <option value="true">Yes</option>
        <option value="false">No</option>
    </select>
    <br>
    Email: <input type="text" name="email" /> <br>
    <input type="submit" value="submit" />

</form>
<a href="index.jsp">Главная страница</a>
</body>
</html>
