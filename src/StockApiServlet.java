
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/api/stock")
public class StockApiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String searchCode = request.getParameter("code");
        String[] codes = { "A001", "A002", "A003" };
        int[] qty = { 20, 0, 5 };
        int found = -1;
        for (int i = 0; i < qty.length; i++) {
            if (codes[i].equals(searchCode)) {
                found = qty[i];
            }
        }
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().print("{\"code\":\"" + searchCode + "\",\"qty\":" + found + "}");
    }
}
