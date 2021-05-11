package cookies;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie3 extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          Cookie[] c=request.getCookies();
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cookie3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cookie3 at " + request.getContextPath() + "</h1>");
            for(int i=0;i<c.length;i++){
            out.println("<h1>Cookie Name and value :"+c[i].getName()+" "+c[i].getValue()+"</h1>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }


}
