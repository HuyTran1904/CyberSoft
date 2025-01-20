package btservlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Chuyển hướng đến trang đăng nhập
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy thông tin đăng nhập từ form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra thông tin đăng nhập
        if ("admin".equals(username) && "123456".equals(password)) {
            response.sendRedirect("welcome.jsp"); // Đăng nhập thành công
        } else {
            // Gửi thông báo lỗi và quay lại trang đăng nhập
            request.setAttribute("errorMessage", "Sai thông tin đăng nhập!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}