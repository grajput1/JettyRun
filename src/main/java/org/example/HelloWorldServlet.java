package org.example;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@Slf4j
public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html"); // Set content type of the response
        PrintWriter out = response.getWriter(); // Get a PrintWriter to write the response
        out.println("<html><body>");
        out.println("<h1>Hello World from Java Servlet!</h1>");
        out.println("</body></html>");
        log.info("Hello");
    }
}