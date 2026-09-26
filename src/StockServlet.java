import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/stock")
public class StockServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String[] codes = { "A001", "A002", "A003" };
        int[] qtys = { 20, 0, 5 };

        out.println("<h1>庫存清單</h1>");
        out.println("<ul>");
        for (int i = 0; i < codes.length; i++) {
            out.println("<li>" + codes[i] + "：" + qtys[i] + " 箱</li>");
        }
        out.println("</ul>");

        String search = new String("A002");
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equals(search)) {
                out.println("<p>查詢結果：" + search + " 剩 " + qtys[i] + " 箱</p>");
            }
        }
    }
}
