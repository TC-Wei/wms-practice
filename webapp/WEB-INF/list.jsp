<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix ="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>庫存</title>
</head>
<body>
    <h1>庫存清單(Servlet → JSP)</h1>
    <p>總箱數：${total}</p>
    <ul>
        <c:forEach var="code" items="${codes}">
        <li>${code}</li>
        </c:forEach>
    </ul>
</body>
</html>
