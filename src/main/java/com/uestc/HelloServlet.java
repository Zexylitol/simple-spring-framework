package com.uestc;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yzze
 * @create 2022-04-15 16:40
 */
// http://localhost:8080/simpleframework/hello
@Slf4j
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
//    Logger log =  Logger.getLogger(HelloServlet.class);
    @Override
    public void init() {
        System.out.println("Initial Servlet...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("entrance : servie implement doGet...");
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "My Simple Framework";
        log.debug("name is " + name);
        req.setAttribute("name", name);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("Destroy...");
    }
}




















