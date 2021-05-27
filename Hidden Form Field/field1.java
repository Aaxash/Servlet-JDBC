package Hiddenfield;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class field1 extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
         
            String s=request.getParameter("username");
            PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet usecookie</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello"+request.getParameter("username")+"</h1>");
            out.println("<form action='field2' method='post'>"
                    + "<input type='hidden'  name='uname' value="+s+">"
                    + "<input type='submit' value='OK'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

    
}
