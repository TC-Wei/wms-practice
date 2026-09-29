<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix ="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>庫存</title>
</head>
<body>
    <h1>庫存清單(Servlet → JSP)</h1>
    <p>查詢：${empty keyword ? "無":keyword}</p>
    <form>
        <input name="code">
        <button>查詢</button>
    </form>
    
    <p>總箱數：${total}</p>
    <ul>
        <c:forEach varStatus="s" var="code" items="${codes}">
            <c:if test = "${empty keyword or code== keyword}" >
                <li>${code} : ${qtys[s.index]} 箱</li>
                <c:set var = "found" value = "true"/>
            </c:if>
        </c:forEach>    
    </ul>
            <c:if test = "${not empty keyword && !found}">
                    <p>${keyword} : 查無此儲位</p>
            </c:if>
</body>
</html>
