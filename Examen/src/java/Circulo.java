
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Circulo extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            double num1;
            double resultado;
            String Boton;
            
            Boton=request.getParameter("Boton");
            num1=Double.parseDouble(request.getParameter("triangulo"));
            
            if(Boton.equals("Area"))
            {
                resultado= Math.pow(num1, 2)*3.1416;
                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
            
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Area</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<center><h1> area =" + resultado+ "</h1>");
                out.println("<br><br>");
                out.println("<a href='circulo.html'><input type='button' value='volver'></a></center>");
                out.println("</body>");
                out.println("</html>");
                }
            }
            else if(Boton.equals("Perimetro"))
            {
                resultado= (num1*2)* 3.1416;
                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
            
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Perimetro</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<center><h1>perimetro = " + resultado+ "</h1>");
                out.println("<a href='circulo.html'><input type='button' value='volver'></a></center>");
                out.println("</body>");
                out.println("</html>");
                }
            }
        
            
    }
}
