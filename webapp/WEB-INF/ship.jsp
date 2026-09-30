<%@ page contentType="text/html;charset=UTF-8"%> <%@ taglib prefix = "c"
uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>出貨單</title>
  </head>
  <body>
      <p>出貨單號：${orderNo}</p>
      <p>客戶：${customer}</p>
    <table border="1">
      <tr>
        <th><input type="checkbox" class="itemAll"/></th>
        <th>料號</th>
        <th>品名</th>
        <th>數量</th>
      </tr>
      <c:forEach varStatus="s" var="code" items="${codes}">
        <tr>
          <td><input type="checkbox" class="item" /></td>
          <td>${code}</td>
          <td>${names[s.index]}</td>
          <td>${qty[s.index]}</td>
        </tr>
      </c:forEach>
    </table>
    <p>總數量：${total}</p>
  </body>
</html>
