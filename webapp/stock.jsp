<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>庫存</title>
    </head>
    <body>
        <h1>庫存清單( JSP 版)</h1>
        <p>總箱數 ： ${20 + 0 + 5}</p>
        <ul>
            <c:forEach var = "i" begin = "1" end = "3">
                <li>第 ${i} 個儲位<c:if test="${i eq 2}">(空)</c:if></li>
            </c:forEach>
        </ul>
    </body>
</html>