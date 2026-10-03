# 倉儲管理練習(Java | JSP | Servlet)

模仿倉儲管理系統（WMS）後台的庫存查詢與出貨單頁面

## 頁面

- /list：查看庫存剩餘數量，總數量可以輸入A001來查詢，輸入A999非庫存資料則顯示為無
- /api/stock：傳入?code=料號，回傳JSON，查無時 qty 是 -1
- /ajax.html：輸入料號 → 用 jQuery ajax 呼叫/api/stock → 不重新整理頁面就顯示結果
- /ship：用表格顯示，可以全選或勾選刪除品項，總數量也會跟著更新

## 技術

- 後端使用 Java
- 頁面使用 JSP + JSTL（c:forEach、c:if）
- 前端互動使用 jQuery（DOM 操作、$.ajax）

## 學到的事

- 字串比較用 .equals()而非 ==
- 箭頭函式this不能使用會抓錯地方，箭頭函式沒有自己的 this

## 執行方式

- 需自行放入 JSTL jar，並在 Tomcat 設定 wms.xml 指向 webapp
- cd到專案資料夾打上 /opt/homebrew/opt/tomcat/bin/catalina run 啟用Tomcat 在網址輸入 http://localhost:8080/wms/list「把 list 換成上方清單裡的路徑」

- Tomcat版本：11.0.26
