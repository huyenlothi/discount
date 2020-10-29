import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet", urlPatterns = "/DiscountCalculator")
public class CalculateDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("ProductDescription");
        double price = Double.parseDouble(request.getParameter("listprice"));
        double discount = Double.parseDouble(request.getParameter("discountPrice"));
        double discountAmount = price*discount*0.01;
        double result = price - discountAmount;

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("Product Description: " + product + "<br/>");
        printWriter.println("List Price: " + price + "<br/>");
        printWriter.println("Discount Price (%): " + discount+ "<br/>");
        printWriter.println("Discount Amount: " + discountAmount+ "<br/>");
        printWriter.println("Discount Price: " + result+ "<br/>");
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
