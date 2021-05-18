package httpsession;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class httpsession1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            if(request.getParameter("id").equals("java") && request.getParameter("pwd").equals("java")){
              HttpSession hs=request.getSession();
              hs.setAttribute("S-ID","java");
               /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet httpsession1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Session Created</h1>");
            out.println("<h1><a href='httpsession2'>Homepage</a></h1>");
            out.println("</body>");
            out.println("</html>");
            }
            else{
                
             out.println("<h1>Wrong ID or Password</h1>");
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
