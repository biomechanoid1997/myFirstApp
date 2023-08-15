

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HometaskServlet3 extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String number1 = request.getParameter("num1");
        String number2 = request.getParameter("num2");
        String action = request.getParameter("action");
        int finalNumber = 0;
        switch (action){
            case "plus":
                finalNumber = Integer.parseInt(number1) + Integer.parseInt(number2);
                writer.println("<p>Result number: "+ finalNumber + "<p>");
                break;
            case  "minus":
                finalNumber = Integer.parseInt(number1) - Integer.parseInt(number2);
                writer.println("<p>Result number: "+ finalNumber + "<p>");
                break;
            case  "multiply":
                finalNumber = Integer.parseInt(number1) * Integer.parseInt(number2);
                writer.println("<p>Result number: "+ finalNumber + "<p>");
                break;
            case  "divide":
                finalNumber = Integer.parseInt(number1) / Integer.parseInt(number2);
                writer.println("<p>Result number: "+ finalNumber + "<p>");
                break;
            default:
                writer.println("<h2>ERROR</h2>");
                break;
        }
        writer.println("<p>First number:" + number1 + "</p>");
        writer.println("<p>Second number:" + number2 + "</p>");
        writer.println("<p>Action: " + action +"</p>");
        writer.close();

    }


}