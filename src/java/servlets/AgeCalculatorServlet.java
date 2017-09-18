package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 740991
 */
public class AgeCalculatorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        //Get Params from URL
        String age = request.getParameter("age");
        if(age == null) {
          getServletContext().getRequestDispatcher("/WEB-INF/AgeCalc.jsp").forward(request, response);
            return;  
        }
        if (age.trim().isEmpty())
        {
            request.setAttribute("ErrorMessage", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalc.jsp").forward(request, response);
            return;
        }
        else
        {        
        try
        {
        int ageI = Integer.parseInt(age);
            
            request.setAttribute("age", ageI);
            request.setAttribute("response", "Your age next birthday will be " + ++ageI);
        }catch(NumberFormatException e){    
        }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalc.jsp").forward(request, response);
        return;   
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        // TODO
    }
}
