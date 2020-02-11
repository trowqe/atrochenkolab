package com.bsuir.lab1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletClass extends HttpServlet {
    Utils utils = new Utils();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String numberStringFromRequest = request.getParameter("numbers");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        boolean valid = utils.validateStringWithNumbers(numberStringFromRequest);
        out.println(utils.validateStringWithNumbers(numberStringFromRequest));
        if (!valid) {
            return;
        }
        float arr[] = utils.convertStringWithNumbersLoFloatArrayAndSort(numberStringFromRequest);
        out.println("<table border=\"1\" width=\"10%\" cellpadding=\"5\">");
        for (float f : arr
        ) {
            out.println(printInCell(f));
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }

    private String printInCell(float f) {
        return "<tr><th>" + f + "</th></tr>";
    }
}
