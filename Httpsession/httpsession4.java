package httpsession;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class httpsession4 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession s=request.getSession(false);
            String str=(String) s.getAttribute("S-ID");
            s.invalidate();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");        
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Logout Successfull</h1>");
            out.println("</body>");
            out.println("</html>");
            RequestDispatcher r=request.getRequestDispatcher("index.html");
            r.include(request, response);
            
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


}
