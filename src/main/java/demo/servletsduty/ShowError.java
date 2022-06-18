package demo.servletsduty;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HTTP 状态码实例:把 407 错误代码发送到客户端浏览器，浏览器会显示 "Need authentication!!!" 消息。
 *
 * http://localhost:8080/simpleframework/showerror
 *
 * @author yzz
 * @create 2022-05-25 17:21
 */
@WebServlet("/showerror")
public class ShowError extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置错误代码和原因
        resp.sendError(407, "Need authentication!!!" );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
