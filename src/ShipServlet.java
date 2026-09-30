import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ship")
public class ShipServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String orderNo = "SO-0930-001";
        String customer = "台南物流";
        String[] codes = { "A001", "A002", "A003" };
        String[] names = { "紙箱", "膠帶", "棧板" };
        int[] qty = { 20, 0, 5 };
        int total = 0;
        for (int i = 0; i < qty.length; i++) {
            total += qty[i];
        }
        request.setAttribute("customer", customer);
        request.setAttribute("orderNo", orderNo);
        request.setAttribute("total", total);
        request.setAttribute("codes", codes);
        request.setAttribute("names", names);
        request.setAttribute("qty", qty);

        request.getRequestDispatcher("/WEB-INF/ship.jsp").forward(request, response);
    }

}
