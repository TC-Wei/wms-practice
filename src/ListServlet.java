import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] codes = { "A001", "A002", "A003" };
        int[] qty = { 20, 0, 5 };
        int total = 0;
        for (int i = 0; i < qty.length; i++) {
            total += qty[i];
        }
        String searchCode = request.getParameter("code");
        request.setAttribute("keyword", searchCode);
        request.setAttribute("total", total);
        request.setAttribute("codes", codes);
        request.setAttribute("qtys", qty);

        request.getRequestDispatcher("/WEB-INF/list.jsp").forward(request, response);
    }
}
