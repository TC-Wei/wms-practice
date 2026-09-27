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
        <c:forEach varStatus="s" var="code" items="${codes}">
        <li>${code} : ${qtys[s.index]} 箱</li>
        </c:forEach>
    </ul>
</body>
</html>
